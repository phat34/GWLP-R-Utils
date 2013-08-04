//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.04 at 07:43:14 PM EDT 
//


package packetcodegen.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldType">
 *   &lt;complexContent>
 *     &lt;extension base="{}MetaInfoAttachment">
 *       &lt;sequence>
 *         &lt;element name="Field" type="{}FieldType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{}PacketSimpleTypes" />
 *       &lt;attribute name="elements" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="typeSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="staticSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldType", propOrder = {
    "field"
})
public class FieldType
    extends MetaInfoAttachment
{

    @XmlElement(name = "Field")
    protected List<FieldType> field;
    @XmlAttribute(name = "type", required = true)
    protected PacketSimpleTypes type;
    @XmlAttribute(name = "elements")
    @XmlSchemaType(name = "unsignedInt")
    protected Long elements;
    @XmlAttribute(name = "typeSize")
    protected BigInteger typeSize;
    @XmlAttribute(name = "staticSize")
    protected BigInteger staticSize;

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldType }
     * 
     * 
     */
    public List<FieldType> getField() {
        if (field == null) {
            field = new ArrayList<FieldType>();
        }
        return this.field;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PacketSimpleTypes }
     *     
     */
    public PacketSimpleTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacketSimpleTypes }
     *     
     */
    public void setType(PacketSimpleTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the elements property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getElements() {
        return elements;
    }

    /**
     * Sets the value of the elements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setElements(Long value) {
        this.elements = value;
    }

    /**
     * Gets the value of the typeSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeSize() {
        return typeSize;
    }

    /**
     * Sets the value of the typeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeSize(BigInteger value) {
        this.typeSize = value;
    }

    /**
     * Gets the value of the staticSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaticSize() {
        return staticSize;
    }

    /**
     * Sets the value of the staticSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaticSize(BigInteger value) {
        this.staticSize = value;
    }

}
