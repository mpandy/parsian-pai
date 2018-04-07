
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


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
 *         &lt;element name="CiiRegAgencyResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4AgncRes" minOccurs="0"/>
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
    "ciiRegAgencyResult"
})
@XmlRootElement(name = "CiiRegAgencyResponse")
public class CiiRegAgencyResponse {

    @XmlElementRef(name = "CiiRegAgencyResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4AgncRes> ciiRegAgencyResult;

    /**
     * Gets the value of the ciiRegAgencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4AgncRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4AgncRes> getCiiRegAgencyResult() {
        return ciiRegAgencyResult;
    }

    /**
     * Sets the value of the ciiRegAgencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4AgncRes }{@code >}
     *     
     */
    public void setCiiRegAgencyResult(JAXBElement<WbsV4AgncRes> value) {
        this.ciiRegAgencyResult = value;
    }

}
