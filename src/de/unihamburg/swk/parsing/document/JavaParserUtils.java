package de.unihamburg.swk.parsing.document;

import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.ArrayTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.ClassOrInterfaceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.ClassType_lf_classOrInterfaceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.ClassType_lfno_classOrInterfaceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.ExtendsInterfacesContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.FormalParameterContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.PrimitiveTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.ReferenceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.SuperclassContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.SuperinterfacesContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.TypeArgumentContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.TypeArgumentsContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.TypeVariableContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.UnannArrayTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.UnannClassOrInterfaceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.UnannPrimitiveTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.UnannReferenceTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.UnannTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.UnannTypeVariableContext;

public final class JavaParserUtils {

	public static final TermMapperManager MAPPER = TermMapperManager.JAVA;
	
	private JavaParserUtils() { 
		throw new IllegalAccessError();
	}
	
	public static PointerTypeSeparator setType(UnannTypeContext unannType) {
		PointerTypeSeparator result = new PointerTypeSeparator(MAPPER);
		try {
			result.setPointerType(unannType.getText());
			if (unannType.unannPrimitiveType() != null) {
				setType(unannType.unannPrimitiveType(), result);
			} else if (unannType.unannReferenceType() != null) {
				setType(unannType.unannReferenceType(), result);
			} else {
				throw new IllegalAccessError();
			}
		} catch (Exception e) {
			System.err.println("Typeerror: " + unannType.getText());
			e.printStackTrace();
		} 
//		System.out.println(result);
		return result;
	}

	private static void setType(UnannReferenceTypeContext typeContext, PointerTypeSeparator result) {
//		System.out.println("UnannReferenceTypeContext" + typeContext.getText());
		if (typeContext.unannClassOrInterfaceType() != null) {
			setType(typeContext.unannClassOrInterfaceType(), result);
		} else if (typeContext.unannTypeVariable() != null) {
			setType(typeContext.unannTypeVariable(), result);
		} else if (typeContext.unannArrayType() != null) {
			setType(typeContext.unannArrayType(), result);
		} else {
			throw new IllegalAccessError();
		}
	}
	
	private static void setType(UnannArrayTypeContext typeContext, PointerTypeSeparator result) {
//		System.out.println("UnannArrayTypeContext" + typeContext.getText());
		if(typeContext.unannClassOrInterfaceType() != null) {
			setType(typeContext.unannClassOrInterfaceType(), result);
		} else if(typeContext.unannPrimitiveType() != null) {
			setType(typeContext.unannPrimitiveType(), result);
		} else if(typeContext.unannTypeVariable() != null) {
			setType(typeContext.unannTypeVariable(), result);
		} else {
			throw new IllegalAccessError();
		}
	}
	
	private static void setType(UnannClassOrInterfaceTypeContext typeContext, PointerTypeSeparator result) {
//		System.out.println("UnannClassOrInterfaceTypeContext: " + typeContext.getText());

		if (typeContext.unannClassType_lfno_unannClassOrInterfaceType() != null) {
			setType(typeContext.unannClassType_lfno_unannClassOrInterfaceType(), result);
		} else {
			setType(typeContext.unannInterfaceType_lfno_unannClassOrInterfaceType(), result);
		}
		
		for (UnannClassType_lf_unannClassOrInterfaceTypeContext a : typeContext.unannClassType_lf_unannClassOrInterfaceType()) {
			setType(a, result);
		}
		for (UnannInterfaceType_lf_unannClassOrInterfaceTypeContext b : typeContext.unannInterfaceType_lf_unannClassOrInterfaceType()) {
			setType(b, result);
		}
	}

	private static void setType(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext typeContext, @SuppressWarnings("unused") PointerTypeSeparator result) {
		System.out.println("UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext");
		System.err.println("Not supported type: "  + typeContext.getText());
	}

	private static void setType(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext typeContext, @SuppressWarnings("unused") PointerTypeSeparator result) {
		System.out.println("UnannInterfaceType_lf_unannClassOrInterfaceTypeContext");
		System.err.println("Not supported type: "  + typeContext.getText());
	}

	private static void setType(UnannPrimitiveTypeContext typeContext, PointerTypeSeparator result) {
//		System.out.println("UnannPrimitiveTypeContext "+ typeContext.getText());
		result.addType(typeContext.getText());
	}
	
	private static void setType(UnannTypeVariableContext typeContext, PointerTypeSeparator result) {
//		System.out.println("UnannTypeVariableContext "+ typeContext.getText());
		result.addType(typeContext.Identifier().getText());
	}
	
	private static void setType(UnannClassType_lfno_unannClassOrInterfaceTypeContext typeContext, PointerTypeSeparator result) {
//		System.out.println("UnannClassType_lfno_unannClassOrInterfaceTypeContext " + typeContext.getText());
		result.addType(typeContext.Identifier().getText());
		
		if(typeContext.typeArguments() != null) {
			setTypes(typeContext.typeArguments(), result);
		}
	}
	
	private static void setType(UnannClassType_lf_unannClassOrInterfaceTypeContext typeContext, PointerTypeSeparator result) {
//		System.out.println("UnannClassType_lf_unannClassOrInterfaceTypeContext " + typeContext.getText());
		result.addType(typeContext.Identifier().getText());

		if(typeContext.typeArguments() != null) {
			setTypes(typeContext.typeArguments(), result);
		}
	}

	private static void setTypes(TypeArgumentsContext typeArguments, PointerTypeSeparator result) {
//		System.out.println("TypeArgumentsContext");
		for (TypeArgumentContext tac : typeArguments.typeArgumentList().typeArgument()) {
			if(tac.referenceType() != null) {
				setType(tac.referenceType(), result);
			}
		}
	}
	
	private static void setType(ReferenceTypeContext typeContext, PointerTypeSeparator result) {
//		System.out.println("ReferenceTypeContext: " + typeContext.getText());
		if(typeContext.classOrInterfaceType() != null) {
			setType(typeContext.classOrInterfaceType(), result);
		} else if(typeContext.typeVariable() != null) {
			setType(typeContext.typeVariable(), result);
		} else if(typeContext.arrayType() != null) {
			setType(typeContext.arrayType(), result);
		} else {
			throw new UnknownError();
		}
	}

	private static void setType(ArrayTypeContext typeContext, PointerTypeSeparator result) { // TODO
		if(typeContext.classOrInterfaceType() != null) {
			setType(typeContext.classOrInterfaceType(), result);
		} else if(typeContext.primitiveType() != null) {
			setType(typeContext.primitiveType(), result);
		} else if(typeContext.typeVariable() != null) {
			setType(typeContext.typeVariable(), result);
		} else {
			throw new IllegalAccessError();
		}
	}

	private static void setType(PrimitiveTypeContext typeContext, PointerTypeSeparator result) {
		result.addType(typeContext.getText());		
	}

	private static void setType(TypeVariableContext typeContext, PointerTypeSeparator result) {
		result.addType(typeContext.Identifier().getText());
	}

	private static void setType(ClassOrInterfaceTypeContext typeContext, PointerTypeSeparator result) {
//		System.out.println("UnannClassOrInterfaceTypeContext: " + typeContext.getText());
		if (typeContext.classType_lfno_classOrInterfaceType() != null) {
			setType(typeContext.classType_lfno_classOrInterfaceType(), result);
		} else {
			setType(typeContext.interfaceType_lfno_classOrInterfaceType(), result);
		}
		
		for (ClassType_lf_classOrInterfaceTypeContext a : typeContext.classType_lf_classOrInterfaceType()) {
			setType(a, result);
		}
		for (InterfaceType_lf_classOrInterfaceTypeContext b : typeContext.interfaceType_lf_classOrInterfaceType()) {
			setType(b, result);
		}
	}
	
	private static void setType(ClassType_lf_classOrInterfaceTypeContext typeContext, PointerTypeSeparator result) {
//		System.out.println("ClassType_lf_classOrInterfaceTypeContext " + typeContext.getText());
		result.addType(typeContext.Identifier().getText());

		if(typeContext.typeArguments() != null) {
			setTypes(typeContext.typeArguments(), result);
		}
	}
	
	private static void setType(ClassType_lfno_classOrInterfaceTypeContext typeContext, PointerTypeSeparator result) {
//		System.out.println("ClassType_lfno_classOrInterfaceTypeContext " + typeContext.getText());
		result.addType(typeContext.Identifier().getText());
		
		if(typeContext.typeArguments() != null) {
			setTypes(typeContext.typeArguments(), result);
		}
	}
	
	private static void setType(InterfaceType_lfno_classOrInterfaceTypeContext typeContext, @SuppressWarnings("unused") PointerTypeSeparator result) {
		System.out.println("InterfaceType_lfno_classOrInterfaceTypeContext");
		System.err.println("Not supported type: "  + typeContext.getText());
	}

	private static void setType(InterfaceType_lf_classOrInterfaceTypeContext typeContext, @SuppressWarnings("unused") PointerTypeSeparator result) {
		System.out.println("InterfaceType_lf_classOrInterfaceTypeContext");
		System.err.println("Not supported type: "  + typeContext.getText());
	}
	
	public static void setTypesAndNames(FormalParameterContext formalParameter, SimlpleTypeSeparator types, List<String> names) {
		names.add(formalParameter.variableDeclaratorId().Identifier().getText());
		types.addAll(JavaParserUtils.setType(formalParameter.unannType()));
	}
	
	public static void setTypesAndNames(Java8Parser.LambdaParametersContext ctx, SimlpleTypeSeparator types, List<String> names) {
		// (a , b) -> { ... }
		if (ctx.inferredFormalParameterList() != null) {
			ctx.inferredFormalParameterList().Identifier().forEach(e -> names.add(e.getText()));
		// a -> { ... }
		} else if (ctx.Identifier() != null) {
			names.add(ctx.Identifier().getText());
		// (A a, ...) -> { ... }
		} else if (ctx.formalParameterList() != null) {
			if (ctx.formalParameterList().formalParameters() != null) {
				for (FormalParameterContext fpc : ctx.formalParameterList().formalParameters().formalParameter()) {
					JavaParserUtils.setTypesAndNames(fpc, types, names);
				}
			} else {
				JavaParserUtils.setTypesAndNames(ctx.formalParameterList().lastFormalParameter().formalParameter(), types, names);
			}
		} else {
			// () -> { ... }
		}
	}
	
	public static void setInheritance(SuperinterfacesContext superinterfaces, List<String> inheritance) {
		if(superinterfaces != null) {
			superinterfaces.interfaceTypeList().interfaceType()
			.forEach(e -> inheritance.add(MAPPER.types(e.classType().Identifier().getText())));
		}
	}

	public static void setInheritance(SuperclassContext superclass, List<String> inheritance) {
		if(superclass != null) {
			inheritance.add(MAPPER.types(superclass.classType().Identifier().getText()));
		}
	}

	public static void setInheritance(ExtendsInterfacesContext extendsInterfaces, List<String> interfaces) {
		if (extendsInterfaces != null) {
			extendsInterfaces.interfaceTypeList().interfaceType()
					.forEach(e -> interfaces.add(MAPPER.types(e.classType().Identifier().getText())));
		}
	}

	public static String getName(TerminalNode identifier) {
		return identifier.getText();
	}
	
	public static String setMappedMethodName(String identifier) {
		return MAPPER.functions(identifier);
	}
	
	public static String setMappedAttributeName(String identifier) {
		return MAPPER.variables(identifier);
	}
}