package de.unihamburg.swk.parsing;

import java.util.List;

import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

public interface ISourceCodeParser <TDocument extends ISearchableDocument> {

	List<TDocument> parseDocuments();

}
