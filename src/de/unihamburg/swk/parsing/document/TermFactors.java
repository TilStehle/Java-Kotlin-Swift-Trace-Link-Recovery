package de.unihamburg.swk.parsing.document;

public class TermFactors {

//	public static final TermFactor OWN_TYPE_DECLARATION_FACTOR = 4; // 4
//	public static final TermFactor OTHER_TYPE_DECLARATION_FACTOR = 4;
//	public static final TermFactor OWN_INHERITANCE_FACTOR = 1;
//	public static final TermFactor OTHER_INHERITANCE_FACTOR = 1;
//
//	public static final TermFactor OWN_ATTRIBUTE_FACTOR = 4;
//	public static final TermFactor OTHER_ATTRIBUTE_FACTOR = 2;
//	public static final TermFactor OWN_ATTRIBUTE_TYPE_FACTOR = 1;
//	public static final TermFactor OTHER_ATTRIBUTE_TYPE_FACTOR = 1;
//
//	public static final TermFactor OWN_METHOD_FACTOR = 4;
//	public static final TermFactor OTHER_METHOD_FACTOR = 2;
//	public static final TermFactor OWN_METHOD_TYPE_FACTOR = 1;
//	public static final TermFactor OTHER_METHOD_TYPE_FACTOR = 1;
//
//	public static final TermFactor OWN_CLOSURE_TYPE_FACTOR = 4;
//	public static final TermFactor OTHER_CLOSURE_TYPE_FACTOR = 1;
//
//	public static final TermFactor OWN_CONSTRUCTOR_FACTOR = 4;
//	public static final TermFactor OTHER_CONSTRUCTOR_FACTOR = 2;
//
//	public static final TermFactor OWN_LOCAL_VARIABLE_FACTOR = 2;
//	public static final TermFactor OTHER_LOCAL_VARIABLE_FACTOR = 1;
//	public static final TermFactor OWN_LOCAL_VARIABLE_TYPE_FACTOR = 1;
//	public static final TermFactor OTHER_LOCAL_VARIABLE_TYPE_FACTOR = 1;
//
//	public static final TermFactor OWN_PARAMETER_FACTOR = 2;
//	public static final TermFactor OTHER_PARAMETER_FACTOR = 1;
//	public static final TermFactor OWN_PARAMETER_TYPE_FACTOR = 1;
//	public static final TermFactor OTHER_PARAMETER_TYPE_FACTOR = 1;
//
//	public static final TermFactor OWN_TYPE_PARAMETER_FACTOR = 1;
//	public static final TermFactor OTHER_TYPE_PARAMETER_FACTOR = 1;

	public static final TermFactor OWN_TYPE_DECLARATION_FACTOR = new TermFactor(8, "OWN_TYPE_DECLARATION_FACTOR"); // 4
	public static final TermFactor OTHER_TYPE_DECLARATION_FACTOR = new TermFactor(8, "OTHER_TYPE_DECLARATION_FACTOR");
	public static final TermFactor OWN_INHERITANCE_FACTOR = new TermFactor(2, "OWN_INHERITANCE_FACTOR");
	public static final TermFactor OTHER_INHERITANCE_FACTOR = new TermFactor(2, "OTHER_INHERITANCE_FACTOR");

	public static final TermFactor OWN_ATTRIBUTE_FACTOR = new TermFactor(8, "OWN_ATTRIBUTE_FACTOR");
	public static final TermFactor OTHER_ATTRIBUTE_FACTOR = new TermFactor(4, "OTHER_ATTRIBUTE_FACTOR");
	public static final TermFactor OWN_ATTRIBUTE_TYPE_FACTOR = new TermFactor(2, "OWN_ATTRIBUTE_TYPE_FACTOR");
	public static final TermFactor OTHER_ATTRIBUTE_TYPE_FACTOR = new TermFactor(2, "OTHER_ATTRIBUTE_TYPE_FACTOR");

	public static final TermFactor OWN_METHOD_FACTOR = new TermFactor(8, "OWN_METHOD_FACTOR");
	public static final TermFactor OTHER_METHOD_FACTOR = new TermFactor(4, "OTHER_METHOD_FACTOR");
	public static final TermFactor OWN_METHOD_TYPE_FACTOR = new TermFactor(2, "OWN_METHOD_TYPE_FACTOR");
	public static final TermFactor OTHER_METHOD_TYPE_FACTOR = new TermFactor(2, "OTHER_METHOD_TYPE_FACTOR");

	public static final TermFactor OWN_CLOSURE_TYPE_FACTOR = new TermFactor(8, "OWN_CLOSURE_TYPE_FACTOR");
	public static final TermFactor OTHER_CLOSURE_TYPE_FACTOR = new TermFactor(2, "OTHER_CLOSURE_TYPE_FACTOR");

	public static final TermFactor OWN_CONSTRUCTOR_FACTOR = new TermFactor(8, "OWN_CONSTRUCTOR_FACTOR");
	public static final TermFactor OTHER_CONSTRUCTOR_FACTOR = new TermFactor(4, "OTHER_CONSTRUCTOR_FACTOR");

	public static final TermFactor OWN_LOCAL_VARIABLE_FACTOR = new TermFactor(8, "OWN_LOCAL_VARIABLE_FACTOR");
	public static final TermFactor OTHER_LOCAL_VARIABLE_FACTOR = new TermFactor(2, "OTHER_LOCAL_VARIABLE_FACTOR");
	public static final TermFactor OWN_LOCAL_VARIABLE_TYPE_FACTOR = new TermFactor(2, "OWN_LOCAL_VARIABLE_TYPE_FACTOR");
	public static final TermFactor OTHER_LOCAL_VARIABLE_TYPE_FACTOR = new TermFactor(2, "OTHER_LOCAL_VARIABLE_TYPE_FACTOR");

	public static final TermFactor OWN_PARAMETER_FACTOR = new TermFactor(8, "OWN_PARAMETER_FACTOR");
	public static final TermFactor OTHER_PARAMETER_FACTOR = new TermFactor(2, "OTHER_PARAMETER_FACTOR");
	public static final TermFactor OWN_PARAMETER_TYPE_FACTOR = new TermFactor(2, "OWN_PARAMETER_TYPE_FACTOR");
	public static final TermFactor OTHER_PARAMETER_TYPE_FACTOR = new TermFactor(2, "OTHER_PARAMETER_TYPE_FACTOR");

	public static final TermFactor OWN_TYPE_PARAMETER_FACTOR = new TermFactor(1, "OWN_TYPE_PARAMETER_FACTOR");
	public static final TermFactor OTHER_TYPE_PARAMETER_FACTOR = new TermFactor(1, "OTHER_TYPE_PARAMETER_FACTOR");



	public static final TermFactor VARIABLE_USAGE_FACTOR = new TermFactor(1, "VARIABLE_USAGE_FACTOR");
	public static final TermFactor OTHER_VARIABLE_USAGE_FACTOR = new TermFactor(1, "OTHER_VARIABLE_USAGE_FACTOR");

	public static final TermFactor METHOD_CALL_FACTOR = new TermFactor(1, "METHOD_CALL_FACTOR");
	public static final TermFactor OTHER_METHOD_CALL_FACTOR = new TermFactor(1, "OTHER_METHOD_CALL_FACTOR");
	public static final TermFactor ENCLOSING_TYPE_FACTOR =new TermFactor(1, "ENCLOSING_TYPE_FACTOR");
	public static final TermFactor GETTER_SETTER_FACTOR =new TermFactor(1, "GETTER_SETTER_FACTOR");

}
