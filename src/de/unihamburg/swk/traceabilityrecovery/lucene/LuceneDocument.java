package de.unihamburg.swk.traceabilityrecovery.lucene;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

import org.apache.commons.io.FilenameUtils;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.XMLExport;
import de.unihamburg.masterprojekt2016.traceability.XMLImport;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

/**
 * Created by Tilmann Stehle on 20.01.2017.
 */
public class LuceneDocument implements ISearchableDocument {

	public static LuceneDocument fromDocument(Document original) {
		TraceabilityPointer pointer = XMLImport.unmarshalPointer(original.get("pointer"));
		StoredField idField = (StoredField) original.getField("id");
		long id = new Long(idField.numericValue().longValue());
		LuceneDocument luceneDocument = new LuceneDocument();
		luceneDocument.document = original;
		luceneDocument.id = id;
		luceneDocument.describedArtifactPointer = pointer;

		return luceneDocument;
	}

	private long id;
	private TraceabilityPointer describedArtifactPointer;
	private Document document;

	private LuceneDocument() {

	}

	public LuceneDocument(TraceabilityPointer pointer, long id) {

		describedArtifactPointer = pointer;
		this.id = id;
		document = new Document();
		String languageFileNameExtension = FilenameUtils.getExtension(pointer.getSourceFilePath());
		document.add(new StringField("language", languageFileNameExtension, Field.Store.YES));
		document.add(new StoredField("id", id));
		document.add(new StringField("pointer", XMLExport.createXMLStringFromPointer(pointer), Field.Store.YES));
		document.add(new StringField("path", pointer.getSourceFilePath(), Field.Store.YES));
		// Damit das erste Feld nicht null im content ist
		document.add(new TextField("content", "", Field.Store.YES));
	}

	public String getLanguage() {
		return document.get("language");
	}

	@Override
	public void setTitle(String title) {
		title = cleanTerm(title);
		if (document.get("title") != null) {
			document.removeField("title");
		}
		TextField titleField = new TextField("title", title, Field.Store.YES);
		document.add(titleField);
	}

	public String getTitle() {
		return document.get("title");
	}

	@Override
	public void addTerm(int weight, String term, String termType) {
		try (Analyzer sourceCodeAnalyzer = new SourceCodeAnalyzer(LuceneDocsFactory.javaAPIStopFilter,
				LuceneDocsFactory.dottedNamesFilter, LuceneDocsFactory.camelCaseFilter,
				LuceneDocsFactory.englishPossessiveFilter, LuceneDocsFactory.javaStopFilter,
				LuceneDocsFactory.porterStemFilter)) {
			TokenStream tokenStream = sourceCodeAnalyzer.tokenStream("my_keyword_field", new StringReader(term));
			CharTermAttribute attr = tokenStream.addAttribute(CharTermAttribute.class);
			tokenStream.reset();
			while (tokenStream.incrementToken()) {
				addTermToField(weight, attr.toString(), "content");
			}
			tokenStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addTermToField(int weight, String term, String fieldName) {
		if (term != null && !term.equals("null")) {
			String currentContent = document.get(fieldName);
			term = cleanTerm(term);
			if (currentContent != null) {
				document.removeField(fieldName);
			}
			for (int i = 0; i < weight; i++) {
				currentContent += " " + term;// +" "+termType+"\\("+term+"\\)";
			}

			document.add(new TextField(fieldName, currentContent, Field.Store.YES));
		}
	}

	private String cleanTerm(String term) {
		term = term.replace("[]", "");
		term = term.replace("!", "");
		return term;
	}

	@Override
	public void setLayer(String value) {
		if (document.get("layer") != null) {
			document.removeField("layer");
		}
		document.add(new StringField("layer", value, Field.Store.YES));
	}

	@Override
	public void traceabilityPointerHasChanged() {
		if (document.get("pointer") != null) {
			document.removeField("pointer");
		}
		document.add(new StringField("pointer", XMLExport.createXMLStringFromPointer(this.describedArtifactPointer),
				Field.Store.YES));
	}

	public String getContents() {
		return document.get("content");
	}

	@Override
	public String getDescription() {
		return describedArtifactPointer.toString();
	}

	@Override
	public TraceabilityPointer getTraceabilityPointer() {
		return describedArtifactPointer;
	}

	public Document getDocument() {
		return document;
	}

	public long getId() {
		return id;
	}

	public String getLayer() {
		return document.get("layer");
	}

	@Override
	public String toString() {
		return "\n" + describedArtifactPointer.toString() + "\t" + describedArtifactPointer.getSourceFilePath()
				+ "\nlayer: " + getLayer() + "     contents:" + getContents();
	}

	public HashMap<String, Double> createTermFrequencyMap() {
		HashMap<String, Double> freqMap = new HashMap<>();
		String[] terms = getContents().split(" ");
		for (String term : terms) {
			if (!term.isEmpty()) {
				if (freqMap.containsKey(term)) {
					freqMap.put(term, freqMap.get(term) + (1.0 / terms.length));
				} else {
					freqMap.put(term, (1.0 / terms.length));
				}
			}
		}
		return freqMap;
	}
}
