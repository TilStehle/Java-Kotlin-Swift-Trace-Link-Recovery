package de.unihamburg.swk.parsing.document;

import java.util.List;
import java.util.Objects;

import de.unihamburg.masterprojekt2016.traceability.*;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

public class DocumentBuilder<TDocument extends ISearchableDocument> {

	private static final String NO_RETURN_TYPE = "void";

//	private static final int ENCLOSE_TYPE_FACTOR = 1; // @see DocumentStack
	 
	private static final String INHERITANCE = "INHERITANCE";
	private static final String TYPE_DECLARATION = "TYPE DECLARATION";
	private static final String CONSTRUCTOR = ConstructorPointer.CONSTRUCTOR;
	private static final String METHOD = MethodPointer.METHOD;
	private static final String TYPE_PARAMETER = "TYPE PARAMETER";
	private static final String CLOSURE = "CLOSURE";
	private static final String ATTRIBUTE = AttributePointer.ATTRIBUTE;
	private static final String PARAMETER = "PARAMETER";
	private static final String LOCAL_VARIABLE = "LOCAL VARIABLE";
	
	private DocumentStack<TDocument> documentStack;

	public DocumentBuilder(String filePath, IDocumentFactory<TDocument> documentFactory) {
		documentStack = new DocumentStack<>(filePath, documentFactory);
	}

	public void enterTypeDeclaration(String pointerName, TypePointerClassification classification, List<String> inheritance) {
		documentStack.layerOf(inheritance);
		enterTypeDeclaration(pointerName, classification);
		for (String name : inheritance) {
			documentStack.addTerm(name, INHERITANCE, TermFactors.OWN_INHERITANCE_FACTOR, TermFactors.OTHER_INHERITANCE_FACTOR);
		}
	}
	
	public void enterTypeDeclaration(String pointerName, TypePointerClassification classification) {
		enterAnonymousTypeDeclaration(pointerName, classification);
		documentStack.addTerm(pointerName, TYPE_DECLARATION, TermFactors.OWN_TYPE_DECLARATION_FACTOR, TermFactors.OTHER_TYPE_DECLARATION_FACTOR);
	}
	
	public void enterAnonymousTypeDeclaration(String pointerName, TypePointerClassification classification) {
		documentStack.enterTypeDeclaration(classification, pointerName);
	}

	public void exitTypeDeclaration() {
		documentStack.closedRecentTypeDeclaration();
	}

	public void closeElement() {
		documentStack.closedRecentElementDeclaration();
	}

	public void enterConstructor(String name) {
		ConstructorPointer constructorPointer = new ConstructorPointer(name);
		documentStack.enterElementDeclaration(constructorPointer);
		
		documentStack.addTerm(name, CONSTRUCTOR, TermFactors.OWN_CONSTRUCTOR_FACTOR, TermFactors.OTHER_CONSTRUCTOR_FACTOR);
	}

	public void enterMethod(String pointerName, String mappedName, PointerTypeSeparator type) {
		Objects.requireNonNull(type);

		MethodPointer methodPointer = new MethodPointer(pointerName, type.getPointerType());
		documentStack.enterElementDeclaration(methodPointer);

		documentStack.addTerm(mappedName, METHOD, TermFactors.OWN_METHOD_FACTOR, TermFactors.OTHER_METHOD_FACTOR);
		documentStack.addTerms(type.getTypes(), METHOD, TermFactors.OWN_METHOD_TYPE_FACTOR, TermFactors.OTHER_METHOD_TYPE_FACTOR);
		documentStack.addTerms(type.getGenTypes(), TYPE_PARAMETER, TermFactors.OWN_TYPE_PARAMETER_FACTOR, TermFactors.OTHER_TYPE_PARAMETER_FACTOR);
	}

	public void enterMethod(String pointerName, String mappedName) {
		MethodPointer methodPointer = new MethodPointer(pointerName, NO_RETURN_TYPE);
		documentStack.enterElementDeclaration(methodPointer);
		
		documentStack.addTerm(mappedName, METHOD, TermFactors.OWN_METHOD_FACTOR, TermFactors.OTHER_METHOD_FACTOR);
		documentStack.addTerm(NO_RETURN_TYPE, METHOD, TermFactors.OWN_METHOD_TYPE_FACTOR, TermFactors.OTHER_METHOD_TYPE_FACTOR);
	}
	
	public void enterClosure(PointerTypeSeparator type) {
		Objects.requireNonNull(type);

		ClosurePointer closurePointer = new ClosurePointer(type.getPointerType());
		documentStack.enterElementDeclaration(closurePointer);

		documentStack.addTerms(type.getTypes(), CLOSURE, TermFactors.OWN_CLOSURE_TYPE_FACTOR, TermFactors.OTHER_CLOSURE_TYPE_FACTOR);
		documentStack.addTerms(type.getGenTypes(), TYPE_PARAMETER, TermFactors.OWN_TYPE_PARAMETER_FACTOR, TermFactors.OTHER_TYPE_PARAMETER_FACTOR);
	}

	public void enterClosure() {
		ClosurePointer closurePointer = new ClosurePointer(NO_RETURN_TYPE);
		documentStack.enterElementDeclaration(closurePointer);
		
		documentStack.addTerm(NO_RETURN_TYPE, CLOSURE, TermFactors.OWN_CLOSURE_TYPE_FACTOR, TermFactors.OTHER_CLOSURE_TYPE_FACTOR);
	}
	
	public void enterField(String pointerName, String mappedName, PointerTypeSeparator type) {
		Objects.requireNonNull(type);
		
		AttributePointer attributePointer = new AttributePointer(pointerName, type.getPointerType());
		documentStack.enterElementDeclaration(attributePointer);
		
		if(mappedName.contains(",")) {
			for (String name : mappedName.split(",")) {
				addFieldTerms(name, type);
			}
		} else {
			addFieldTerms(mappedName, type);
		}
	}
	
	private void addFieldTerms(String pointerName, PointerTypeSeparator type) {
		Objects.requireNonNull(type);
		
		documentStack.addTerm(pointerName, ATTRIBUTE, TermFactors.OWN_ATTRIBUTE_FACTOR, TermFactors.OTHER_ATTRIBUTE_FACTOR);
		documentStack.addTerms(type.getTypes(), ATTRIBUTE, TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, TermFactors.OTHER_ATTRIBUTE_TYPE_FACTOR);
		documentStack.addTerms(type.getGenTypes(), TYPE_PARAMETER, TermFactors.OWN_TYPE_PARAMETER_FACTOR, TermFactors.OTHER_TYPE_PARAMETER_FACTOR);
	}
	
	public void enterParameter(String name, PointerTypeSeparator type) {
		Objects.requireNonNull(type);
		
		addParameterToRecentPointer(name, type.getPointerType());

		documentStack.addTerm(name, PARAMETER, TermFactors.OWN_PARAMETER_FACTOR, TermFactors.OTHER_PARAMETER_FACTOR);
		documentStack.addTerms(type.getTypes(), PARAMETER, TermFactors.OWN_PARAMETER_TYPE_FACTOR, TermFactors.OTHER_PARAMETER_TYPE_FACTOR);
		documentStack.addTerms(type.getGenTypes(), TYPE_PARAMETER, TermFactors.OWN_TYPE_PARAMETER_FACTOR, TermFactors.OTHER_TYPE_PARAMETER_FACTOR);
	}

	public void enterParameter(String name) {
		addParameterToRecentPointer(name, "");
		documentStack.addTerm(name, PARAMETER, TermFactors.OWN_PARAMETER_FACTOR, TermFactors.OTHER_PARAMETER_FACTOR);
	}
	
	public void enterSubscript(PointerTypeSeparator type) {
		Objects.requireNonNull(type);
		
		SubscriptPointer subscriptPointer = new SubscriptPointer();
		subscriptPointer.setReturnType(type.getPointerType());
		
		documentStack.enterElementDeclaration(subscriptPointer);
		
		documentStack.addTerms(type.getTypes(), METHOD, TermFactors.OWN_METHOD_TYPE_FACTOR, TermFactors.OTHER_METHOD_TYPE_FACTOR);
		documentStack.addTerms(type.getGenTypes(), METHOD, TermFactors.OWN_TYPE_PARAMETER_FACTOR, TermFactors.OTHER_TYPE_PARAMETER_FACTOR);
	}
	
	public void enterLocalVariable(String name, PointerTypeSeparator type) {
		Objects.requireNonNull(type);
		
		if(name.contains(",")) {
			for (String v : name.split(",")) {
				localVariableTerms(type, v);
			}
		} else {
			localVariableTerms(type, name);
		}
	}

	private void localVariableTerms(PointerTypeSeparator type, String v) {
		documentStack.addTerm(v, LOCAL_VARIABLE, TermFactors.OWN_LOCAL_VARIABLE_FACTOR, TermFactors.OTHER_LOCAL_VARIABLE_FACTOR);
		documentStack.addTerms(type.getTypes(), LOCAL_VARIABLE, TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, TermFactors.OTHER_LOCAL_VARIABLE_TYPE_FACTOR);
		documentStack.addTerms(type.getGenTypes(), LOCAL_VARIABLE, TermFactors.OWN_TYPE_PARAMETER_FACTOR, TermFactors.OTHER_TYPE_PARAMETER_FACTOR);
	}
	
	public void enterLambda(List<String> lambdavariableNames, SimlpleTypeSeparator type) {
		Objects.requireNonNull(type);
		
		documentStack.addTerms(lambdavariableNames, PARAMETER, TermFactors.OWN_PARAMETER_FACTOR, TermFactors.OTHER_PARAMETER_FACTOR);
		documentStack.addTerms(type.getTypes(), PARAMETER, TermFactors.OWN_PARAMETER_TYPE_FACTOR, TermFactors.OTHER_PARAMETER_TYPE_FACTOR);
		documentStack.addTerms(type.getGenTypes(), TYPE_PARAMETER, TermFactors.OWN_TYPE_PARAMETER_FACTOR, TermFactors.OTHER_TYPE_PARAMETER_FACTOR);
	}
	
	public void enterTypeParameter(String typeParameterName) {
		documentStack.addTerm(typeParameterName, TYPE_PARAMETER, TermFactors.OWN_TYPE_PARAMETER_FACTOR, TermFactors.OTHER_TYPE_PARAMETER_FACTOR);
	}
	
	public void addEnumConstant(String constantName) {
		documentStack.addTerm(constantName, ATTRIBUTE, TermFactors.OWN_ATTRIBUTE_FACTOR, TermFactors.OTHER_ATTRIBUTE_FACTOR); // TODO ?
	}
	
	private void addParameterToRecentPointer(String name, String type) {
		TraceabilityPointer traceabilityPointer = documentStack.currentTraceabilityPointer();
		if (traceabilityPointer instanceof IHasParameter) {
			((IHasParameter) traceabilityPointer).addParameter(new Parameter(name, type));
		} else {
			throw new IllegalStateException(name + " " + type);
		}
	}

	public List<TDocument> getDocuments() {
		return this.documentStack.getAllDocuments();
	}

	public void addPackagName(String fullPackageName) {
		documentStack.addPackage(fullPackageName);
	}

	public void setLayer(String value) { // TODO
		documentStack.forEachOnStack(doc -> doc.setLayer(value));
	}

	public int openTypes() {
		return documentStack.countOpenTypes();
	}


	@Deprecated
	public void enterParameter(String name, String type) {
		addParameterToRecentPointer(name, type);

		documentStack.addTerm(name, PARAMETER, TermFactors.OWN_PARAMETER_FACTOR, TermFactors.OTHER_PARAMETER_FACTOR);
		documentStack.addTerm(type, PARAMETER, TermFactors.OWN_PARAMETER_TYPE_FACTOR, TermFactors.OTHER_PARAMETER_TYPE_FACTOR);
	}

	@Deprecated
	public void enterField(String name, String type) {
		AttributePointer attributePointer = new AttributePointer(name, type);
		documentStack.enterElementDeclaration(attributePointer);
		
		documentStack.addTerm(name, ATTRIBUTE, TermFactors.OWN_ATTRIBUTE_FACTOR, TermFactors.OTHER_ATTRIBUTE_FACTOR);
		documentStack.addTerm(type, ATTRIBUTE, TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, TermFactors.OTHER_ATTRIBUTE_TYPE_FACTOR);
	}

	public void enterLambdaExpression() {
		LambdaPointer lambdaPointer = new LambdaPointer();
		documentStack.enterElementDeclaration(lambdaPointer);
	}

	public void enterClauseTag(String clause) {
		documentStack.addTerm(clause, "???", 1, 1);
	}

	public boolean isLocalBeforeAdd() {
		TraceabilityPointer current = documentStack.currentTraceabilityPointer();
		if(current == null) return false;
		
		return !(current instanceof TypePointer);
	}

	public boolean isLocalBeforeRemove() {
		return isLocalBeforeAdd();
//		TraceabilityPointer current = documentStack.secondCurrentTraceabilityPointer();
//		if(current == null) return false;
//		return (current instanceof TypePointer);
	}

	public void printOpenElements() {
		this.documentStack.printOpenElements();
	}
}