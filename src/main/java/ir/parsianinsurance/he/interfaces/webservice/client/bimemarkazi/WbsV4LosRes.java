
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for WbsV4LosRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4LosRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/>
 *         &lt;element name="LosMidId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LosUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4LosRes", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "errors",
    "losMidId",
    "losUnqCod"
})
public class WbsV4LosRes {

    @XmlElementRef(name = "Errors", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> errors;
    @XmlElement(name = "LosMidId")
    protected Long losMidId;
    @XmlElement(name = "LosUnqCod")
    protected Long losUnqCod;

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
     * Gets the value of the losMidId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLosMidId() {
        return losMidId;
    }

    /**
     * Sets the value of the losMidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLosMidId(Long value) {
        this.losMidId = value;
    }

    /**
     * Gets the value of the losUnqCod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLosUnqCod() {
        return losUnqCod;
    }

    /**
     * Sets the value of the losUnqCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLosUnqCod(Long value) {
        this.losUnqCod = value;
    }

}
