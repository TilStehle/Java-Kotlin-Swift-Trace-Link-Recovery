package view.resultPopup;

import com.intellij.ui.components.JBLabel;
import com.intellij.util.ui.UIUtil;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import view.IconProvider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.Consumer;

/**
 * Created by Tilmann Stehle.
 */
public class CheckboxListCellRenderer implements ListCellRenderer<TraceabilityLink> {

    private DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private java.util.List _selectedLinks;

    public CheckboxListCellRenderer(java.util.List<TraceabilityLink> selectedLinks){
        this._selectedLinks = selectedLinks;
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends TraceabilityLink> list, final TraceabilityLink value, int index, boolean isSelected, boolean cellHasFocus) {

        TraceabilityPointer pointer = value.getTarget();

        Double probability = value.getProbability();
        JCheckBox checkBox = new JCheckBox(pointer.getDisplayName());
        checkBox.setSelected(_selectedLinks.contains(value));
        checkBox.setEnabled(true);
        JBLabel linkLabel = new JBLabel(IconProvider.getIconForTraceabilityLink(pointer));

        JBLabel fileInfoLabel = new JBLabel(getPointerInfo(pointer));
        fileInfoLabel.setFontColor(UIUtil.FontColor.BRIGHTER);

        JPanel cellPanel = new JPanel(new BorderLayout(5, 5));
        cellPanel.add(linkLabel, BorderLayout.WEST);
        cellPanel.add(checkBox, BorderLayout.CENTER);
        cellPanel.add(fileInfoLabel, BorderLayout.EAST);

        cellPanel.setBackground(UIUtil.getListBackground(cellHasFocus));

        return cellPanel;
    }

    private String getPointerInfo(TraceabilityPointer pointer) {

        String sourceFilePath = pointer.getSourceFilePath();
        String info = sourceFilePath.substring(sourceFilePath.lastIndexOf(File.separator) + 1, sourceFilePath.indexOf("."));
        return info;
    }
}
