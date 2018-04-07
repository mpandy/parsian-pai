
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
 *         &lt;element name="CiiRegPlcyCvrResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4PlcyCvrRes" minOccurs="0"/>
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
    "ciiRegPlcyCvrResult"
})
@XmlRootElement(name = "CiiRegPlcyCvrResponse")
public class CiiRegPlcyCvrResponse {

    @XmlElementRef(name = "CiiRegPlcyCvrResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4PlcyCvrRes> ciiRegPlcyCvrResult;

    /**
     * Gets the value of the ciiRegPlcyCvrResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4PlcyCvrRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4PlcyCvrRes> getCiiRegPlcyCvrResult() {
        return ciiRegPlcyCvrResult;
    }

    /**
     * Sets the value of the ciiRegPlcyCvrResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4PlcyCvrRes }{@code >}
     *     
     */
    public void setCiiRegPlcyCvrResult(JAXBElement<WbsV4PlcyCvrRes> value) {
        this.ciiRegPlcyCvrResult = value;
    }

}
