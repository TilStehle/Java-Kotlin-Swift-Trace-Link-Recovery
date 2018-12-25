package de.unihamburg.masterprojekt2016.traceability;

import de.unihamburg.swk.parsing.document.IHasTypePointer;

/**
 * @author Jakob Andersen
 * 
 * @see AttributePointer
 * @see MethodPointer
 * @see ConstructorPointer
 */

public abstract class NamedTypeElementPointer extends TraceabilityPointer implements IHasTypePointer {

	private String name;
	private TypePointer typePointer;
	
	public NamedTypeElementPointer() { }
	
	public NamedTypeElementPointer(String name, TypePointer typePointer, String sourceFilePath, int startLine) {
		super(sourceFilePath, startLine);
		this.name = name;
		this.typePointer = typePointer;
	}
	
	@Override
    public String getDisplayName() {
    	return typePointer.getDisplayName() + "." + this.getName();
    }
	
	@Override
	public TypePointer getTypePointer() {
        return typePointer;
    }

    @Override
	public void setTypePointer(TypePointer typePointer) {
        this.typePointer = typePointer;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((typePointer == null) ? 0 : typePointer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		NamedTypeElementPointer other = (NamedTypeElementPointer) obj;
		if (name == null) {
			if (other.name != null) return false;
		} 
		else if (!name.equals(other.name)) return false;
		
		if (typePointer == null) {
			if (other.typePointer != null) return false;
		} else if (!typePointer.equals(other.typePointer)) return false;
		
		return true;
	}
    
    
}
