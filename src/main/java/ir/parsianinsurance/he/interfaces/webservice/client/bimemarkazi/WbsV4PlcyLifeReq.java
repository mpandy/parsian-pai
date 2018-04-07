
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for WbsV4PlcyLifeReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4PlcyLifeReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgrNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BdHdsCptl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BdHdsPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BrthDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CmpBrdPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CmpDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CstmNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DarmanPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DieCptl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DieHdsCptlY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DieHdsPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DieHdsPrmY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiePrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiePurPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisCptlY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisPrmY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DivCst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DivCstY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EdrsUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExptPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExptPrmY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IlnsCptl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IlnsPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IlnsPrmY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InsCst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsCmmn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LfCvr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LfDie" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LfPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LfPurPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MapFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapMdcFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapOthFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MdcCmpFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MedicExtraPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MftOfBGMftPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MsCmpFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MsMapFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MstmrMftPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OfcCst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OthCmpFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayDurYr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PayNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PayPerYr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PayYr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlcyUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurPrmYr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RcvCst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RcvDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurgicalPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TamamCmpFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TamamMapFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TamamOmrPrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxCfc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tol" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TolCfc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="YrNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZamaniLifePrm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hasDscnt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEdrsRtn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPlcyRtn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isScndPrsn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4PlcyLifeReq", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "agrNo",
    "bdHdsCptl",
    "bdHdsPrm",
    "brthDte",
    "cmpBrdPrm",
    "cmpDocNo",
    "cstmNam",
    "darmanPrm",
    "dieCptl",
    "dieHdsCptlY",
    "dieHdsPrm",
    "dieHdsPrmY",
    "diePrm",
    "diePurPrm",
    "disCptlY",
    "disPrm",
    "disPrmY",
    "divCst",
    "divCstY",
    "edrsUnqCod",
    "exptPrm",
    "exptPrmY",
    "ilnsCptl",
    "ilnsPrm",
    "ilnsPrmY",
    "insCst",
    "isCmmn",
    "lfCvr",
    "lfDie",
    "lfPrm",
    "lfPurPrm",
    "mapFldDtlCod",
    "mapMdcFldDtlCod",
    "mapOthFldDtlCod",
    "mdcCmpFldDtlCod",
    "medicExtraPrm",
    "mftOfBGMftPrm",
    "msCmpFldDtlCod",
    "msMapFldDtlCod",
    "msPrm",
    "mstmrMftPrm",
    "ofcCst",
    "othCmpFldDtlCod",
    "payDte",
    "payDurYr",
    "payNo",
    "payPerYr",
    "payYr",
    "plcyUnqCod",
    "purPrmYr",
    "rcvCst",
    "rcvDte",
    "surgicalPrm",
    "tamamCmpFldDtlCod",
    "tamamMapFldDtlCod",
    "tamamOmrPrm",
    "tax",
    "taxCfc",
    "tol",
    "tolCfc",
    "yrNo",
    "zamaniLifePrm",
    "hasDscnt",
    "isEdrsRtn",
    "isPlcyRtn",
    "isScndPrsn"
})
public class WbsV4PlcyLifeReq {

    @XmlElement(name = "AgrNo")
    protected Integer agrNo;
    @XmlElement(name = "BdHdsCptl")
    protected BigDecimal bdHdsCptl;
    @XmlElement(name = "BdHdsPrm")
    protected BigDecimal bdHdsPrm;
    @XmlElementRef(name = "BrthDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brthDte;
    @XmlElement(name = "CmpBrdPrm")
    protected BigDecimal cmpBrdPrm;
    @XmlElementRef(name = "CmpDocNo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpDocNo;
    @XmlElementRef(name = "CstmNam", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cstmNam;
    @XmlElement(name = "DarmanPrm")
    protected BigDecimal darmanPrm;
    @XmlElement(name = "DieCptl")
    protected BigDecimal dieCptl;
    @XmlElement(name = "DieHdsCptlY")
    protected BigDecimal dieHdsCptlY;
    @XmlElement(name = "DieHdsPrm")
    protected BigDecimal dieHdsPrm;
    @XmlElement(name = "DieHdsPrmY")
    protected BigDecimal dieHdsPrmY;
    @XmlElement(name = "DiePrm")
    protected BigDecimal diePrm;
    @XmlElement(name = "DiePurPrm")
    protected BigDecimal diePurPrm;
    @XmlElement(name = "DisCptlY")
    protected BigDecimal disCptlY;
    @XmlElement(name = "DisPrm")
    protected BigDecimal disPrm;
    @XmlElement(name = "DisPrmY")
    protected BigDecimal disPrmY;
    @XmlElement(name = "DivCst")
    protected BigDecimal divCst;
    @XmlElement(name = "DivCstY")
    protected BigDecimal divCstY;
    @XmlElement(name = "EdrsUnqCod")
    protected Long edrsUnqCod;
    @XmlElement(name = "ExptPrm")
    protected BigDecimal exptPrm;
    @XmlElement(name = "ExptPrmY")
    protected BigDecimal exptPrmY;
    @XmlElement(name = "IlnsCptl")
    protected BigDecimal ilnsCptl;
    @XmlElement(name = "IlnsPrm")
    protected BigDecimal ilnsPrm;
    @XmlElement(name = "IlnsPrmY")
    protected BigDecimal ilnsPrmY;
    @XmlElement(name = "InsCst")
    protected BigDecimal insCst;
    @XmlElement(name = "IsCmmn")
    protected Boolean isCmmn;
    @XmlElement(name = "LfCvr")
    protected BigDecimal lfCvr;
    @XmlElement(name = "LfDie")
    protected BigDecimal lfDie;
    @XmlElement(name = "LfPrm")
    protected BigDecimal lfPrm;
    @XmlElement(name = "LfPurPrm")
    protected BigDecimal lfPurPrm;
    @XmlElementRef(name = "MapFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapFldDtlCod;
    @XmlElementRef(name = "MapMdcFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapMdcFldDtlCod;
    @XmlElementRef(name = "MapOthFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapOthFldDtlCod;
    @XmlElementRef(name = "MdcCmpFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mdcCmpFldDtlCod;
    @XmlElement(name = "MedicExtraPrm")
    protected BigDecimal medicExtraPrm;
    @XmlElement(name = "MftOfBGMftPrm")
    protected BigDecimal mftOfBGMftPrm;
    @XmlElement(name = "MsCmpFldDtlCod")
    protected Integer msCmpFldDtlCod;
    @XmlElementRef(name = "MsMapFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msMapFldDtlCod;
    @XmlElement(name = "MsPrm")
    protected BigDecimal msPrm;
    @XmlElement(name = "MstmrMftPrm")
    protected BigDecimal mstmrMftPrm;
    @XmlElement(name = "OfcCst")
    protected BigDecimal ofcCst;
    @XmlElementRef(name = "OthCmpFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> othCmpFldDtlCod;
    @XmlElementRef(name = "PayDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payDte;
    @XmlElement(name = "PayDurYr")
    protected Integer payDurYr;
    @XmlElement(name = "PayNo")
    protected Integer payNo;
    @XmlElement(name = "PayPerYr")
    protected Integer payPerYr;
    @XmlElement(name = "PayYr")
    protected Integer payYr;
    @XmlElement(name = "PlcyUnqCod")
    protected Long plcyUnqCod;
    @XmlElement(name = "PurPrmYr")
    protected BigDecimal purPrmYr;
    @XmlElement(name = "RcvCst")
    protected BigDecimal rcvCst;
    @XmlElementRef(name = "RcvDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rcvDte;
    @XmlElement(name = "SurgicalPrm")
    protected BigDecimal surgicalPrm;
    @XmlElement(name = "TamamCmpFldDtlCod")
    protected Integer tamamCmpFldDtlCod;
    @XmlElementRef(name = "TamamMapFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tamamMapFldDtlCod;
    @XmlElement(name = "TamamOmrPrm")
    protected BigDecimal tamamOmrPrm;
    @XmlElement(name = "Tax")
    protected BigDecimal tax;
    @XmlElement(name = "TaxCfc")
    protected BigDecimal taxCfc;
    @XmlElement(name = "Tol")
    protected BigDecimal tol;
    @XmlElement(name = "TolCfc")
    protected BigDecimal tolCfc;
    @XmlElement(name = "YrNo")
    protected Integer yrNo;
    @XmlElement(name = "ZamaniLifePrm")
    protected BigDecimal zamaniLifePrm;
    protected Boolean hasDscnt;
    protected Boolean isEdrsRtn;
    protected Boolean isPlcyRtn;
    protected Boolean isScndPrsn;

    /**
     * Gets the value of the agrNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgrNo() {
        return agrNo;
    }

    /**
     * Sets the value of the agrNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgrNo(Integer value) {
        this.agrNo = value;
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
     * Gets the value of the cmpBrdPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCmpBrdPrm() {
        return cmpBrdPrm;
    }

    /**
     * Sets the value of the cmpBrdPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCmpBrdPrm(BigDecimal value) {
        this.cmpBrdPrm = value;
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
     * Gets the value of the darmanPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDarmanPrm() {
        return darmanPrm;
    }

    /**
     * Sets the value of the darmanPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDarmanPrm(BigDecimal value) {
        this.darmanPrm = value;
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
     * Gets the value of the dieHdsPrmY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDieHdsPrmY() {
        return dieHdsPrmY;
    }

    /**
     * Sets the value of the dieHdsPrmY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDieHdsPrmY(BigDecimal value) {
        this.dieHdsPrmY = value;
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
     * Gets the value of the diePurPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiePurPrm() {
        return diePurPrm;
    }

    /**
     * Sets the value of the diePurPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiePurPrm(BigDecimal value) {
        this.diePurPrm = value;
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
     * Gets the value of the disPrmY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisPrmY() {
        return disPrmY;
    }

    /**
     * Sets the value of the disPrmY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisPrmY(BigDecimal value) {
        this.disPrmY = value;
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
     * Gets the value of the divCstY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDivCstY() {
        return divCstY;
    }

    /**
     * Sets the value of the divCstY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDivCstY(BigDecimal value) {
        this.divCstY = value;
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
     * Gets the value of the exptPrmY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExptPrmY() {
        return exptPrmY;
    }

    /**
     * Sets the value of the exptPrmY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExptPrmY(BigDecimal value) {
        this.exptPrmY = value;
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
     * Gets the value of the ilnsPrmY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIlnsPrmY() {
        return ilnsPrmY;
    }

    /**
     * Sets the value of the ilnsPrmY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIlnsPrmY(BigDecimal value) {
        this.ilnsPrmY = value;
    }

    /**
     * Gets the value of the insCst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsCst() {
        return insCst;
    }

    /**
     * Sets the value of the insCst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsCst(BigDecimal value) {
        this.insCst = value;
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
     * Gets the value of the lfPurPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLfPurPrm() {
        return lfPurPrm;
    }

    /**
     * Sets the value of the lfPurPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLfPurPrm(BigDecimal value) {
        this.lfPurPrm = value;
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
     * Gets the value of the mapMdcFldDtlCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapMdcFldDtlCod() {
        return mapMdcFldDtlCod;
    }

    /**
     * Sets the value of the mapMdcFldDtlCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapMdcFldDtlCod(JAXBElement<String> value) {
        this.mapMdcFldDtlCod = value;
    }

    /**
     * Gets the value of the mapOthFldDtlCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapOthFldDtlCod() {
        return mapOthFldDtlCod;
    }

    /**
     * Sets the value of the mapOthFldDtlCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapOthFldDtlCod(JAXBElement<String> value) {
        this.mapOthFldDtlCod = value;
    }

    /**
     * Gets the value of the mdcCmpFldDtlCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdcCmpFldDtlCod() {
        return mdcCmpFldDtlCod;
    }

    /**
     * Sets the value of the mdcCmpFldDtlCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdcCmpFldDtlCod(JAXBElement<String> value) {
        this.mdcCmpFldDtlCod = value;
    }

    /**
     * Gets the value of the medicExtraPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedicExtraPrm() {
        return medicExtraPrm;
    }

    /**
     * Sets the value of the medicExtraPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedicExtraPrm(BigDecimal value) {
        this.medicExtraPrm = value;
    }

    /**
     * Gets the value of the mftOfBGMftPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMftOfBGMftPrm() {
        return mftOfBGMftPrm;
    }

    /**
     * Sets the value of the mftOfBGMftPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMftOfBGMftPrm(BigDecimal value) {
        this.mftOfBGMftPrm = value;
    }

    /**
     * Gets the value of the msCmpFldDtlCod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMsCmpFldDtlCod() {
        return msCmpFldDtlCod;
    }

    /**
     * Sets the value of the msCmpFldDtlCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMsCmpFldDtlCod(Integer value) {
        this.msCmpFldDtlCod = value;
    }

    /**
     * Gets the value of the msMapFldDtlCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsMapFldDtlCod() {
        return msMapFldDtlCod;
    }

    /**
     * Sets the value of the msMapFldDtlCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsMapFldDtlCod(JAXBElement<String> value) {
        this.msMapFldDtlCod = value;
    }

    /**
     * Gets the value of the msPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMsPrm() {
        return msPrm;
    }

    /**
     * Sets the value of the msPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMsPrm(BigDecimal value) {
        this.msPrm = value;
    }

    /**
     * Gets the value of the mstmrMftPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMstmrMftPrm() {
        return mstmrMftPrm;
    }

    /**
     * Sets the value of the mstmrMftPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMstmrMftPrm(BigDecimal value) {
        this.mstmrMftPrm = value;
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
     * Gets the value of the othCmpFldDtlCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOthCmpFldDtlCod() {
        return othCmpFldDtlCod;
    }

    /**
     * Sets the value of the othCmpFldDtlCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOthCmpFldDtlCod(JAXBElement<String> value) {
        this.othCmpFldDtlCod = value;
    }

    /**
     * Gets the value of the payDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayDte() {
        return payDte;
    }

    /**
     * Sets the value of the payDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayDte(JAXBElement<String> value) {
        this.payDte = value;
    }

    /**
     * Gets the value of the payDurYr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayDurYr() {
        return payDurYr;
    }

    /**
     * Sets the value of the payDurYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayDurYr(Integer value) {
        this.payDurYr = value;
    }

    /**
     * Gets the value of the payNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayNo() {
        return payNo;
    }

    /**
     * Sets the value of the payNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayNo(Integer value) {
        this.payNo = value;
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
     * Gets the value of the payYr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayYr() {
        return payYr;
    }

    /**
     * Sets the value of the payYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayYr(Integer value) {
        this.payYr = value;
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
     * Gets the value of the purPrmYr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurPrmYr() {
        return purPrmYr;
    }

    /**
     * Sets the value of the purPrmYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurPrmYr(BigDecimal value) {
        this.purPrmYr = value;
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
     * Gets the value of the rcvDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRcvDte() {
        return rcvDte;
    }

    /**
     * Sets the value of the rcvDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRcvDte(JAXBElement<String> value) {
        this.rcvDte = value;
    }

    /**
     * Gets the value of the surgicalPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurgicalPrm() {
        return surgicalPrm;
    }

    /**
     * Sets the value of the surgicalPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurgicalPrm(BigDecimal value) {
        this.surgicalPrm = value;
    }

    /**
     * Gets the value of the tamamCmpFldDtlCod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTamamCmpFldDtlCod() {
        return tamamCmpFldDtlCod;
    }

    /**
     * Sets the value of the tamamCmpFldDtlCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTamamCmpFldDtlCod(Integer value) {
        this.tamamCmpFldDtlCod = value;
    }

    /**
     * Gets the value of the tamamMapFldDtlCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTamamMapFldDtlCod() {
        return tamamMapFldDtlCod;
    }

    /**
     * Sets the value of the tamamMapFldDtlCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTamamMapFldDtlCod(JAXBElement<String> value) {
        this.tamamMapFldDtlCod = value;
    }

    /**
     * Gets the value of the tamamOmrPrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTamamOmrPrm() {
        return tamamOmrPrm;
    }

    /**
     * Sets the value of the tamamOmrPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTamamOmrPrm(BigDecimal value) {
        this.tamamOmrPrm = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the taxCfc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxCfc() {
        return taxCfc;
    }

    /**
     * Sets the value of the taxCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxCfc(BigDecimal value) {
        this.taxCfc = value;
    }

    /**
     * Gets the value of the tol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTol() {
        return tol;
    }

    /**
     * Sets the value of the tol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTol(BigDecimal value) {
        this.tol = value;
    }

    /**
     * Gets the value of the tolCfc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTolCfc() {
        return tolCfc;
    }

    /**
     * Sets the value of the tolCfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTolCfc(BigDecimal value) {
        this.tolCfc = value;
    }

    /**
     * Gets the value of the yrNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYrNo() {
        return yrNo;
    }

    /**
     * Sets the value of the yrNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYrNo(Integer value) {
        this.yrNo = value;
    }

    /**
     * Gets the value of the zamaniLifePrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZamaniLifePrm() {
        return zamaniLifePrm;
    }

    /**
     * Sets the value of the zamaniLifePrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZamaniLifePrm(BigDecimal value) {
        this.zamaniLifePrm = value;
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

    /**
     * Gets the value of the isEdrsRtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEdrsRtn() {
        return isEdrsRtn;
    }

    /**
     * Sets the value of the isEdrsRtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEdrsRtn(Boolean value) {
        this.isEdrsRtn = value;
    }

    /**
     * Gets the value of the isPlcyRtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPlcyRtn() {
        return isPlcyRtn;
    }

    /**
     * Sets the value of the isPlcyRtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPlcyRtn(Boolean value) {
        this.isPlcyRtn = value;
    }

    /**
     * Gets the value of the isScndPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsScndPrsn() {
        return isScndPrsn;
    }

    /**
     * Sets the value of the isScndPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsScndPrsn(Boolean value) {
        this.isScndPrsn = value;
    }

}
