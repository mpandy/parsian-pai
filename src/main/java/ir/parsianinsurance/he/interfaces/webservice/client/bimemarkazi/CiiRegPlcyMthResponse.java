
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
 *         &lt;element name="CiiRegPlcyMthResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4PlcyMthRes" minOccurs="0"/>
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
    "ciiRegPlcyMthResult"
})
@XmlRootElement(name = "CiiRegPlcyMthResponse")
public class CiiRegPlcyMthResponse {

    @XmlElementRef(name = "CiiRegPlcyMthResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4PlcyMthRes> ciiRegPlcyMthResult;

    /**
     * Gets the value of the ciiRegPlcyMthResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4PlcyMthRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4PlcyMthRes> getCiiRegPlcyMthResult() {
        return ciiRegPlcyMthResult;
    }

    /**
     * Sets the value of the ciiRegPlcyMthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4PlcyMthRes }{@code >}
     *     
     */
    public void setCiiRegPlcyMthResult(JAXBElement<WbsV4PlcyMthRes> value) {
        this.ciiRegPlcyMthResult = value;
    }

}
