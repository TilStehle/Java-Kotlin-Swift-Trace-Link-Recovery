package de.unihamburg.swk.parsing.document;

public class TermFactors {

//	public static final int OWN_TYPE_DECLARATION_FACTOR = 4; // 4
//	public static final int OTHER_TYPE_DECLARATION_FACTOR = 4;
//	public static final int OWN_INHERITANCE_FACTOR = 1;
//	public static final int OTHER_INHERITANCE_FACTOR = 1;
//
//	public static final int OWN_ATTRIBUTE_FACTOR = 4;
//	public static final int OTHER_ATTRIBUTE_FACTOR = 2;
//	public static final int OWN_ATTRIBUTE_TYPE_FACTOR = 1;
//	public static final int OTHER_ATTRIBUTE_TYPE_FACTOR = 1;
//
//	public static final int OWN_METHOD_FACTOR = 4;
//	public static final int OTHER_METHOD_FACTOR = 2;
//	public static final int OWN_METHOD_TYPE_FACTOR = 1;
//	public static final int OTHER_METHOD_TYPE_FACTOR = 1;
//
//	public static final int OWN_CLOSURE_TYPE_FACTOR = 4;
//	public static final int OTHER_CLOSURE_TYPE_FACTOR = 1;
//
//	public static final int OWN_CONSTRUCTOR_FACTOR = 4;
//	public static final int OTHER_CONSTRUCTOR_FACTOR = 2;
//
//	public static final int OWN_LOCAL_VARIABLE_FACTOR = 2;
//	public static final int OTHER_LOCAL_VARIABLE_FACTOR = 1;
//	public static final int OWN_LOCAL_VARIABLE_TYPE_FACTOR = 1;
//	public static final int OTHER_LOCAL_VARIABLE_TYPE_FACTOR = 1;
//
//	public static final int OWN_PARAMETER_FACTOR = 2;
//	public static final int OTHER_PARAMETER_FACTOR = 1;
//	public static final int OWN_PARAMETER_TYPE_FACTOR = 1;
//	public static final int OTHER_PARAMETER_TYPE_FACTOR = 1;
//
//	public static final int OWN_TYPE_PARAMETER_FACTOR = 1;
//	public static final int OTHER_TYPE_PARAMETER_FACTOR = 1;

	public static final int OWN_TYPE_DECLARATION_FACTOR = 8; // 4
	public static final int OTHER_TYPE_DECLARATION_FACTOR = 8;
	public static final int OWN_INHERITANCE_FACTOR = 2;
	public static final int OTHER_INHERITANCE_FACTOR = 2;

	public static final int OWN_ATTRIBUTE_FACTOR = 8;
	public static final int OTHER_ATTRIBUTE_FACTOR = 4;
	public static final int OWN_ATTRIBUTE_TYPE_FACTOR = 2;
	public static final int OTHER_ATTRIBUTE_TYPE_FACTOR = 2;

	public static final int OWN_METHOD_FACTOR = 8;
	public static final int OTHER_METHOD_FACTOR = 4;
	public static final int OWN_METHOD_TYPE_FACTOR = 2;
	public static final int OTHER_METHOD_TYPE_FACTOR = 2;

	public static final int OWN_CLOSURE_TYPE_FACTOR = 8;
	public static final int OTHER_CLOSURE_TYPE_FACTOR = 2;

	public static final int OWN_CONSTRUCTOR_FACTOR = 8;
	public static final int OTHER_CONSTRUCTOR_FACTOR = 4;

	public static final int OWN_LOCAL_VARIABLE_FACTOR = 8;
	public static final int OTHER_LOCAL_VARIABLE_FACTOR = 2;
	public static final int OWN_LOCAL_VARIABLE_TYPE_FACTOR = 2;
	public static final int OTHER_LOCAL_VARIABLE_TYPE_FACTOR = 2;

	public static final int OWN_PARAMETER_FACTOR = 8;
	public static final int OTHER_PARAMETER_FACTOR = 2;
	public static final int OWN_PARAMETER_TYPE_FACTOR = 2;
	public static final int OTHER_PARAMETER_TYPE_FACTOR = 2;

	public static final int OWN_TYPE_PARAMETER_FACTOR = 1;
	public static final int OTHER_TYPE_PARAMETER_FACTOR = 1;





    public static final int OWN_FUNCTION_DECLARATION_FACTOR = OWN_METHOD_FACTOR ;
	public static final int OTHER_FUNCTION_DECLARATION_FACTOR =OTHER_METHOD_FACTOR ;

	public static final int VARIABLE_USAGE_FACTOR = 1;
	public static final int OTHER_VARIABLE_USAGE_FACTOR = 1;

	public static final int METHOD_CALL_FACTOR = 1;
	public static final int OTHER_METHOD_CALL_FACTOR = 1;
}
