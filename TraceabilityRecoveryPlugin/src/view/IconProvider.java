package view;

import com.intellij.openapi.util.IconLoader;
import de.unihamburg.masterprojekt2016.traceability.*;

import javax.swing.*;

/**
 * Created by Gerrit Greiert on 19.12.16.
 */
public class IconProvider {

    public static Icon TRACEABILITY_ICON = IconLoader.getIcon("/icons/icon_traceability.png");

    public static Icon LINK_CLASS = IconLoader.getIcon("/icons/linkicon_class.png");
    public static Icon LINK_CONSTRUCTOR = IconLoader.getIcon("/icons/linkicon_constructor.png");
    public static Icon LINK_ENUM = IconLoader.getIcon("/icons/linkicon_enum.png");
    public static Icon LINK_FIELD = IconLoader.getIcon("/icons/linkicon_field.png");
    public static Icon LINK_INTERFACE = IconLoader.getIcon("/icons/linkicon_interface.png");
    public static Icon LINK_METHOD = IconLoader.getIcon("/icons/linkicon_method.png");
    public static Icon LINK_PACKAGE = IconLoader.getIcon("/icons/linkicon_package.png");

    public static Icon getIconForTraceabilityLink(TraceabilityPointer pointer){

        if (pointer instanceof TypePointer){

            TypePointer typePointer = (TypePointer) pointer;
            if (typePointer.getClassification() == TypePointerClassification.INTERFACE){
                return LINK_INTERFACE;
            }
            else if (typePointer.getClassification() == TypePointerClassification.ENUM){
                return LINK_ENUM;
            }
            else {
                return LINK_CLASS;
            }
        }
        else if (pointer instanceof MethodPointer){
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
