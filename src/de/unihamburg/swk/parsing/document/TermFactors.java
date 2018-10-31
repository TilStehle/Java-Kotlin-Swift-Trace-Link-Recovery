package de.unihamburg.swk.parsing.document;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TermFactors {
    public static final String OWN_TYPE_DECLARATION_FACTOR = "ownTypeDeclarationFactor";
    public static final String OTHER_TYPE_DECLARATION_FACTOR = "otherTypeDeclarationFactor";
    public static final String OWN_INHERITANCE_FACTOR = "ownInheritanceFactor";
    public static final String OTHER_INHERITANCE_FACTOR = "otherInheritanceFactor";
    public static final String OWN_ATTRIBUTE_FACTOR = "ownAttributeFactor";
    public static final String OTHER_ATTRIBUTE_FACTOR = "otherAttributeFactor";
    public static final String OWN_ATTRIBUTE_TYPE_FACTOR = "ownAttributeTypeFactor";
    public static final String OTHER_ATTRIBUTE_TYPE_FACTOR = "otherAttributeTypeFactor";
    public static final String OWN_METHOD_FACTOR = "ownMethodFactor";
    public static final String OTHER_METHOD_FACTOR = "otherMethodFactor";
    public static final String OWN_METHOD_TYPE_FACTOR = "ownMethodTypeFactor";
    public static final String OTHER_METHOD_TYPE_FACTOR = "otherMethodTypeFactor";
    public static final String OWN_CLOSURE_TYPE_FACTOR = "ownClosureTypeFactor";
    public static final String OTHER_CLOSURE_TYPE_FACTOR = "otherClosureTypeFactor";
    public static final String OWN_CONSTRUCTOR_FACTOR = "ownConstructorFactor";
    public static final String OTHER_CONSTRUCTOR_FACTOR = "otherConstructorFactor";
    public static final String OWN_LOCAL_VARIABLE_FACTOR = "ownLocalVariableFactor";
    public static final String OTHER_LOCAL_VARIABLE_FACTOR = "otherLocalVariableFactor";
    public static final String OWN_LOCAL_VARIABLE_TYPE_FACTOR = "ownLocalVariableTypeFactor";
    public static final String OTHER_LOCAL_VARIABLE_TYPE_FACTOR = "otherLocalVariableTypeFactor";
    public static final String OWN_PARAMETER_FACTOR = "ownParameterFactor";
    public static final String OTHER_PARAMETER_FACTOR = "otherParameterFactor";
    public static final String OWN_PARAMETER_TYPE_FACTOR = "ownParameterTypeFactor";
    public static final String OTHER_PARAMETER_TYPE_FACTOR = "otherParameterTypeFactor";
    public static final String OWN_TYPE_PARAMETER_FACTOR = "ownTypeParameterFactor";
    public static final String OTHER_TYPE_PARAMETER_FACTOR = "otherTypeParameterFactor";
    public static final String VARIABLE_USAGE_FACTOR = "variableUsageFactor";
    public static final String OTHER_VARIABLE_USAGE_FACTOR = "otherVariableUsageFactor";
    public static final String METHOD_CALL_FACTOR = "methodCallFactor";
    public static final String OTHER_METHOD_CALL_FACTOR = "otherMethodCallFactor";
    public static final String ENCLOSING_TYPE_FACTOR = "enclosingTypeFactor";
    public static final String GETTER_SETTER_FACTOR = "getterSetterFactor";


    public static TermFactors DEFAULT_FACTORS = new TermFactors();
    public static TermFactors ALL_FACTORS_ONE = new TermFactors(1, 1, 1, 1, 1,1,1,1, 1,1,
    1, 1, 1, 1, 1,1, 1, 1, 1,1,1, 1, 1, 1,1, 1, 1, 1, 1,1, 1, 1);


//	public  final TermFactor ownTypeDeclarationFactor = 4; // 4
//	public  final TermFactor otherTypeDeclarationFactor = 4;
//	public  final TermFactor ownInheritanceFactor = 1;
//	public  final TermFactor otherInheritanceFactor = 1;
//
//	public  final TermFactor ownAttributeFactor = 4;
//	public  final TermFactor otherAttributeFactor = 2;
//	public  final TermFactor ownAttributeTypeFactor = 1;
//	public  final TermFactor otherAttributeTypeFactor = 1;
//
//	public  final TermFactor ownMethodFactor = 4;
//	public  final TermFactor otherMethodFactor = 2;
//	public  final TermFactor ownMethodTypeFactor = 1;
//	public  final TermFactor otherMethodTypeFactor = 1;
//
//	public  final TermFactor ownClosureTypeFactor = 4;
//	public  final TermFactor otherClosureTypeFactor = 1;
//
//	public  final TermFactor ownConstructorFactor = 4;
//	public  final TermFactor otherConstructorFactor = 2;
//
//	public  final TermFactor ownLocalVariableFactor = 2;
//	public  final TermFactor otherLocalVariableFactor = 1;
//	public  final TermFactor ownLocalVariableTypeFactor = 1;
//	public  final TermFactor otherLocalVariableTypeFactor = 1;
//
//	public  final TermFactor ownParameterFactor = 2;
//	public  final TermFactor otherParameterFactor = 1;
//	public  final TermFactor ownParameterTypeFactor = 1;
//	public  final TermFactor otherParameterTypeFactor = 1;
//
//	public  final TermFactor ownTypeParameterFactor = 1;
//	public  final TermFactor otherTypeParameterFactor = 1;

    public final TermFactor ownTypeDeclarationFactor; // 4
    public final TermFactor otherTypeDeclarationFactor;
    public final TermFactor ownInheritanceFactor;
    public final TermFactor otherInheritanceFactor;

    public final TermFactor ownAttributeFactor;
    public final TermFactor otherAttributeFactor;
    public final TermFactor ownAttributeTypeFactor;
    public final TermFactor otherAttributeTypeFactor;

    public final TermFactor ownMethodFactor;
    public final TermFactor otherMethodFactor;
    public final TermFactor ownMethodTypeFactor;
    public final TermFactor otherMethodTypeFactor;

    public final TermFactor ownClosureTypeFactor;
    public final TermFactor otherClosureTypeFactor;

    public final TermFactor ownConstructorFactor;
    public final TermFactor otherConstructorFactor;

    public final TermFactor ownLocalVariableFactor;
    public final TermFactor otherLocalVariableFactor;
    public final TermFactor ownLocalVariableTypeFactor;
    public final TermFactor otherLocalVariableTypeFactor;

    public final TermFactor ownParameterFactor;
    public final TermFactor otherParameterFactor;
    public final TermFactor ownParameterTypeFactor;
    public final TermFactor otherParameterTypeFactor;

    public final TermFactor ownTypeParameterFactor;
    public final TermFactor otherTypeParameterFactor;


    public final TermFactor variableUsageFactor;
    public final TermFactor otherVariableUsageFactor;

    public final TermFactor methodCallFactor;
    public final TermFactor otherMethodCallFactor;
    public final TermFactor enclosingTypeFactor;
    public final TermFactor getterSetterFactor;


    public TermFactors(int ownTypeDeclarationFactor, int otherTypeDeclarationFactor, int ownInheritanceFactor, int otherInheritanceFactor, int ownAttributeFactor,
                       int otherAttributeFactor, int ownAttributeTypeFactor, int otherAttributeTypeFactor, int ownMethodFactor, int otherMethodFactor,
                       int ownMethodTypeFactor, int otherMethodTypeFactor, int ownClosureTypeFactor, int otherClosureTypeFactor, int ownConstructorFactor,
                       int otherConstructorFactor, int ownLocalVariableFactor, int otherLocalVariableFactor, int ownLocalVariableTypeFactor,
                       int otherLocalVariableTypeFactor, int ownParameterFactor, int otherParameterFactor, int ownParameterTypeFactor, int otherParameterTypeFactor,
                       int ownTypeParameterFactor, int otherTypeParameterFactor, int variableUsageFactor, int otherVariableUsageFactor, int methodCallFactor,
                       int otherMethodCallFactor, int enclosingTypeFactor, int getterSetterFactor) {
        this.ownTypeDeclarationFactor = new TermFactor(ownTypeDeclarationFactor, OWN_TYPE_DECLARATION_FACTOR); // 4
        this.otherTypeDeclarationFactor = new TermFactor(otherTypeDeclarationFactor, OTHER_TYPE_DECLARATION_FACTOR);
        this.ownInheritanceFactor = new TermFactor(ownInheritanceFactor, OWN_INHERITANCE_FACTOR);
        this.otherInheritanceFactor = new TermFactor(otherInheritanceFactor, OTHER_INHERITANCE_FACTOR);

        this.ownAttributeFactor = new TermFactor(ownAttributeFactor, OWN_ATTRIBUTE_FACTOR);
        this.otherAttributeFactor = new TermFactor(otherAttributeFactor, OTHER_ATTRIBUTE_FACTOR);
        this.ownAttributeTypeFactor = new TermFactor(ownAttributeTypeFactor, OWN_ATTRIBUTE_TYPE_FACTOR);
        this.otherAttributeTypeFactor = new TermFactor(otherAttributeTypeFactor, OTHER_ATTRIBUTE_TYPE_FACTOR);

        this.ownMethodFactor = new TermFactor(ownMethodFactor, OWN_METHOD_FACTOR);
        this.otherMethodFactor = new TermFactor(otherMethodFactor, OTHER_METHOD_FACTOR);
        this.ownMethodTypeFactor = new TermFactor(ownMethodTypeFactor, OWN_METHOD_TYPE_FACTOR);
        this.otherMethodTypeFactor = new TermFactor(otherMethodTypeFactor, OTHER_METHOD_TYPE_FACTOR);

        this.ownClosureTypeFactor = new TermFactor(ownClosureTypeFactor, OWN_CLOSURE_TYPE_FACTOR);
        this.otherClosureTypeFactor = new TermFactor(otherClosureTypeFactor, OTHER_CLOSURE_TYPE_FACTOR);
        this.ownConstructorFactor = new TermFactor(ownConstructorFactor, OWN_CONSTRUCTOR_FACTOR);
        this.otherConstructorFactor = new TermFactor(otherConstructorFactor, OTHER_CONSTRUCTOR_FACTOR);

        this.ownLocalVariableFactor = new TermFactor(ownLocalVariableFactor, OWN_LOCAL_VARIABLE_FACTOR);
        this.otherLocalVariableFactor = new TermFactor(otherLocalVariableFactor, OTHER_LOCAL_VARIABLE_FACTOR);
        this.ownLocalVariableTypeFactor = new TermFactor(ownLocalVariableTypeFactor, OWN_LOCAL_VARIABLE_TYPE_FACTOR);
        this.otherLocalVariableTypeFactor = new TermFactor(otherLocalVariableTypeFactor, OTHER_LOCAL_VARIABLE_TYPE_FACTOR);

        this.ownParameterFactor = new TermFactor(ownParameterFactor, OWN_PARAMETER_FACTOR);
        this.otherParameterFactor = new TermFactor(otherParameterFactor, OTHER_PARAMETER_FACTOR);
        this.ownParameterTypeFactor = new TermFactor(ownParameterTypeFactor, OWN_PARAMETER_TYPE_FACTOR);
        this.otherParameterTypeFactor = new TermFactor(otherParameterTypeFactor, OTHER_PARAMETER_TYPE_FACTOR);

        this.ownTypeParameterFactor = new TermFactor(ownTypeParameterFactor, OWN_TYPE_PARAMETER_FACTOR);
        this.otherTypeParameterFactor = new TermFactor(otherTypeParameterFactor, OTHER_TYPE_PARAMETER_FACTOR);


        this.variableUsageFactor = new TermFactor(variableUsageFactor, VARIABLE_USAGE_FACTOR);
        this.otherVariableUsageFactor = new TermFactor(otherVariableUsageFactor, OTHER_VARIABLE_USAGE_FACTOR);

        this.methodCallFactor = new TermFactor(methodCallFactor, METHOD_CALL_FACTOR);
        this.otherMethodCallFactor = new TermFactor(otherMethodCallFactor, OTHER_METHOD_CALL_FACTOR);
        this.enclosingTypeFactor = new TermFactor(enclosingTypeFactor, ENCLOSING_TYPE_FACTOR);
        this.getterSetterFactor = new TermFactor(getterSetterFactor, GETTER_SETTER_FACTOR);
    }

    private TermFactors() {
        ownTypeDeclarationFactor = new TermFactor(8, OWN_TYPE_DECLARATION_FACTOR); // 4
        otherTypeDeclarationFactor = new TermFactor(8, OTHER_TYPE_DECLARATION_FACTOR);
        ownInheritanceFactor = new TermFactor(2, OWN_INHERITANCE_FACTOR);
        otherInheritanceFactor = new TermFactor(2, OTHER_INHERITANCE_FACTOR);

        ownAttributeFactor = new TermFactor(8, OWN_ATTRIBUTE_FACTOR);
        otherAttributeFactor = new TermFactor(4, OTHER_ATTRIBUTE_FACTOR);
        ownAttributeTypeFactor = new TermFactor(2, OWN_ATTRIBUTE_TYPE_FACTOR);
        otherAttributeTypeFactor = new TermFactor(2, OTHER_ATTRIBUTE_TYPE_FACTOR);

        ownMethodFactor = new TermFactor(8, OWN_METHOD_FACTOR);
        otherMethodFactor = new TermFactor(4, OTHER_METHOD_FACTOR);
        ownMethodTypeFactor = new TermFactor(2, OWN_METHOD_TYPE_FACTOR);
        otherMethodTypeFactor = new TermFactor(2, OTHER_METHOD_TYPE_FACTOR);

        ownClosureTypeFactor = new TermFactor(8, OWN_CLOSURE_TYPE_FACTOR);
        otherClosureTypeFactor = new TermFactor(2, OTHER_CLOSURE_TYPE_FACTOR);

        ownConstructorFactor = new TermFactor(8, OWN_CONSTRUCTOR_FACTOR);
        otherConstructorFactor = new TermFactor(4, OTHER_CONSTRUCTOR_FACTOR);

        ownLocalVariableFactor = new TermFactor(8, OWN_LOCAL_VARIABLE_FACTOR);
        otherLocalVariableFactor = new TermFactor(2, OTHER_LOCAL_VARIABLE_FACTOR);
        ownLocalVariableTypeFactor = new TermFactor(2, OWN_LOCAL_VARIABLE_TYPE_FACTOR);
        otherLocalVariableTypeFactor = new TermFactor(2, OTHER_LOCAL_VARIABLE_TYPE_FACTOR);

        ownParameterFactor = new TermFactor(8, OWN_PARAMETER_FACTOR);
        otherParameterFactor = new TermFactor(2, OTHER_PARAMETER_FACTOR);
        ownParameterTypeFactor = new TermFactor(2, OWN_PARAMETER_TYPE_FACTOR);
        otherParameterTypeFactor = new TermFactor(2, OTHER_PARAMETER_TYPE_FACTOR);

        ownTypeParameterFactor = new TermFactor(1, OWN_TYPE_PARAMETER_FACTOR);
        otherTypeParameterFactor = new TermFactor(1, OTHER_TYPE_PARAMETER_FACTOR);


        variableUsageFactor = new TermFactor(1, VARIABLE_USAGE_FACTOR);
        otherVariableUsageFactor = new TermFactor(1, OTHER_VARIABLE_USAGE_FACTOR);

        methodCallFactor = new TermFactor(1, METHOD_CALL_FACTOR);
        otherMethodCallFactor = new TermFactor(1, OTHER_METHOD_CALL_FACTOR);
        enclosingTypeFactor = new TermFactor(1, ENCLOSING_TYPE_FACTOR);
        getterSetterFactor = new TermFactor(1, GETTER_SETTER_FACTOR);

    }


    public List<TermFactor> getAllFactors() {
        Field[] fields = this.getClass().getFields();
        List<TermFactor> factors = new ArrayList<TermFactor>();
        for (Field field :fields) {
            if(field.getType().isAssignableFrom(TermFactor.class))
            {
                try {
                    factors.add((TermFactor) field.get(this));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("private TermFactor fields will break this code!");
                }
            }

        }
        return factors;

    }
}
