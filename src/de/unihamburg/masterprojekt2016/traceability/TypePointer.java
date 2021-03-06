package de.unihamburg.masterprojekt2016.traceability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jakob Andersen
 * @see TypePointerClassification
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TypePointer extends TraceabilityPointer implements FullyQuallyfying {

    private String fullyQualifiedName;
    private TypePointerClassification classification;

    public TypePointer() {
        this(null, 0);
    }

    public TypePointer(String fullyQualifiedName, int startLine) {
        this(fullyQualifiedName, TypePointerClassification.NO_CLASSIFICATION, null, startLine);
    }

    public TypePointer(String fullyQualifiedName, TypePointerClassification classification, int startLine) {
        this(fullyQualifiedName, classification, null, startLine);
    }

    public TypePointer(String fullyQualifiedName, TypePointerClassification classification, String sourceFilePath, int startLine) {
        super(sourceFilePath, startLine);
        this.classification = classification;
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public TypePointerClassification getClassification() {
        return this.classification;
    }

    public void setClassification(TypePointerClassification classification) {
        this.classification = classification == null ? TypePointerClassification.NO_CLASSIFICATION : classification;
    }

    @Override
    public String getDisplayName() {
        return getFullyQualifiedName().substring(getFullyQualifiedName().lastIndexOf(".") + 1);
    }

    @Override
    public String toString() {
        return "TypePointer [fullyQualifiedName=" + fullyQualifiedName + ", classification=" + classification + "]";
    }

    @Override
    public String getPointerType() {
        return classification.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypePointer that = (TypePointer) o;

        boolean a = fullyQualifiedName != null ? fullyQualifiedName.equals(that.fullyQualifiedName) : that.fullyQualifiedName == null;
        boolean b = classification != null ? classification.equals(that.classification) : that.classification == null;
        boolean c = _fileNameExtension != null ? _fileNameExtension.equals(that._fileNameExtension) : that._fileNameExtension == null;
        boolean d = sourceFilePath != null ? sourceFilePath.equals(that.sourceFilePath) : that.sourceFilePath == null;

        return a && b && c;// && d;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((classification == null) ? 0 : classification.hashCode());
        result = prime * result + ((fullyQualifiedName == null) ? 0 : fullyQualifiedName.hashCode());
        result = prime * result + ((_fileNameExtension == null) ? 0 : _fileNameExtension.hashCode());
        //result = prime * result + ((sourceFilePath == null) ? 0 : sourceFilePath.hashCode());
        return result;
    }


}
