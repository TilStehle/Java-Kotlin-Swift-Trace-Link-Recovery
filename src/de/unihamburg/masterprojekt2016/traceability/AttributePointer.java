package de.unihamburg.masterprojekt2016.traceability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jakob Andersen
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AttributePointer extends NamedTypeElementPointer {

    public static final String ATTRIBUTE = "Attribute";
    private String type;

    public AttributePointer(){ }

    public AttributePointer(String name, String type, int startLine){
        this(name, null, null, type, startLine);
    }
    
    public AttributePointer(String name, TypePointer typePointer, String sourceFilePath, String type, int startLine){
        super(name, typePointer, sourceFilePath, startLine);
        this.type = type;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
	public String toString() {
		return "AttributePointer [name=" + getName() + ", type=" + type + ", typePointer=" + getTypePointer() + "]";
	}

    @Override
    public String getPointerType() {
        return ATTRIBUTE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttributePointer that = (AttributePointer) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return getTypePointer() != null ? getTypePointer().equals(that.getTypePointer()) : that.getTypePointer() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (getTypePointer() != null ? getTypePointer().hashCode() : 0);
        return result;
    }


}
