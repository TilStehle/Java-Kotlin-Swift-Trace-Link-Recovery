package actions.intentions;

import actions.opener.TPointerOpenerFactory;
import actions.psiutils.TraceabilityPointerCreator;
import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.util.IncorrectOperationException;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.Language;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.psi.KtClass;
import org.jetbrains.kotlin.psi.KtNamedFunction;
import org.jetbrains.kotlin.psi.KtProperty;
import view.resultPopup.ResultFilter;
import view.resultPopup.ResultsPopup;

import java.util.List;

import static components.TraceabilityRecoveryComponent.*;

/**
 * Created by Gerrit Greiert on 29.05.17.
 */
public class TraceabilityQueryIntention implements IntentionAction{

    private static final String TEXT = "Show possible linked implementations";

    @Nls
    @NotNull
    @Override
    public String getText() {
        return TEXT;
    }

    @Nls
    @NotNull
    @Override
    public String getFamilyName() {
        return getText();
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile psiFile) {

        try {
            PsiElement psiElement = psiFile.findElementAt(editor.getCaretModel().getOffset());
            if (psiElement.getParent() != null)
                psiElement = psiElement.getParent();

            if (psiElement instanceof PsiClass || psiElement instanceof PsiMethod || psiElement instanceof PsiField
                    || psiElement instanceof KtClass || psiElement instanceof KtNamedFunction || psiElement instanceof KtProperty) {
                return true;
            }
        }
        catch (NullPointerException ex){
            ex.printStackTrace();
        }

        return false;
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, PsiFile psiFile) throws IncorrectOperationException {

        PsiElement psiElement = psiFile.findElementAt(editor.getCaretModel().getOffset());
        psiElement = psiElement.getParent();

        TraceabilityPointer pointer = TraceabilityPointerCreator.getPointerForPsiElement(psiElement);
        //System.out.println("Pointer: " + pointer.toString());

        ITraceabilityRecoveryService recoveryService = ServiceManager.getService(project, ITraceabilityRecoveryService.class);
        try {
            List<TraceabilityLink> results = recoveryService.getSortedTraceabilityLinksForPointer(pointer, Language.SWIFT);
            ResultsPopup resultsPopup = new ResultsPopup(results, editor, clickedPointer ->
                    TPointerOpenerFactory.createOpener().openTraceabilityPointer(clickedPointer));
            resultsPopup.setResultFilter(ResultFilter.getFilterForPointerType(pointer));
            resultsPopup.show();
        }
        catch (Exception ex){
            Notifications.Bus.notify(new Notification(NOTIFICATION_ID, QUERY_TITLE, QUERY_ERROR, NotificationType.ERROR));
        }
    }

    @Override
    public boolean startInWriteAction() {
        return false;
    }
}
