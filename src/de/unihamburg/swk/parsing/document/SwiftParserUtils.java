package de.unihamburg.swk.parsing.document;

import java.util.List;

import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.STypeContext;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.TupleTypeContext;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.TypeInheritanceClauseContext;

public final class SwiftParserUtils {

	public static final TermMapperManager MAPPER = TermMapperManager.SWIFT;
	
	private SwiftParserUtils() {
		throw new IllegalAccessError();
	}
	
	public static PointerTypeSeparator getType(STypeContext sType) {
		PointerTypeSeparator result = new PointerTypeSeparator(MAPPER);
		result.setPointerType(sType.getText());
		getType(sType, result);
		return result;
	}
	
	public static SimlpleTypeSeparator getSimpleType(STypeContext sType) {
		SimlpleTypeSeparator result = new SimlpleTypeSeparator(MAPPER);
		getType(sType, result);
		return result;
	}
	
	private static void getType(STypeContext sType, SimlpleTypeSeparator types) {
		if(sType == null) return;
		if (sType.typeIdentifier() != null) {
			types.addType(sType.typeIdentifier().typeName().getText());
			if (sType.typeIdentifier().genericArgumentClause() != null) {
				sType.typeIdentifier().genericArgumentClause().genericArgumentList().genericArgument()
						.forEach(gen -> getType(gen.sType(), types));
			}
		} else if (sType.tupleType() != null) {
			getType(sType.tupleType(), types);
			if(sType.sType() != null) {
				for (STypeContext type : sType.sType()) {
					getType(type, types);
				}
			}
		} else if (sType.arrayType() != null) {
			getType(sType.arrayType().sType(), types);
		} else if (sType.dictionaryType() != null) {
			sType.dictionaryType().sType().forEach(e -> getType(e, types));
		} else if (sType.sType() != null) {
			sType.sType().forEach(e -> getType(e, types));
		} else {
			System.err.println("no type Match");
		}
	}

	private static void getType(TupleTypeContext tupleType, SimlpleTypeSeparator types) {
		if(tupleType.tupleTypeBody() != null) {
			tupleType.tupleTypeBody().tupleTypeElementList().tupleTypeElement()
					.forEach(tupel -> getType(tupel.sType(), types));
		}
	}

	public static void setInharitance(TypeInheritanceClauseContext typeInheritanceClause, List<String> inharitance) {
		if(typeInheritanceClause != null && typeInheritanceClause.typeInheritanceList() != null) {
			typeInheritanceClause.typeInheritanceList().typeIdentifier().forEach(e -> inharitance.add(MAPPER.types(e.typeName().getText())));
		}
	}

	public static String getMappedMethodName(String name) {
		return MAPPER.functions(name);
	}

	public static String getMappedAttributeName(String pointerName) {
		return MAPPER.variables(pointerName);
	}
}
