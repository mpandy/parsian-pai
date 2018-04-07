
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
 *         &lt;element name="RegPlcyLifeBaseResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4PlcyLifeBaseRes" minOccurs="0"/>
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
    "regPlcyLifeBaseResult"
})
@XmlRootElement(name = "RegPlcyLifeBaseResponse")
public class RegPlcyLifeBaseResponse {

    @XmlElementRef(name = "RegPlcyLifeBaseResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4PlcyLifeBaseRes> regPlcyLifeBaseResult;

    /**
     * Gets the value of the regPlcyLifeBaseResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeBaseRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4PlcyLifeBaseRes> getRegPlcyLifeBaseResult() {
        return regPlcyLifeBaseResult;
    }

    /**
     * Sets the value of the regPlcyLifeBaseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeBaseRes }{@code >}
     *     
     */
    public void setRegPlcyLifeBaseResult(JAXBElement<WbsV4PlcyLifeBaseRes> value) {
        this.regPlcyLifeBaseResult = value;
    }

}
