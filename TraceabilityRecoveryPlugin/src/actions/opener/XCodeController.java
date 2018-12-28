package actions.opener;

import actions.psiutils.SwiftParserUtils;
import actions.psiutils.TokenPosition;
import de.unihamburg.masterprojekt2016.traceability.AttributePointer;
import de.unihamburg.masterprojekt2016.traceability.ConstructorPointer;
import de.unihamburg.masterprojekt2016.traceability.MethodPointer;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by Tilmann Stehle on 24.11.2016.
 */
public class XCodeController {

    public static void openXCodeAtLine(String fileName, int lineNumber) {

        Runtime runtime = Runtime.getRuntime();
        String appleScript = "tell application \"Xcode\"\n" +
                "\tactivate\n" +
                "\t\n" +
                "\ttell application \"System Events\"\n" +
                "\t\t--open file containing class declaration\n" +
                "\t\t\n" +
                "\t\ttell process \"Xcode\"\n" +
                "\t\t\tkeystroke \"o\" using {shift down, command down}\n" +
                "\t\t\trepeat until window \"Open Quickly\" exists\n" +
                "\t\t\tend repeat\n" +
                "\t\t\tset value of text field 1 of window \"Open Quickly\" to \""+fileName+"\"\n" +
                "\t\t\tdelay 0.2\n" +
                "\t\t\tkeystroke return\n" +
                "\t\t\tkeystroke \"l\" using command down\n" +
                "\t\t\trepeat until window \"Open Quickly\" exists\n" +
                "\t\t\tend repeat\n" +
                "\t\t\tset value of text field 1 of window \"Open Quickly\" to \""+lineNumber+"\"\n" +
                "\t\t\t--set winstuff to entire contents of front window\n" +
                "\t\t\t--return winstuff -- comment this out too to get just menustuff\n" +
                "\t\t\tkeystroke return\n" +
                "\t\tend tell\n" +
                "\tend tell\n" +
                "end tell";
        String[] args = {"osascript", "-e", appleScript};
        try {
            //System.out.println(appleScript);
            runtime.exec(args);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void openXCodeProjectAtTypeAndLine(String projectFilePath, String typeName, int lineNumber) {
        Runtime runtime = Runtime.getRuntime();
        String appleScript =
                "" +"tell application \"Xcode\"\n" +
                "\topen \""+projectFilePath+"\"\n" +
                "\tactivate\n" +
                "\ttell application \"System Events\"\n" +
                "\t\ttell process \"Xcode\"\n" +
                "\t\t\t\n" +
                "\t\t\t--open file containing class declaration\n" +
                "\t\t\tkeystroke \"o\" using {shift down, command down}\n" +
                "\t\t\trepeat until window \"Open Quickly\" exists\n" +
                "\t\t\tend repeat\n" +
                "\t\t\tset value of text field 1 of window \"Open Quickly\" to \""+typeName+"\"\n" +
                "\t\t\tdelay 0.2\n" +
                "\t\t\tkeystroke return\n" +
                "\t\t\t\n" +
                "\t\t\t--navigate to method line\n" +
                "\t\t\tkeystroke \"l\" using command down\n" +
                "\t\t\trepeat until window \"Open Quickly\" exists\n" +
                "\t\t\tend repeat\n" +
                "\t\t\tset value of text field 1 of window \"Open Quickly\" to \""+lineNumber+"\"\n" +
                "\t\t\tkeystroke return\t\n" +
                "\t\tend tell\n" +
                "\tend tell\n" +
                "end tell";
        String[] args = {"osascript",   "-e", appleScript};
        try {
            runtime.exec(args);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void renameElementAtToken(String typeName, String methodName, TokenPosition methodPosition, String newMethodName, String xcodeProjectFilePath) {
        Runtime runtime = Runtime.getRuntime();
        StringBuilder builder = new StringBuilder("");
        InputStream renameScriptStream = XCodeController.class.getClassLoader().getResourceAsStream("applescripts/rename.script");
        try (Scanner scanner = new Scanner(renameScriptStream)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                builder.append(line).append("\n");
            }

            scanner.close();

        }
        int methodNameColumn = methodPosition.getColumn();
        String script=builder.toString();
        script=script.replace("$methodName", methodName);
        script=script.replace("$newMethodName", newMethodName);
        script=script.replace("$methodColumn", "" + methodNameColumn);
        script=script.replace("$typeName", typeName);
        script=script.replace("$lineNumber", ""+methodPosition.getLine());

        String[] args = {"osascript", "-e", script};
        try {
            runtime.exec(args).waitFor();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void openXCodeAtMethod(MethodPointer pointer, @Nullable String projectFilePath) {

        TokenPosition methodPosition = SwiftParserUtils.getMethodPosition(pointer);

        if(projectFilePath==null ||"".equals(projectFilePath)) {
            openXCodeAtLine(pointer.getSourceFilePath(), methodPosition.getLine());
        }
        else{
            String typeName = pointer.getTypePointer().getFullyQualifiedName();
            typeName=typeName.substring(typeName.lastIndexOf('.') + 1);
            openXCodeProjectAtTypeAndLine(projectFilePath,typeName, methodPosition.getLine());
        }
    }

    public static void openXCodeAtConstructor(ConstructorPointer pointer, @Nullable String projectFilePath) {

        TokenPosition methodPosition = SwiftParserUtils.getConstructorPosition(pointer);

        if(projectFilePath==null ||"".equals(projectFilePath)) {
            openXCodeAtLine(pointer.getSourceFilePath(), methodPosition.getLine());
        }
        else{
            String typeName = pointer.getTypePointer().getFullyQualifiedName();
            typeName=typeName.substring(typeName.lastIndexOf('.') + 1);
            openXCodeProjectAtTypeAndLine(projectFilePath,typeName, methodPosition.getLine());
        }
    }

    public static void openXCodeAtAttribute(AttributePointer target, @Nullable String projectFilePath) {

        TokenPosition methodPosition = SwiftParserUtils.getAtributePosition(target);

        if(projectFilePath==null ||"".equals(projectFilePath)) {
            openXCodeAtLine(target.getSourceFilePath(), methodPosition.getLine());
        }
        else{
            String typeName = target.getTypePointer().getFullyQualifiedName();
            typeName=typeName.substring(typeName.lastIndexOf('.') + 1);
            openXCodeProjectAtTypeAndLine(projectFilePath,typeName, methodPosition.getLine());
        }
    }
}
