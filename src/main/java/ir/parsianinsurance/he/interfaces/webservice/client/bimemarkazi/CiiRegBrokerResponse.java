
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
 *         &lt;element name="CiiRegBrokerResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4BrokerRes" minOccurs="0"/>
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
    "ciiRegBrokerResult"
})
@XmlRootElement(name = "CiiRegBrokerResponse")
public class CiiRegBrokerResponse {

    @XmlElementRef(name = "CiiRegBrokerResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4BrokerRes> ciiRegBrokerResult;

    /**
     * Gets the value of the ciiRegBrokerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4BrokerRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4BrokerRes> getCiiRegBrokerResult() {
        return ciiRegBrokerResult;
    }

    /**
     * Sets the value of the ciiRegBrokerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4BrokerRes }{@code >}
     *     
     */
    public void setCiiRegBrokerResult(JAXBElement<WbsV4BrokerRes> value) {
        this.ciiRegBrokerResult = value;
    }

}
