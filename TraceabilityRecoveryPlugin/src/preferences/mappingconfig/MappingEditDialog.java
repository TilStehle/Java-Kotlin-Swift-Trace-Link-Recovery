package preferences.mappingconfig;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gerrit Greiert on 14.04.17.
 */
public class MappingEditDialog extends DialogWrapper {

    private JComboBox typeComboBox;
    private JBTextField sourceTextField;
    private JBTextField targetTextField;

    private final String[] typeOptions = {MappingsTableModel.TYPE, MappingsTableModel.VARIABLE, MappingsTableModel.FUNCTION};

    protected MappingEditDialog(@Nullable Project project) {
        super(project);
        init();
    }

    protected MappingEditDialog(@Nullable Project project, String type, String source, String target){
        super(project);
        init();
        typeComboBox.setSelectedItem(type);
        sourceTextField.setText(source);
        targetTextField.setText(target);
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {

        JPanel labelPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        JBLabel typeLabel = new JBLabel(MappingsTableModel.TYPE_COLUMN_NAME);
        JBLabel sourceLabel = new JBLabel(MappingsTableModel.SOURCE_COLUMN_NAME);
        JBLabel targetLabel = new JBLabel(MappingsTableModel.TARGET_COLUMN_NAME);
        labelPanel.add(typeLabel);
        labelPanel.add(sourceLabel);
        labelPanel.add(targetLabel);

        JPanel textFieldPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        typeComboBox = new ComboBox(typeOptions);
        sourceTextField = new JBTextField();
        targetTextField = new JBTextField();
        textFieldPanel.add(typeComboBox);
        textFieldPanel.add(sourceTextField);
        textFieldPanel.add(targetTextField);

        JPanel editorPanel = new JPanel(new BorderLayout(5, 5));
        editorPanel.add(labelPanel, BorderLayout.LINE_START);
        editorPanel.add(textFieldPanel, BorderLayout.CENTER);

        return editorPanel;
    }

    public String getType(){
        return typeComboBox.getSelectedItem().toString();
    }

    public String getSource(){
        return sourceTextField.getText();
    }

    public String getTarget(){
        return targetTextField.getText();
    }
}
