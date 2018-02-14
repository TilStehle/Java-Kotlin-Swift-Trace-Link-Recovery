package de.unihamburg.swk.traceabilityrecovery.commands;

import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;

import java.io.IOException;
import java.util.function.Predicate;

/**
 * Created by Tilmann Stehle on 14.02.2018.
 */
public class DiscardIndexAndReadDocumentsCommand implements ITraceabilityRecoveryCommand {

    private final ITraceabilityRecoveryService traceabilityRecoveryService;
    private Predicate<String> projectPathFilter;
    private String[] projectPaths;

    public DiscardIndexAndReadDocumentsCommand (ITraceabilityRecoveryService traceabilityRecoveryService, Predicate<String> projectPathFilter, String... projectPaths)
    {
        this.traceabilityRecoveryService = traceabilityRecoveryService;
        this.projectPathFilter = projectPathFilter;

        this.projectPaths = projectPaths;
    }
    @Override
    public void execute() throws IOException {
        traceabilityRecoveryService.discardIndexAndReadDocuments(projectPathFilter,projectPaths);
    }
}
