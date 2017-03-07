package actions;

import actions.psiutils.TraceabilityPointerCreator;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiField;
import com.intellij.psi.PsiMethod;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import view.resultPopup.ResultsPopup;

import java.util.List;

/**
 * Created by Gerrit Greiert on 16.02.17.
 */
public class EditorQueryAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {

        PsiElement psiElement = event.getData(LangDataKeys.PSI_ELEMENT);

        TraceabilityPointer pointer = TraceabilityPointerCreator.getPointerForPsiElement(psiElement);
        System.out.println("Pointer: " + pointer.toString());

        ITraceabilityRecoveryService recoveryService = ServiceManager.getService(event.getProject(), ITraceabilityRecoveryService.class);
        List<TraceabilityLink> results = recoveryService.getSortedTraceabilityLinksForPointer(pointer);

        ResultsPopup resultsPopup = new ResultsPopup(results, event.getData(PlatformDataKeys.EDITOR_EVEN_IF_INACTIVE));
        resultsPopup.show();
    }

    @Override
    public void update(AnActionEvent anActionEvent){

        PsiElement psiElement = anActionEvent.getData(LangDataKeys.PSI_ELEMENT);
        if (psiElement instanceof PsiClass || psiElement instanceof PsiMethod || psiElement instanceof PsiField){
            anActionEvent.getPresentation().setEnabled(true);
        }
        else{
            anActionEvent.getPresentation().setEnabled(false);
        }
    }
}
