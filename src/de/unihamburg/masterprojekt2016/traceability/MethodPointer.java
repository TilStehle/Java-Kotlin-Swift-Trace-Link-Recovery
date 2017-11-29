package de.unihamburg.masterprojekt2016.traceability;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Author Evelyn Fischer
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MethodPointer extends NamedTypeElementPointer implements IHasParameter, FullyQuallyfying {

    public static final String METHOD = "method";
    private List<Parameter> parameters;
    private String returnType;

    public MethodPointer() {
        this(null);
    }

    public MethodPointer(String name) {
        this(name, null);
    }

    public MethodPointer(String name, String returnType) {
        this(name, returnType, null, null);
    }

    public MethodPointer(String name, String returnType, TypePointer typePointer, String sourceFilePath) {
        super(name, typePointer, sourceFilePath);
        this.returnType = returnType;
        this.parameters = new LinkedList<>();
    }
    
    @Override
	public List<Parameter> getParameters() {
        return parameters;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    @Override
	public void addParameter(Parameter parameter) {
        parameters.add(parameter);
    }


    @Override
    public String toString() {
        return "MethodPointer [name=" + getName() + ", parameters=" + parameters + ", returnType=" + returnType
                + ", typePointer=" + getTypePointer() + "]";
    }

    @Override
    public String getPointerType() {
        return METHOD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        MethodPointer that = (MethodPointer) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null)
            return false;
        if (!hasSameParametersAs(that))
            return false;
        if (returnType != null ? !returnType.equals(that.returnType)
                : that.returnType != null)
            return false;
        return getTypePointer() != null ? getTypePointer().equals(that.getTypePointer())
                : that.getTypePointer() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + computeParameterHashCode();
        result = 31 * result + (returnType != null ? returnType.hashCode() : 0);
        result = 31 * result
                + (getTypePointer() != null ? getTypePointer().hashCode() : 0);
        return result;
    }

    private int computeParameterHashCode() {
        int hashCode=0;
        for (Parameter parameter : parameters) {
            hashCode=31*hashCode+parameter.hashCode();
        }
        return hashCode;
    }

    private boolean hasSameParametersAs(MethodPointer other) {
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
    public String getFullyQualifiedName() {
        return getTypePointer().getFullyQualifiedName()+"."+getName();
    }
}