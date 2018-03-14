package de.unihamburg.swk.traceabilityrecovery.commands;

import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Tilmann Stehle on 14.02.2018.
 */
public class ReplaceDocumentsForFilePathsCommand implements ITraceabilityRecoveryCommand {

    private final ITraceabilityRecoveryService traceabilityRecoveryService;
    private String[] filePaths;

    public ReplaceDocumentsForFilePathsCommand(ITraceabilityRecoveryService traceabilityRecoveryService, String... filePaths)
    {
        this.traceabilityRecoveryService = traceabilityRecoveryService;

        this.filePaths = filePaths;
    }
    @Override
    public void execute() throws IOException {
        traceabilityRecoveryService.replaceDocumentsForFilePaths(filePaths);
    }

    @Override
    public String getDescription() {
        return "Reindexing "+ Arrays.toString(filePaths);
    }
}
