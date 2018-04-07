
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
 *         &lt;element name="CiiUpdDocLosResult" type="{http://schemas.datacontract.org/2004/07/}UpdWbsV4DocLosRes" minOccurs="0"/>
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
    "ciiUpdDocLosResult"
})
@XmlRootElement(name = "CiiUpdDocLosResponse")
public class CiiUpdDocLosResponse {

    @XmlElementRef(name = "CiiUpdDocLosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdWbsV4DocLosRes> ciiUpdDocLosResult;

    /**
     * Gets the value of the ciiUpdDocLosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdWbsV4DocLosRes }{@code >}
     *     
     */
    public JAXBElement<UpdWbsV4DocLosRes> getCiiUpdDocLosResult() {
        return ciiUpdDocLosResult;
    }

    /**
     * Sets the value of the ciiUpdDocLosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdWbsV4DocLosRes }{@code >}
     *     
     */
    public void setCiiUpdDocLosResult(JAXBElement<UpdWbsV4DocLosRes> value) {
        this.ciiUpdDocLosResult = value;
    }

}
