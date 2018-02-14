package de.unihamburg.swk.traceabilityrecovery.commands;

import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;

import java.io.IOException;

/**
 * Created by Tilmann Stehle on 14.02.2018.
 */
public class ReplaceDocumentsForFilePathCommand implements ITraceabilityRecoveryCommand {

    private final ITraceabilityRecoveryService traceabilityRecoveryService;
    private String filePath;

    public ReplaceDocumentsForFilePathCommand(ITraceabilityRecoveryService traceabilityRecoveryService, String filePath)
    {
        this.traceabilityRecoveryService = traceabilityRecoveryService;

        this.filePath = filePath;
    }
    @Override
    public void execute() throws IOException {
        traceabilityRecoveryService.replaceDocumentsForFilePath(filePath);
    }
}
