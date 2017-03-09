package view;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.VerticalFlowLayout;
import com.intellij.psi.*;
import com.intellij.ui.TextFieldWithAutoCompletion;
import com.intellij.ui.TextFieldWithAutoCompletionListProvider;
import com.intellij.ui.components.JBLabel;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tilmann Stehle on 09.03.17.
 */
public class ToDoCommentsDialog extends DialogWrapper {

    private static final String TITLE = "Create ToDo Comment";
    private static final float HORIZONTAL_STRETCH_FACTOR = 2;
    private static final String INFO_LABEL_TEXT = "Type your Todo Comment";

    private Project project;
    private TextFieldWithAutoCompletionListProvider<String> provider = null;
    private TextFieldWithAutoCompletion commentTextField;

    public ToDoCommentsDialog(@Nullable Project project, @Nullable PsiFile currentPsile){
        super(project);
        this.project = project;
        provider = getCompletionProviderForClass(currentPsile);
        init();
    }

    private TextFieldWithAutoCompletionListProvider<String> getCompletionProviderForClass(PsiFile currentPsiFile) {

        if (currentPsiFile != null) {
            List<String> keywordsFromClass = new ArrayList<String>();

            for (PsiElement element : currentPsiFile.getChildren()) {
                if (element instanceof PsiClass) {

                    PsiClass psiClass = (PsiClass) element;
                    keywordsFromClass.add(psiClass.getName());

                    for (PsiMethod psiMethod : psiClass.getMethods()) {
                        keywordsFromClass.add(psiMethod.getName());
                    }
                    for (PsiField psiField : psiClass.getFields()) {
                        keywordsFromClass.add(psiField.getName());
                    }
                }
            }

            return new TextFieldWithAutoCompletion.StringsCompletionProvider(keywordsFromClass, null);
        }
        else return new TextFieldWithAutoCompletion.StringsCompletionProvider(null, null);
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        this.setTitle(TITLE);
        this.setHorizontalStretch(HORIZONTAL_STRETCH_FACTOR);

        JPanel dialogPanel = new JPanel(new VerticalFlowLayout(true, false));

        JBLabel infoLabel = new JBLabel(INFO_LABEL_TEXT);
        commentTextField = new TextFieldWithAutoCompletion(project, provider, false, null);

        dialogPanel.add(infoLabel);
        dialogPanel.add(commentTextField);

        return dialogPanel;
    }

    @Nullable
    @Override
    public JComponent getPreferredFocusedComponent() {
        return commentTextField;
    }

    public String getTodoComment(){
        return commentTextField.getText();
    }
}
