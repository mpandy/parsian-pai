
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
 *         &lt;element name="CiiRegBranchResult" type="{http://schemas.datacontract.org/2004/07/}WbsV4BranchRes" minOccurs="0"/>
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
    "ciiRegBranchResult"
})
@XmlRootElement(name = "CiiRegBranchResponse")
public class CiiRegBranchResponse {

    @XmlElementRef(name = "CiiRegBranchResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4BranchRes> ciiRegBranchResult;

    /**
     * Gets the value of the ciiRegBranchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4BranchRes }{@code >}
     *     
     */
    public JAXBElement<WbsV4BranchRes> getCiiRegBranchResult() {
        return ciiRegBranchResult;
    }

    /**
     * Sets the value of the ciiRegBranchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4BranchRes }{@code >}
     *     
     */
    public void setCiiRegBranchResult(JAXBElement<WbsV4BranchRes> value) {
        this.ciiRegBranchResult = value;
    }

}
