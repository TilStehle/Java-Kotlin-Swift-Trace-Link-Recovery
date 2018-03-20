package components;

import com.intellij.openapi.components.*;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.intellij.openapi.vfs.newvfs.BulkFileListener;
import com.intellij.openapi.vfs.newvfs.events.*;
import com.intellij.util.containers.ContainerUtil;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.commands.*;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import preferences.TraceabilityRecoveryComponentConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

/**
 * Created by Gerrit Greiert on 21.02.17.
 */
@State(
        name = "Traceability Recovery Plugin",
        storages = {@Storage("traceability-recovery-plugin.xml")}
)
public class TraceabilityRecoveryComponent implements ProjectComponent, PersistentStateComponent<TraceabilityRecoveryComponentConfiguration>, BulkFileListener {

    public static final String NOTIFICATION_ID = "Traceability Recovery";
    public static final String QUERY_TITLE = "Traceability Query";
    public static final String QUERY_ERROR = "The selected element has not been parsed, therefore no traceability info is available. It might not have been parsed because of an error or the configured parser timeout.";

    private Project project;
    private TraceabilityRecoveryComponentConfiguration configuration;
    private ITraceabilityRecoveryService traceabilityRecoveryService;
    public static final  Predicate<String> indexPathFilter = path -> !path.contains("/build/") && !path.contains("\\build\\") && !path.contains("/.git/") && !path.contains("\\.git\\");
    public TraceabilityRecoveryComponent(Project project) {
        this.project = project;
        configuration = new TraceabilityRecoveryComponentConfiguration();
        traceabilityRecoveryService = ServiceManager.getService(project, ITraceabilityRecoveryService.class);
        project.getMessageBus().connect(project).subscribe(VirtualFileManager.VFS_CHANGES, this);

    }


    @Override
    public void before(@NotNull List<? extends VFileEvent> list) {

    }

    @Override
    public void after(@NotNull List<? extends VFileEvent> list) {
        for (VFileEvent fileEvent : list) {
            if (fileEvent instanceof VFileContentChangeEvent) {
                refreshTraceabilityForFile(fileEvent.getPath());
            } else if (fileEvent instanceof VFileCreateEvent) {
                addToTraceabilityIndex(fileEvent.getPath());
            } else if (fileEvent instanceof VFileCopyEvent) {
                addToTraceabilityIndex(fileEvent.getPath());
            } else if (fileEvent instanceof VFileMoveEvent) {
                VFileMoveEvent moveEvent = (VFileMoveEvent) fileEvent;
                removeFromTraceabilityIndex(moveEvent.getOldPath());
                addToTraceabilityIndex(moveEvent.getNewParent().getPath() + "/" + moveEvent.getFile().getName());
            } else if (fileEvent instanceof VFileDeleteEvent) {
                removeFromTraceabilityIndex(fileEvent.getPath());

            }
        }


    }

    private void removeFromTraceabilityIndex(String path) {
        if(indexPathFilter.test(path))
        {
            ITraceabilityRecoveryCommand command = new RemoveDocumentsForFilePathPrefixCommand(traceabilityRecoveryService, path);
            enqueueCommand(command);
        }
    }

    private void addToTraceabilityIndex(String path) {
        File file = new File(path);
            if (indexPathFilter.test(path) && traceabilityRecoveryService.isParseableSourceFilePath(path)) {
                ITraceabilityRecoveryCommand command = new AddDocumentsForFilePathsCommand(traceabilityRecoveryService, path);
                enqueueCommand(command);
            } else if (file.isDirectory()) {
                ITraceabilityRecoveryCommand command = new AddFolderToIndexCommand(traceabilityRecoveryService, path,indexPathFilter);
                enqueueCommand(command);
            }
    }

    private void refreshTraceabilityForFile(String path) {
        if(indexPathFilter.test(path)) {
            if (traceabilityRecoveryService.isParseableSourceFilePath(path)) {
                ITraceabilityRecoveryCommand command = new ReplaceDocumentsForFilePathsCommand(traceabilityRecoveryService, path);
                enqueueCommand(command);
            }
        }
    }

    private void enqueueCommand(ITraceabilityRecoveryCommand command) {
        RecoveryServiceRefreshTask task = new RecoveryServiceRefreshTask(project, configuration.getFileParserTimeout(), command);
        ProgressManager.getInstance().run(task);
    }




    @Override
    public void initComponent() {
    }

    @Override
    public void disposeComponent() {
    }

    @Override
    @NotNull
    public String getComponentName() {
        return this.getClass().getName();
    }

    @Override
    public void projectOpened() {
        String projectBasePath = project.getBasePath();
        System.out.println("Opened project: " + projectBasePath);
        System.out.println("Linked implementation: " + configuration.getLinkedImplementationPath());

        traceabilityRecoveryService = ServiceManager.getService(project, ITraceabilityRecoveryService.class);

        //Reload lucene index if lucene service
        if (traceabilityRecoveryService instanceof LuceneTraceabilityRecoveryService) {

            if (configuration.isUseCustomConfigPath()) {
                traceabilityRecoveryService.setIndexPath(configuration.getCustomConfigPath() + configuration.INDEX_PATH_FOLDER);
            } else {
                traceabilityRecoveryService.setIndexPath(projectBasePath + configuration.INDEX_PATH_FOLDER);
            }

            try {
                traceabilityRecoveryService.loadIndexFromDisk();
            } catch (IOException | RuntimeException e) {
                System.out.println("Couldn't read index, building new index");
                refreshRecoveryService();
            }
        }

    }

    @Override
    public void projectClosed() {

    }


    /**
     * Saves the current component configuration, gets called from framework
     */
    @Nullable
    @Override
    public TraceabilityRecoveryComponentConfiguration getState() {
        return configuration;
    }


    /**
     * Loads the current component configuration, gets called from framework
     */
    @Override
    public void loadState(TraceabilityRecoveryComponentConfiguration state) {
        this.configuration = state;
    }

    /**
     * Gets the current component configuration
     */
    public TraceabilityRecoveryComponentConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Refreshes the recovery service. Calls discardIndexAndReadDocuments() on all given paths.
     */
    public void refreshRecoveryService() {

        ITraceabilityRecoveryCommand command = new DiscardIndexAndReadDocumentsCommand(traceabilityRecoveryService,indexPathFilter, project.getBasePath(), configuration.getLinkedImplementationPath());
        RecoveryServiceRefreshTask task = new RecoveryServiceRefreshTask(project, configuration.getFileParserTimeout(), command);
        ProgressManager.getInstance().run(task);
    }
}
