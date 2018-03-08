package de.unihamburg.masterprojekt2016.traceability;

import java.util.ArrayList;
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
public class ClosurePointer extends TraceabilityPointer implements IHasParameter, IHasTypePointer{

	public static final String CLOSURE = "Closure";
	private List<Parameter> parameters;
	private TypePointer typePointer;

	public ClosurePointer() {
		this(null, 0);
	}

	public ClosurePointer(String sourceFilePath, int startLine) {
		this(null, sourceFilePath, startLine);
	}

	public ClosurePointer(TypePointer typePointer, String sourceFilePath, int startLine) {
		super(sourceFilePath, startLine);
		this.typePointer = typePointer;
		this.parameters = new ArrayList<>();
	}

	@Override
	public void addParameter(Parameter parameter) {
		parameters.add(parameter);
	}

	@Override
	public List<Parameter> getParameters() {
		return parameters;
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
		return CLOSURE;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ClosurePointer that = (ClosurePointer) o;

		if (!hasSameParametersAs(that))
			return false;
		return getTypePointer() != null ? getTypePointer().equals(that.getTypePointer())
				: that.getTypePointer() == null;
	}

	@Override
	public int hashCode() {
		int result = computeParameterHashCode();
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

	private boolean hasSameParametersAs(ClosurePointer other) {
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

	@Override
	public String toString() {
		return "ClosurePointer [parameters=" + parameters + ", typePointer=" + typePointer + "]";
	}
	
	

}
