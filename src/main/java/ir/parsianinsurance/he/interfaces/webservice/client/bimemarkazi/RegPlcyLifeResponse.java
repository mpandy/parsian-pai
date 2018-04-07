
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
 *         &lt;element name="RegPlcyLifeResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4PlcyLifeRes" minOccurs="0"/>
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
    "regPlcyLifeResult"
})
@XmlRootElement(name = "RegPlcyLifeResponse")
public class RegPlcyLifeResponse {

    @XmlElementRef(name = "RegPlcyLifeResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4PlcyLifeRes> regPlcyLifeResult;

    /**
     * Gets the value of the regPlcyLifeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4PlcyLifeRes> getRegPlcyLifeResult() {
        return regPlcyLifeResult;
    }

    /**
     * Sets the value of the regPlcyLifeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4PlcyLifeRes }{@code >}
     *     
     */
    public void setRegPlcyLifeResult(JAXBElement<WbsV4PlcyLifeRes> value) {
        this.regPlcyLifeResult = value;
    }

}
