
package ir.parsianinsurance.he.interfaces.webservice.client.ashkhasehoghooghi_v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubmitNationalIdInqResult" type="{http://schemas.datacontract.org/2004/07/LegalLogic}LegalInqRes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "submitNationalIdInqResult"
})
@XmlRootElement(name = "SubmitNationalIdInqResponse")
public class SubmitNationalIdInqResponse {

    @XmlElementRef(name = "SubmitNationalIdInqResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<LegalInqRes> submitNationalIdInqResult;

    /**
     * Gets the value of the submitNationalIdInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LegalInqRes }{@code >}
     *     
     */
    public JAXBElement<LegalInqRes> getSubmitNationalIdInqResult() {
        return submitNationalIdInqResult;
    }

    /**
     * Sets the value of the submitNationalIdInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LegalInqRes }{@code >}
     *     
     */
    public void setSubmitNationalIdInqResult(JAXBElement<LegalInqRes> value) {
        this.submitNationalIdInqResult = value;
    }

}
