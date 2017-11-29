package preferences.layerconfig;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gerrit Greiert on 13.04.17.
 */
public class LayerEditDialog extends DialogWrapper {

    private JBTextField selectorTextField;
    private JBTextField layerTextField;

    protected LayerEditDialog(@Nullable Project project) {
        super(project);
        init();
    }

    protected LayerEditDialog(@Nullable Project project, String selector, String layer){
        super(project);
        init();
        selectorTextField.setText(selector);
        layerTextField.setText(layer);
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {

        JPanel labelPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        JBLabel selectorLabel = new JBLabel(LayerTableModel.SELECTOR_COLUMN_NAME);
        JBLabel layerLabel = new JBLabel(LayerTableModel.LAYER_COLUMN_NAME);
        labelPanel.add(selectorLabel);
        labelPanel.add(layerLabel);

        JPanel textFieldPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        selectorTextField = new JBTextField();
        layerTextField = new JBTextField();
        textFieldPanel.add(selectorTextField);
        textFieldPanel.add(layerTextField);

        JPanel editorPanel = new JPanel(new BorderLayout(5, 5));
        editorPanel.add(labelPanel, BorderLayout.LINE_START);
        editorPanel.add(textFieldPanel, BorderLayout.CENTER);

        return editorPanel;
    }

    public String getSelector() {
        return selectorTextField.getText();
    }

    public String getLayer() {
        return layerTextField.getText();
    }
}
