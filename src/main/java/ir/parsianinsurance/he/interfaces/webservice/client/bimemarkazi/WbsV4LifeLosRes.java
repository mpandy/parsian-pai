
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for WbsV4LifeLosRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4LifeLosRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/>
 *         &lt;element name="LifeLosMidId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LifeLosUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4LifeLosRes", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "errors",
    "lifeLosMidId",
    "lifeLosUnqCod"
})
public class WbsV4LifeLosRes {

    @XmlElementRef(name = "Errors", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> errors;
    @XmlElement(name = "LifeLosMidId")
    protected Long lifeLosMidId;
    @XmlElement(name = "LifeLosUnqCod")
    protected Long lifeLosUnqCod;

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
     * Gets the value of the lifeLosMidId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLifeLosMidId() {
        return lifeLosMidId;
    }

    /**
     * Sets the value of the lifeLosMidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLifeLosMidId(Long value) {
        this.lifeLosMidId = value;
    }

    /**
     * Gets the value of the lifeLosUnqCod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLifeLosUnqCod() {
        return lifeLosUnqCod;
    }

    /**
     * Sets the value of the lifeLosUnqCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLifeLosUnqCod(Long value) {
        this.lifeLosUnqCod = value;
    }

}
