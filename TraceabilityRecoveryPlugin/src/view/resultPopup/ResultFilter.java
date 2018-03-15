package view.resultPopup;

import de.unihamburg.masterprojekt2016.traceability.*;

/**
 * Created by Gerrit Greiert on 26.06.17.
 */
public enum ResultFilter {
    ALL, CLASS, METHOD, ATTRIBUTE;

    public static ResultFilter getFilterForPointerType(TraceabilityPointer pointer) {

        if (pointer instanceof TypePointer)
            return CLASS;
        if (pointer instanceof MethodPointer || pointer instanceof ConstructorPointer)
            return METHOD;
        if (pointer instanceof AttributePointer)
            return ATTRIBUTE;
        else return ALL;

    }

    public static ResultFilter increase(ResultFilter toIncrease) {
        ResultFilter[] values = values();
        ResultFilter result =ALL;
        for (int i = 0; i < values.length; i++) {
            ResultFilter value = values[i];
            if (value == toIncrease)
            {
                result =  values[Math.abs((i+1)%values.length)];
            }
        }
        return result;

    }

    public static ResultFilter decrease(ResultFilter toIncrease) {
        ResultFilter[] values = values();
        ResultFilter result =ALL;
        for (int i = 0; i < values.length; i++) {
            ResultFilter value = values[i];
            if (value == toIncrease)
            {
                result =  values[Math.abs((i-1) >=0? i-1: values.length-1 )];
            }
        }
        return result;

    }
}
