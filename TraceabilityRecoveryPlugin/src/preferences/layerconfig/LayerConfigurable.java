package preferences.layerconfig;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import components.TraceabilityRecoveryComponent;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;
import preferences.TraceabilityRecoveryComponentConfiguration;

import javax.swing.*;

/**
 * Created by Gerrit Greiert on 13.04.17.
 */
public class LayerConfigurable implements Configurable {

    private static final String DISPLAY_NAME = "Layer configuration";
    private Project project;
    private TraceabilityRecoveryComponentConfiguration componentSettings;
    private LayerConfigPanel panel;

    public LayerConfigurable(Project project) {
        this.project = project;
        componentSettings = project.getComponent(TraceabilityRecoveryComponent.class).getConfiguration();

        String configPath;
        if (componentSettings.isUseCustomConfigPath()){
            configPath = componentSettings.getCustomConfigPath() + componentSettings.CONFIG_PATH_FOLDER;
        } else {
            configPath = project.getBasePath() + componentSettings.CONFIG_PATH_FOLDER;
        }

        panel = new LayerConfigPanel(configPath);
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
        return panel.isModified();
    }

    @Override
    public void apply() throws ConfigurationException {
        panel.apply();
    }

    @Override
    public void reset() {
        panel.reset();
    }

    @Override
    public void disposeUIResources() {
        panel = null;
    }
}
