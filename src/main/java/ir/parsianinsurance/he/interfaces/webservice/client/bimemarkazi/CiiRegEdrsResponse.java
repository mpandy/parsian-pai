
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
 *         &lt;element name="CiiRegEdrsResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4EdrsRes" minOccurs="0"/>
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
    "ciiRegEdrsResult"
})
@XmlRootElement(name = "CiiRegEdrsResponse")
public class CiiRegEdrsResponse {

    @XmlElementRef(name = "CiiRegEdrsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4EdrsRes> ciiRegEdrsResult;

    /**
     * Gets the value of the ciiRegEdrsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4EdrsRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4EdrsRes> getCiiRegEdrsResult() {
        return ciiRegEdrsResult;
    }

    /**
     * Sets the value of the ciiRegEdrsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4EdrsRes }{@code >}
     *     
     */
    public void setCiiRegEdrsResult(JAXBElement<WbsV4EdrsRes> value) {
        this.ciiRegEdrsResult = value;
    }

}
