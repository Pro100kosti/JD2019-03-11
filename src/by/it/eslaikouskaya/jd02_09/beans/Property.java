//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.14 at 12:15:44 PM MSK 
//


package by.it.eslaikouskaya.jd02_09.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Property complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Property">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Property", propOrder = {
		"mark",
		"info"
})
public class Property {

	@XmlElement(required = true)
	protected String mark;
	@XmlElement(required = true)
	protected String info;

	/**
	 * Gets the value of the mark property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * Sets the value of the mark property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setMark(String value) {
		this.mark = value;
	}

	/**
	 * Gets the value of the info property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * Sets the value of the info property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setInfo(String value) {
		this.info = value;
	}

}
