package de.unihamburg.swk.traceabilityrecovery.lucene;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.swk.parsing.document.IDocumentFactory;

/**
 * Created by Tilmann Stehle on 20.01.2017.
 */
public class LuceneDocsFactory implements IDocumentFactory<LuceneDocument> {
	private static long currentId = 0;
	public static boolean javaStopFilter;
	public static boolean javaAPIStopFilter;
	public static boolean dottedNamesFilter;
	public static boolean camelCaseFilter;
	public static boolean englishPossessiveFilter;
	public static boolean porterStemFilter;

	public LuceneDocsFactory() {
	}

	public LuceneDocsFactory(boolean javaAPIStopFilter, boolean dottedNamesFilter, boolean camelCaseFilter,
			boolean englishPossessiveFilter, boolean javaStopFilter, boolean porterStemFilter) {
		LuceneDocsFactory.javaStopFilter = javaStopFilter;
		LuceneDocsFactory.javaAPIStopFilter = javaAPIStopFilter;
		LuceneDocsFactory.dottedNamesFilter = dottedNamesFilter;
		LuceneDocsFactory.camelCaseFilter = camelCaseFilter;
		LuceneDocsFactory.englishPossessiveFilter = englishPossessiveFilter;
		LuceneDocsFactory.porterStemFilter = porterStemFilter;
	}

	@Override
	public LuceneDocument createDocument(TraceabilityPointer pointer) {
		return new LuceneDocument(pointer, currentId++);
	}
}
