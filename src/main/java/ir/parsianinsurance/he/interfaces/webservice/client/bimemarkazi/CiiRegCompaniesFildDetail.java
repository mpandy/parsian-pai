
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
 *         &lt;element name="Pr" type="{http://schemas.datacontract.org/2004/07/}WbsV4CompaniesFildDetailReq" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassWrod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pr",
    "username",
    "passWrod"
})
@XmlRootElement(name = "CiiRegCompaniesFildDetail")
public class CiiRegCompaniesFildDetail {

    @XmlElementRef(name = "Pr", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WbsV4CompaniesFildDetailReq> pr;
    @XmlElementRef(name = "Username", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> username;
    @XmlElementRef(name = "PassWrod", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passWrod;

    /**
     * Gets the value of the pr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbsV4CompaniesFildDetailReq }{@code >}
     *     
     */
    public JAXBElement<WbsV4CompaniesFildDetailReq> getPr() {
        return pr;
    }

    /**
     * Sets the value of the pr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbsV4CompaniesFildDetailReq }{@code >}
     *     
     */
    public void setPr(JAXBElement<WbsV4CompaniesFildDetailReq> value) {
        this.pr = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername(JAXBElement<String> value) {
        this.username = value;
    }

    /**
     * Gets the value of the passWrod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassWrod() {
        return passWrod;
    }

    /**
     * Sets the value of the passWrod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassWrod(JAXBElement<String> value) {
        this.passWrod = value;
    }

}
