package de.unihamburg.masterprojekt2016.traceability;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jakob Andersen
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ConstructorPointer extends NamedTypeElementPointer implements IHasParameter {

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
        this.parameters = new LinkedList<>();
    }
    
    @Override
	public List<Parameter> getParameters() {
		return this.parameters;
	}

    @Override
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
		if (!hasSameParametersAs(that))
			return false;
		if (getTypePointer() != null ? !getTypePointer().equals(that.getTypePointer()) : that.getTypePointer() != null) return false;
		return true;
	}

	private boolean hasSameParametersAs(ConstructorPointer other) {
		List<Parameter> otherMethodsParameters = other.parameters;
		if (otherMethodsParameters.size() != this.parameters.size()) {
			return false;
		}
		for (int i = 0; i < otherMethodsParameters.size(); i++) {
			Parameter otherParam = otherMethodsParameters.get(i);
			if (!otherParam.equals(parameters.get(i))) {
				return false;

			}
		}
		return true;
	}

	private int computeParameterHashCode() {
		int hashCode=0;
		for (Parameter parameter : parameters) {
			hashCode=31*hashCode+parameter.hashCode();
		}
		return hashCode;
	}

	@Override
	public int hashCode() {
		int result = getTypePointer() != null ? getTypePointer().hashCode() : 0;
		result = 31 * result + computeParameterHashCode();
		return result;
	}
}
