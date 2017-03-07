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
            try {
                ((LuceneTraceabilityRecoveryService) traceabilityRecoveryService).readDocuments(projectBasePath,configuration.getLinkedImplementationPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //refreshRecoveryService();
    }

    @Override
    public void projectClosed() {

    }

    @Nullable
    @Override
    /**
     * Saves the current component configuration, gets called from framework
     */
    public TraceabilityRecoveryComponentConfiguration getState() {
        return configuration;
    }

    @Override
    /**
     * Loads the current component configuration, gets called from framework
     */
    public void loadState(TraceabilityRecoveryComponentConfiguration state) {
        this.configuration = state;
    }

    /**
     * Gets the current component configuration
     */
    public TraceabilityRecoveryComponentConfiguration getConfiguration() {
        return configuration;
    }

    public void refreshRecoveryService(){

        RecoveryServiceRefreshTask task = new RecoveryServiceRefreshTask(project, project.getBasePath(), configuration.getLinkedImplementationPath());
        ProgressManager.getInstance().run(task);
    }

}
