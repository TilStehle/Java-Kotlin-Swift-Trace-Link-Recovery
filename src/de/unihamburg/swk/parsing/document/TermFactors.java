package de.unihamburg.swk.parsing.document;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

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

    private final List<TermFactor> allFactors = new ArrayList<>(32);


    public TermFactors(int ownTypeDeclarationFactor, int otherTypeDeclarationFactor, int ownInheritanceFactor, int otherInheritanceFactor, int ownAttributeFactor,
                       int otherAttributeFactor, int ownAttributeTypeFactor, int otherAttributeTypeFactor, int ownMethodFactor, int otherMethodFactor,
                       int ownMethodTypeFactor, int otherMethodTypeFactor, int ownClosureTypeFactor, int otherClosureTypeFactor, int ownConstructorFactor,
                       int otherConstructorFactor, int ownLocalVariableFactor, int otherLocalVariableFactor, int ownLocalVariableTypeFactor,
                       int otherLocalVariableTypeFactor, int ownParameterFactor, int otherParameterFactor, int ownParameterTypeFactor, int otherParameterTypeFactor,
                       int ownTypeParameterFactor, int otherTypeParameterFactor, int variableUsageFactor, int otherVariableUsageFactor, int methodCallFactor,
                       int otherMethodCallFactor, int enclosingTypeFactor, int getterSetterFactor) {
        this.ownTypeDeclarationFactor = new TermFactor(ownTypeDeclarationFactor, OWN_TYPE_DECLARATION_FACTOR);
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


        this.variableUsageFactor = new TermFactor(1, VARIABLE_USAGE_FACTOR);
        this.otherVariableUsageFactor = this.variableUsageFactor;

        this.methodCallFactor = new TermFactor(methodCallFactor, METHOD_CALL_FACTOR);
        this.otherMethodCallFactor = this.methodCallFactor;
        this.enclosingTypeFactor = new TermFactor(enclosingTypeFactor, ENCLOSING_TYPE_FACTOR);
        this.getterSetterFactor = new TermFactor(getterSetterFactor, GETTER_SETTER_FACTOR);

        initializeFactorsList();
    }

    private void initializeFactorsList()
    {

        allFactors.add(this.ownTypeDeclarationFactor);
        allFactors.add(this.otherTypeDeclarationFactor);
        allFactors.add(this.ownInheritanceFactor);
        allFactors.add(this.otherInheritanceFactor);

        allFactors.add(this.ownAttributeFactor);
        allFactors.add(this.otherAttributeFactor);
        allFactors.add(this.ownAttributeTypeFactor);
        allFactors.add(this.otherAttributeTypeFactor);

        allFactors.add(this.ownMethodFactor);
        allFactors.add(this.otherMethodFactor);
        allFactors.add(this.ownMethodTypeFactor);
        allFactors.add(this.otherMethodTypeFactor);

        allFactors.add(this.ownClosureTypeFactor);
        allFactors.add(this.otherClosureTypeFactor);
        allFactors.add(this.ownConstructorFactor);
        allFactors.add(this.otherConstructorFactor);

        allFactors.add(this.ownLocalVariableFactor);
        allFactors.add(this.otherLocalVariableFactor);
        allFactors.add(this.ownLocalVariableTypeFactor);
        allFactors.add(this.otherLocalVariableTypeFactor);


        allFactors.add(this.ownParameterFactor);
        allFactors.add(this.otherParameterFactor);
        allFactors.add(this.ownParameterTypeFactor);
        allFactors.add(this.otherParameterTypeFactor);

        allFactors.add(this.ownTypeParameterFactor);
        allFactors.add(this.otherTypeParameterFactor);


        allFactors.add(this.variableUsageFactor);
        allFactors.add(this.otherVariableUsageFactor);

        allFactors.add(this.methodCallFactor);
        allFactors.add(this.otherMethodCallFactor);
        allFactors.add(this.enclosingTypeFactor);
        allFactors.add(this.getterSetterFactor);
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

        ownLocalVariableFactor = new TermFactor(1, OWN_LOCAL_VARIABLE_FACTOR);
        otherLocalVariableFactor = new TermFactor(1, OTHER_LOCAL_VARIABLE_FACTOR);
        ownLocalVariableTypeFactor = new TermFactor(1, OWN_LOCAL_VARIABLE_TYPE_FACTOR);
        otherLocalVariableTypeFactor = new TermFactor(1, OTHER_LOCAL_VARIABLE_TYPE_FACTOR);

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
        initializeFactorsList();



    }


    public List<TermFactor> getAllFactors() {

        return allFactors;

    }

    @Override
    public String toString() {
        return "TermFactors{" +
                "ownTypeDeclarationFactor=" + ownTypeDeclarationFactor +
                ", otherTypeDeclarationFactor=" + otherTypeDeclarationFactor +
                ", ownInheritanceFactor=" + ownInheritanceFactor +
                ", otherInheritanceFactor=" + otherInheritanceFactor +
                ", ownAttributeFactor=" + ownAttributeFactor +
                ", otherAttributeFactor=" + otherAttributeFactor +
                ", ownAttributeTypeFactor=" + ownAttributeTypeFactor +
                ", otherAttributeTypeFactor=" + otherAttributeTypeFactor +
                ", ownMethodFactor=" + ownMethodFactor +
                ", otherMethodFactor=" + otherMethodFactor +
                ", ownMethodTypeFactor=" + ownMethodTypeFactor +
                ", otherMethodTypeFactor=" + otherMethodTypeFactor +
                ", ownClosureTypeFactor=" + ownClosureTypeFactor +
                ", otherClosureTypeFactor=" + otherClosureTypeFactor +
                ", ownConstructorFactor=" + ownConstructorFactor +
                ", otherConstructorFactor=" + otherConstructorFactor +
                ", ownLocalVariableFactor=" + ownLocalVariableFactor +
                ", otherLocalVariableFactor=" + otherLocalVariableFactor +
                ", ownLocalVariableTypeFactor=" + ownLocalVariableTypeFactor +
                ", otherLocalVariableTypeFactor=" + otherLocalVariableTypeFactor +
                ", ownParameterFactor=" + ownParameterFactor +
                ", otherParameterFactor=" + otherParameterFactor +
                ", ownParameterTypeFactor=" + ownParameterTypeFactor +
                ", otherParameterTypeFactor=" + otherParameterTypeFactor +
                ", ownTypeParameterFactor=" + ownTypeParameterFactor +
                ", otherTypeParameterFactor=" + otherTypeParameterFactor +
                ", variableUsageFactor=" + variableUsageFactor +
                ", otherVariableUsageFactor=" + otherVariableUsageFactor +
                ", methodCallFactor=" + methodCallFactor +
                ", otherMethodCallFactor=" + otherMethodCallFactor +
                ", enclosingTypeFactor=" + enclosingTypeFactor +
                ", getterSetterFactor=" + getterSetterFactor +
                '}';
    }

    public String toShortString() {
        return "TermFactors{" +
                       ownTypeDeclarationFactor +
                ", " + otherTypeDeclarationFactor +
                ", " + ownInheritanceFactor +
                ", " + otherInheritanceFactor +
                ", " + ownAttributeFactor +
                ", " + otherAttributeFactor +
                ", " + ownAttributeTypeFactor +
                ", " + otherAttributeTypeFactor +
                ", " + ownMethodFactor +
                ", " + otherMethodFactor +
                ", " + ownMethodTypeFactor +
                ", " + otherMethodTypeFactor +
                ", " + ownClosureTypeFactor +
                ", " + otherClosureTypeFactor +
                ", " + ownConstructorFactor +
                ", " + otherConstructorFactor +
                ", " + ownLocalVariableFactor +
                ", " + otherLocalVariableFactor +
                ", " + ownLocalVariableTypeFactor +
                ", " + otherLocalVariableTypeFactor +
                ", " + ownParameterFactor +
                ", " + otherParameterFactor +
                ", " + ownParameterTypeFactor +
                ", " + otherParameterTypeFactor +
                ", " + ownTypeParameterFactor +
                ", " + otherTypeParameterFactor +
                ", " + variableUsageFactor +
                ", " + otherVariableUsageFactor +
                ", " + methodCallFactor +
                ", " + otherMethodCallFactor +
                ", " + enclosingTypeFactor +
                ", " + getterSetterFactor +
                '}';
    }

    @Override
    public  Object clone()  {
        return new TermFactors(ownTypeDeclarationFactor.getFactor(), otherTypeDeclarationFactor.getFactor(),  ownInheritanceFactor.getFactor(),  otherInheritanceFactor.getFactor(),  ownAttributeFactor.getFactor(),
         otherAttributeFactor.getFactor(),  ownAttributeTypeFactor.getFactor(),  otherAttributeTypeFactor.getFactor(),  ownMethodFactor.getFactor(),  otherMethodFactor.getFactor(),
         ownMethodTypeFactor.getFactor(),  otherMethodTypeFactor.getFactor(),  ownClosureTypeFactor.getFactor(),  otherClosureTypeFactor.getFactor(),  ownConstructorFactor.getFactor(),
         otherConstructorFactor.getFactor(),  ownLocalVariableFactor.getFactor(),  otherLocalVariableFactor.getFactor(),  ownLocalVariableTypeFactor.getFactor(),
         otherLocalVariableTypeFactor.getFactor(),  ownParameterFactor.getFactor(),  otherParameterFactor.getFactor(),  ownParameterTypeFactor.getFactor(),  otherParameterTypeFactor.getFactor(),
         ownTypeParameterFactor.getFactor(),  otherTypeParameterFactor.getFactor(),  variableUsageFactor.getFactor(),  otherVariableUsageFactor.getFactor(),  methodCallFactor.getFactor(),
         otherMethodCallFactor.getFactor(),  enclosingTypeFactor.getFactor(),  getterSetterFactor.getFactor());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TermFactors that = (TermFactors) o;

        if (ownTypeDeclarationFactor != null ? !ownTypeDeclarationFactor.equals(that.ownTypeDeclarationFactor) : that.ownTypeDeclarationFactor != null)
            return false;
        if (otherTypeDeclarationFactor != null ? !otherTypeDeclarationFactor.equals(that.otherTypeDeclarationFactor) : that.otherTypeDeclarationFactor != null)
            return false;
        if (ownInheritanceFactor != null ? !ownInheritanceFactor.equals(that.ownInheritanceFactor) : that.ownInheritanceFactor != null)
            return false;
        if (otherInheritanceFactor != null ? !otherInheritanceFactor.equals(that.otherInheritanceFactor) : that.otherInheritanceFactor != null)
            return false;
        if (ownAttributeFactor != null ? !ownAttributeFactor.equals(that.ownAttributeFactor) : that.ownAttributeFactor != null)
            return false;
        if (otherAttributeFactor != null ? !otherAttributeFactor.equals(that.otherAttributeFactor) : that.otherAttributeFactor != null)
            return false;
        if (ownAttributeTypeFactor != null ? !ownAttributeTypeFactor.equals(that.ownAttributeTypeFactor) : that.ownAttributeTypeFactor != null)
            return false;
        if (otherAttributeTypeFactor != null ? !otherAttributeTypeFactor.equals(that.otherAttributeTypeFactor) : that.otherAttributeTypeFactor != null)
            return false;
        if (ownMethodFactor != null ? !ownMethodFactor.equals(that.ownMethodFactor) : that.ownMethodFactor != null)
            return false;
        if (otherMethodFactor != null ? !otherMethodFactor.equals(that.otherMethodFactor) : that.otherMethodFactor != null)
            return false;
        if (ownMethodTypeFactor != null ? !ownMethodTypeFactor.equals(that.ownMethodTypeFactor) : that.ownMethodTypeFactor != null)
            return false;
        if (otherMethodTypeFactor != null ? !otherMethodTypeFactor.equals(that.otherMethodTypeFactor) : that.otherMethodTypeFactor != null)
            return false;
        if (ownClosureTypeFactor != null ? !ownClosureTypeFactor.equals(that.ownClosureTypeFactor) : that.ownClosureTypeFactor != null)
            return false;
        if (otherClosureTypeFactor != null ? !otherClosureTypeFactor.equals(that.otherClosureTypeFactor) : that.otherClosureTypeFactor != null)
            return false;
        if (ownConstructorFactor != null ? !ownConstructorFactor.equals(that.ownConstructorFactor) : that.ownConstructorFactor != null)
            return false;
        if (otherConstructorFactor != null ? !otherConstructorFactor.equals(that.otherConstructorFactor) : that.otherConstructorFactor != null)
            return false;
        if (ownLocalVariableFactor != null ? !ownLocalVariableFactor.equals(that.ownLocalVariableFactor) : that.ownLocalVariableFactor != null)
            return false;
        if (otherLocalVariableFactor != null ? !otherLocalVariableFactor.equals(that.otherLocalVariableFactor) : that.otherLocalVariableFactor != null)
            return false;
        if (ownLocalVariableTypeFactor != null ? !ownLocalVariableTypeFactor.equals(that.ownLocalVariableTypeFactor) : that.ownLocalVariableTypeFactor != null)
            return false;
        if (otherLocalVariableTypeFactor != null ? !otherLocalVariableTypeFactor.equals(that.otherLocalVariableTypeFactor) : that.otherLocalVariableTypeFactor != null)
            return false;
        if (ownParameterFactor != null ? !ownParameterFactor.equals(that.ownParameterFactor) : that.ownParameterFactor != null)
            return false;
        if (otherParameterFactor != null ? !otherParameterFactor.equals(that.otherParameterFactor) : that.otherParameterFactor != null)
            return false;
        if (ownParameterTypeFactor != null ? !ownParameterTypeFactor.equals(that.ownParameterTypeFactor) : that.ownParameterTypeFactor != null)
            return false;
        if (otherParameterTypeFactor != null ? !otherParameterTypeFactor.equals(that.otherParameterTypeFactor) : that.otherParameterTypeFactor != null)
            return false;
        if (ownTypeParameterFactor != null ? !ownTypeParameterFactor.equals(that.ownTypeParameterFactor) : that.ownTypeParameterFactor != null)
            return false;
        if (otherTypeParameterFactor != null ? !otherTypeParameterFactor.equals(that.otherTypeParameterFactor) : that.otherTypeParameterFactor != null)
            return false;
        if (variableUsageFactor != null ? !variableUsageFactor.equals(that.variableUsageFactor) : that.variableUsageFactor != null)
            return false;
        if (otherVariableUsageFactor != null ? !otherVariableUsageFactor.equals(that.otherVariableUsageFactor) : that.otherVariableUsageFactor != null)
            return false;
        if (methodCallFactor != null ? !methodCallFactor.equals(that.methodCallFactor) : that.methodCallFactor != null)
            return false;
        if (otherMethodCallFactor != null ? !otherMethodCallFactor.equals(that.otherMethodCallFactor) : that.otherMethodCallFactor != null)
            return false;
        if (enclosingTypeFactor != null ? !enclosingTypeFactor.equals(that.enclosingTypeFactor) : that.enclosingTypeFactor != null)
            return false;
        return getterSetterFactor != null ? getterSetterFactor.equals(that.getterSetterFactor) : that.getterSetterFactor == null;
    }

    @Override
    public int hashCode() {
        int result = ownTypeDeclarationFactor != null ? ownTypeDeclarationFactor.hashCode() : 0;
        result = 31 * result + (otherTypeDeclarationFactor != null ? otherTypeDeclarationFactor.hashCode() : 0);
        result = 31 * result + (ownInheritanceFactor != null ? ownInheritanceFactor.hashCode() : 0);
        result = 31 * result + (otherInheritanceFactor != null ? otherInheritanceFactor.hashCode() : 0);
        result = 31 * result + (ownAttributeFactor != null ? ownAttributeFactor.hashCode() : 0);
        result = 31 * result + (otherAttributeFactor != null ? otherAttributeFactor.hashCode() : 0);
        result = 31 * result + (ownAttributeTypeFactor != null ? ownAttributeTypeFactor.hashCode() : 0);
        result = 31 * result + (otherAttributeTypeFactor != null ? otherAttributeTypeFactor.hashCode() : 0);
        result = 31 * result + (ownMethodFactor != null ? ownMethodFactor.hashCode() : 0);
        result = 31 * result + (otherMethodFactor != null ? otherMethodFactor.hashCode() : 0);
        result = 31 * result + (ownMethodTypeFactor != null ? ownMethodTypeFactor.hashCode() : 0);
        result = 31 * result + (otherMethodTypeFactor != null ? otherMethodTypeFactor.hashCode() : 0);
        result = 31 * result + (ownClosureTypeFactor != null ? ownClosureTypeFactor.hashCode() : 0);
        result = 31 * result + (otherClosureTypeFactor != null ? otherClosureTypeFactor.hashCode() : 0);
        result = 31 * result + (ownConstructorFactor != null ? ownConstructorFactor.hashCode() : 0);
        result = 31 * result + (otherConstructorFactor != null ? otherConstructorFactor.hashCode() : 0);
        result = 31 * result + (ownLocalVariableFactor != null ? ownLocalVariableFactor.hashCode() : 0);
        result = 31 * result + (otherLocalVariableFactor != null ? otherLocalVariableFactor.hashCode() : 0);
        result = 31 * result + (ownLocalVariableTypeFactor != null ? ownLocalVariableTypeFactor.hashCode() : 0);
        result = 31 * result + (otherLocalVariableTypeFactor != null ? otherLocalVariableTypeFactor.hashCode() : 0);
        result = 31 * result + (ownParameterFactor != null ? ownParameterFactor.hashCode() : 0);
        result = 31 * result + (otherParameterFactor != null ? otherParameterFactor.hashCode() : 0);
        result = 31 * result + (ownParameterTypeFactor != null ? ownParameterTypeFactor.hashCode() : 0);
        result = 31 * result + (otherParameterTypeFactor != null ? otherParameterTypeFactor.hashCode() : 0);
        result = 31 * result + (ownTypeParameterFactor != null ? ownTypeParameterFactor.hashCode() : 0);
        result = 31 * result + (otherTypeParameterFactor != null ? otherTypeParameterFactor.hashCode() : 0);
        result = 31 * result + (variableUsageFactor != null ? variableUsageFactor.hashCode() : 0);
        result = 31 * result + (otherVariableUsageFactor != null ? otherVariableUsageFactor.hashCode() : 0);
        result = 31 * result + (methodCallFactor != null ? methodCallFactor.hashCode() : 0);
        result = 31 * result + (otherMethodCallFactor != null ? otherMethodCallFactor.hashCode() : 0);
        result = 31 * result + (enclosingTypeFactor != null ? enclosingTypeFactor.hashCode() : 0);
        result = 31 * result + (getterSetterFactor != null ? getterSetterFactor.hashCode() : 0);
        return result;
    }

    public TermFactors withFactor(TermFactor newTermFactor) {

        Predicate<TermFactor> factorIdentifierEqualsIdentifierToReplace = factor -> factor.getFactorIdentifier().equals(newTermFactor.getFactorIdentifier());
        Optional<TermFactor> factorToChangeOtional = allFactors.stream().filter(factorIdentifierEqualsIdentifierToReplace).findFirst();
        if(!factorToChangeOtional.isPresent())
        {
            throw new RuntimeException("You tried to change a non existent Factor!");
        }

        TermFactor factorToChange = factorToChangeOtional.get();
        List<TermFactor> newFactors = new ArrayList<TermFactor>(allFactors);
        newFactors.replaceAll(oldFactor-> {
            if(factorIdentifierEqualsIdentifierToReplace.test(oldFactor))
            {
                return newTermFactor;
            }
            else return oldFactor;
        });
       return new TermFactors(newFactors.get(0).getFactor(),newFactors.get(1).getFactor(),newFactors.get(2).getFactor(),newFactors.get(3).getFactor(),newFactors.get(4).getFactor(),newFactors.get(5).getFactor(),
                newFactors.get(6).getFactor(),newFactors.get(7).getFactor(),newFactors.get(8).getFactor(),newFactors.get(9).getFactor(),newFactors.get(10).getFactor(),newFactors.get(11).getFactor(),
                newFactors.get(12).getFactor(),newFactors.get(13).getFactor(),newFactors.get(14).getFactor(),newFactors.get(15).getFactor(),newFactors.get(16).getFactor(),newFactors.get(17).getFactor(),
                newFactors.get(18).getFactor(),newFactors.get(19).getFactor(),newFactors.get(20).getFactor(),newFactors.get(21).getFactor(),newFactors.get(22).getFactor(),newFactors.get(23).getFactor(),
                newFactors.get(24).getFactor(),newFactors.get(25).getFactor(),newFactors.get(26).getFactor(),newFactors.get(27).getFactor(),newFactors.get(28).getFactor(),newFactors.get(29).getFactor(),
                newFactors.get(30).getFactor(),newFactors.get(31).getFactor());


    }

    public TermFactor getFactor(String factorIdentifier)
    {
        Predicate<TermFactor> termFactorPredicate = factor -> factor.getFactorIdentifier().equals(factorIdentifier);
        Optional<TermFactor> factorToChangeOtional = allFactors.stream().filter(termFactorPredicate).findFirst();
        if(!factorToChangeOtional.isPresent())
        {
            throw new RuntimeException("You tried to change a non existent Factor!");
        }
        return factorToChangeOtional.get();
    }
}
