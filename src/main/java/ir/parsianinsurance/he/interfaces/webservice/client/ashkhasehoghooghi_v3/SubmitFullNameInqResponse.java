
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
 *         &lt;element name="SubmitFullNameInqResult" type="{http://schemas.datacontract.org/2004/07/LegalLogic}LegalInqRes" minOccurs="0"/>
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
    "submitFullNameInqResult"
})
@XmlRootElement(name = "SubmitFullNameInqResponse")
public class SubmitFullNameInqResponse {

    @XmlElementRef(name = "SubmitFullNameInqResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<LegalInqRes> submitFullNameInqResult;

    /**
     * Gets the value of the submitFullNameInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LegalInqRes }{@code >}
     *     
     */
    public JAXBElement<LegalInqRes> getSubmitFullNameInqResult() {
        return submitFullNameInqResult;
    }

    /**
     * Sets the value of the submitFullNameInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LegalInqRes }{@code >}
     *     
     */
    public void setSubmitFullNameInqResult(JAXBElement<LegalInqRes> value) {
        this.submitFullNameInqResult = value;
    }

}
