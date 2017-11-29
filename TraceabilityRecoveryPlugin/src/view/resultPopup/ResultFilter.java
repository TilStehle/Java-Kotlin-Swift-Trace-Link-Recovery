package view.resultPopup;

import de.unihamburg.masterprojekt2016.traceability.*;

/**
 * Created by Gerrit Greiert on 26.06.17.
 */
public enum ResultFilter {
    ALL, CLASS, METHOD, ATTRIBUTE;

    public static ResultFilter getFilterForPointerType(TraceabilityPointer pointer){

        if (pointer instanceof TypePointer)
            return CLASS;
        if (pointer instanceof MethodPointer || pointer instanceof ConstructorPointer)
            return METHOD;
        if (pointer instanceof AttributePointer)
            return ATTRIBUTE;
        else return ALL;

    }
}
