package preferences;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import components.TraceabilityRecoveryComponent;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Gerrit Greiert on 16.02.17.
 */
public class PluginConfigurable implements Configurable {

    private static final String DISPLAY_NAME = "Traceability Recovery preferences";
    private Project project;
    private TraceabilityRecoveryComponentConfiguration componentSettings;
    private PreferencesPanel panel;

    private String initialLinkedImplementationPath;

    public PluginConfigurable(Project project){
        this.project = project;
        componentSettings = project.getComponent(TraceabilityRecoveryComponent.class).getConfiguration();
        panel = new PreferencesPanel();

        panel.setImplementationPath(componentSettings.getLinkedImplementationPath());

        initialLinkedImplementationPath = componentSettings.getLinkedImplementationPath();

    }

    @Nls
    @Override
    public String getDisplayName() {
        return DISPLAY_NAME;
    }

    @Nullable
    @Override
    public String getHelpTopic() {
        return null;
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        return panel;
    }

    @Override
    public boolean isModified() {
        return panel.getImplementationPath().equals(initialLinkedImplementationPath) ? false : true;
    }

    @Override
    public void apply() throws ConfigurationException {
        componentSettings.setLinkedImplementationPath(panel.getImplementationPath());
        initialLinkedImplementationPath = panel.getImplementationPath();
    }

    @Override
    public void reset() {
        panel.setImplementationPath(initialLinkedImplementationPath);
    }

    @Override
    public void disposeUIResources() {
        panel = null;
    }
}
