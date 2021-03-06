
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for WbsV4PlcyReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4PlcyReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BgnDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CmpDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cptl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EndDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Isu" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsuDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapAgncCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapBrkrCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapBrnhCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapCorTypCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapCurCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapIntrCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapPrsnTypCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NtnlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrntCmpDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rct" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tol" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Wag" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ZipCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4PlcyReq", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "bgnDte",
    "cmpDocNo",
    "cptl",
    "endDte",
    "insNam",
    "isu",
    "isuDte",
    "mapAgncCod",
    "mapBrkrCod",
    "mapBrnhCod",
    "mapCorTypCod",
    "mapCurCod",
    "mapFldDtlCod",
    "mapIntrCod",
    "mapPrsnTypCod",
    "mbl",
    "ntnlId",
    "prm",
    "prntCmpDocNo",
    "rct",
    "tax",
    "tel",
    "tol",
    "wag",
    "zipCod"
})
public class WbsV4PlcyReq {

    @XmlElementRef(name = "BgnDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bgnDte;
    @XmlElementRef(name = "CmpDocNo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpDocNo;
    @XmlElement(name = "Cptl")
    protected BigDecimal cptl;
    @XmlElementRef(name = "EndDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endDte;
    @XmlElementRef(name = "InsNam", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insNam;
    @XmlElement(name = "Isu")
    protected BigDecimal isu;
    @XmlElementRef(name = "IsuDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isuDte;
    @XmlElementRef(name = "MapAgncCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapAgncCod;
    @XmlElementRef(name = "MapBrkrCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapBrkrCod;
    @XmlElementRef(name = "MapBrnhCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapBrnhCod;
    @XmlElementRef(name = "MapCorTypCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapCorTypCod;
    @XmlElementRef(name = "MapCurCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapCurCod;
    @XmlElementRef(name = "MapFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapFldDtlCod;
    @XmlElementRef(name = "MapIntrCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapIntrCod;
    @XmlElementRef(name = "MapPrsnTypCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapPrsnTypCod;
    @XmlElementRef(name = "Mbl", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mbl;
    @XmlElementRef(name = "NtnlId", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ntnlId;
    @XmlElement(name = "Prm")
    protected BigDecimal prm;
    @XmlElementRef(name = "PrntCmpDocNo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prntCmpDocNo;
    @XmlElement(name = "Rct")
    protected BigDecimal rct;
    @XmlElement(name = "Tax")
    protected BigDecimal tax;
    @XmlElementRef(name = "Tel", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tel;
    @XmlElement(name = "Tol")
    protected BigDecimal tol;
    @XmlElement(name = "Wag")
    protected BigDecimal wag;
    @XmlElementRef(name = "ZipCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zipCod;

    /**
     * Gets the value of the bgnDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBgnDte() {
        return bgnDte;
    }

    /**
     * Sets the value of the bgnDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBgnDte(JAXBElement<String> value) {
        this.bgnDte = value;
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
     * Gets the value of the cptl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCptl() {
        return cptl;
    }

    /**
     * Sets the value of the cptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCptl(BigDecimal value) {
        this.cptl = value;
    }

    /**
     * Gets the value of the endDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndDte() {
        return endDte;
    }

    /**
     * Sets the value of the endDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndDte(JAXBElement<String> value) {
        this.endDte = value;
    }

    /**
     * Gets the value of the insNam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsNam() {
        return insNam;
    }

    /**
     * Sets the value of the insNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsNam(JAXBElement<String> value) {
        this.insNam = value;
    }

    /**
     * Gets the value of the isu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIsu() {
        return isu;
    }

    /**
     * Sets the value of the isu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIsu(BigDecimal value) {
        this.isu = value;
    }

    /**
     * Gets the value of the isuDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsuDte() {
        return isuDte;
    }

    /**
     * Sets the value of the isuDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsuDte(JAXBElement<String> value) {
        this.isuDte = value;
    }

    /**
     * Gets the value of the mapAgncCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapAgncCod() {
        return mapAgncCod;
    }

    /**
     * Sets the value of the mapAgncCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapAgncCod(JAXBElement<String> value) {
        this.mapAgncCod = value;
    }

    /**
     * Gets the value of the mapBrkrCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapBrkrCod() {
        return mapBrkrCod;
    }

    /**
     * Sets the value of the mapBrkrCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapBrkrCod(JAXBElement<String> value) {
        this.mapBrkrCod = value;
    }

    /**
     * Gets the value of the mapBrnhCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapBrnhCod() {
        return mapBrnhCod;
    }

    /**
     * Sets the value of the mapBrnhCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapBrnhCod(JAXBElement<String> value) {
        this.mapBrnhCod = value;
    }

    /**
     * Gets the value of the mapCorTypCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapCorTypCod() {
        return mapCorTypCod;
    }

    /**
     * Sets the value of the mapCorTypCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapCorTypCod(JAXBElement<String> value) {
        this.mapCorTypCod = value;
    }

    /**
     * Gets the value of the mapCurCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapCurCod() {
        return mapCurCod;
    }

    /**
     * Sets the value of the mapCurCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapCurCod(JAXBElement<String> value) {
        this.mapCurCod = value;
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
     * Gets the value of the mapIntrCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapIntrCod() {
        return mapIntrCod;
    }

    /**
     * Sets the value of the mapIntrCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapIntrCod(JAXBElement<String> value) {
        this.mapIntrCod = value;
    }

    /**
     * Gets the value of the mapPrsnTypCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapPrsnTypCod() {
        return mapPrsnTypCod;
    }

    /**
     * Sets the value of the mapPrsnTypCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapPrsnTypCod(JAXBElement<String> value) {
        this.mapPrsnTypCod = value;
    }

    /**
     * Gets the value of the mbl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbl() {
        return mbl;
    }

    /**
     * Sets the value of the mbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbl(JAXBElement<String> value) {
        this.mbl = value;
    }

    /**
     * Gets the value of the ntnlId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNtnlId() {
        return ntnlId;
    }

    /**
     * Sets the value of the ntnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNtnlId(JAXBElement<String> value) {
        this.ntnlId = value;
    }

    /**
     * Gets the value of the prm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrm() {
        return prm;
    }

    /**
     * Sets the value of the prm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrm(BigDecimal value) {
        this.prm = value;
    }

    /**
     * Gets the value of the prntCmpDocNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrntCmpDocNo() {
        return prntCmpDocNo;
    }

    /**
     * Sets the value of the prntCmpDocNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrntCmpDocNo(JAXBElement<String> value) {
        this.prntCmpDocNo = value;
    }

    /**
     * Gets the value of the rct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRct() {
        return rct;
    }

    /**
     * Sets the value of the rct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRct(BigDecimal value) {
        this.rct = value;
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
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTel(JAXBElement<String> value) {
        this.tel = value;
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
     * Gets the value of the wag property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWag() {
        return wag;
    }

    /**
     * Sets the value of the wag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWag(BigDecimal value) {
        this.wag = value;
    }

    /**
     * Gets the value of the zipCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZipCod() {
        return zipCod;
    }

    /**
     * Sets the value of the zipCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZipCod(JAXBElement<String> value) {
        this.zipCod = value;
    }

}
