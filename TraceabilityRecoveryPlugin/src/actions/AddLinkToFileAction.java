package actions;

import actions.psiutils.TraceabilityPointerCreator;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
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
import de.unihamburg.masterprojekt2016.traceability.XMLExport;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.Language;
import org.jetbrains.kotlin.psi.KtClass;
import org.jetbrains.kotlin.psi.KtNamedFunction;
import org.jetbrains.kotlin.psi.KtProperty;
import view.resultPopup.ResultsPopup;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static components.TraceabilityRecoveryComponent.*;

/**
 * Created by Gerrit Greiert on 16.02.17.
 */
public class AddLinkToFileAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {

        PsiElement psiElement = event.getData(LangDataKeys.PSI_ELEMENT);

        TraceabilityPointer pointer = TraceabilityPointerCreator.getPointerForPsiElement(psiElement);
        //System.out.println("Pointer: " + pointer.toString());

        ITraceabilityRecoveryService recoveryService = ServiceManager.getService(event.getProject(), ITraceabilityRecoveryService.class);
        try {
            List<TraceabilityLink> results = recoveryService.getSortedTraceabilityLinksForPointer(pointer, Language.SWIFT);
            ResultsPopup resultsPopup = new ResultsPopup(results,"", event.getData(PlatformDataKeys.EDITOR_EVEN_IF_INACTIVE), clickedPointer ->
                    exportLinkToFile(new TraceabilityLink(pointer, clickedPointer, 1d))
            );
            //resultsPopup.setResultFilter(ResultFilter.getFilterForPointerType(pointer));
            resultsPopup.show();
        } catch (Exception ex) {
            Notifications.Bus.notify(new Notification(NOTIFICATION_ID, QUERY_TITLE, QUERY_ERROR, NotificationType.ERROR));
        }
    }

    private void exportLinkToFile(TraceabilityLink link) {
        try {
            Files.write(Paths.get("/Users/tilmannstehle/Documents/DissWorkspace/Traceability_Optimierung/testDocs/TraceabilityModel.xml"), XMLExport.createStringFromLink(link).getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void update(AnActionEvent anActionEvent) {

        PsiElement psiElement = anActionEvent.getData(LangDataKeys.PSI_ELEMENT);

        if (psiElement instanceof PsiClass || psiElement instanceof PsiMethod || psiElement instanceof PsiField
                || psiElement instanceof KtClass || psiElement instanceof KtNamedFunction || psiElement instanceof KtProperty) {
            anActionEvent.getPresentation().setEnabled(true);
        } else {
            anActionEvent.getPresentation().setEnabled(false);
        }
    }
}
