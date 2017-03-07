package actions.opener;

import com.intellij.openapi.ui.Messages;
import de.unihamburg.masterprojekt2016.traceability.*;

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

    public void openTraceabilityPointer(TypePointer pointer) {
        XCodeController.openXCodeAtLine(pointer.getSourceFilePath(), 0);
    }

    public void openTraceabilityPointer(MethodPointer pointer) {
        XCodeController.openXCodeAtMethod(pointer, xCodeProjectPath);
    }

    public void openTraceabilityPointer(ConstructorPointer pointer) {
        XCodeController.openXCodeAtConstructor(pointer, xCodeProjectPath);
    }

    public void openTraceabilityPointer(AttributePointer pointer) {
        XCodeController.openXCodeAtAttribute(pointer, xCodeProjectPath);
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
