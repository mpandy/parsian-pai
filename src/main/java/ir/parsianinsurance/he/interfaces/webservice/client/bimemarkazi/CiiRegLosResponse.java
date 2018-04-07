
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
 *         &lt;element name="CiiRegLosResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4LosRes" minOccurs="0"/>
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
    "ciiRegLosResult"
})
@XmlRootElement(name = "CiiRegLosResponse")
public class CiiRegLosResponse {

    @XmlElementRef(name = "CiiRegLosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4LosRes> ciiRegLosResult;

    /**
     * Gets the value of the ciiRegLosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4LosRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4LosRes> getCiiRegLosResult() {
        return ciiRegLosResult;
    }

    /**
     * Sets the value of the ciiRegLosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4LosRes }{@code >}
     *     
     */
    public void setCiiRegLosResult(JAXBElement<WbsV4LosRes> value) {
        this.ciiRegLosResult = value;
    }

}
