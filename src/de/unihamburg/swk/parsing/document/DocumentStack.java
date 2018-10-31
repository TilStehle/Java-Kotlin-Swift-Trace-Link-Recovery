package de.unihamburg.swk.parsing.document;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointerClassification;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

public class DocumentStack<TDocument extends ISearchableDocument> implements IDocumentCreationStructure<TDocument> {

	private LayerCalculator layerCalculator;

	private static String ENCLOSE_TYPE = "ENCLOSE TYPE";
	
	private String filePath;
	private IDocumentFactory<TDocument> documentFactory;

	private List<TDocument> documentBag;
	private Stack<TDocument> documentStack;
	private Stack<TypePointer> typeStack;
	private Stack<String> typeNameStack;
	private TermFactors termFactors;
	
	public DocumentStack(String filePath, IDocumentFactory<TDocument> documentFactory) {
		termFactors = documentFactory.getTermFactors();
		this.filePath = filePath;
		this.documentFactory = documentFactory;
		this.layerCalculator = new LayerCalculator();

		documentBag = new LinkedList<>();
		documentStack = new Stack<>();
		typeStack = new Stack<>();
		typeNameStack = new Stack<>();
	}


	@Override
	public void enterTypeDeclaration(TypePointerClassification classification, String simpleName, int startLine) {
		TypePointer typePointer;
		pushTypeName(simpleName);
		typePointer = new TypePointer(currentFullyQualifiedname(), classification, filePath, startLine);
		typeStack.push(typePointer);
		createEmptyDocumentFor(typePointer);
		addEnclosingTypeTerm1();
	}

	private void addEnclosingTypeTerm1() {
		if(typeNameStack.size() > 2 && termFactors.enclosingTypeFactor.getFactor() > 0) {
			documentStack.peek() .addTerm(termFactors.enclosingTypeFactor, typeNameStack.get(typeNameStack.size() - 2), ENCLOSE_TYPE);
		}
	}
	
	@Override
	public void closedRecentTypeDeclaration() {
		closedRecentElementDeclaration();
		typeNameStack.pop();
		typeStack.pop();
	}

	@Override
	public void enterElementDeclaration(TraceabilityPointer traceabilityPointer) {
		initializePointer(traceabilityPointer);
		createEmptyDocumentFor(traceabilityPointer);
		addEnclosingTypeTerm2();
	}

	@Override
	public void enterElementDeclarationWithoutParentType(TraceabilityPointer traceabilityPointer) {
		initializePointer(traceabilityPointer);
		createEmptyDocumentFor(traceabilityPointer);
	}

	private void addEnclosingTypeTerm2() {
		if(typeNameStack.size() > 1 &&  termFactors.enclosingTypeFactor.getFactor() > 0) {
			documentStack.peek().addTerm( termFactors.enclosingTypeFactor, typeNameStack.peek(), ENCLOSE_TYPE);
		}
	}
	
	@Override
	public void closedRecentElementDeclaration() {
		documentBag.add(documentStack.pop());
		layerCalculator.currentSize(documentStack.size());
	}

	@Override
	public String recentSimpleTypeName() {
		return typeNameStack.peek();
	}

	@Override 
	public void addTerm(String term, String termType, TermFactor allfactor) {
		addTerm(term, termType, allfactor, allfactor);
	}
	
	@Override
	public void addTerm(String term, String termType, TermFactor ownFactor, TermFactor otherFactor) {
		int ownFactorValue = ownFactor.getFactor();
		int otherFactorValue = otherFactor.getFactor();
		if(!documentStack.isEmpty()) {
			if (ownFactorValue > 0) {
				documentStack.peek().addTerm(ownFactor, term, termType);
			}
			if (otherFactorValue > 0) {
				for (TDocument tDocument : documentStack.subList(0, documentStack.size() - 1)) {
					tDocument.addTerm(otherFactor, term, termType);
				}
			}
		}
	}

	public void addTerms(List<String> terms, String termType, TermFactor ownFactor, TermFactor otherFactor) {
		for (String term : terms) {
			addTerm(term, termType, ownFactor, otherFactor);
		}
	}
	
	@Override
	public List<TDocument> getAllDocuments() {
		return documentBag;
	}

	private void createEmptyDocumentFor(TraceabilityPointer traceabilityPointer) {
		documentStack.push(documentFactory.createDocument(traceabilityPointer));
		documentStack.peek().setLayer(layerCalculator.getCurrentLayer(documentStack.size()));
	}

	private String currentFullyQualifiedname() {
		String fullyQualifiedName = typeNameStack.stream().collect(Collectors.joining("."));
		if(fullyQualifiedName.startsWith("."))
		{
			fullyQualifiedName=fullyQualifiedName.substring(1);
		}
		return fullyQualifiedName;
	}

	private void pushTypeName(String typeName) {
		boolean noPackageDeclaration = typeNameStack.isEmpty();
		if (noPackageDeclaration) {
			typeNameStack.push("");
		}
		typeNameStack.push(typeName);
	}

	private void initializePointer(TraceabilityPointer pointer) {
		if (pointer instanceof IHasTypePointer) {
			if (!typeStack.isEmpty()) {
				((IHasTypePointer) pointer).setTypePointer(typeStack.peek());
			}
		}
		pointer.setSourceFilePath(filePath);
	}
	
	
	public void addPackage(String fullPackageName) { // TODO private
		if (typeNameStack.size() > 0)
			return;
		typeNameStack.add(fullPackageName);
	}

	public TraceabilityPointer currentTraceabilityPointer() { // TODO private
		if(documentStack.isEmpty()) 
			return null;
		
		return documentStack.peek().getTraceabilityPointer();
	}

	public TraceabilityPointer secondCurrentTraceabilityPointer() { // TODO private
		if(documentStack.size() < 1) 
			return null;
		
		return documentStack.get(documentStack.size() - 1).getTraceabilityPointer();
	}
	
	public int countOpenTypes() {
		return documentStack.size();
	}
	
	public void forEachOnStack(Consumer<TDocument> consumer) {
		documentStack.forEach(consumer);
	}

	public void layerOf(List<String> types) {
		layerCalculator.checkEnterlayer(types, typeStack.size() + 1);
	}

	public void printOpenElements() {
		for (TDocument tDocument : documentStack) {
			System.out.println(tDocument.getDescription());
		}


	}
	public String getTopmostTypeName()
	{
		return typeStack.peek().getDisplayName();
	}

	public TDocument currentDocument() {
		if(documentStack.isEmpty())
			return null;

		return documentStack.peek();
	}
}