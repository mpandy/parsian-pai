
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for WbsV4PlcyLifeBaseRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4PlcyLifeBaseRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/>
 *         &lt;element name="PlcyLifeBaseMidId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PlcyLifeBaseUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4PlcyLifeBaseRes", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "errors",
    "plcyLifeBaseMidId",
    "plcyLifeBaseUnqCod"
})
public class WbsV4PlcyLifeBaseRes {

    @XmlElementRef(name = "Errors", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> errors;
    @XmlElement(name = "PlcyLifeBaseMidId")
    protected Long plcyLifeBaseMidId;
    @XmlElement(name = "PlcyLifeBaseUnqCod")
    protected Long plcyLifeBaseUnqCod;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringstring> getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public void setErrors(JAXBElement<ArrayOfKeyValueOfstringstring> value) {
        this.errors = value;
    }

    /**
     * Gets the value of the plcyLifeBaseMidId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlcyLifeBaseMidId() {
        return plcyLifeBaseMidId;
    }

    /**
     * Sets the value of the plcyLifeBaseMidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlcyLifeBaseMidId(Long value) {
        this.plcyLifeBaseMidId = value;
    }

    /**
     * Gets the value of the plcyLifeBaseUnqCod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlcyLifeBaseUnqCod() {
        return plcyLifeBaseUnqCod;
    }

    /**
     * Sets the value of the plcyLifeBaseUnqCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlcyLifeBaseUnqCod(Long value) {
        this.plcyLifeBaseUnqCod = value;
    }

}
