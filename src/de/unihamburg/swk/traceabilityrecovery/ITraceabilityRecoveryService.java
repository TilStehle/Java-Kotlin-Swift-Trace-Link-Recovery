package de.unihamburg.swk.traceabilityrecovery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.google.common.collect.Multiset;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;

public interface ITraceabilityRecoveryService
{

	public static List<String> NonParsedFiles = new ArrayList<>();
	List<TraceabilityLink> getSortedTraceabilityLinksForQuery(Multiset<String> queryTerms);
	List<TraceabilityLink> getSortedTraceabilityLinksForPointer(TraceabilityPointer pointer);
	void readDocuments(String... projectPaths) throws IOException;
    int getNumberOfDocs();
	void loadIndexFromDisk(String indexPathPrefix) throws IOException;

    void printDocuments();

    int getNumberOfDocumentsForLanguage(String language);
}
