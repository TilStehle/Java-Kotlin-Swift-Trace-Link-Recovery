package actions;

import actions.opener.TPointerOpenerFactory;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.intellij.navigation.ChooseByNameContributor;
import com.intellij.navigation.ChooseByNameRegistry;
import com.intellij.navigation.GotoClassContributor;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.psi.*;
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

    public static class Event{}
    @Override
    public void actionPerformed(AnActionEvent event) {

        PsiFile currentPsiFile = event.getData(PlatformDataKeys.PSI_FILE);
        SearchQueryDialog queryDialog = new SearchQueryDialog(event.getProject(), currentPsiFile);
        queryDialog.show();

        if (queryDialog.getExitCode() == DialogWrapper.OK_EXIT_CODE) {
            String[] separatedQueryTerms = queryDialog.getQuery().replaceAll("\\s+", "").split(",");


            Multiset<String> queryTermsSet = HashMultiset.create(Arrays.asList(separatedQueryTerms));

            ITraceabilityRecoveryService recoveryService = ServiceManager.getService(event.getProject(), ITraceabilityRecoveryService.class);
            recoveryService.getLinksByClassName(separatedQueryTerms[0]);
            List<TraceabilityLink> results = recoveryService.getSortedTraceabilityLinksForQuery(queryTermsSet, Language.SWIFT);

            ResultsPopup resultsPopup = new ResultsPopup(results,"Choose a linked element to navigate to!", event.getData(PlatformDataKeys.EDITOR_EVEN_IF_INACTIVE), clickedPointer ->
                    TPointerOpenerFactory.createOpener().openTraceabilityPointer(clickedPointer));
            resultsPopup.show();
        }

    }
}
