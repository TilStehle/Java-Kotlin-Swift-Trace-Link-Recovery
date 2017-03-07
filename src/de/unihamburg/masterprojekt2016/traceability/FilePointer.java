package de.unihamburg.masterprojekt2016.traceability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Nils-Hendrik Berger
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FilePointer extends TraceabilityPointer{

	public static final String FILE = "File";
	private String filename;	//Optional => null-value allowed
	
	public FilePointer() { }
	
	public FilePointer(String source)
	{
		setSourceFilePath(source);		
	}	
	public FilePointer(String source, String filename)
	{
		setSourceFilePath(source);
		this.filename = filename;
	}
		
	public void setFilename(String filename)
	{
		this.filename = filename;
	}
	
	public String getFilename()
	{
		return filename;
	}
	
	@Override
    public String getDisplayName() {
    	return this.filename;
    }
	
	
	public String toString()
	{
		return "Path: " + getSourceFilePath();  
	}

	@Override
	public String getPointerType() {
		return FILE;
	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = HashUtils.calcHashCode(hash, getSourceFilePath());
		hash = HashUtils.calcHashCode(hash, filename);
		return hash;
	}
	@Override
	public boolean equals(final Object other) {
		if(other == null)
		{
			return false;
		}
		if(this == other)
		{
			return true;
		}
		if(this.getClass() != other.getClass())
		{
			return false;
		}
		final FilePointer filepointer = (FilePointer) other;
		return equalsImpl(filepointer);
		
	}
	/**
	 * 
	 * @param otherPointer 
	 * @return Returns true if all the member variables are equal
	 */
	private boolean equalsImpl(final FilePointer otherPointer)
	{
		return  EqualsUtils.nullSafeEquals(getSourceFilePath(), otherPointer.getSourceFilePath()) &&
				EqualsUtils.nullSafeEquals(getFilename(), otherPointer.getFilename());
				//TODO: Auch SourceFilePath checken?
	}
	
}
