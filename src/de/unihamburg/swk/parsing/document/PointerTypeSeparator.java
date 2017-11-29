package de.unihamburg.swk.parsing.document;

/**
 * @author Jakob Andersen
 */

public class PointerTypeSeparator extends SimlpleTypeSeparator {

	private String pointerType;
	
	public PointerTypeSeparator(TermMapperManager mapper) {
		super(mapper);
	}
	
	public PointerTypeSeparator(String atomarIdentifier, TermMapperManager mapper) {
		this(mapper);
		this.pointerType = atomarIdentifier;
		this.addType(atomarIdentifier);
	}
	
	public void setPointerType(String pointerType) {
		this.pointerType = pointerType;
	}
	
	public String getPointerType() {
		return pointerType;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		return "PointerTypeSeparator [pointerType=" + pointerType  + super.toString() + "]";
	}

}