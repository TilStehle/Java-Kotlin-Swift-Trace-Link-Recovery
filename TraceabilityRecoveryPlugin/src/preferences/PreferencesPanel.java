package preferences;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.ui.VerticalFlowLayout;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBPanel;
import com.intellij.ui.components.JBRadioButton;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;

/**
 * Created by Gerrit Greiert on 16.02.17.
 */
public class PreferencesPanel extends JPanel implements ApplyResetDelegate{

    private static final String PLUGIN_NAME = "TraceabilityRecovery";

    private TraceabilityRecoveryComponentConfiguration configuration;

    private String initialLinkedImplementationPath;
    private boolean initialIsCustomConfigPathSelected;
    private String initialCustomConfigPath;
    private long initialFileParserTimeout;

    private TextFieldWithBrowseButton implementationPathTextField;
    private JBRadioButton projectPathButton;
    private JBRadioButton customPathButton;
    private TextFieldWithBrowseButton customIndexPathTextField;
    private JFormattedTextField timeoutTextField;

    public PreferencesPanel(TraceabilityRecoveryComponentConfiguration configuration) {

        this.configuration = configuration;

        this.setLayout(new VerticalFlowLayout(true, false));
        this.add(createLinkedProjectPathPanel());
        this.add(createPathPanel());
        this.add(createTimeoutPanel());

        implementationPathTextField.setText(configuration.getLinkedImplementationPath());
        setUseCustomPath(configuration.isUseCustomConfigPath());
        customIndexPathTextField.setText(configuration.getCustomConfigPath());
        timeoutTextField.setValue(configuration.getFileParserTimeout());

        initialLinkedImplementationPath = configuration.getLinkedImplementationPath();
        initialIsCustomConfigPathSelected = configuration.isUseCustomConfigPath();
        initialCustomConfigPath = configuration.getCustomConfigPath();
        initialFileParserTimeout = configuration.getFileParserTimeout();
    }

    private JPanel createLinkedProjectPathPanel() {

        JPanel panel = new JPanel(new BorderLayout(5, 5));

        JLabel titleLabel = new JLabel("Path of linked implementation:");
        implementationPathTextField = new TextFieldWithBrowseButton();
        implementationPathTextField.setEditable(false);

        implementationPathTextField.addBrowseFolderListener(PLUGIN_NAME, "Select path to the corresponding Swift implementation",
                null, new FileChooserDescriptor(false, true, false, false, false, false));

        panel.add(titleLabel, BorderLayout.LINE_START);
        panel.add(implementationPathTextField, BorderLayout.CENTER);

        return panel;
    }

    private JBPanel createPathPanel() {

        JBPanel panel = new JBPanel(new VerticalFlowLayout(true, false));
        panel.setBorder(BorderFactory.createTitledBorder("Path settings"));

        JBLabel infoLabel = new JBLabel("Select directory where the Lucene index and config files shall be saved");

        projectPathButton = new JBRadioButton("Save in project directory");
        customPathButton = new JBRadioButton("Use custom path");
        ButtonGroup luceneIndexGroup = new ButtonGroup();
        luceneIndexGroup.add(projectPathButton);
        luceneIndexGroup.add(customPathButton);

        customIndexPathTextField = new TextFieldWithBrowseButton();
        customIndexPathTextField.setEditable(false);
        customIndexPathTextField.addBrowseFolderListener(PLUGIN_NAME, "Select directory where the Lucene index and config files shall be saved",
                null, new FileChooserDescriptor(false, true, false, false, false, false));

        panel.add(infoLabel);
        panel.add(projectPathButton);
        panel.add(customPathButton);
        panel.add(customIndexPathTextField);

        return panel;
    }

    private JBPanel createTimeoutPanel(){

        JBPanel panel = new JBPanel(new BorderLayout(5, 5));

        JBLabel infoLabel = new JBLabel("Define parser timeout for files:");
        JBLabel secondsLabel = new JBLabel("seconds");

        NumberFormat numberFormat = NumberFormat.getIntegerInstance();
        NumberFormatter formatter = new NumberFormatter(numberFormat);
        formatter.setValueClass(Long.class);
        formatter.setAllowsInvalid(false);

        timeoutTextField = new JFormattedTextField(formatter);
        timeoutTextField.setValue(60);

        panel.add(infoLabel, BorderLayout.LINE_START);
        panel.add(timeoutTextField, BorderLayout.CENTER);
        panel.add(secondsLabel, BorderLayout.LINE_END);

        return panel;
    }

    @Override
    public void apply() {
        configuration.setLinkedImplementationPath(implementationPathTextField.getText());
        initialLinkedImplementationPath = implementationPathTextField.getText();

        configuration.setUseCustomConfigPath(isCustomPathSelected());
        initialIsCustomConfigPathSelected = isCustomPathSelected();

        configuration.setCustomConfigPath(customIndexPathTextField.getText());
        initialCustomConfigPath = customIndexPathTextField.getText();

        configuration.setFileParserTimeout((Long) timeoutTextField.getValue());
        initialFileParserTimeout = (long) timeoutTextField.getValue();
    }

    @Override
    public boolean isModified() {
        return !implementationPathTextField.getText().equals(initialLinkedImplementationPath)
                || (isCustomPathSelected() != initialIsCustomConfigPathSelected)
                || !customIndexPathTextField.getText().equals(initialCustomConfigPath)
                || ((long )timeoutTextField.getValue() != initialFileParserTimeout);
    }

    @Override
    public void reset() {
        implementationPathTextField.setText(initialLinkedImplementationPath);
        setUseCustomPath(initialIsCustomConfigPathSelected);
        customIndexPathTextField.setText(initialCustomConfigPath);
        timeoutTextField.setValue(initialFileParserTimeout);
    }

    public void setUseCustomPath(boolean useCustomPath) {
        if (useCustomPath){
            customPathButton.setSelected(true);
        }else {
            projectPathButton.setSelected(true);
        }
    }

    public boolean isCustomPathSelected(){
        if (projectPathButton.isSelected() && !customPathButton.isSelected())
            return false;
        else return true;
    }
}
