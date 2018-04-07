
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
 *         &lt;element name="RegLifeLosResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4LifeLosRes" minOccurs="0"/>
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
    "regLifeLosResult"
})
@XmlRootElement(name = "RegLifeLosResponse")
public class RegLifeLosResponse {

    @XmlElementRef(name = "RegLifeLosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4LifeLosRes> regLifeLosResult;

    /**
     * Gets the value of the regLifeLosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4LifeLosRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4LifeLosRes> getRegLifeLosResult() {
        return regLifeLosResult;
    }

    /**
     * Sets the value of the regLifeLosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4LifeLosRes }{@code >}
     *     
     */
    public void setRegLifeLosResult(JAXBElement<WbsV4LifeLosRes> value) {
        this.regLifeLosResult = value;
    }

}
