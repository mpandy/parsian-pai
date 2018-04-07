
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
 *         &lt;element name="CiiRegDocLosResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4DocLosRes" minOccurs="0"/>
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
    "ciiRegDocLosResult"
})
@XmlRootElement(name = "CiiRegDocLosResponse")
public class CiiRegDocLosResponse {

    @XmlElementRef(name = "CiiRegDocLosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4DocLosRes> ciiRegDocLosResult;

    /**
     * Gets the value of the ciiRegDocLosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4DocLosRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4DocLosRes> getCiiRegDocLosResult() {
        return ciiRegDocLosResult;
    }

    /**
     * Sets the value of the ciiRegDocLosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4DocLosRes }{@code >}
     *     
     */
    public void setCiiRegDocLosResult(JAXBElement<WbsV4DocLosRes> value) {
        this.ciiRegDocLosResult = value;
    }

}
