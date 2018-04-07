
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
 *         &lt;element name="CiiRegIntroResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4IntroRes" minOccurs="0"/>
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
    "ciiRegIntroResult"
})
@XmlRootElement(name = "CiiRegIntroResponse")
public class CiiRegIntroResponse {

    @XmlElementRef(name = "CiiRegIntroResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4IntroRes> ciiRegIntroResult;

    /**
     * Gets the value of the ciiRegIntroResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4IntroRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4IntroRes> getCiiRegIntroResult() {
        return ciiRegIntroResult;
    }

    /**
     * Sets the value of the ciiRegIntroResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4IntroRes }{@code >}
     *     
     */
    public void setCiiRegIntroResult(JAXBElement<WbsV4IntroRes> value) {
        this.ciiRegIntroResult = value;
    }

}
