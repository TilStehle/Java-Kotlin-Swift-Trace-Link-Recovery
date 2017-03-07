package de.unihamburg.masterprojekt2016.traceability;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jakob Andersen
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ConstructorPointer extends NamedTypeElementPointer {

	public static final String CONSTRUCTOR = "Constructor";
	private List<Parameter> parameters;

	public ConstructorPointer() {
		this(null);
	}
	
    public ConstructorPointer(String name){
        this(name, null, null);
    }

    public ConstructorPointer(String name, TypePointer typePointer, String sourceFilePath){
        super(name, typePointer, sourceFilePath);
        this.parameters = new ArrayList<Parameter>();
    }
    
	public List<Parameter> getParameters() {
		return this.parameters;
	}

	public void addParameter(Parameter parameter) {
		parameters.add(parameter);
	}
	
	/**
	 *
	 * @deprecated for XML Import only. use {@link #addParameter(Parameter)} instead!
	 */
	@Deprecated
	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}


	@Override
	public String toString() {
		return "ConstructorPointer [name=" + getName() + ", typePointer=" + getTypePointer() + ", parameters=" + parameters + "]";
	}

	@Override
	public String getPointerType() {
		return CONSTRUCTOR;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ConstructorPointer that = (ConstructorPointer) o;

		if (getTypePointer() != null ? !getTypePointer().equals(that.getTypePointer()) : that.getTypePointer() != null) return false;
		return parameters != null ? parameters.equals(that.parameters) : that.parameters == null;
	}

	@Override
	public int hashCode() {
		int result = getTypePointer() != null ? getTypePointer().hashCode() : 0;
		result = 31 * result + (parameters != null ? parameters.hashCode() : 0);
		return result;
	}
}
