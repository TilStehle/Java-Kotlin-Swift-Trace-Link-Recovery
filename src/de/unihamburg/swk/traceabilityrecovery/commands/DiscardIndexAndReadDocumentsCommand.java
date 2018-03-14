package de.unihamburg.swk.traceabilityrecovery.commands;

import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Created by Tilmann Stehle on 14.02.2018.
 */
public class DiscardIndexAndReadDocumentsCommand implements ITraceabilityRecoveryCommand {

    private final ITraceabilityRecoveryService traceabilityRecoveryService;
    private final Predicate<String> pathFilter;
    private final String[] projectPaths;
    private String filePath;

    public DiscardIndexAndReadDocumentsCommand(ITraceabilityRecoveryService traceabilityRecoveryService, String... projectPaths)
    {
        this(traceabilityRecoveryService,null, projectPaths);
    }
    public DiscardIndexAndReadDocumentsCommand(ITraceabilityRecoveryService traceabilityRecoveryService, Predicate<String> pathFilter , String... projectPaths)
    {
        this.traceabilityRecoveryService = traceabilityRecoveryService;

        this.pathFilter = pathFilter;
        this.projectPaths = projectPaths;
    }
    @Override
    public void execute() throws IOException {
        if(pathFilter == null)
        {
            traceabilityRecoveryService.discardIndexAndReadDocuments( projectPaths);
        }
        else
        {
            traceabilityRecoveryService.discardIndexAndReadDocuments(pathFilter, projectPaths);
        }
    }

    @Override
    public String getDescription() {
        return "Reindexing project paths "+ Arrays.toString(projectPaths);
    }
}
