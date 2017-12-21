package de.unihamburg.swk.parsing.document;

import java.util.List;

import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.STypeContext;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.TupleTypeContext;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.TypeInheritanceClauseContext;

public final class SwiftListenerExtension extends AbstractListenerExtension {

	public SwiftListenerExtension() {
		super(TermMapperManager.SWIFT);
	}

	public PointerTypeSeparator getType(STypeContext sType) {
		PointerTypeSeparator result = new PointerTypeSeparator(mapper);
		result.setPointerType(sType.getText());
		getType(sType, result);
		return result;
	}

	public SimpleTypeSeparator getSimpleType(STypeContext sType) {
		SimpleTypeSeparator result = new SimpleTypeSeparator(mapper);
		getType(sType, result);
		return result;
	}

	private void getType(STypeContext sType, SimpleTypeSeparator types) {
		if (sType == null)
			return;
		if (sType.typeIdentifier() != null) {
			types.addType(sType.typeIdentifier().typeName().getText());
			if (sType.typeIdentifier().genericArgumentClause() != null) {
				sType.typeIdentifier().genericArgumentClause().genericArgumentList().genericArgument()
						.forEach(gen -> getType(gen.sType(), types));
			}
		} else if (sType.tupleType() != null) {
			getType(sType.tupleType(), types);
			if (sType.sType() != null) {
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

	private void getType(TupleTypeContext tupleType, SimpleTypeSeparator types) {
		if (tupleType.tupleTypeBody() != null) {
			tupleType.tupleTypeBody().tupleTypeElementList().tupleTypeElement()
					.forEach(tupel -> getType(tupel.sType(), types));
		}
	}

	public void setInharitance(TypeInheritanceClauseContext typeInheritanceClause, List<String> inharitance) {
		if (typeInheritanceClause != null && typeInheritanceClause.typeInheritanceList() != null) {
			typeInheritanceClause.typeInheritanceList().typeIdentifier()
					.forEach(e -> inharitance.add(mapper.types(e.typeName().getText())));
		}
	}

}
