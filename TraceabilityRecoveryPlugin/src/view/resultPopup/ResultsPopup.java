package view.resultPopup;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.ui.popup.ComponentPopupBuilder;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import org.jetbrains.annotations.Nullable;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
    private ResultPopupPanel popupPanel;

    public ResultsPopup(List<TraceabilityLink> results, @Nullable Editor editor, TraceabilityPointerClickedListener pointerClickedListener){

        this.editor = editor;
        results.sort(new TraceabilityLinkProbabilityComparator());

        JBPopupFactory popupFactory = ServiceManager.getService(JBPopupFactory.class);

        popupPanel = new ResultPopupPanel(results);
        ComponentPopupBuilder popupBuilder = popupFactory.createComponentPopupBuilder(popupPanel, popupPanel.getResultList());
        popup = popupBuilder.createPopup();

        popupPanel.getResultList().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()){
                    TraceabilityLink selectedLink = popupPanel.getSelectedLink();
                    TraceabilityPointer target = selectedLink.getTarget();
                    pointerClickedListener.onLinkedClicked(target);
                    popup.cancel();
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

    public void setResultFilter(ResultFilter filter){

        popupPanel.filter(filter);
    }
}
