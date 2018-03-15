package actions.opener;

import com.intellij.openapi.ui.Messages;
import de.unihamburg.masterprojekt2016.traceability.*;

import java.io.File;

/**
 * Created by Gerrit Greiert on 04.01.17.
 */
public class MacTPointerOpener extends TPointerOpener {

    private String xCodeProjectPath = null;

    @Override
    public void openTraceabilityPointer(TraceabilityPointer pointer) {

        if (pointer instanceof TypePointer){
            openTraceabilityPointer((TypePointer) pointer);
        }
        else if (pointer instanceof MethodPointer){
            openTraceabilityPointer((MethodPointer) pointer);
        }
        else if (pointer instanceof ConstructorPointer){
            openTraceabilityPointer((ConstructorPointer) pointer);
        }
        else if (pointer instanceof AttributePointer){
            openTraceabilityPointer((AttributePointer) pointer);
        }
        /*else if (pointer instanceof PackagePointer){
            openTraceabilityPointer((PackagePointer) pointer);
        }*/
        else{
            super.openTraceabilityPointer(pointer);
        }

    }
    private String getFileNameFromPath(String path){
        File f = new File(path);
        return f.getName();
    }

    public void openTraceabilityPointer(TypePointer pointer) {
        XCodeController.openXCodeAtLine(getFileNameFromPath(pointer.getSourceFilePath()), pointer.getStartLine());
    }

    public void openTraceabilityPointer(MethodPointer pointer) {
        XCodeController.openXCodeAtLine(getFileNameFromPath(pointer.getSourceFilePath()), pointer.getStartLine());
    }

    public void openTraceabilityPointer(ConstructorPointer pointer) {
        XCodeController.openXCodeAtLine(getFileNameFromPath(pointer.getSourceFilePath()), pointer.getStartLine());
    }

    public void openTraceabilityPointer(AttributePointer pointer) {
        XCodeController.openXCodeAtLine(getFileNameFromPath(pointer.getSourceFilePath()), pointer.getStartLine());
    }

    /*
    public void openTraceabilityPointer(PackagePointer pointer) {
        try {
            String sourceString = File.separator + "src" + File.separator;
            String path = SettingsPropertyProvider.getTargetPath() + sourceString + pointer.getName();
            Desktop.getDesktop().open(new File(path));
        } catch (Exception ex) {
            Messages.showErrorDialog("Target package path couldn't be opened", "J2Swift");
            ex.printStackTrace();
        }
    }
    */

    public void setXCodeProjectPath(String path){
        xCodeProjectPath = path;
    }
    public void clearXCodeProjectPath(){
        xCodeProjectPath = null;
    }
}
