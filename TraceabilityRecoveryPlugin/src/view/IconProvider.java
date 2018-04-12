package view;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.IconLoader;
import de.unihamburg.masterprojekt2016.traceability.*;

import javax.swing.*;

/**
 * Created by Gerrit Greiert on 19.12.16.
 */
public class IconProvider {

    public static Icon TRACEABILITY_ICON = IconLoader.getIcon("/icons/icon_traceability.png");

    public static Icon LINK_CLASS = AllIcons.Nodes.Class;
    public static Icon LINK_CONSTRUCTOR = AllIcons.Nodes.ClassInitializer; //No constructor icon available
    public static Icon LINK_ENUM = AllIcons.Nodes.Enum;
    public static Icon LINK_FIELD = AllIcons.Nodes.Field;
    public static Icon LINK_INTERFACE = AllIcons.Nodes.Interface;
    public static Icon LINK_METHOD = AllIcons.Nodes.Method;
    public static Icon LINK_PACKAGE = AllIcons.Nodes.Package;
    public static Icon LINK_EXTENSION = AllIcons.Nodes.Enum;

    public static Icon getIconForTraceabilityLink(TraceabilityPointer pointer){

        if (pointer instanceof TypePointer){

            TypePointer typePointer = (TypePointer) pointer;
            if (typePointer.getClassification() == TypePointerClassification.INTERFACE){
                return LINK_INTERFACE;
            }
            else if (typePointer.getClassification() == TypePointerClassification.ENUM){
                return LINK_ENUM;
            }
            else if (typePointer.getClassification() == TypePointerClassification.EXTENSION){
                return LINK_EXTENSION;
            }
            else {
                return LINK_CLASS;
            }
        }
        else if (pointer instanceof MethodPointer ){
            return LINK_METHOD;
        }
        else if (pointer instanceof FunctionPointer)
        {
            return LINK_METHOD;
        }
        else if (pointer instanceof ConstructorPointer){
            return LINK_CONSTRUCTOR;
        }
        else if (pointer instanceof AttributePointer){
            return LINK_FIELD;
        }
        else if (pointer instanceof PackagePointer){
            return LINK_PACKAGE;
        }
        else return TRACEABILITY_ICON;
    }
}
