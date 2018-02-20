package de.unihamburg.swk.traceabilityrecovery.commands;

import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;

import java.io.IOException;

/**
 * Created by Tilmann Stehle on 14.02.2018.
 */
public class LoadIndexFromDiskCommand implements ITraceabilityRecoveryCommand {

    private final ITraceabilityRecoveryService traceabilityRecoveryService;
    private String filePath;

    public LoadIndexFromDiskCommand(ITraceabilityRecoveryService traceabilityRecoveryService)
    {
        this.traceabilityRecoveryService = traceabilityRecoveryService;

    }
    @Override
    public void execute() throws IOException {
        traceabilityRecoveryService.loadIndexFromDisk();
    }
}
