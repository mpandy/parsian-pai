
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
 *         &lt;element name="CiiRegCurrencyResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4CurrencyRes" minOccurs="0"/>
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
    "ciiRegCurrencyResult"
})
@XmlRootElement(name = "CiiRegCurrencyResponse")
public class CiiRegCurrencyResponse {

    @XmlElementRef(name = "CiiRegCurrencyResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4CurrencyRes> ciiRegCurrencyResult;

    /**
     * Gets the value of the ciiRegCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4CurrencyRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4CurrencyRes> getCiiRegCurrencyResult() {
        return ciiRegCurrencyResult;
    }

    /**
     * Sets the value of the ciiRegCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4CurrencyRes }{@code >}
     *     
     */
    public void setCiiRegCurrencyResult(JAXBElement<WbsV4CurrencyRes> value) {
        this.ciiRegCurrencyResult = value;
    }

}
