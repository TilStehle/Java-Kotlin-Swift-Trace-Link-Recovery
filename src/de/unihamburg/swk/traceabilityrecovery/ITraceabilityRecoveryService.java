package de.unihamburg.swk.traceabilityrecovery;

import com.google.common.collect.Multiset;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.swk.traceabilityrecovery.commands.ITraceabilityRecoveryCommand;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public interface ITraceabilityRecoveryService
{


	public static List<String> NonParsedFiles = new ArrayList<>();

    void enqueueCommand(ITraceabilityRecoveryCommand command) throws IOException;

    List<TraceabilityLink> getSortedTraceabilityLinksForQuery(Multiset<String> queryTerms, Language language);
    List<TraceabilityLink> getSortedTraceabilityLinksToOtherLanguagesForPointer(TraceabilityPointer pointer);

	List<TraceabilityLink> getSortedTraceabilityLinksForPointer(TraceabilityPointer pointer, Language language);

    List<TraceabilityLink> getSortedTraceabilityLinksForPointer(TraceabilityPointer pointer, String... pathPrefixes);

    void addFolderToIndex(Predicate<String> pathFilter , String fodlerPaths) throws IndexPathNotSetException, IOException ;

    void discardIndexAndReadDocuments(Predicate<String> pathFilter , String... projectPaths) throws IndexPathNotSetException, IOException ;

    default void discardIndexAndReadDocuments(String... projectPaths) throws IOException, IndexPathNotSetException
    {
        discardIndexAndReadDocuments(p -> true, projectPaths);
    }

    void replaceDocumentsForFilePath(String path) throws IOException;

    void addDocumentsForFilePath(String path) throws IOException;

    void removeDocumentsForFilesWithPathPrefix(String path) throws IOException;
    int getNumberOfDocs();
	void loadIndexFromDisk() throws IOException, IndexPathNotSetException;

    void printDocuments();

    boolean isParseableSourceFilePath(String path);

    int getNumberOfDocumentsForLanguage(String language);

    void setIndexPath(String projectBasePath);

	ParserProgress getParserProgress();


}
