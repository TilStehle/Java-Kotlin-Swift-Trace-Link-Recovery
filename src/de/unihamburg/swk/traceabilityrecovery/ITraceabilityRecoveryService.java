package de.unihamburg.swk.traceabilityrecovery;

import com.google.common.collect.Multiset;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface ITraceabilityRecoveryService
{


	public static List<String> NonParsedFiles = new ArrayList<>();
	List<TraceabilityLink> getSortedTraceabilityLinksForQuery(Multiset<String> queryTerms, Language language);

	List<TraceabilityLink> getSortedTraceabilityLinksForPointer(TraceabilityPointer pointer, Language language);

	void readDocuments(String... projectPaths) throws IOException, IndexPathNotSetException;
    int getNumberOfDocs();
	void loadIndexFromDisk() throws IOException, IndexPathNotSetException;

    void printDocuments();

    int getNumberOfDocumentsForLanguage(String language);

    void setIndexPath(String projectBasePath);

	ParserProgress getParserProgress();

}
