package components;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

/**
 * Created by Gerrit Greiert on 24.02.17.
 */
public class RecoveryServiceRefreshTask extends Task.Backgroundable {

    private static final String TITLE = "Traceability Recovery analysis";
    private String[] pathsToRead;
    private ITraceabilityRecoveryService recoveryService;

    public RecoveryServiceRefreshTask(@Nullable Project project, String... pathsToRead) {
        super(project, TITLE, true);
        recoveryService = ServiceManager.getService(project, ITraceabilityRecoveryService.class);
        this.pathsToRead = pathsToRead;

        this.setCancelText("Traceability recovery functionality will not be available when cancelled");
    }

    @Override
    public void run(@NotNull ProgressIndicator progressIndicator) {

        try {
            recoveryService.readDocuments(pathsToRead);

            //Debug output
            System.out.println("Documents read: " + recoveryService.getNumberOfDocs());
            //recoveryService.printDocuments();

        } catch (IOException e) {
            System.out.println("Couldn't read documents");
            e.printStackTrace();
        }
    }
}
