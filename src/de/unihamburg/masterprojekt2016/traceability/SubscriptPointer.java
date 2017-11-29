package de.unihamburg.masterprojekt2016.traceability;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import de.unihamburg.swk.parsing.document.IHasTypePointer;

/**
 * @author Jakob Andersen
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SubscriptPointer extends TraceabilityPointer implements IHasParameter, IHasTypePointer{

	public static final String SUBSCRIPT = "Subscript";
	private List<Parameter> parameters;
	private TypePointer typePointer;
	private String returnType;
	
	public SubscriptPointer() {
		this(null);
	}
	
	public SubscriptPointer(TypePointer typePointer) {
		this(typePointer, null);
	}

	public SubscriptPointer(TypePointer typePointer, String sourceFilePath) {
		super(sourceFilePath);
		this.typePointer = typePointer;
		this.parameters = new LinkedList<>();
	}

	@Override
	public void addParameter(Parameter parameter) {
		parameters.add(parameter);
	}

	@Override
	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setReturnType(String ret) {
        this.returnType = ret;
    }
	
	public String getReturnType() {
        return returnType;
    }
	
	@Override
	public TypePointer getTypePointer() {
		return typePointer;
	}

	@Override
	public void setTypePointer(TypePointer typePointer) {
		this.typePointer = typePointer;
	}

	@Override
	public String getDisplayName() {
		return "";
	}

	@Override
	public String getPointerType() {
		return SUBSCRIPT;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		SubscriptPointer that = (SubscriptPointer) o;

		if (returnType != null ? !returnType.equals(that.returnType)
                : that.returnType != null)
            return false;
		
		if (!hasSameParametersAs(that))
			return false;
		return getTypePointer() != null ? getTypePointer().equals(that.getTypePointer())
				: that.getTypePointer() == null;
	}

	@Override
	public int hashCode() {
		int result = computeParameterHashCode();
		result = 31 * result + (returnType != null ? returnType.hashCode() : 0);
		result = 31 * result + (getTypePointer() != null ? getTypePointer().hashCode() : 0);
		return result;
	}

	private int computeParameterHashCode() {
		int hashCode = 0;
		for (Parameter parameter : parameters) {
			hashCode = 31 * hashCode + parameter.hashCode();
		}
		return hashCode;
	}

	private boolean hasSameParametersAs(SubscriptPointer other) {
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

}
