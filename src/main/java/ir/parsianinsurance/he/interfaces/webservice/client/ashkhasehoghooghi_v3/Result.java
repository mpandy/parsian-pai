
package ir.parsianinsurance.he.interfaces.webservice.client.ashkhasehoghooghi_v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://tempuri.org/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankRuptcyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchList" type="{http://tempuri.org/}ArrayOfResult" minOccurs="0"/>
 *         &lt;element name="BreakUpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstablishmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FollowUpNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBankRupt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsBranch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsBreakUp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsSettle" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsTaxRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="JSONRseult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastChangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalPersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalPersonTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NationalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentLegalPerson" type="{http://tempuri.org/}Result" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisterUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Residency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettleDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Successful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TaxRestrictDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = {
    "extensionData",
    "address",
    "bankRuptcyDate",
    "branchList",
    "breakUpDate",
    "establishmentDate",
    "followUpNo",
    "isBankRupt",
    "isBranch",
    "isBreakUp",
    "isSettle",
    "isTaxRestricted",
    "jsonRseult",
    "lastChangeDate",
    "legalPersonType",
    "legalPersonTypeId",
    "licenseDate",
    "licenseNumber",
    "message",
    "name",
    "nationalCode",
    "parentLegalPerson",
    "postCode",
    "registerDate",
    "registerNumber",
    "registerUnit",
    "residency",
    "settleDate",
    "state",
    "successful",
    "taxRestrictDate",
    "unitId"
})
public class Result {

    @XmlElementRef(name = "ExtensionData", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionDataObject> extensionData;
    @XmlElementRef(name = "Address", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElementRef(name = "BankRuptcyDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankRuptcyDate;
    @XmlElementRef(name = "BranchList", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResult> branchList;
    @XmlElementRef(name = "BreakUpDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> breakUpDate;
    @XmlElementRef(name = "EstablishmentDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> establishmentDate;
    @XmlElementRef(name = "FollowUpNo", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> followUpNo;
    @XmlElement(name = "IsBankRupt")
    protected boolean isBankRupt;
    @XmlElement(name = "IsBranch")
    protected boolean isBranch;
    @XmlElement(name = "IsBreakUp")
    protected boolean isBreakUp;
    @XmlElement(name = "IsSettle")
    protected boolean isSettle;
    @XmlElement(name = "IsTaxRestricted")
    protected boolean isTaxRestricted;
    @XmlElementRef(name = "JSONRseult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jsonRseult;
    @XmlElementRef(name = "LastChangeDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastChangeDate;
    @XmlElementRef(name = "LegalPersonType", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalPersonType;
    @XmlElementRef(name = "LegalPersonTypeId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalPersonTypeId;
    @XmlElementRef(name = "LicenseDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licenseDate;
    @XmlElementRef(name = "LicenseNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licenseNumber;
    @XmlElementRef(name = "Message", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "Name", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "NationalCode", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationalCode;
    @XmlElementRef(name = "ParentLegalPerson", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> parentLegalPerson;
    @XmlElementRef(name = "PostCode", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postCode;
    @XmlElementRef(name = "RegisterDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registerDate;
    @XmlElementRef(name = "RegisterNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registerNumber;
    @XmlElementRef(name = "RegisterUnit", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registerUnit;
    @XmlElementRef(name = "Residency", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residency;
    @XmlElementRef(name = "SettleDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> settleDate;
    @XmlElementRef(name = "State", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElement(name = "Successful")
    protected boolean successful;
    @XmlElementRef(name = "TaxRestrictDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxRestrictDate;
    @XmlElementRef(name = "UnitId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitId;

    /**
     * Gets the value of the extensionData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionDataObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionDataObject> getExtensionData() {
        return extensionData;
    }

    /**
     * Sets the value of the extensionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionDataObject }{@code >}
     *     
     */
    public void setExtensionData(JAXBElement<ExtensionDataObject> value) {
        this.extensionData = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * Gets the value of the bankRuptcyDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankRuptcyDate() {
        return bankRuptcyDate;
    }

    /**
     * Sets the value of the bankRuptcyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankRuptcyDate(JAXBElement<String> value) {
        this.bankRuptcyDate = value;
    }

    /**
     * Gets the value of the branchList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResult> getBranchList() {
        return branchList;
    }

    /**
     * Sets the value of the branchList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResult }{@code >}
     *     
     */
    public void setBranchList(JAXBElement<ArrayOfResult> value) {
        this.branchList = value;
    }

    /**
     * Gets the value of the breakUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBreakUpDate() {
        return breakUpDate;
    }

    /**
     * Sets the value of the breakUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBreakUpDate(JAXBElement<String> value) {
        this.breakUpDate = value;
    }

    /**
     * Gets the value of the establishmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstablishmentDate() {
        return establishmentDate;
    }

    /**
     * Sets the value of the establishmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstablishmentDate(JAXBElement<String> value) {
        this.establishmentDate = value;
    }

    /**
     * Gets the value of the followUpNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFollowUpNo() {
        return followUpNo;
    }

    /**
     * Sets the value of the followUpNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFollowUpNo(JAXBElement<String> value) {
        this.followUpNo = value;
    }

    /**
     * Gets the value of the isBankRupt property.
     * 
     */
    public boolean isIsBankRupt() {
        return isBankRupt;
    }

    /**
     * Sets the value of the isBankRupt property.
     * 
     */
    public void setIsBankRupt(boolean value) {
        this.isBankRupt = value;
    }

    /**
     * Gets the value of the isBranch property.
     * 
     */
    public boolean isIsBranch() {
        return isBranch;
    }

    /**
     * Sets the value of the isBranch property.
     * 
     */
    public void setIsBranch(boolean value) {
        this.isBranch = value;
    }

    /**
     * Gets the value of the isBreakUp property.
     * 
     */
    public boolean isIsBreakUp() {
        return isBreakUp;
    }

    /**
     * Sets the value of the isBreakUp property.
     * 
     */
    public void setIsBreakUp(boolean value) {
        this.isBreakUp = value;
    }

    /**
     * Gets the value of the isSettle property.
     * 
     */
    public boolean isIsSettle() {
        return isSettle;
    }

    /**
     * Sets the value of the isSettle property.
     * 
     */
    public void setIsSettle(boolean value) {
        this.isSettle = value;
    }

    /**
     * Gets the value of the isTaxRestricted property.
     * 
     */
    public boolean isIsTaxRestricted() {
        return isTaxRestricted;
    }

    /**
     * Sets the value of the isTaxRestricted property.
     * 
     */
    public void setIsTaxRestricted(boolean value) {
        this.isTaxRestricted = value;
    }

    /**
     * Gets the value of the jsonRseult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJSONRseult() {
        return jsonRseult;
    }

    /**
     * Sets the value of the jsonRseult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJSONRseult(JAXBElement<String> value) {
        this.jsonRseult = value;
    }

    /**
     * Gets the value of the lastChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Sets the value of the lastChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastChangeDate(JAXBElement<String> value) {
        this.lastChangeDate = value;
    }

    /**
     * Gets the value of the legalPersonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalPersonType() {
        return legalPersonType;
    }

    /**
     * Sets the value of the legalPersonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalPersonType(JAXBElement<String> value) {
        this.legalPersonType = value;
    }

    /**
     * Gets the value of the legalPersonTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalPersonTypeId() {
        return legalPersonTypeId;
    }

    /**
     * Sets the value of the legalPersonTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalPersonTypeId(JAXBElement<String> value) {
        this.legalPersonTypeId = value;
    }

    /**
     * Gets the value of the licenseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenseDate() {
        return licenseDate;
    }

    /**
     * Sets the value of the licenseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenseDate(JAXBElement<String> value) {
        this.licenseDate = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenseNumber(JAXBElement<String> value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the nationalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationalCode() {
        return nationalCode;
    }

    /**
     * Sets the value of the nationalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationalCode(JAXBElement<String> value) {
        this.nationalCode = value;
    }

    /**
     * Gets the value of the parentLegalPerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getParentLegalPerson() {
        return parentLegalPerson;
    }

    /**
     * Sets the value of the parentLegalPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setParentLegalPerson(JAXBElement<Result> value) {
        this.parentLegalPerson = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostCode(JAXBElement<String> value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the registerDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the value of the registerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegisterDate(JAXBElement<String> value) {
        this.registerDate = value;
    }

    /**
     * Gets the value of the registerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Sets the value of the registerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegisterNumber(JAXBElement<String> value) {
        this.registerNumber = value;
    }

    /**
     * Gets the value of the registerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegisterUnit() {
        return registerUnit;
    }

    /**
     * Sets the value of the registerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegisterUnit(JAXBElement<String> value) {
        this.registerUnit = value;
    }

    /**
     * Gets the value of the residency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResidency() {
        return residency;
    }

    /**
     * Sets the value of the residency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResidency(JAXBElement<String> value) {
        this.residency = value;
    }

    /**
     * Gets the value of the settleDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSettleDate() {
        return settleDate;
    }

    /**
     * Sets the value of the settleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSettleDate(JAXBElement<String> value) {
        this.settleDate = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the successful property.
     * 
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     */
    public void setSuccessful(boolean value) {
        this.successful = value;
    }

    /**
     * Gets the value of the taxRestrictDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxRestrictDate() {
        return taxRestrictDate;
    }

    /**
     * Sets the value of the taxRestrictDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxRestrictDate(JAXBElement<String> value) {
        this.taxRestrictDate = value;
    }

    /**
     * Gets the value of the unitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitId() {
        return unitId;
    }

    /**
     * Sets the value of the unitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitId(JAXBElement<String> value) {
        this.unitId = value;
    }

}
