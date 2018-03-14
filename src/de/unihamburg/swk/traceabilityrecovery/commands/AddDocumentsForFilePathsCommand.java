package de.unihamburg.swk.traceabilityrecovery.commands;

import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Tilmann Stehle on 14.02.2018.
 */
public class AddDocumentsForFilePathsCommand implements ITraceabilityRecoveryCommand {

    private final ITraceabilityRecoveryService traceabilityRecoveryService;
    private String[] filePaths;

    public AddDocumentsForFilePathsCommand(ITraceabilityRecoveryService traceabilityRecoveryService, String... filePaths)
    {
        this.traceabilityRecoveryService = traceabilityRecoveryService;
        this.filePaths = filePaths;
    }
    @Override
    public void execute() throws IOException {
        traceabilityRecoveryService.addDocumentsForFilePaths(filePaths);
    }

    @Override
    public String getDescription() {
        return "Indexing the following files: "+ Arrays.toString(filePaths);
    }
}
