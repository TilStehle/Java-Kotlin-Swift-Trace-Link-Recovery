package de.unihamburg.swk.traceabilityrecovery.lucene;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.XMLExport;
import de.unihamburg.masterprojekt2016.traceability.XMLImport;
import de.unihamburg.swk.parsing.document.TermFactor;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import org.apache.commons.io.FilenameUtils;
import org.apache.lucene.document.*;

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

    private LuceneDocument()
    {

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
    public void addTerm(TermFactor termFactor, String term, String termType) {
        addTermToField(termFactor.getFactor(), term, "content");
        addTermToField(1, term, termFactor.getFactorIdentifier());
       // addTermToField(weight, term, termType);
    }

    private void addTermToField(int weight, String term, String fieldName) {
        if(term!=null && !term.equals("null")) {
            String currentContent = document.get(fieldName);
            term = cleanTerm(term);
            if (currentContent != null && !"".equals(currentContent)) {
                document.removeField(fieldName);
            }
            for (int i = 0; i < weight; i++) {
                currentContent += " " + term;//+" "+termType+"\\("+term+"\\)";
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
        document.add(new StringField("pointer", XMLExport.createXMLStringFromPointer(this.describedArtifactPointer), Field.Store.YES));
    }

    @Override
    public void applyTermFactors(TermFactors newTermFactors) {
        StringBuilder newContentBuilder = new StringBuilder();

        for (TermFactor termFactor : newTermFactors.getAllFactors()) {
            String s = document.get(termFactor.getFactorIdentifier());
            if(s != null)
            {
                for(int i =0; i<termFactor.getFactor(); i++)
                {
                    newContentBuilder.append(" "+s);
                }
            }
        }

        document.removeField("content");
        document.add(new TextField("content", newContentBuilder.toString(), Field.Store.YES));
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
        return "\n"+describedArtifactPointer.toString()+"\t"+ describedArtifactPointer.getSourceFilePath() +"\nlayer: " + getLayer() + "     contents:" + getContents();
    }
}
