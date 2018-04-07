
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
 *         &lt;element name="CiiRegPersonTypeResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4PersonTypeRes" minOccurs="0"/>
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
    "ciiRegPersonTypeResult"
})
@XmlRootElement(name = "CiiRegPersonTypeResponse")
public class CiiRegPersonTypeResponse {

    @XmlElementRef(name = "CiiRegPersonTypeResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4PersonTypeRes> ciiRegPersonTypeResult;

    /**
     * Gets the value of the ciiRegPersonTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4PersonTypeRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4PersonTypeRes> getCiiRegPersonTypeResult() {
        return ciiRegPersonTypeResult;
    }

    /**
     * Sets the value of the ciiRegPersonTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4PersonTypeRes }{@code >}
     *     
     */
    public void setCiiRegPersonTypeResult(JAXBElement<WbsV4PersonTypeRes> value) {
        this.ciiRegPersonTypeResult = value;
    }

}
