package actions.filewriter;

import actions.psiutils.SwiftParserUtils;
import actions.psiutils.TokenPosition;
import com.intellij.util.PathUtil;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;

import java.io.*;

/**
 * Created by Tilmann Stehle on 09.03.2017.
 */
public class CommentWriter {
    private final TokenPosition tokenPosition;
    private TraceabilityPointer pointer;

    public CommentWriter(TraceabilityPointer pointer) {

        this.pointer = pointer;
        tokenPosition = SwiftParserUtils.getPosition(pointer);
    }

    public void addTodoComment(String commentText) throws Exception {
        insertStringInFile(pointer.getSourceFilePath(), tokenPosition.getLine(),"//TODO: "+ commentText);
    }

    public void insertStringInFile(String path, int lineno, String lineToBeInserted)
            throws Exception {
        File inFile= new File(path);
        // temp file
        String parentPath = PathUtil.getParentPath(path);
        File outFile = new File(parentPath+"/"+PathUtil.getFileName(path)+".tmp");

        // input
        FileInputStream fis = new FileInputStream(inFile);
        BufferedReader in = new BufferedReader
                (new InputStreamReader(fis));

        // output
        FileOutputStream fos = new FileOutputStream(outFile);
        PrintWriter out = new PrintWriter(fos);

        String thisLine = "";
        int i = 0;
        while ((thisLine = in.readLine()) != null) {
            if (i == lineno) out.println(lineToBeInserted);
            out.println(thisLine);
            i++;
        }
        out.flush();
        out.close();
        in.close();

        inFile.delete();
        outFile.renameTo(inFile);
    }
}
