
package ir.parsianinsurance.he.interfaces.webservice.client.ashkhasehoghooghi_v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalInqRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalInqRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorNams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalEntity" type="{http://tempuri.org/}Result" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalInqRes", namespace = "http://schemas.datacontract.org/2004/07/LegalLogic", propOrder = {
    "errorNams",
    "legalEntity"
})
public class LegalInqRes {

    @XmlElementRef(name = "ErrorNams", namespace = "http://schemas.datacontract.org/2004/07/LegalLogic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorNams;
    @XmlElementRef(name = "LegalEntity", namespace = "http://schemas.datacontract.org/2004/07/LegalLogic", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> legalEntity;

    /**
     * Gets the value of the errorNams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorNams() {
        return errorNams;
    }

    /**
     * Sets the value of the errorNams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorNams(JAXBElement<String> value) {
        this.errorNams = value;
    }

    /**
     * Gets the value of the LegalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getLegalEntity() {
        return legalEntity;
    }

    /**
     * Sets the value of the LegalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setLegalEntity(JAXBElement<Result> value) {
        this.legalEntity = value;
    }

}
