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
public class LambdaPointer extends TraceabilityPointer implements IHasParameter, IHasTypePointer{

	private List<Parameter> parameters;
	private TypePointer typePointer;
	
	public static final String LAMBDA = "lambda";
	
	public LambdaPointer() {
		this(null);
	}

	public LambdaPointer(String sourceFilePath) {
		this(null, sourceFilePath);
	}

	public LambdaPointer(TypePointer typePointer, String sourceFilePath) {
		super(sourceFilePath);
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
		// TODO Auto-generated method stub
		return LAMBDA;
	}

	@Override
	public String getPointerType() {
		return LambdaPointer.LAMBDA;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        LambdaPointer that = (LambdaPointer) o;

        if (!hasSameParametersAs(that))
            return false;
        return getTypePointer() != null ? getTypePointer().equals(that.getTypePointer())
                : that.getTypePointer() == null;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + computeParameterHashCode();
        result = 31 * result + (getTypePointer() != null ? getTypePointer().hashCode() : 0);
        return result;
    }

    private int computeParameterHashCode() {
        int hashCode=0;
        for (Parameter parameter : parameters) {
            hashCode=31*hashCode+parameter.hashCode();
        }
        return hashCode;
    }

    private boolean hasSameParametersAs(LambdaPointer other) {
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
