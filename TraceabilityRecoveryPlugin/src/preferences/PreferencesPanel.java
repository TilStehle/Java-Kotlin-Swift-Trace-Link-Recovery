package preferences;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.ui.VerticalFlowLayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gerrit Greiert on 16.02.17.
 */
public class PreferencesPanel extends JPanel {

    private TextFieldWithBrowseButton implementationPathTextField;

    public PreferencesPanel(){

        this.setLayout(new VerticalFlowLayout(true, false));
        this.add(createLinkedProjectPathPanel());
    }

    private JPanel createLinkedProjectPathPanel() {

        JPanel panel = new JPanel(new BorderLayout(5,5));

        JLabel titleLabel = new JLabel("Path of linked implementation:");
        implementationPathTextField = new TextFieldWithBrowseButton();
        implementationPathTextField.setEditable(false);

        implementationPathTextField.addBrowseFolderListener("J2Swift", "Select a J2Swift target path for the converted files",
                null, new FileChooserDescriptor(false, true, false, false, false, false));

        panel.add(titleLabel, BorderLayout.LINE_START);
        panel.add(implementationPathTextField, BorderLayout.CENTER);

        return panel;
    }

    public String getImplementationPath(){
        return implementationPathTextField.getText();
    }
    public void setImplementationPath(String path){
        implementationPathTextField.setText(path);
    }
}
