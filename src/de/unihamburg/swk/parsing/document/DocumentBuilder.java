package de.unihamburg.swk.parsing.document;

import java.util.List;
import java.util.Objects;

import de.unihamburg.masterprojekt2016.traceability.*;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

public class DocumentBuilder<TDocument extends ISearchableDocument> {

	private static final String NO_RETURN_TYPE = "void";

//	private static final int enclosingTypeFactor = 1; // @see DocumentStack
	 
	private static final String INHERITANCE = "INHERITANCE";
	private static final String TYPE_DECLARATION = "TYPE DECLARATION";
	private static final String CONSTRUCTOR = ConstructorPointer.CONSTRUCTOR;
	private static final String METHOD = MethodPointer.METHOD;
	private static final String TYPE_PARAMETER = "TYPE PARAMETER";
	private static final String CLOSURE = "CLOSURE";
	private static final String ATTRIBUTE = AttributePointer.ATTRIBUTE;
	private static final String PARAMETER = "PARAMETER";
	private static final String LOCAL_VARIABLE = "LOCAL VARIABLE";
	private static final String VARIABLE_USAGE = "VARIABLE USAGE";
	private static final String METHOD_CALL = "METHOD CALL";
	private static final String FUNCTIONDECLARATION = "FUNCTIONDECLARATION";
	private static final String GETTER = "GETTER";
	private static final String SETTER = "SETTER";
	private final TermFactors _termFactors;

	private DocumentStack<TDocument> documentStack;

	public DocumentBuilder(String filePath, IDocumentFactory<TDocument> documentFactory) {
		this._termFactors = documentFactory.getTermFactors();
		documentStack = new DocumentStack<>(filePath.replace('\\', '/').replace("/./", "/"), documentFactory);
	}

	public void enterTypeDeclaration(String pointerName, TypePointerClassification classification, List<String> inheritance, int startLine) {
		documentStack.layerOf(inheritance);
		enterTypeDeclaration(pointerName, classification, startLine);
		for (String name : inheritance) {
			documentStack.addTerm(name, INHERITANCE, _termFactors.ownInheritanceFactor, _termFactors.otherInheritanceFactor);
		}
	}

	public void enterTypeDeclaration(String pointerName, TypePointerClassification classification, int startLine) {
		enterAnonymousTypeDeclaration(pointerName, classification, startLine);
		documentStack.addTerm(pointerName, TYPE_DECLARATION, _termFactors.ownTypeDeclarationFactor, _termFactors.otherTypeDeclarationFactor);
	}

	public void enterFunctionDeclaration(String functionName,  int startLine) {
		documentStack.enterElementDeclarationWithoutParentType(new FunctionPointer(functionName,startLine));
		documentStack.addTerm(functionName, FUNCTIONDECLARATION, _termFactors.ownMethodFactor, _termFactors.otherMethodFactor);
	}
	
	public void enterAnonymousTypeDeclaration(String pointerName, TypePointerClassification classification, int startLine) {
		documentStack.enterTypeDeclaration(classification, pointerName, startLine);
	}

	public void exitTypeDeclaration() {
		documentStack.closedRecentTypeDeclaration();
	}

	public void closeElement() {
		documentStack.closedRecentElementDeclaration();
	}

	public void enterConstructor(String name, int startLine) {
		ConstructorPointer constructorPointer = new ConstructorPointer(name, startLine);
		documentStack.enterElementDeclaration(constructorPointer);
		
		documentStack.addTerm(name, CONSTRUCTOR, _termFactors.ownConstructorFactor, _termFactors.otherConstructorFactor);
	}

	public void enterMethod(String pointerName, String mappedName, PointerTypeSeparator type, int startLine) {
		Objects.requireNonNull(type);

		MethodPointer methodPointer = new MethodPointer(pointerName, type.getPointerType(), startLine);
		documentStack.enterElementDeclaration(methodPointer);

		documentStack.addTerm(mappedName, METHOD, _termFactors.ownMethodFactor, _termFactors.otherMethodFactor);
		documentStack.addTerms(type.getTypes(), METHOD, _termFactors.ownMethodTypeFactor, _termFactors.otherMethodTypeFactor);
		documentStack.addTerms(type.getGenTypes(), TYPE_PARAMETER, _termFactors.ownTypeParameterFactor, _termFactors.otherTypeParameterFactor);
	}

	public void enterMethod(String pointerName, String mappedName, int startLine) {
		MethodPointer methodPointer = new MethodPointer(pointerName, NO_RETURN_TYPE,startLine);
		documentStack.enterElementDeclaration(methodPointer);

		documentStack.addTerm(mappedName, METHOD, _termFactors.ownMethodFactor, _termFactors.otherMethodFactor);
		documentStack.addTerm(NO_RETURN_TYPE, METHOD, _termFactors.ownMethodTypeFactor, _termFactors.otherMethodTypeFactor);
	}
	
	public void enterClosure(PointerTypeSeparator type, int line) {
		Objects.requireNonNull(type);

		ClosurePointer closurePointer = new ClosurePointer(type.getPointerType(), line);
		documentStack.enterElementDeclaration(closurePointer);

		documentStack.addTerms(type.getTypes(), CLOSURE, _termFactors.ownClosureTypeFactor, _termFactors.otherClosureTypeFactor);
		documentStack.addTerms(type.getGenTypes(), TYPE_PARAMETER, _termFactors.ownTypeParameterFactor, _termFactors.otherTypeParameterFactor);
	}

	public void enterClosure(int line) {
		ClosurePointer closurePointer = new ClosurePointer(NO_RETURN_TYPE, line);
		documentStack.enterElementDeclaration(closurePointer);
		
		documentStack.addTerm(NO_RETURN_TYPE, CLOSURE, _termFactors.ownClosureTypeFactor, _termFactors.otherClosureTypeFactor);
	}
	
	public void enterField(String pointerName, String mappedName, PointerTypeSeparator type, int startLine) {
		Objects.requireNonNull(type);
		
		AttributePointer attributePointer = new AttributePointer(pointerName, type.getPointerType(),  startLine);
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
		
		documentStack.addTerm(pointerName, ATTRIBUTE, _termFactors.ownAttributeFactor, _termFactors.otherAttributeFactor);
		documentStack.addTerms(type.getTypes(), ATTRIBUTE, _termFactors.ownAttributeTypeFactor, _termFactors.otherAttributeTypeFactor);
		documentStack.addTerms(type.getGenTypes(), TYPE_PARAMETER, _termFactors.ownTypeParameterFactor, _termFactors.otherTypeParameterFactor);
	}
	
	public void enterParameter(String name, PointerTypeSeparator type) {
		Objects.requireNonNull(type);
		
		addParameterToRecentPointer(name, type.getPointerType());

		documentStack.addTerm(name, PARAMETER, _termFactors.ownParameterFactor, _termFactors.otherParameterFactor);
		documentStack.addTerms(type.getTypes(), PARAMETER, _termFactors.ownParameterTypeFactor, _termFactors.otherParameterTypeFactor);
		documentStack.addTerms(type.getGenTypes(), TYPE_PARAMETER, _termFactors.ownTypeParameterFactor, _termFactors.otherTypeParameterFactor);
	}

	public void enterParameter(String name) {
		addParameterToRecentPointer(name, "");
		documentStack.addTerm(name, PARAMETER, _termFactors.ownParameterFactor, _termFactors.otherParameterFactor);
	}
	
	public void enterSubscript(PointerTypeSeparator type) {
		Objects.requireNonNull(type);
		
		SubscriptPointer subscriptPointer = new SubscriptPointer();
		subscriptPointer.setReturnType(type.getPointerType());
		
		documentStack.enterElementDeclaration(subscriptPointer);
		
		documentStack.addTerms(type.getTypes(), METHOD, _termFactors.ownMethodTypeFactor, _termFactors.otherMethodTypeFactor);
		documentStack.addTerms(type.getGenTypes(), METHOD, _termFactors.ownTypeParameterFactor, _termFactors.otherTypeParameterFactor);
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
		documentStack.addTerm(v, LOCAL_VARIABLE, _termFactors.ownLocalVariableFactor, _termFactors.otherLocalVariableFactor);
		documentStack.addTerms(type.getTypes(), LOCAL_VARIABLE, _termFactors.ownLocalVariableTypeFactor, _termFactors.otherLocalVariableTypeFactor);
		documentStack.addTerms(type.getGenTypes(), LOCAL_VARIABLE, _termFactors.ownTypeParameterFactor, _termFactors.otherTypeParameterFactor);
	}
	
	public void enterLambdaParameter(List<String> lambdavariableNames, SimpleTypeSeparator type) {
		Objects.requireNonNull(type);
		
		documentStack.addTerms(lambdavariableNames, PARAMETER, _termFactors.ownParameterFactor, _termFactors.otherParameterFactor);
		documentStack.addTerms(type.getTypes(), PARAMETER, _termFactors.ownParameterTypeFactor, _termFactors.otherParameterTypeFactor);
		documentStack.addTerms(type.getGenTypes(), TYPE_PARAMETER, _termFactors.ownTypeParameterFactor, _termFactors.otherTypeParameterFactor);
	}
	
	public void enterTypeParameter(String typeParameterName) {
		documentStack.addTerm(typeParameterName, TYPE_PARAMETER, _termFactors.ownTypeParameterFactor, _termFactors.otherTypeParameterFactor);
	}
	
	public void addEnumConstant(String constantName) {
		documentStack.addTerm(constantName, ATTRIBUTE, _termFactors.ownAttributeFactor, _termFactors.otherAttributeFactor); // TODO ?
	}
	
	private void addParameterToRecentPointer(String name, String type) {
		TraceabilityPointer traceabilityPointer = documentStack.currentTraceabilityPointer();
		if (traceabilityPointer instanceof IHasParameter) {
			((IHasParameter) traceabilityPointer).addParameter(new Parameter(name, type));
			documentStack.currentDocument().traceabilityPointerHasChanged();
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

		documentStack.addTerm(name, PARAMETER, _termFactors.ownParameterFactor, _termFactors.otherParameterFactor);
		documentStack.addTerm(type, PARAMETER, _termFactors.ownParameterTypeFactor, _termFactors.otherParameterTypeFactor);
	}

	@Deprecated
	public void enterField(String name, String type, int startLine) {
		AttributePointer attributePointer = new AttributePointer(name, type,startLine);
		documentStack.enterElementDeclaration(attributePointer);
		
		documentStack.addTerm(name, ATTRIBUTE, _termFactors.ownAttributeFactor, _termFactors.otherAttributeFactor);
		documentStack.addTerm(type, ATTRIBUTE, _termFactors.ownAttributeTypeFactor, _termFactors.otherAttributeTypeFactor);
	}

	public void enterLambdaExpression() {
		LambdaPointer lambdaPointer = new LambdaPointer();
		documentStack.enterElementDeclaration(lambdaPointer);
	}

//	public void enterClauseTag(String clause) {
//		documentStack.addTerm(clause, "???", 1, 1);
//	}

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

	public String getCurrentTypeName() {
		return documentStack.getTopmostTypeName();
	}

	public void enterVariableUsage(String name) {
		documentStack.addTerm(name, VARIABLE_USAGE, _termFactors.variableUsageFactor, _termFactors.otherVariableUsageFactor);

	}

	public void enterMethodCall(String name) {
		documentStack.addTerm(name, METHOD_CALL, _termFactors.methodCallFactor, _termFactors.otherMethodCallFactor);

	}

	public void enterGetter(String text) {
		documentStack.addTerm(text, GETTER, _termFactors.getterSetterFactor, _termFactors.getterSetterFactor);

	}


	public void enterSetter(String text) {
		documentStack.addTerm(text, SETTER, _termFactors.getterSetterFactor, _termFactors.getterSetterFactor);

	}
}