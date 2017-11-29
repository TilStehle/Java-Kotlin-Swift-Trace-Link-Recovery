package preferences.layerconfig;

import de.unihamburg.swk.parsing.document.LayerManager;

import javax.swing.table.DefaultTableModel;
import java.util.Map;

/**
 * Created by Gerrit Greiert on 13.04.17.
 */
public class LayerTableModel extends DefaultTableModel {

    public static final String SELECTOR_COLUMN_NAME = "Selector (Regex)";
    public static final String LAYER_COLUMN_NAME = "Layer";

    private final LayerManager layerManager;
    private final Map<String, String> layerMap;

    public LayerTableModel(String layerFilePath) {

        layerManager = LayerManager.INSTANCE;
        layerManager.setData(layerFilePath);
        layerMap = layerManager.getData();

        this.addColumn(SELECTOR_COLUMN_NAME, layerMap.keySet().toArray());
        this.addColumn(LAYER_COLUMN_NAME, layerMap.values().toArray());

    }

    public void writeLayers(){

        layerMap.clear();
        for (int rowIndex = 0; rowIndex < getRowCount(); rowIndex++) {
            String selector = (String) getValueAt(rowIndex, 0);
            String layer = (String) getValueAt(rowIndex, 1);
            layerMap.put(selector, layer);
        }


        layerManager.setData(layerMap);
        layerManager.persist();
    }

}


