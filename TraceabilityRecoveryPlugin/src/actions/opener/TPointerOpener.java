package actions.opener;

import com.intellij.openapi.ui.Messages;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Gerrit Greiert on 04.01.17.
 */
public class TPointerOpener {

    public void openTraceabilityPointer(TraceabilityPointer pointer){

        File file = new File(pointer.getSourceFilePath());
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            Messages.showInfoMessage("The selected type of Traceability Pointer cannot be opened by " + this.getClass().getName(), "Traceability Recovery");
            e.printStackTrace();
        }
    };
}
