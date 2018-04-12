package view.resultPopup;

import com.intellij.ui.components.JBList;
import com.intellij.ui.components.JBPanel;
import com.intellij.ui.components.JBRadioButton;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.components.panels.HorizontalLayout;
import com.intellij.ui.components.panels.VerticalLayout;
import de.unihamburg.masterprojekt2016.traceability.*;
import view.IconProvider;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by Gerrit Greiert on 25.06.17.
 */
public class ResultPopupPanel extends JBPanel {

    private List<TraceabilityLink> traceabilityLinks;
    private JBList resultList;

    private JBRadioButton allButton;
    private JBRadioButton classButton;
    private JBRadioButton methodButton;
    private JBRadioButton attributeButton;
    private ResultFilter filter;

    public ResultPopupPanel(List<TraceabilityLink> traceabilityLinks){

        this.traceabilityLinks = traceabilityLinks;
        this.setLayout(new VerticalLayout(5));

        this.add(createFilterBar());
        this.add(createResultList());
        this.filter(ResultFilter.ALL);
    }

    private JBPanel createFilterBar() {

        JBPanel filterBar = new JBPanel(new HorizontalLayout(10));

        allButton = new JBRadioButton("All", IconProvider.TRACEABILITY_ICON);
        classButton = new JBRadioButton("Classes", IconProvider.LINK_CLASS);
        methodButton = new JBRadioButton("Methods", IconProvider.LINK_METHOD);
        attributeButton = new JBRadioButton("Attributes", IconProvider.LINK_FIELD);

        ButtonGroup filterButtonGroup = new ButtonGroup();
        filterButtonGroup.add(allButton);
        filterButtonGroup.add(classButton);
        filterButtonGroup.add(methodButton);
        filterButtonGroup.add(attributeButton);

        filterBar.add(allButton);
        filterBar.add(classButton);
        filterBar.add(methodButton);
        filterBar.add(attributeButton);

        allButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filter(ResultFilter.ALL);
            }
        });
        classButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filter(ResultFilter.CLASS);
            }
        });
        methodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filter(ResultFilter.METHOD);
            }
        });
        attributeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filter(ResultFilter.ATTRIBUTE);
            }
        });

        return  filterBar;
    }

    private JBScrollPane createResultList(){

        resultList = new JBList();
        resultList.setCellRenderer(new ResultListCellRenderer());
        resultList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        return new JBScrollPane(resultList);
    }

    public void filter(ResultFilter filter){
        this.filter= filter;

        DefaultListModel<TraceabilityLink> filteredListModel = new DefaultListModel<>();

        List<TraceabilityLink> filteredList = new ArrayList<>();

        switch (filter){
            case ALL:
                filteredList = traceabilityLinks;
                allButton.setSelected(true);
                break;
            case CLASS:
                filteredList = traceabilityLinks.stream().filter(p -> p.getTarget() instanceof TypePointer).collect(Collectors.toList());
                classButton.setSelected(true);
                break;
            case METHOD:
                filteredList = traceabilityLinks.stream().filter(p -> p.getTarget() instanceof MethodPointer || p.getTarget() instanceof ConstructorPointer || p.getTarget() instanceof FunctionPointer).collect(Collectors.toList());
                methodButton.setSelected(true);
                break;
            case ATTRIBUTE:
                filteredList = traceabilityLinks.stream().filter(p -> p.getTarget() instanceof AttributePointer).collect(Collectors.toList());
                attributeButton.setSelected(true);
                break;
        }

        for (TraceabilityLink link: filteredList) {
            filteredListModel.addElement(link);
        }
        resultList.setModel(filteredListModel);
    }

    public TraceabilityLink getSelectedLink(){

        TraceabilityLink selectedLink = (TraceabilityLink) resultList.getSelectedValue();
        return selectedLink;
    }

    public JBList getResultList(){

        return resultList;
    }

    public ResultFilter getFilter() {
        return filter;
    }
}
