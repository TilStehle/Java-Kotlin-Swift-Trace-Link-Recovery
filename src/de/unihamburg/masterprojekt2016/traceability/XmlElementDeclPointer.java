
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
public class XmlElementDeclPointer extends TraceabilityPointer{


	public static final String XML_ELEMENT = "XmlElement";
	private String xmlElementByTagName;
	
	public XmlElementDeclPointer() { }
	
	public XmlElementDeclPointer(String source, String xmlElementByTagName)
	{
		setSourceFilePath(source);	
		this.xmlElementByTagName = xmlElementByTagName;
	}	
	
	public void setXmlElementByTagName(String xmlElementByTagName)
	{
		this.xmlElementByTagName = xmlElementByTagName;
	}	
	
	public String getXmlElementByTagName()
	{
		return xmlElementByTagName;
	}
	
	@Override
    public String getDisplayName() {
		return getXmlElementByTagName();
	}
	
	public String toString()
	{
		return "Path: " + getSourceFilePath() + " XmlElementDecl: " + xmlElementByTagName;  
	}

	@Override
	public String getPointerType() {
		return XML_ELEMENT;
	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = HashUtils.calcHashCode(hash, getSourceFilePath());
		hash = HashUtils.calcHashCode(hash, xmlElementByTagName);
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
		final XmlElementDeclPointer xmlElementDeclPointer = (XmlElementDeclPointer) other;
		return equalsImpl(xmlElementDeclPointer);
		
	}
	/**
	 * 
	 * @param otherPointer 
	 * @return Returns true if all the member variables are equal
	 */
	private boolean equalsImpl(final XmlElementDeclPointer otherPointer)
	{
		return 	EqualsUtils.nullSafeEquals(getSourceFilePath(), otherPointer.getSourceFilePath()) &&
				EqualsUtils.nullSafeEquals(xmlElementByTagName, otherPointer.getXmlElementByTagName());
	}
}
