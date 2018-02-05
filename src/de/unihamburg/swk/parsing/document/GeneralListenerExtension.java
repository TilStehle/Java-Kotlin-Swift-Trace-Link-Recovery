package de.unihamburg.swk.parsing.document;

public class GeneralListenerExtension {

	protected TermMapperManager mapper;
	
	public GeneralListenerExtension(TermMapperManager mapper) {
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
