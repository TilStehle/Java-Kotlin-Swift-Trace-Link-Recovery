package de.unihamburg.swk.traceabilityrecovery.commands;

import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;

import java.io.IOException;
import java.util.function.Predicate;

/**
 * Created by Tilmann Stehle on 20.02.2018.
 */
public class AddFolderToIndexCommand  implements ITraceabilityRecoveryCommand{
    private final ITraceabilityRecoveryService traceabilityRecoveryService;
    private final String folderPath;
    private Predicate<String> projectPathFilter;

    public AddFolderToIndexCommand(ITraceabilityRecoveryService traceabilityRecoveryService, String folderPath,Predicate<String> projectPathFilter)
    {
        this.traceabilityRecoveryService = traceabilityRecoveryService;
        this.folderPath = folderPath;
        this.projectPathFilter = projectPathFilter;
    }
    @Override
    public void execute() throws IOException {
        traceabilityRecoveryService.addFolderToIndex(projectPathFilter, folderPath );
    }

    @Override
    public String getDescription() {
        return "Adding" + folderPath + "to traceability index";
    }
}
