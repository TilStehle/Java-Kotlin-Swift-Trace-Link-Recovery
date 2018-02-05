package de.unihamburg.swk.parsing.document;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Jakob Andersen
 */

public class SimpleTypeSeparator {

	protected TermMapperManager mapper;
	
	private List<String> types;
	private List<String> genTypes;

	public SimpleTypeSeparator(TermMapperManager mapper) {
		this.mapper = mapper;
		this.types = new LinkedList<>();
		this.genTypes = new LinkedList<>();
	}
	
	public SimpleTypeSeparator union(SimpleTypeSeparator other) {
		this.types.addAll(other.types);
		this.genTypes.addAll(other.genTypes);
		return this;
	}
	
	public void addAll(SimpleTypeSeparator type) {
		type.types.forEach(this::addType);
		type.genTypes.forEach(this::addGenericType);
	}
	
	public void addType(String type) {
		types.add(mapper.types(type));
	}

	public void addGenericType(String type) {
		genTypes.add(mapper.types(type));
	}

	public List<String> getTypes() {
		return types;
	}

	public List<String> getGenTypes() {
		return genTypes;
	}

	@Override
	public boolean equals(Object obj) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int hashCode() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "BaseTypeSeparator [types=" + types + ", genTypes=" + genTypes + ", mapper=" + mapper + "]";
	}
	
}
