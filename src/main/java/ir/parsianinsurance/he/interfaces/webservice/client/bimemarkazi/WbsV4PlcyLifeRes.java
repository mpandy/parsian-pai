
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for WbsV4PlcyLifeRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4PlcyLifeRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/>
 *         &lt;element name="PlcyLifeMidId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PlcyLifeUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4PlcyLifeRes", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "errors",
    "plcyLifeMidId",
    "plcyLifeUnqCod"
})
public class WbsV4PlcyLifeRes {

    @XmlElementRef(name = "Errors", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> errors;
    @XmlElement(name = "PlcyLifeMidId")
    protected Long plcyLifeMidId;
    @XmlElement(name = "PlcyLifeUnqCod")
    protected Long plcyLifeUnqCod;

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
     * Gets the value of the plcyLifeMidId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlcyLifeMidId() {
        return plcyLifeMidId;
    }

    /**
     * Sets the value of the plcyLifeMidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlcyLifeMidId(Long value) {
        this.plcyLifeMidId = value;
    }

    /**
     * Gets the value of the plcyLifeUnqCod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlcyLifeUnqCod() {
        return plcyLifeUnqCod;
    }

    /**
     * Sets the value of the plcyLifeUnqCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlcyLifeUnqCod(Long value) {
        this.plcyLifeUnqCod = value;
    }

}
