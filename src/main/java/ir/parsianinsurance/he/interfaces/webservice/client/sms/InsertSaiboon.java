
package ir.parsianinsurance.he.interfaces.webservice.client.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Passwrd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SMSText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReservedField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "userName",
    "passwrd",
    "firstName",
    "lastName",
    "cellPhone",
    "smsText",
    "description",
    "policyID",
    "appName",
    "reservedField3"
})
@XmlRootElement(name = "Insert_Saiboon")
public class InsertSaiboon {

    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Passwrd")
    protected String passwrd;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "CellPhone")
    protected String cellPhone;
    @XmlElement(name = "SMSText")
    protected String smsText;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PolicyID")
    protected String policyID;
    @XmlElement(name = "AppName")
    protected int appName;
    @XmlElement(name = "ReservedField3")
    protected String reservedField3;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the passwrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswrd() {
        return passwrd;
    }

    /**
     * Sets the value of the passwrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswrd(String value) {
        this.passwrd = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the cellPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * Sets the value of the cellPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhone(String value) {
        this.cellPhone = value;
    }

    /**
     * Gets the value of the smsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSText() {
        return smsText;
    }

    /**
     * Sets the value of the smsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSText(String value) {
        this.smsText = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the policyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyID() {
        return policyID;
    }

    /**
     * Sets the value of the policyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyID(String value) {
        this.policyID = value;
    }

    /**
     * Gets the value of the appName property.
     * 
     */
    public int getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     */
    public void setAppName(int value) {
        this.appName = value;
    }

    /**
     * Gets the value of the reservedField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservedField3() {
        return reservedField3;
    }

    /**
     * Sets the value of the reservedField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservedField3(String value) {
        this.reservedField3 = value;
    }

}
