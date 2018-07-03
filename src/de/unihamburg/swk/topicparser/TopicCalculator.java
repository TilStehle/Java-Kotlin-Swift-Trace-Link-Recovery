package de.unihamburg.swk.topicparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.store.FSDirectory;

import de.unihamburg.swk.traceabilityrecovery.FileNameNotSetException;
import de.unihamburg.swk.traceabilityrecovery.IndexPathNotSetException;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;
import de.unihamburg.swk.traceabilityrecovery.lucene.SourceCodeAnalyzer;

public class TopicCalculator {

	private Path indexPath;
	private String fileName;
	IndexReader reader;
	IndexWriterConfig config;

	public TopicCalculator(Path indexPath, String fileName) {
		if (indexPath == null || indexPath.toString().isEmpty())
			throw new IndexPathNotSetException();
		this.indexPath = indexPath;
		if (fileName == null || fileName.isEmpty())
			throw new FileNameNotSetException();
		this.fileName = fileName;
		this.config = new IndexWriterConfig(new SourceCodeAnalyzer());
	}

	public void calculateTopics() {
		setUpReader();
		IndexSearcher searcher = new IndexSearcher(reader);
		try (PrintWriter pw = new PrintWriter(new File(indexPath + "/" + fileName))) {
			for (int i = 0; i < reader.maxDoc(); i++) {
				StringBuilder sb = new StringBuilder();
				Document document = null;
				try {
					document = reader.document(i);
				} catch (IOException e) {
					System.out.println("Document kann nicht gelesen werden!");
					e.printStackTrace();
				}
				LuceneDocument luceneDocument = LuceneDocument.fromDocument(document);
				HashMap<String, Double> termFrequencyMap = luceneDocument.createTermFrequencyMap();
				HashMap<String, Double> map = new HashMap<>();
				map = calculateTfAndIdfAndAddToMap(reader, searcher, termFrequencyMap, map);
				// System.out.println("Documentname:" +
				// luceneDocument.getTraceabilityPointer().getDisplayName() + "\n");
				sb.append(luceneDocument.getTraceabilityPointer().getDisplayName() + "\n");
				TreeMap<String, Double> sortedMap = sortMapByValue(map);
				Iterator<String> iterator = sortedMap.navigableKeySet().iterator();
				for (int counter = 0; counter < 10; counter++) {
					if (iterator.hasNext()) {
						String term = iterator.next();
						// System.out.println(term + ";" + map.get(term) + "\n");
						sb.append(term + ";" + map.get(term) + "\n");
					} else
						break;
				}
				// System.out.println("\n\n");
				sb.append("\n\n");
				pw.write(sb.toString());
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	private void setUpReader() {
		try {
			reader = DirectoryReader.open(FSDirectory.open(indexPath));
		} catch (IOException e) {
			System.out.println("Error: Reader for IndexPath could not be initialized!");
			e.printStackTrace();
		}
	}

	private HashMap<String, Double> calculateTfAndIdfAndAddToMap(IndexReader reader, IndexSearcher searcher,
			HashMap<String, Double> termFrequencyMap, HashMap<String, Double> map) {
		for (String term : termFrequencyMap.keySet()) {
			Query query;
			query = createQuery(term);
			long docCount = 0;
			try {
				docCount = searcher.count(query);
			} catch (IOException e) {
				System.out.println("Query konnte nicht durchgeführt werden");
				e.printStackTrace();
			}
			double tf = termFrequencyMap.get(term);
			double idf = Math.log((double) reader.maxDoc() / docCount);
			map.put(term, tf * idf);
		}
		return map;
	}

	private static TreeMap<String, Double> sortMapByValue(HashMap<String, Double> map) {
		Comparator<String> comparator = new ValueComparator(map);
		TreeMap<String, Double> result = new TreeMap<String, Double>(comparator);
		result.putAll(map);
		return result;
	}

	private Query createQuery(String term) {
		QueryParser parser = new QueryParser("content", new SourceCodeAnalyzer());
		Query query = null;
		try {
			query = parser.parse(term);
		} catch (ParseException e) {
			System.out.println(term + " konnte nicht geparst werden");
			e.printStackTrace();
		}
		return query;
	}
}
