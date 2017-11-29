package components;

import com.intellij.openapi.components.*;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.project.Project;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import preferences.TraceabilityRecoveryComponentConfiguration;

import java.io.IOException;

/**
 * Created by Gerrit Greiert on 21.02.17.
 */
@State(
        name = "Traceability Recovery Plugin",
        storages = {@Storage("traceability-recovery-plugin.xml")}
)
public class TraceabilityRecoveryComponent implements ProjectComponent, PersistentStateComponent<TraceabilityRecoveryComponentConfiguration> {

    public static final String NOTIFICATION_ID = "Traceability Recovery";
    public static final String QUERY_TITLE = "Traceability Query";
    public static final String QUERY_ERROR = "The selected element has not been parsed, therefore no traceability info is available. It might not have been parsed because of an error or the configured parser timeout.";

    private Project project;
    private TraceabilityRecoveryComponentConfiguration configuration;
    private ITraceabilityRecoveryService traceabilityRecoveryService;

    public TraceabilityRecoveryComponent(Project project) {
        this.project = project;
        configuration = new TraceabilityRecoveryComponentConfiguration();
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
    public void projectOpened(){
        String projectBasePath = project.getBasePath();
        System.out.println("Opened project: " + projectBasePath);
        System.out.println("Linked implementation: " + configuration.getLinkedImplementationPath());

        traceabilityRecoveryService = ServiceManager.getService(project, ITraceabilityRecoveryService.class);

        //Reload lucene index if lucene service
        if (traceabilityRecoveryService instanceof LuceneTraceabilityRecoveryService){

            if (configuration.isUseCustomConfigPath()){
                traceabilityRecoveryService.setIndexPath(configuration.getCustomConfigPath() + configuration.INDEX_PATH_FOLDER);
            } else {
                traceabilityRecoveryService.setIndexPath(projectBasePath + configuration.INDEX_PATH_FOLDER);
            }

            try {
                traceabilityRecoveryService.loadIndexFromDisk();
            } catch (IOException|RuntimeException e) {
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
     * Refreshes the recovery service. Calls readDocuments() on all given paths.
     */
    public void refreshRecoveryService(){

        RecoveryServiceRefreshTask task = new RecoveryServiceRefreshTask(project, configuration.getFileParserTimeout(), project.getBasePath(), configuration.getLinkedImplementationPath());
        ProgressManager.getInstance().run(task);
    }

}
