package actions;

import actions.filewriter.CommentWriter;
import actions.psiutils.TraceabilityPointerCreator;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.popup.Balloon;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.psi.*;
import com.intellij.ui.awt.RelativePoint;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.Language;
import view.ToDoCommentsDialog;
import view.resultPopup.ResultsPopup;

import java.util.List;

/**
 * Created by Tilmann Stehle on 09.03.2017.
 */
public class GenerateTodoCommentAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {

        PsiElement psiElement = event.getData(LangDataKeys.PSI_ELEMENT);

        TraceabilityPointer pointer = TraceabilityPointerCreator.getPointerForPsiElement(psiElement);

        ITraceabilityRecoveryService recoveryService = ServiceManager.getService(event.getProject(), ITraceabilityRecoveryService.class);
        List<TraceabilityLink> results = recoveryService.getSortedTraceabilityLinksForPointer(pointer, Language.SWIFT);

        ResultsPopup resultsPopup = new ResultsPopup(results,"Select a linked element at which the comment shall be placed!", event.getData(PlatformDataKeys.EDITOR_EVEN_IF_INACTIVE), clickedPointer ->
                createTodoCommentAtPointer(clickedPointer,event));
        resultsPopup.show();
    }

    private void createTodoCommentAtPointer(TraceabilityPointer clickedPointer, AnActionEvent event) {


        PsiFile currentPsiFile = event.getData(PlatformDataKeys.PSI_FILE);

        ToDoCommentsDialog toDoCommentsDialog = new ToDoCommentsDialog(event.getProject(), currentPsiFile);
        toDoCommentsDialog.show();
        Editor editor = FileEditorManager.getInstance(event.getProject()).getSelectedTextEditor();
        RelativePoint dialogCenter = RelativePoint.getCenterOf(editor.getComponent());
        if (toDoCommentsDialog.getExitCode() == DialogWrapper.OK_EXIT_CODE) {
            String todoComment = toDoCommentsDialog.getTodoComment();
            try {
                new CommentWriter(clickedPointer).addTodoComment(todoComment);
            } catch (Exception e) {
                JBPopupFactory.getInstance()
                        .createHtmlTextBalloonBuilder("Failed to insert comment "+e.getLocalizedMessage(), MessageType.ERROR, null)
                        .setFadeoutTime(7500)
                        .createBalloon()
                        .show(dialogCenter,
                                Balloon.Position.atRight);
            }
        }
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
