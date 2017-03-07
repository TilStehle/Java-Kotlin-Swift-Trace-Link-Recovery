package de.unihamburg.swk.parsing;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import de.unihamburg.masterprojekt2016.traceability.*;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

public class DocumentBuilder<TDocument extends ISearchableDocument> {

    private static final int IDENTIFIER_ON_TYPE_FACTOR = 4;//6;//<-Relevant for type documents
    private static final int TYPE_FACTOR = 1;//10;//<-Relevant for type documents
    private static final int IDENTIFIER_ON_ATTRIBUTE_FACTOR = 1;//5;
    private static final int ATTRIBUTE_FACTOR = 1;//5;//<-Relevant for type documents
    private static final int IDENTIFIER_ON_METHOD_FACTOR = 1;//5;
    private static final int METHOD_FACTOR = 1;//5;//<-Relevant for type documents

    private static final int IDENTIFIER_ON_CONSTRUCTOR_FACTOR = 1;// 5;
    private static final int LOCAL_VARIABLE_FACTOR = 1;//<-Relevant for type documents

    private String filePath;
    private IDocumentFactory<TDocument> documentFactory;

    private List<TDocument> documentBag;
    private Stack<TDocument> documentStack;
    private Stack<TypePointer> typeStack;
    private Stack<String> typeNameStack;

    public DocumentBuilder(String filePath, IDocumentFactory<TDocument> documentFactory) {
        this.filePath = filePath;
        this.documentFactory = documentFactory;
        this.documentBag = new LinkedList<>();
        this.documentStack = new Stack<>();
        this.typeStack = new Stack<>();
        this.typeNameStack = new Stack<>();
    }

    /**
     * Will be called when entering a type declaration.
     * <p>
     * <p>
     * What it does: <br>
     * - adds the type name to the stack <br>
     * - generates a {@link TraceabilityLink}s between the Java and
     * corresponding Swift type <br>
     * - Initialize the creation of a new {@link TraceabilityModel} <br>
     * - adds the {@link TraceabilityLink} into the {@link TraceabilityModel}
     * <br>
     *
     * @param identifier     of the type
     * @param classification of the Type.
     */
    public void enterTypeDeclaration(String identifier, TypePointerClassification classification) {
        TypePointer typePointer;
        pushTypeName(identifier);
        typePointer = new TypePointer(currentFullyQualifiedname(), classification, filePath);
        typeStack.push(typePointer);
        createDocumentForType(identifier, typePointer);
    }

    /**
     * Will be called when leaving a type declaration. Adds import statements if
     * necessary.
     * <p>
     * <p>
     * What it does: <br>
     * - Exits the Java model of the type declaration <br>
     * - Exits the Swift {@link TypePointer} <br>
     * - Remove corresponding data from stack <br>
     * <p>
     * to place the import statements
     */
    public void exitTypeDeclaration() {
        closeElement();
        closedType();
    }

    private void closedType() {
        typeNameStack.pop();
        typeStack.pop();
    }

    /**
     * Will be called to close the current {@link TraceabilityModel}.
     * <p>
     * <p>
     * What it does: <br>
     * - removes the current model from stack
     */
    public void closeElement() {
        documentBag.add(documentStack.pop());
    }

    /**
     * Adds a name of a type or package to the stack.
     *
     * @param typeName
     */
    private void pushTypeName(String typeName) {
        boolean noPackageDeclaration = typeNameStack.isEmpty();
        if (noPackageDeclaration) {
            typeNameStack.push("");
        }
        typeNameStack.push(typeName);
    }

    public String getCurrentTypeName() {
        return typeNameStack.peek();
    }

    /**
     * Gets the fully qualified name of the current type.
     *
     * @return fully qualified name
     */
    private String currentFullyQualifiedname() {
        String fullyQualifiedName = typeNameStack.stream().collect(Collectors.joining("."));
        if (fullyQualifiedName.startsWith(".")) {
            fullyQualifiedName = fullyQualifiedName.substring(1);
        }
        return fullyQualifiedName;
    }

    /**
     * Initialize a given Java {@link NamedTypeElementPointer}. Sets the
     * {@link TypePointer}, source file path and name.
     *
     * @param name
     */
    public void enterConstructor(String name) {
        ConstructorPointer constructorPointer = new ConstructorPointer();
        initializeNamedElementPointer(constructorPointer, name);

        documentStack.push(createDocument(constructorPointer, name, IDENTIFIER_ON_CONSTRUCTOR_FACTOR, METHOD_FACTOR));
    }

    public void enterMethod(String name, String returnType) {
        MethodPointer methodPointer = new MethodPointer();
        initializeNamedElementPointer(methodPointer, name);
        methodPointer.setReturnType(returnType);

        documentStack.push(createDocument(methodPointer, name, IDENTIFIER_ON_METHOD_FACTOR, METHOD_FACTOR));
    }

    public void enterSubscript() {
        SubscriptPointer subscriptPointer = new SubscriptPointer();
        subscriptPointer.setTypePointer(typeStack.peek());
        subscriptPointer.setSourceFilePath(filePath);

        documentStack.push(createDocument(subscriptPointer, "", 1, METHOD_FACTOR)); // TODO fix Term
    }

    public void enterField(String name, String type) {
        AttributePointer attributePointer = new AttributePointer();
        initializeNamedElementPointer(attributePointer, name);
        attributePointer.setType(type);

        documentBag.add(createDocument(attributePointer, name, IDENTIFIER_ON_ATTRIBUTE_FACTOR, ATTRIBUTE_FACTOR, type));
    }

    private TDocument createDocument(TraceabilityPointer pointer, String identifier, int ownDocumentFactor, int otherDocumentsFactor, String... otherTerms) {

        TDocument document = this.documentFactory.createDocument(pointer);

        document.addTerm(ownDocumentFactor, identifier, pointer.getPointerType());
        addIdentifierToAllDocsOnStack(pointer.getPointerType(), otherDocumentsFactor, identifier);
        for (String term : otherTerms) {
            addIdentifierToAllDocsOnStack(pointer.getPointerType(), 1, term);
            document.addTerm(1, term, pointer.getPointerType());
        }
        return document;
    }

    private void initializeNamedElementPointer(NamedTypeElementPointer elementPointer, String name) {
        elementPointer.setName(name);
        if (!typeStack.isEmpty()) {
            elementPointer.setTypePointer(typeStack.peek());
        }
        elementPointer.setSourceFilePath(filePath);
    }

    private TraceabilityPointer peekCurrentTraceabilityPointer() {
        return documentStack.peek().getTraceabilityPointer();
    }

    public List<TDocument> getDocuments() {
        return this.documentBag;
    }

    public void addPackagName(String fullPackageName) {
        if (this.typeNameStack.size() > 0) return;
        this.typeNameStack.add(fullPackageName);
    }

    // Typen
    private void createDocumentForType(String name, TraceabilityPointer traceabilityPointer) {
        addIdentifierToAllDocsOnStack(traceabilityPointer.getPointerType(), TYPE_FACTOR, name);
        TDocument document = documentFactory.createDocument(traceabilityPointer);
        document.addTerm(IDENTIFIER_ON_TYPE_FACTOR, name, traceabilityPointer.getPointerType());

        documentStack.push(document);
    }

    public void addIdentifierToAllDocsOnStack(String termType, int factor, String... terms) {
        for (ISearchableDocument document : documentStack) {
            for (String term : terms) {
                document.addTerm(factor, term, termType);
            }
        }
    }

    public void enterParameter(String name, String type) {
        addIdentifierToAllDocsOnStack(ConceptComparer.LOCAL_VARIABLE, LOCAL_VARIABLE_FACTOR, name, type);

        TraceabilityPointer traceabilityPointer = peekCurrentTraceabilityPointer();
        if (traceabilityPointer instanceof ConstructorPointer) {
            ((ConstructorPointer) traceabilityPointer).addParameter(new Parameter(name, type));
        } else if (traceabilityPointer instanceof MethodPointer) {
            ((MethodPointer) traceabilityPointer).addParameter(new Parameter(name, type));
        } else if (traceabilityPointer instanceof SubscriptPointer) {
            ((SubscriptPointer) traceabilityPointer).addParameter(new Parameter(name, type));
        } else {
            throw new IllegalStateException("@see DocumentBuilder.enterParameter");
        }
    }

    public void enterLocalVariable(String name, String type) {
        addIdentifierToAllDocsOnStack(ConceptComparer.LOCAL_VARIABLE, LOCAL_VARIABLE_FACTOR, name, type);
    }

    public void setLayer(String value) {
        for (ISearchableDocument tDocument : documentStack) {
            tDocument.setLayer(value);
        }

    }
}