package components;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.ParserProgress;
import de.unihamburg.swk.traceabilityrecovery.commands.ITraceabilityRecoveryCommand;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.function.Predicate;

import static components.TraceabilityRecoveryComponent.NOTIFICATION_ID;

/**
 * Created by Gerrit Greiert on 24.02.17.
 */
public class RecoveryServiceRefreshTask extends Task.Backgroundable implements Observer {

    private final String title;
    private static final String FINISH_MESSAGE = "Recovery Service has been refreshed";
    private static final String ERROR_MESSAGE = "Recovery Service could not be refreshed";
    private static final String ERROR_MESSAGE_NO_PATHS = "Recovery Service could not be refreshed because no linked implementation path is configured";
    private static final String UNPARSED_MESSAGE = "The following files haven't been parsed due to error or timeout:";

    private String[] pathsToRead;
    private ITraceabilityRecoveryService recoveryService;
    private final ITraceabilityRecoveryCommand command;

    private boolean cancelled = false;

    private ProgressIndicator progressIndicator;

    public RecoveryServiceRefreshTask(@Nullable Project project, long fileTimeout, ITraceabilityRecoveryCommand command) {
        super(project, command.getDescription(), true);
        title = command.getDescription();
        recoveryService = ServiceManager.getService(project, ITraceabilityRecoveryService.class);
        this.command = command;

        recoveryService.getParserProgress().setFileParserTimeout(fileTimeout);
        recoveryService.getParserProgress().addObserver(this);

    }

    @Override
    public void run(@NotNull ProgressIndicator progressIndicator) {

        this.progressIndicator = progressIndicator;

        try {
            recoveryService.enqueueCommand(command);

            if (cancelled)
                throw new IOException();

            Notifications.Bus.notify(new Notification(NOTIFICATION_ID, title, FINISH_MESSAGE, NotificationType.INFORMATION));

            if (!recoveryService.getParserProgress().getNonParsedFiles().isEmpty()) {
                String unparsedMessage = UNPARSED_MESSAGE + "\n";
                for (String filePath : recoveryService.getParserProgress().getNonParsedFiles()) {
                    unparsedMessage = unparsedMessage + filePath + "\n";
                }
                Notifications.Bus.notify(new Notification(NOTIFICATION_ID, title, unparsedMessage, NotificationType.WARNING));
            }

        } catch (IOException e) {

            Notifications.Bus.notify(new Notification(NOTIFICATION_ID, title, ERROR_MESSAGE, NotificationType.ERROR));
            System.out.println("Couldn't read documents");

        } catch (NullPointerException e){

            Notifications.Bus.notify(new Notification(NOTIFICATION_ID, title, ERROR_MESSAGE_NO_PATHS, NotificationType.INFORMATION));
            System.out.println("No paths given");
        }

    }

    @Override
    public void update(Observable o, Object arg) {

        ParserProgress parserProgress = (ParserProgress) o;
        this.progressIndicator.setFraction(parserProgress.getProgress());

        if (progressIndicator.isCanceled()){
            this.onCancel();
        }
    }

    @Override
    public void onCancel() {

        recoveryService.getParserProgress().stopParsing();
        cancelled = true;
    }
}
