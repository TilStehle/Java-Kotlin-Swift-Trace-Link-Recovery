package preferences.mappingconfig;

import com.intellij.ui.AnActionButton;
import com.intellij.ui.AnActionButtonRunnable;
import com.intellij.ui.ToolbarDecorator;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.table.JBTable;
import de.unihamburg.swk.parsing.document.TermMapperManager;
import org.apache.commons.lang.ArrayUtils;
import preferences.ApplyResetDelegate;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gerrit Greiert on 14.04.17.
 */
public class MappingLanguageTab extends JPanel implements ApplyResetDelegate{

    private JBTable table;
    private ToolbarDecorator tableDecorator;

    private boolean modified = false;
    private String mappingsFilePath;
    private TermMapperManager mapper;

    public MappingLanguageTab(String mappingsFilePath, TermMapperManager mapper){
        super(new BorderLayout());
        this.mappingsFilePath = mappingsFilePath;
        this.mapper = mapper;

        this.add(createTablePanel(mapper), BorderLayout.CENTER);
    }

    private JPanel createTablePanel(TermMapperManager mapper) {

        JPanel panel = new JPanel(new BorderLayout(5, 5));

        MappingsTableModel model = new MappingsTableModel(mappingsFilePath, mapper);
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

                MappingEditDialog mappingEditDialog = new MappingEditDialog(null);
                mappingEditDialog.show();
                if (mappingEditDialog.isOK()){
                    getTableModel().addRow(new String[]{mappingEditDialog.getType(), mappingEditDialog.getSource(), mappingEditDialog.getTarget()});
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
                String type = (String) getTableModel().getValueAt(rowIndex, 0);
                String source = (String) getTableModel().getValueAt(rowIndex, 1);
                String target = (String) getTableModel().getValueAt(rowIndex, 2);
                MappingEditDialog mappingEditDialog = new MappingEditDialog(null, type, source, target);
                mappingEditDialog.show();
                if (mappingEditDialog.isOK()){
                    getTableModel().setValueAt(mappingEditDialog.getType(), rowIndex, 0);
                    getTableModel().setValueAt(mappingEditDialog.getSource(), rowIndex, 1);
                    getTableModel().setValueAt(mappingEditDialog.getTarget(), rowIndex, 2);
                    modified = true;
                }
            }
        });

        return tableDecorator.createPanel();
    }

    private MappingsTableModel getTableModel(){
        return (MappingsTableModel) table.getModel();
    }

    @Override
    public void apply() {
        getTableModel().writeMappings();
        modified = false;
    }

    @Override
    public boolean isModified() {
        return modified;
    }

    @Override
    public void reset() {
        table.setModel(new MappingsTableModel(mappingsFilePath, mapper));
        modified = false;
    }
}
