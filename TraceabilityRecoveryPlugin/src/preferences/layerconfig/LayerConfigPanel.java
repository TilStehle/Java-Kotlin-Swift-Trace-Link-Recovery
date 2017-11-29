package preferences.layerconfig;

import com.intellij.openapi.ui.VerticalFlowLayout;
import com.intellij.ui.AnActionButton;
import com.intellij.ui.AnActionButtonRunnable;
import com.intellij.ui.ToolbarDecorator;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.table.JBTable;
import org.apache.commons.lang.ArrayUtils;
import preferences.ApplyResetDelegate;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gerrit Greiert on 13.04.17.
 */
public class LayerConfigPanel extends JPanel implements ApplyResetDelegate {

    private static final String LAYERS_FILE_NAME = "/layers";
    private static final String INFO_DESCRIPTION = "Define Layers";


    private JBTable table;
    private ToolbarDecorator tableDecorator;

    private boolean modified = false;
    private String layersFilePath;

    public LayerConfigPanel(String configFilePath) {

        this.layersFilePath = configFilePath + LAYERS_FILE_NAME;

        this.setLayout(new VerticalFlowLayout(true, false));
        this.add(createInfoPanel());
        this.add(createTablePanel());
    }

    private JPanel createInfoPanel(){

        JPanel panel = new JPanel(new BorderLayout(5, 5));

        JBLabel infoLabel = new JBLabel(INFO_DESCRIPTION);

        panel.add(infoLabel, BorderLayout.LINE_START);
        return panel;
    }

    private JPanel createTablePanel() {

        JPanel panel = new JPanel(new BorderLayout(5, 5));

        LayerTableModel model = new LayerTableModel(layersFilePath);
        table = new JBTable(model);

        panel.add(new JBScrollPane(table),BorderLayout.CENTER);
        panel.add(createTableDecorator());
        return panel;
    }

    private JPanel createTableDecorator(){

        tableDecorator = ToolbarDecorator.createDecorator(table);

        tableDecorator.setAddAction(new AnActionButtonRunnable() {
            @Override
            public void run(AnActionButton anActionButton) {

                LayerEditDialog layerEditDialog = new LayerEditDialog(null);
                layerEditDialog.show();
                if (layerEditDialog.isOK()){
                    getTableModel().addRow(new String[]{layerEditDialog.getSelector(), layerEditDialog.getLayer()});
                    modified = true;
                }
            }
        });

        tableDecorator.setRemoveAction(new AnActionButtonRunnable() {
            @Override
            public void run(AnActionButton anActionButton) {

                int[] indices = table.getSelectedRows();
                ArrayUtils.reverse(indices);
                for (int index : indices) {
                    getTableModel().removeRow(index);
                    modified = true;
                }
            }
        });

        tableDecorator.setEditAction(new AnActionButtonRunnable() {
            @Override
            public void run(AnActionButton anActionButton) {

                int rowIndex = table.getSelectedRow();
                String selector = (String) getTableModel().getValueAt(rowIndex, 0);
                String layer = (String) getTableModel().getValueAt(rowIndex, 1);
                LayerEditDialog layerEditDialog = new LayerEditDialog(null, selector, layer);
                layerEditDialog.show();
                if (layerEditDialog.isOK()){
                    getTableModel().setValueAt(layerEditDialog.getSelector(), rowIndex, 0);
                    getTableModel().setValueAt(layerEditDialog.getLayer(), rowIndex, 1);
                    modified = true;
                }
            }
        });

        return tableDecorator.createPanel();
    }

    private LayerTableModel getTableModel(){
        return (LayerTableModel) table.getModel();
    }

    @Override
    public void apply() {
        getTableModel().writeLayers();
        modified = false;
    }

    @Override
    public boolean isModified() {
        return modified;
    }

    @Override
    public void reset() {
        table.setModel(new LayerTableModel(layersFilePath));
        modified = false;
    }
}
