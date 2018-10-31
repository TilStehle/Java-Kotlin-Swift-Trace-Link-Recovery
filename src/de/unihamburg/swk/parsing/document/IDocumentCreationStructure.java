package de.unihamburg.swk.parsing.document;

import java.util.List;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointerClassification;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

/**
 * @author Jakob Andersen
 */

public interface IDocumentCreationStructure<TDocument extends ISearchableDocument> {

	void enterTypeDeclaration(TypePointerClassification classification, String simpleName, int startLine);

	void closedRecentTypeDeclaration();

	String recentSimpleTypeName();

	void enterElementDeclaration(TraceabilityPointer traceabilityPointer);

	void enterElementDeclarationWithoutParentType(TraceabilityPointer traceabilityPointer);

	void closedRecentElementDeclaration();

	void addTerm(String term, String termType, TermFactor allfactor);

	void addTerm(String term, String termType, TermFactor ownFactor, TermFactor otherFactor);

	List<TDocument> getAllDocuments();

}
