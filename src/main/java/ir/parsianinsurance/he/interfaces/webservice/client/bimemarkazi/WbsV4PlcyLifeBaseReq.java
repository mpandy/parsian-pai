
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for WbsV4PlcyLifeBaseReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4PlcyLifeBaseReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="BdHdsCptl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BdHdsPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BrthDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfcChngCptl" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="CfcChngPrm" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="CmpDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CstmNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DieCptl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DieHdsCptlY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DieHdsPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiePrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisCptlY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DivCst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EdrsUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExptPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FariAge" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="FirstPrmContainsExtraPushesh" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="FirstReserved" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HdsDieCfc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HdsNaghsCfc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IlnsCfc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IlnsCptl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IlnsPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsCmmn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsJari" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="IsuYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LfCvr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LfDie" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LfPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LifeGhrd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MapFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MdcCfc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OfcCst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PayPerYr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlcyUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RcvCst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReservedPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SaleCst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScnBSAmrazCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScnBSHdsDieCfc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScnBdHdsCfc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScnCptl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScnDrmnCptl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScnHdsMdcCstCfc" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ScnIlnsCfc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScnMdcCfc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ScnMftCfc" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ScnNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScnSrgclCstCptl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hasDscnt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4PlcyLifeBaseReq", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "age",
    "bdHdsCptl",
    "bdHdsPrm",
    "brthDte",
    "cfcChngCptl",
    "cfcChngPrm",
    "cmpDocNo",
    "cstmNam",
    "dieCptl",
    "dieHdsCptlY",
    "dieHdsPrm",
    "diePrm",
    "disCptlY",
    "disPrm",
    "divCst",
    "edrsUnqCod",
    "exptPrm",
    "fariAge",
    "firstPrmContainsExtraPushesh",
    "firstReserved",
    "hdsDieCfc",
    "hdsNaghsCfc",
    "ilnsCfc",
    "ilnsCptl",
    "ilnsPrm",
    "isCmmn",
    "isJari",
    "isuYear",
    "lfCvr",
    "lfDie",
    "lfPrm",
    "lifeGhrd",
    "mapFldDtlCod",
    "mdcCfc",
    "ofcCst",
    "payPerYr",
    "plcyUnqCod",
    "rcvCst",
    "reservedPrm",
    "saleCst",
    "scnBSAmrazCapital",
    "scnBSHdsDieCfc",
    "scnBdHdsCfc",
    "scnCptl",
    "scnDrmnCptl",
    "scnHdsMdcCstCfc",
    "scnIlnsCfc",
    "scnMdcCfc",
    "scnMftCfc",
    "scnNam",
    "scnSrgclCstCptl",
    "hasDscnt"
})
public class WbsV4PlcyLifeBaseReq {

    @XmlElement(name = "Age")
    protected Short age;
    @XmlElement(name = "BdHdsCptl")
    protected BigDecimal bdHdsCptl;
    @XmlElement(name = "BdHdsPrm")
    protected BigDecimal bdHdsPrm;
    @XmlElementRef(name = "BrthDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brthDte;
    @XmlElement(name = "CfcChngCptl")
    protected Float cfcChngCptl;
    @XmlElement(name = "CfcChngPrm")
    protected Float cfcChngPrm;
    @XmlElementRef(name = "CmpDocNo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpDocNo;
    @XmlElementRef(name = "CstmNam", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cstmNam;
    @XmlElement(name = "DieCptl")
    protected BigDecimal dieCptl;
    @XmlElement(name = "DieHdsCptlY")
    protected BigDecimal dieHdsCptlY;
    @XmlElement(name = "DieHdsPrm")
    protected BigDecimal dieHdsPrm;
    @XmlElement(name = "DiePrm")
    protected BigDecimal diePrm;
    @XmlElement(name = "DisCptlY")
    protected BigDecimal disCptlY;
    @XmlElement(name = "DisPrm")
    protected BigDecimal disPrm;
    @XmlElement(name = "DivCst")
    protected BigDecimal divCst;
    @XmlElement(name = "EdrsUnqCod")
    protected Long edrsUnqCod;
    @XmlElement(name = "ExptPrm")
    protected BigDecimal exptPrm;
    @XmlElement(name = "FariAge")
    protected Short fariAge;
    @XmlElement(name = "FirstPrmContainsExtraPushesh")
    protected Short firstPrmContainsExtraPushesh;
    @XmlElement(name = "FirstReserved")
    protected BigDecimal firstReserved;
    @XmlElement(name = "HdsDieCfc")
    protected BigDecimal hdsDieCfc;
    @XmlElement(name = "HdsNaghsCfc")
    protected BigDecimal hdsNaghsCfc;
    @XmlElement(name = "IlnsCfc")
    protected BigDecimal ilnsCfc;
    @XmlElement(name = "IlnsCptl")
    protected BigDecimal ilnsCptl;
    @XmlElement(name = "IlnsPrm")
    protected BigDecimal ilnsPrm;
    @XmlElement(name = "IsCmmn")
    protected Boolean isCmmn;
    @XmlElement(name = "IsJari")
    protected Short isJari;
    @XmlElementRef(name = "IsuYear", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isuYear;
    @XmlElement(name = "LfCvr")
    protected BigDecimal lfCvr;
    @XmlElement(name = "LfDie")
    protected BigDecimal lfDie;
    @XmlElement(name = "LfPrm")
    protected BigDecimal lfPrm;
    @XmlElement(name = "LifeGhrd")
    protected Integer lifeGhrd;
    @XmlElementRef(name = "MapFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapFldDtlCod;
    @XmlElement(name = "MdcCfc")
    protected BigDecimal mdcCfc;
    @XmlElement(name = "OfcCst")
    protected BigDecimal ofcCst;
    @XmlElement(name = "PayPerYr")
    protected Integer payPerYr;
    @XmlElement(name = "PlcyUnqCod")
    protected Long plcyUnqCod;
    @XmlElement(name = "RcvCst")
    protected BigDecimal rcvCst;
    @XmlElement(name = "ReservedPrm")
    protected BigDecimal reservedPrm;
    @XmlElement(name = "SaleCst")
    protected BigDecimal saleCst;
    @XmlElement(name = "ScnBSAmrazCapital")
    protected BigDecimal scnBSAmrazCapital;
    @XmlElement(name = "ScnBSHdsDieCfc")
    protected BigDecimal scnBSHdsDieCfc;
    @XmlElement(name = "ScnBdHdsCfc")
    protected BigDecimal scnBdHdsCfc;
    @XmlElement(name = "ScnCptl")
    protected BigDecimal scnCptl;
    @XmlElement(name = "ScnDrmnCptl")
    protected BigDecimal scnDrmnCptl;
    @XmlElement(name = "ScnHdsMdcCstCfc")
    protected Short scnHdsMdcCstCfc;
    @XmlElement(name = "ScnIlnsCfc")
    protected BigDecimal scnIlnsCfc;
    @XmlElement(name = "ScnMdcCfc")
    protected BigDecimal scnMdcCfc;
    @XmlElement(name = "ScnMftCfc")
    protected Short scnMftCfc;
    @XmlElementRef(name = "ScnNam", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scnNam;
    @XmlElement(name = "ScnSrgclCstCptl")
    protected BigDecimal scnSrgclCstCptl;
    protected Boolean hasDscnt;

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAge(Short value) {
        this.age = value;
    }

    /**
     * Gets the value of the bdHdsCptl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBdHdsCptl() {
        return bdHdsCptl;
    }

    /**
     * Sets the value of the bdHdsCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBdHdsCptl(BigDecimal value) {
        this.bdHdsCptl = value;
    }

    /**
     * Gets the value of the bdHdsPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBdHdsPrm() {
        return bdHdsPrm;
    }

    /**
     * Sets the value of the bdHdsPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBdHdsPrm(BigDecimal value) {
        this.bdHdsPrm = value;
    }

    /**
     * Gets the value of the brthDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrthDte() {
        return brthDte;
    }

    /**
     * Sets the value of the brthDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrthDte(JAXBElement<String> value) {
        this.brthDte = value;
    }

    /**
     * Gets the value of the cfcChngCptl property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCfcChngCptl() {
        return cfcChngCptl;
    }

    /**
     * Sets the value of the cfcChngCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCfcChngCptl(Float value) {
        this.cfcChngCptl = value;
    }

    /**
     * Gets the value of the cfcChngPrm property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCfcChngPrm() {
        return cfcChngPrm;
    }

    /**
     * Sets the value of the cfcChngPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCfcChngPrm(Float value) {
        this.cfcChngPrm = value;
    }

    /**
     * Gets the value of the cmpDocNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpDocNo() {
        return cmpDocNo;
    }

    /**
     * Sets the value of the cmpDocNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpDocNo(JAXBElement<String> value) {
        this.cmpDocNo = value;
    }

    /**
     * Gets the value of the cstmNam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstmNam() {
        return cstmNam;
    }

    /**
     * Sets the value of the cstmNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstmNam(JAXBElement<String> value) {
        this.cstmNam = value;
    }

    /**
     * Gets the value of the dieCptl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDieCptl() {
        return dieCptl;
    }

    /**
     * Sets the value of the dieCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDieCptl(BigDecimal value) {
        this.dieCptl = value;
    }

    /**
     * Gets the value of the dieHdsCptlY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDieHdsCptlY() {
        return dieHdsCptlY;
    }

    /**
     * Sets the value of the dieHdsCptlY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDieHdsCptlY(BigDecimal value) {
        this.dieHdsCptlY = value;
    }

    /**
     * Gets the value of the dieHdsPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDieHdsPrm() {
        return dieHdsPrm;
    }

    /**
     * Sets the value of the dieHdsPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDieHdsPrm(BigDecimal value) {
        this.dieHdsPrm = value;
    }

    /**
     * Gets the value of the diePrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiePrm() {
        return diePrm;
    }

    /**
     * Sets the value of the diePrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiePrm(BigDecimal value) {
        this.diePrm = value;
    }

    /**
     * Gets the value of the disCptlY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisCptlY() {
        return disCptlY;
    }

    /**
     * Sets the value of the disCptlY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisCptlY(BigDecimal value) {
        this.disCptlY = value;
    }

    /**
     * Gets the value of the disPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisPrm() {
        return disPrm;
    }

    /**
     * Sets the value of the disPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisPrm(BigDecimal value) {
        this.disPrm = value;
    }

    /**
     * Gets the value of the divCst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDivCst() {
        return divCst;
    }

    /**
     * Sets the value of the divCst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDivCst(BigDecimal value) {
        this.divCst = value;
    }

    /**
     * Gets the value of the edrsUnqCod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEdrsUnqCod() {
        return edrsUnqCod;
    }

    /**
     * Sets the value of the edrsUnqCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEdrsUnqCod(Long value) {
        this.edrsUnqCod = value;
    }

    /**
     * Gets the value of the exptPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExptPrm() {
        return exptPrm;
    }

    /**
     * Sets the value of the exptPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExptPrm(BigDecimal value) {
        this.exptPrm = value;
    }

    /**
     * Gets the value of the fariAge property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFariAge() {
        return fariAge;
    }

    /**
     * Sets the value of the fariAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFariAge(Short value) {
        this.fariAge = value;
    }

    /**
     * Gets the value of the firstPrmContainsExtraPushesh property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFirstPrmContainsExtraPushesh() {
        return firstPrmContainsExtraPushesh;
    }

    /**
     * Sets the value of the firstPrmContainsExtraPushesh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFirstPrmContainsExtraPushesh(Short value) {
        this.firstPrmContainsExtraPushesh = value;
    }

    /**
     * Gets the value of the firstReserved property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstReserved() {
        return firstReserved;
    }

    /**
     * Sets the value of the firstReserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstReserved(BigDecimal value) {
        this.firstReserved = value;
    }

    /**
     * Gets the value of the hdsDieCfc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHdsDieCfc() {
        return hdsDieCfc;
    }

    /**
     * Sets the value of the hdsDieCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHdsDieCfc(BigDecimal value) {
        this.hdsDieCfc = value;
    }

    /**
     * Gets the value of the hdsNaghsCfc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHdsNaghsCfc() {
        return hdsNaghsCfc;
    }

    /**
     * Sets the value of the hdsNaghsCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHdsNaghsCfc(BigDecimal value) {
        this.hdsNaghsCfc = value;
    }

    /**
     * Gets the value of the ilnsCfc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIlnsCfc() {
        return ilnsCfc;
    }

    /**
     * Sets the value of the ilnsCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIlnsCfc(BigDecimal value) {
        this.ilnsCfc = value;
    }

    /**
     * Gets the value of the ilnsCptl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIlnsCptl() {
        return ilnsCptl;
    }

    /**
     * Sets the value of the ilnsCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIlnsCptl(BigDecimal value) {
        this.ilnsCptl = value;
    }

    /**
     * Gets the value of the ilnsPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIlnsPrm() {
        return ilnsPrm;
    }

    /**
     * Sets the value of the ilnsPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIlnsPrm(BigDecimal value) {
        this.ilnsPrm = value;
    }

    /**
     * Gets the value of the isCmmn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCmmn() {
        return isCmmn;
    }

    /**
     * Sets the value of the isCmmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCmmn(Boolean value) {
        this.isCmmn = value;
    }

    /**
     * Gets the value of the isJari property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsJari() {
        return isJari;
    }

    /**
     * Sets the value of the isJari property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsJari(Short value) {
        this.isJari = value;
    }

    /**
     * Gets the value of the isuYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsuYear() {
        return isuYear;
    }

    /**
     * Sets the value of the isuYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsuYear(JAXBElement<String> value) {
        this.isuYear = value;
    }

    /**
     * Gets the value of the lfCvr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLfCvr() {
        return lfCvr;
    }

    /**
     * Sets the value of the lfCvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLfCvr(BigDecimal value) {
        this.lfCvr = value;
    }

    /**
     * Gets the value of the lfDie property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLfDie() {
        return lfDie;
    }

    /**
     * Sets the value of the lfDie property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLfDie(BigDecimal value) {
        this.lfDie = value;
    }

    /**
     * Gets the value of the lfPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLfPrm() {
        return lfPrm;
    }

    /**
     * Sets the value of the lfPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLfPrm(BigDecimal value) {
        this.lfPrm = value;
    }

    /**
     * Gets the value of the lifeGhrd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLifeGhrd() {
        return lifeGhrd;
    }

    /**
     * Sets the value of the lifeGhrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLifeGhrd(Integer value) {
        this.lifeGhrd = value;
    }

    /**
     * Gets the value of the mapFldDtlCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapFldDtlCod() {
        return mapFldDtlCod;
    }

    /**
     * Sets the value of the mapFldDtlCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapFldDtlCod(JAXBElement<String> value) {
        this.mapFldDtlCod = value;
    }

    /**
     * Gets the value of the mdcCfc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMdcCfc() {
        return mdcCfc;
    }

    /**
     * Sets the value of the mdcCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMdcCfc(BigDecimal value) {
        this.mdcCfc = value;
    }

    /**
     * Gets the value of the ofcCst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfcCst() {
        return ofcCst;
    }

    /**
     * Sets the value of the ofcCst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfcCst(BigDecimal value) {
        this.ofcCst = value;
    }

    /**
     * Gets the value of the payPerYr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayPerYr() {
        return payPerYr;
    }

    /**
     * Sets the value of the payPerYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayPerYr(Integer value) {
        this.payPerYr = value;
    }

    /**
     * Gets the value of the plcyUnqCod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlcyUnqCod() {
        return plcyUnqCod;
    }

    /**
     * Sets the value of the plcyUnqCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlcyUnqCod(Long value) {
        this.plcyUnqCod = value;
    }

    /**
     * Gets the value of the rcvCst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRcvCst() {
        return rcvCst;
    }

    /**
     * Sets the value of the rcvCst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRcvCst(BigDecimal value) {
        this.rcvCst = value;
    }

    /**
     * Gets the value of the reservedPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservedPrm() {
        return reservedPrm;
    }

    /**
     * Sets the value of the reservedPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservedPrm(BigDecimal value) {
        this.reservedPrm = value;
    }

    /**
     * Gets the value of the saleCst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaleCst() {
        return saleCst;
    }

    /**
     * Sets the value of the saleCst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaleCst(BigDecimal value) {
        this.saleCst = value;
    }

    /**
     * Gets the value of the scnBSAmrazCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScnBSAmrazCapital() {
        return scnBSAmrazCapital;
    }

    /**
     * Sets the value of the scnBSAmrazCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScnBSAmrazCapital(BigDecimal value) {
        this.scnBSAmrazCapital = value;
    }

    /**
     * Gets the value of the scnBSHdsDieCfc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScnBSHdsDieCfc() {
        return scnBSHdsDieCfc;
    }

    /**
     * Sets the value of the scnBSHdsDieCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScnBSHdsDieCfc(BigDecimal value) {
        this.scnBSHdsDieCfc = value;
    }

    /**
     * Gets the value of the scnBdHdsCfc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScnBdHdsCfc() {
        return scnBdHdsCfc;
    }

    /**
     * Sets the value of the scnBdHdsCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScnBdHdsCfc(BigDecimal value) {
        this.scnBdHdsCfc = value;
    }

    /**
     * Gets the value of the scnCptl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScnCptl() {
        return scnCptl;
    }

    /**
     * Sets the value of the scnCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScnCptl(BigDecimal value) {
        this.scnCptl = value;
    }

    /**
     * Gets the value of the scnDrmnCptl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScnDrmnCptl() {
        return scnDrmnCptl;
    }

    /**
     * Sets the value of the scnDrmnCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScnDrmnCptl(BigDecimal value) {
        this.scnDrmnCptl = value;
    }

    /**
     * Gets the value of the scnHdsMdcCstCfc property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getScnHdsMdcCstCfc() {
        return scnHdsMdcCstCfc;
    }

    /**
     * Sets the value of the scnHdsMdcCstCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setScnHdsMdcCstCfc(Short value) {
        this.scnHdsMdcCstCfc = value;
    }

    /**
     * Gets the value of the scnIlnsCfc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScnIlnsCfc() {
        return scnIlnsCfc;
    }

    /**
     * Sets the value of the scnIlnsCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScnIlnsCfc(BigDecimal value) {
        this.scnIlnsCfc = value;
    }

    /**
     * Gets the value of the scnMdcCfc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScnMdcCfc() {
        return scnMdcCfc;
    }

    /**
     * Sets the value of the scnMdcCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScnMdcCfc(BigDecimal value) {
        this.scnMdcCfc = value;
    }

    /**
     * Gets the value of the scnMftCfc property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getScnMftCfc() {
        return scnMftCfc;
    }

    /**
     * Sets the value of the scnMftCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setScnMftCfc(Short value) {
        this.scnMftCfc = value;
    }

    /**
     * Gets the value of the scnNam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScnNam() {
        return scnNam;
    }

    /**
     * Sets the value of the scnNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScnNam(JAXBElement<String> value) {
        this.scnNam = value;
    }

    /**
     * Gets the value of the scnSrgclCstCptl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScnSrgclCstCptl() {
        return scnSrgclCstCptl;
    }

    /**
     * Sets the value of the scnSrgclCstCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScnSrgclCstCptl(BigDecimal value) {
        this.scnSrgclCstCptl = value;
    }

    /**
     * Gets the value of the hasDscnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDscnt() {
        return hasDscnt;
    }

    /**
     * Sets the value of the hasDscnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDscnt(Boolean value) {
        this.hasDscnt = value;
    }

}
