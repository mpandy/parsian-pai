
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for WbsV4LifeLosReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4LifeLosReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrdTypCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CmpDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocLosUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HdsAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IlsAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LfAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LosUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MapFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapMdcFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapOthFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MdcCmpFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MftAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OthCmpFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PayDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RsvAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RtrAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4LifeLosReq", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "brdTypCod",
    "cmpDocNo",
    "docLosUnqCod",
    "hdsAmnt",
    "ilsAmnt",
    "lfAmnt",
    "losUnqCod",
    "mapFldDtlCod",
    "mapMdcFldDtlCod",
    "mapOthFldDtlCod",
    "mdcCmpFldDtlCod",
    "mftAmnt",
    "othCmpFldDtlCod",
    "payDte",
    "rsvAmnt",
    "rtrAmnt"
})
public class WbsV4LifeLosReq {

    @XmlElement(name = "BrdTypCod")
    protected Integer brdTypCod;
    @XmlElementRef(name = "CmpDocNo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpDocNo;
    @XmlElement(name = "DocLosUnqCod")
    protected Long docLosUnqCod;
    @XmlElement(name = "HdsAmnt")
    protected BigDecimal hdsAmnt;
    @XmlElement(name = "IlsAmnt")
    protected BigDecimal ilsAmnt;
    @XmlElement(name = "LfAmnt")
    protected BigDecimal lfAmnt;
    @XmlElement(name = "LosUnqCod")
    protected Long losUnqCod;
    @XmlElementRef(name = "MapFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapFldDtlCod;
    @XmlElementRef(name = "MapMdcFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapMdcFldDtlCod;
    @XmlElementRef(name = "MapOthFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapOthFldDtlCod;
    @XmlElement(name = "MdcCmpFldDtlCod")
    protected Integer mdcCmpFldDtlCod;
    @XmlElement(name = "MftAmnt")
    protected BigDecimal mftAmnt;
    @XmlElement(name = "OthCmpFldDtlCod")
    protected Integer othCmpFldDtlCod;
    @XmlElementRef(name = "PayDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payDte;
    @XmlElement(name = "RsvAmnt")
    protected BigDecimal rsvAmnt;
    @XmlElement(name = "RtrAmnt")
    protected BigDecimal rtrAmnt;

    /**
     * Gets the value of the brdTypCod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrdTypCod() {
        return brdTypCod;
    }

    /**
     * Sets the value of the brdTypCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrdTypCod(Integer value) {
        this.brdTypCod = value;
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
     * Gets the value of the docLosUnqCod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocLosUnqCod() {
        return docLosUnqCod;
    }

    /**
     * Sets the value of the docLosUnqCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocLosUnqCod(Long value) {
        this.docLosUnqCod = value;
    }

    /**
     * Gets the value of the hdsAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHdsAmnt() {
        return hdsAmnt;
    }

    /**
     * Sets the value of the hdsAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHdsAmnt(BigDecimal value) {
        this.hdsAmnt = value;
    }

    /**
     * Gets the value of the ilsAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIlsAmnt() {
        return ilsAmnt;
    }

    /**
     * Sets the value of the ilsAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIlsAmnt(BigDecimal value) {
        this.ilsAmnt = value;
    }

    /**
     * Gets the value of the lfAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLfAmnt() {
        return lfAmnt;
    }

    /**
     * Sets the value of the lfAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLfAmnt(BigDecimal value) {
        this.lfAmnt = value;
    }

    /**
     * Gets the value of the losUnqCod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLosUnqCod() {
        return losUnqCod;
    }

    /**
     * Sets the value of the losUnqCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLosUnqCod(Long value) {
        this.losUnqCod = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getMdcCmpFldDtlCod() {
        return mdcCmpFldDtlCod;
    }

    /**
     * Sets the value of the mdcCmpFldDtlCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMdcCmpFldDtlCod(Integer value) {
        this.mdcCmpFldDtlCod = value;
    }

    /**
     * Gets the value of the mftAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMftAmnt() {
        return mftAmnt;
    }

    /**
     * Sets the value of the mftAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMftAmnt(BigDecimal value) {
        this.mftAmnt = value;
    }

    /**
     * Gets the value of the othCmpFldDtlCod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOthCmpFldDtlCod() {
        return othCmpFldDtlCod;
    }

    /**
     * Sets the value of the othCmpFldDtlCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOthCmpFldDtlCod(Integer value) {
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
     * Gets the value of the rsvAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRsvAmnt() {
        return rsvAmnt;
    }

    /**
     * Sets the value of the rsvAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRsvAmnt(BigDecimal value) {
        this.rsvAmnt = value;
    }

    /**
     * Gets the value of the rtrAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtrAmnt() {
        return rtrAmnt;
    }

    /**
     * Sets the value of the rtrAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRtrAmnt(BigDecimal value) {
        this.rtrAmnt = value;
    }

}
