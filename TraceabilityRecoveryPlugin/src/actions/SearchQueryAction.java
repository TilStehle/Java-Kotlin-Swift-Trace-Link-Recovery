package actions;

import actions.opener.TPointerOpenerFactory;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiField;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.Language;
import view.SearchQueryDialog;
import view.resultPopup.ResultsPopup;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Gerrit Greiert on 19.02.17.
 */
public class SearchQueryAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {

        PsiFile currentPsiFile = event.getData(PlatformDataKeys.PSI_FILE);

        SearchQueryDialog queryDialog = new SearchQueryDialog(event.getProject(), currentPsiFile);
        queryDialog.show();

        if (queryDialog.getExitCode() == DialogWrapper.OK_EXIT_CODE) {
            System.out.println("Query: " + queryDialog.getQuery());

            String[] separatedQueryTerms = queryDialog.getQuery().replaceAll("\\s+", "").split(",");

            Multiset<String> queryTermsSet = HashMultiset.create(Arrays.asList(separatedQueryTerms));

            ITraceabilityRecoveryService recoveryService = ServiceManager.getService(event.getProject(), ITraceabilityRecoveryService.class);
            List<TraceabilityLink> results = recoveryService.getSortedTraceabilityLinksForQuery(queryTermsSet, Language.SWIFT);

            ResultsPopup resultsPopup = new ResultsPopup(results, event.getData(PlatformDataKeys.EDITOR_EVEN_IF_INACTIVE), clickedPointer ->
                    TPointerOpenerFactory.createOpener().openTraceabilityPointer(clickedPointer));
            resultsPopup.show();
        }

    }
}
