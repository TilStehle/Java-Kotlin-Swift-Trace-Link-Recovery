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
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiMethod;
import com.intellij.refactoring.rename.PsiElementRenameHandler;
import com.intellij.ui.CheckBoxList;
import de.unihamburg.masterprojekt2016.traceability.MethodPointer;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import view.IconProvider;

import javax.swing.*;
import java.util.*;

/**
 * Created by Tilmann Stehle on 06.12.2016.
 */
public class CrossPlatformRenameHandler extends PsiElementRenameHandler {

    public CrossPlatformRenameHandler() {
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, PsiFile file, DataContext dataContext) {

        ITraceabilityRecoveryService _traceabilityService = ServiceManager.getService(project, ITraceabilityRecoveryService.class);

        PsiElement preRenameElement = getElement(dataContext);
        if (preRenameElement instanceof PsiMethod) {
            PsiMethod preRenameMethod = (PsiMethod) preRenameElement;
            TraceabilityPointer methodPointer = TraceabilityPointerCreator.getPointerForPsiElement(preRenameMethod);
            List<TraceabilityLink> traceabilityLinks = _traceabilityService.getSortedTraceabilityLinksForPointer(methodPointer, Language.SWIFT);
            super.invoke(project, editor, file, dataContext);
            if (traceabilityLinks != null && !traceabilityLinks.isEmpty()) {
                PsiElement renamedElement = getElement(dataContext);
                PsiMethod renamedMethod = (PsiMethod) renamedElement;
                String newName = renamedMethod.getName();

                TraceabilityPointer renamedMethodPointer = TraceabilityPointerCreator.getPointerForPsiElement(renamedMethod);


                ChooseLinksDialog dialogWrapper = new ChooseLinksDialog(project, traceabilityLinks);
                if (dialogWrapper.showAndGet()) {
                    List<TraceabilityLink> selectedLinks = dialogWrapper.getSelectedLinks();
                    for (TraceabilityLink selectedLink : selectedLinks) {
                        if (selectedLink.getTarget() instanceof MethodPointer) {
                            MethodPointer swiftMethodPointerToRename = (MethodPointer) selectedLink.getTarget();
                            String originalSwiftMethodName = swiftMethodPointerToRename.getName();
                            if (!originalSwiftMethodName.equals(newName)) {
                                int swiftMethodHeadLineNUmber = SwiftParserUtils.getMethodPosition((MethodPointer) swiftMethodPointerToRename).getLine();
                                String originalMethodLine = SwiftParserUtils.getLineOfFile(swiftMethodPointerToRename, swiftMethodHeadLineNUmber);
                                String fullyQualifiedName = swiftMethodPointerToRename.getTypePointer().getFullyQualifiedName();
                                String typeName = fullyQualifiedName.substring(fullyQualifiedName.lastIndexOf('.') + 1);
                                TokenPosition originalMethodPosition = SwiftParserUtils.getMethodPosition(swiftMethodPointerToRename);
                                XCodeController.renameMethod(typeName, swiftMethodPointerToRename.getName(), originalMethodPosition, newName, swiftMethodPointerToRename.getSourceFilePath());
                                String renamedMethodLine = SwiftParserUtils.getLineOfFile(swiftMethodPointerToRename, swiftMethodHeadLineNUmber);
                                if (!renamedMethodLine.equals(originalMethodLine))//rename was successful
                                {
                                    swiftMethodPointerToRename.setName(newName);
                                }

                            }
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
            setTitle("Choose linked methods to rename accordingly!");
            init();
        }


        @Nullable
        @Override
        protected JComponent createCenterPanel() {
            JCheckBox[] checkBoxes = new JCheckBox[_traceabilityLinks.size()];
            TraceabilityLink[] array = _traceabilityLinks.toArray(new TraceabilityLink[_traceabilityLinks.size()]);
            for (int i = 0; i < array.length; i++) {
                TraceabilityLink link = array[i];
                JCheckBox checkbox = new JCheckBox(link.getTarget().getDisplayName(),IconProvider.getIconForTraceabilityLink(link.getTarget()));
                checkbox.setEnabled(true);
                checkBoxes[i] = checkbox;
                _checkBoxesAndTheirLinks.put(checkbox, link);
            }

            _list = new CheckBoxList();
            _list.setListData(checkBoxes);
            return _list;
        }

        public List<TraceabilityLink> getSelectedLinks() {
            List<TraceabilityLink> selectedLinks = new ArrayList<>();
            for (Object checkBoxAsObject : _list.getSelectedValuesList()) {
                selectedLinks.add(_checkBoxesAndTheirLinks.get(checkBoxAsObject));
            }
            return selectedLinks;
        }

    }

}
