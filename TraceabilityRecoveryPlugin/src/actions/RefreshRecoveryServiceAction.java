package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import components.TraceabilityRecoveryComponent;

/**
 * Created by Gerrit Greiert on 16.03.17.
 */
public class RefreshRecoveryServiceAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {

        Project project = anActionEvent.getProject();
        project.getComponent(TraceabilityRecoveryComponent.class).refreshRecoveryService();
    }
}
