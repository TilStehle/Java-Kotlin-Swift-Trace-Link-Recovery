package de.unihamburg.masterprojekt2016.traceability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Tilmann Stehle
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FunctionPointer extends TraceabilityPointer implements IHasParameter {

    private static final String FUNCTION = "Function";
    private String name;
    private List<Parameter> parameters;

    public FunctionPointer() {
        this("", 0, null);
    }

    public FunctionPointer(String name, int startLine) {
        this(name, startLine, null);
    }

    public FunctionPointer(String name, int startLine, String sourceFilePath) {
        super(sourceFilePath, startLine);
        this.name = name == null || name.isEmpty() ? "Anonymous Function" : name;
        this.parameters = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String fullyQualifiedName) {
        this.name = fullyQualifiedName;
    }


    @Override
    public String getDisplayName() {
        return getName().substring(getName().lastIndexOf(".") + 1);
    }

    @Override
    public String toString() {
        return "FunctionPointer [name=" + name + ", starts at line = " + startLine + ", parameters=" + parameters + "]";
    }

    @Override
    public String getPointerType() {
        return FUNCTION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FunctionPointer that = (FunctionPointer) o;

        boolean a = name != null ? name.equals(that.name) : that.name == null;
        boolean b = startLine  == that.startLine;
        boolean c = _fileNameExtension != null ? _fileNameExtension.equals(that._fileNameExtension) : that._fileNameExtension == null;
        boolean d = sourceFilePath != null ? sourceFilePath.equals(that.sourceFilePath) : that.sourceFilePath == null;

        return d && b && a && c && this.hasSameParametersAs(that);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((_fileNameExtension == null) ? 0 : _fileNameExtension.hashCode());
        result = prime * result + ((sourceFilePath == null) ? 0 : sourceFilePath.hashCode());
        result = prime * result + (startLine);
        return result;
    }

    private boolean hasSameParametersAs(FunctionPointer other) {
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
    public List<Parameter> getParameters() {
        return parameters;
    }

    @Override
    public void addParameter(Parameter parameter) {
        parameters.add(parameter);
    }

    public int getStartLine() {
        return startLine;
    }
}
