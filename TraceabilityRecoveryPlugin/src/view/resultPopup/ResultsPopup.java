package view.resultPopup;

import actions.opener.TPointerOpenerFactory;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.ui.popup.*;
import com.intellij.ui.components.JBList;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.List;

/**
 * Created by Gerrit Greiert on 23.02.17.
 */
public class ResultsPopup {
    public interface TraceabilityPointerClickedListener {
        public void onLinkedClicked(TraceabilityPointer clickedPointer);
    }
    private Editor editor;
    private JBPopup popup;

    public ResultsPopup(List<TraceabilityLink> results, @Nullable Editor editor, TraceabilityPointerClickedListener pointerClickedListener){

        this.editor = editor;
        results.sort(new TraceabilityLinkProbabilityComparator());

        JBPopupFactory popupFactory = ServiceManager.getService(JBPopupFactory.class);
        JList<TraceabilityLink> resultsList = new JBList(results);
        resultsList.setCellRenderer(new ResultListCellRenderer());
        PopupChooserBuilder listPopupBuilder = popupFactory.createListPopupBuilder(resultsList);
        popup = listPopupBuilder.createPopup();

        popup.addListener(new JBPopupListener.Adapter() {
            @Override
            public void onClosed(LightweightWindowEvent event) {
                int selectedIndex = resultsList.getSelectedIndex();
                if (event.isOk()) {
                    TraceabilityPointer target = results.get(selectedIndex).getTarget();
                    pointerClickedListener.onLinkedClicked(target);
                }
            }
        });
    }

    public void show(){

        if (editor != null){
            popup.showInBestPositionFor(editor);
        }
        else popup.showInFocusCenter();
    }
}
