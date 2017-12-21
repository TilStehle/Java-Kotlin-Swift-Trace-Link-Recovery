package de.unihamburg.swk.parsing.document;

public abstract class AbstractListenerExtension {

	protected TermMapperManager mapper;
	
	public AbstractListenerExtension(TermMapperManager mapper) {
		this.mapper = mapper;
	}
	
	public String getMappedMethodName(String identifier) {
		return mapper.functions(identifier);
	}
	
	public String getMappedAttributeName(String identifier) {
		return mapper.variables(identifier);
	}
	
	public SimpleTypeSeparator createSimpleTypeSeperator() {
		return new SimpleTypeSeparator(mapper);
	}
	
	public PointerTypeSeparator createPointerTypeSeparator() {
		return new PointerTypeSeparator(mapper);
	}
	
}
