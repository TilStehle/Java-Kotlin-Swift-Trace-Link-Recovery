package preferences.mappingconfig;

import de.unihamburg.swk.parsing.document.TermMapperManager;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Map;

/**
 * Created by Gerrit Greiert on 14.04.17.
 */
public class MappingsTableModel extends DefaultTableModel {

    public static final String TYPE_COLUMN_NAME = "Type";
    public static final String SOURCE_COLUMN_NAME = "Source";
    public static final String TARGET_COLUMN_NAME = "Target";

    public static final String TYPE = "Type";
    public static final String VARIABLE = "Variable";
    public static final String FUNCTION = "Method";

    private final TermMapperManager termMapperManager;
    private Map<String, String> types;
    private Map<String, String> variables;
    private Map<String, String> functions;

    public MappingsTableModel(String mappingsFilePath, TermMapperManager mapper){

        termMapperManager = mapper;
        termMapperManager.setData(mappingsFilePath);
        List<Map<String, String>> dataList = termMapperManager.getData();

        types = dataList.get(0);
        variables = dataList.get(1);
        functions = dataList.get(2);

        this.addColumn(TYPE_COLUMN_NAME);
        this.addColumn(SOURCE_COLUMN_NAME);
        this.addColumn(TARGET_COLUMN_NAME);

        for (Map.Entry<String, String> entry: types.entrySet()) {
            this.addRow(new String[]{TYPE, entry.getKey(), entry.getValue()});
        }
        for (Map.Entry<String, String> entry: variables.entrySet()) {
            this.addRow(new String[]{VARIABLE, entry.getKey(), entry.getValue()});
        }
        for (Map.Entry<String, String> entry: functions.entrySet()) {
            this.addRow(new String[]{FUNCTION, entry.getKey(), entry.getValue()});
        }
    }

    public void writeMappings(){

        types.clear();
        variables.clear();
        functions.clear();

        for (int rowIndex = 0; rowIndex < getRowCount(); rowIndex++) {
            String type = (String) getValueAt(rowIndex, 0);
            String source = (String) getValueAt(rowIndex, 1);
            String target = (String) getValueAt(rowIndex, 2);

            if (type.equals(TYPE)){
                types.put(source, target);
            }
            else if (type.equals(VARIABLE)) {
                variables.put(source, target);
            }
            else if (type.equals(FUNCTION)) {
                functions.put(source, target);
            }
            else
                System.out.println("Unknown mapping type");

        }

        termMapperManager.setData(types, functions, variables);
        TermMapperManager.persist();
    }
}
