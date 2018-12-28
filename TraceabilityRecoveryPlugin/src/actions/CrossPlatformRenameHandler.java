package actions;

import actions.opener.XCodeController;
import actions.psiutils.SwiftParserUtils;
import actions.psiutils.TokenPosition;
import actions.psiutils.TraceabilityPointerCreator;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiMethod;
import com.intellij.refactoring.rename.PsiElementRenameHandler;
import com.intellij.ui.CheckBoxList;
import de.unihamburg.masterprojekt2016.traceability.MethodPointer;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointer;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.Language;
import de.unihamburg.swk.traceabilityrecovery.commands.ReplaceDocumentsForFilePathsCommand;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import view.resultPopup.MultipleTraceLinkSelectionPanel;

import javax.swing.*;
import java.io.IOException;
import java.util.*;

/**
 * Created by Tilmann Stehle on 06.12.2016.
 */
public class CrossPlatformRenameHandler extends PsiElementRenameHandler {

    private MultipleTraceLinkSelectionPanel _selectionPanel;

    public CrossPlatformRenameHandler() {
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, PsiFile file, DataContext dataContext) {

        ITraceabilityRecoveryService _traceabilityService = ServiceManager.getService(project, ITraceabilityRecoveryService.class);

        PsiElement preRenameElement = getElement(dataContext);
        TraceabilityPointer pointerOfElementToRename = null;
        if (preRenameElement instanceof PsiMethod) {
            PsiMethod preRenameMethod = (PsiMethod) preRenameElement;
            pointerOfElementToRename = TraceabilityPointerCreator.getPointerForPsiElement(preRenameMethod);
        }
        else if(preRenameElement instanceof PsiClass)
        {
            PsiClass preRenameClass = (PsiClass) preRenameElement;
            pointerOfElementToRename = TraceabilityPointerCreator.getPointerForPsiElement(preRenameClass);

        }
        List<TraceabilityLink> traceabilityLinks = _traceabilityService.getSortedTraceabilityLinksForPointer(pointerOfElementToRename, Language.SWIFT);
        super.invoke(project, editor, file, dataContext);
        if (traceabilityLinks != null && !traceabilityLinks.isEmpty()) {
            PsiElement renamedElement = getElement(dataContext);
            String newName = null;
            if (renamedElement instanceof PsiMethod) {
                PsiMethod renamedMethod = (PsiMethod) renamedElement;
                newName = renamedMethod.getName();
            } else if (renamedElement instanceof PsiClass) {
                PsiClass renamedClass = (PsiClass) renamedElement;
                newName = renamedClass.getName();
            }

            ChooseLinksDialog dialogWrapper = new ChooseLinksDialog(project, traceabilityLinks);
            if (dialogWrapper.showAndGet()) {
                List<TraceabilityLink> selectedLinks = dialogWrapper.getSelectedLinks();
                for (TraceabilityLink selectedLink : selectedLinks) {
                    if (selectedLink.getTarget() instanceof MethodPointer) {
                        MethodPointer swiftMethodPointerToRename = (MethodPointer) selectedLink.getTarget();
                        String originalSwiftMethodName = swiftMethodPointerToRename.getName();
                        if (!originalSwiftMethodName.equals(newName)) {
                            String fullyQualifiedName = swiftMethodPointerToRename.getTypePointer().getFullyQualifiedName();
                            String typeName = fullyQualifiedName.substring(fullyQualifiedName.lastIndexOf('.') + 1);
                            TokenPosition originalMethodPosition = SwiftParserUtils.getMethodPosition(swiftMethodPointerToRename);
                            XCodeController.renameElementAtToken(typeName, swiftMethodPointerToRename.getName(), originalMethodPosition, newName, swiftMethodPointerToRename.getSourceFilePath());
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            try {
                                                _traceabilityService.enqueueCommand(new ReplaceDocumentsForFilePathsCommand(_traceabilityService, swiftMethodPointerToRename.getSourceFilePath()));
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    },
                                    2000
                            );
                        }
                    } else if (selectedLink.getTarget() instanceof TypePointer) {
                        TypePointer swiftTypePointerToRename = (TypePointer) selectedLink.getTarget();
                        String originalSwiftTypeName = swiftTypePointerToRename.getDisplayName();
                        if (!originalSwiftTypeName.equals(newName)) {
                            String fullyQualifiedName = swiftTypePointerToRename.getFullyQualifiedName();
                            String typeName = fullyQualifiedName.substring(fullyQualifiedName.lastIndexOf('.') + 1);
                            TokenPosition originalTypeNamePosition = SwiftParserUtils.getTypeNamePosition(swiftTypePointerToRename);
                            XCodeController.renameElementAtToken(typeName, swiftTypePointerToRename.getDisplayName(), originalTypeNamePosition, newName, swiftTypePointerToRename.getSourceFilePath());
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                        @Override
                                        public void run() {
                                            try {
                                                _traceabilityService.enqueueCommand(new ReplaceDocumentsForFilePathsCommand(_traceabilityService, swiftTypePointerToRename.getSourceFilePath()));
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    },
                                    2000
                            );
                        }
                    }
                }
            }
        }
    }

    private class ChooseLinksDialog extends DialogWrapper {

        private Collection<TraceabilityLink> _traceabilityLinks;
        private CheckBoxList<TraceabilityLink> _list;
        private Map<JCheckBox, TraceabilityLink> _checkBoxesAndTheirLinks = new HashMap<>();

        ChooseLinksDialog(Project project, Collection<TraceabilityLink> traceabilityLinks) {
            super(project);
            _traceabilityLinks = traceabilityLinks;
            setTitle("Choose linked elements to rename accordingly!");
            init();
        }


        @Nullable
        @Override
        protected JComponent createCenterPanel() {
            JCheckBox[] checkBoxes = new JCheckBox[_traceabilityLinks.size()];
            TraceabilityLink[] array = _traceabilityLinks.toArray(new TraceabilityLink[_traceabilityLinks.size()]);
            //for (int i = 0; i < array.length; i++) {
            //   TraceabilityLink link = array[i];
            //  Icon icon =IconProvider.getIconForTraceabilityLink(link.getTarget());
            //  JCheckBox checkbox = new JCheckBox(link.getTarget().getDisplayName(),icon);
            //  checkBoxes[i] = checkbox;
            //   _checkBoxesAndTheirLinks.put(checkbox, link);
            //}

            //_list = new CheckBoxList();
            //_list.setListData(checkBoxes);
            //return _list;
            _selectionPanel = new MultipleTraceLinkSelectionPanel(new ArrayList<>(_traceabilityLinks));
            return _selectionPanel;
        }

        public List<TraceabilityLink> getSelectedLinks() {
            return _selectionPanel.getSelectedLinks();
        }

    }

}
