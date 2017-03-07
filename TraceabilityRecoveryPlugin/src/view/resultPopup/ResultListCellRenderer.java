package view.resultPopup;

import com.intellij.ui.components.JBLabel;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import view.IconProvider;

import javax.swing.*;
import java.awt.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Gerrit Greiert on 23.02.17.
 */
public class ResultListCellRenderer implements ListCellRenderer<TraceabilityLink> {

    private DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public ResultListCellRenderer(){
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends TraceabilityLink> list, TraceabilityLink value, int index, boolean isSelected, boolean cellHasFocus) {

        TraceabilityPointer pointer = value.getTarget();

        JBLabel probabilityLabel = new JBLabel("score: "+decimalFormat.format(value.getProbability()));

        JBLabel linkLabel = new JBLabel(pointer.getDisplayName());
        linkLabel.setIcon(IconProvider.getIconForTraceabilityLink(pointer));

        JPanel cellPanel = new JPanel(new BorderLayout(5, 5));
        cellPanel.add(probabilityLabel, BorderLayout.WEST);
        cellPanel.add(linkLabel, BorderLayout.CENTER);

        return cellPanel;
    }
}
