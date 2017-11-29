package de.unihamburg.swk.parsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import de.unihamburg.masterprojekt2016.traceability.TypePointer;
import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

public class TestDocParser<TDocument extends ISearchableDocument> implements ISourceCodeParser<TDocument> {

	private String filePath;
	private IDocumentFactory<TDocument> documentFactory;

	public TestDocParser(String filePath, IDocumentFactory<TDocument> documentFactory) {
		this.filePath = filePath;
		this.documentFactory = documentFactory;
	}

	@Override
	public List<TDocument> parseDocuments() {
		ArrayList<TDocument> documentsList = new ArrayList<>();
		Path path = Paths.get(filePath);
		TypePointer pointer = new TypePointer(path.getFileName().toString());
		TDocument document = documentFactory.createDocument(pointer);
		documentsList.add(document);
//		Multiset<String> wordsbag = parseTerms(document);
		return documentsList;
	}

	public Multiset<String> parseTerms(TDocument document) {
		Multiset<String> wordsbag = HashMultiset.create();
		Path path = Paths.get(filePath);
		try (Stream<String> stream = Files.lines(path)) {
			stream.forEach(term->document.addTerm(1,null,term));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return wordsbag;
	}

}
