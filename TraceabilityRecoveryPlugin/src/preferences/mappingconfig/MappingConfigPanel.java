package preferences.mappingconfig;

import com.intellij.openapi.ui.VerticalFlowLayout;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTabbedPane;
import de.unihamburg.swk.parsing.document.TermMapperManager;
import preferences.ApplyResetDelegate;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gerrit Greiert on 13.04.17.
 */
public class MappingConfigPanel extends JPanel implements ApplyResetDelegate{

    private static final String MAPPINGS_FILE_NAME = "/mappings";
    private static final String INFO_DESCRIPTION = "Define Mappings";

    private MappingLanguageTab javaTab;
    private MappingLanguageTab swiftTab;

    private String mappingsFilePath;

    public MappingConfigPanel(String configFilePath) {

        this.mappingsFilePath = configFilePath + MAPPINGS_FILE_NAME;

        this.setLayout(new VerticalFlowLayout(true, false));
        this.add(createInfoPanel());
        this.add(createTabbedPane());
    }

    private JPanel createInfoPanel(){

        JPanel panel = new JPanel(new BorderLayout(5, 5));

        JBLabel infoLabel = new JBLabel(INFO_DESCRIPTION);

        panel.add(infoLabel, BorderLayout.LINE_START);
        return panel;
    }

    private JBTabbedPane createTabbedPane() {

        javaTab = new MappingLanguageTab(mappingsFilePath, TermMapperManager.JAVA);
        swiftTab = new MappingLanguageTab(mappingsFilePath, TermMapperManager.SWIFT);

        JBTabbedPane tabbedPane = new JBTabbedPane();
        tabbedPane.add("Java", javaTab);
        tabbedPane.add("Swift", swiftTab);
        return tabbedPane;
    }

    @Override
    public void apply() {
        javaTab.apply();
        swiftTab.apply();
    }

    @Override
    public boolean isModified() {
        return javaTab.isModified() || swiftTab.isModified();
    }

    @Override
    public void reset() {
        javaTab.reset();
        swiftTab.reset();
    }
}
