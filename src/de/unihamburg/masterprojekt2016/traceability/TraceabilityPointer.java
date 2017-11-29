package de.unihamburg.masterprojekt2016.traceability;

import org.apache.commons.io.FilenameUtils;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by Evelyn Fischer on 20.10.2016.
 * 
 * @see TypePointer
 * @see PackagePointer
 * @see NamedTypeElementPointer 
 */
@XmlTransient //Prevents the mapping of a JavaBean property/type to XML representation
@XmlSeeAlso({MethodPointer.class, AttributePointer.class, ConstructorPointer.class, TypePointer.class, PackagePointer.class, SubscriptPointer.class, ClosurePointer.class, LambdaPointer.class, FilePointer.class, XmlElementDeclPointer.class})
    public abstract class TraceabilityPointer {

    protected String _fileNameExtension;
    private String sourceFilePath;
    
    public TraceabilityPointer() { }

    public TraceabilityPointer(String sourceFilePath) {
    	this.setSourceFilePath(sourceFilePath);

    }
    
    public abstract String getDisplayName();
    
    public String getSourceFilePath() {
        return sourceFilePath;
    }

    public void setSourceFilePath(String path){
        this.sourceFilePath = path;
        _fileNameExtension = FilenameUtils.getExtension(sourceFilePath);
    }

	@Override
	public String toString() {
		return "TraceabilityPointer [sourceFilePath=" + sourceFilePath + "]";
	}

    public abstract String getPointerType();

    public boolean hasSameArtefactType(TraceabilityPointer other)
    {
        return getPointerType().equals(other.getPointerType());
    }
}