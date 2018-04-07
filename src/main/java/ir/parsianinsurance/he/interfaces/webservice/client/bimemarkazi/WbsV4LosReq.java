
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for WbsV4LosReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4LosReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CmpDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocLosUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Exp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LosRcv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LosRcvNtnlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapAgncCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapBrnhCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapCorTypCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapCurCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PayDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rtn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RtnExp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RtnRcy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4LosReq", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "amnt",
    "cmpDocNo",
    "docLosUnqCod",
    "exp",
    "losRcv",
    "losRcvNtnlId",
    "mapAgncCod",
    "mapBrnhCod",
    "mapCorTypCod",
    "mapCurCod",
    "mapFldDtlCod",
    "payAmnt",
    "payDte",
    "rcy",
    "rtn",
    "rtnExp",
    "rtnRcy"
})
public class WbsV4LosReq {

    @XmlElement(name = "Amnt")
    protected BigDecimal amnt;
    @XmlElementRef(name = "CmpDocNo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpDocNo;
    @XmlElement(name = "DocLosUnqCod")
    protected Long docLosUnqCod;
    @XmlElement(name = "Exp")
    protected BigDecimal exp;
    @XmlElementRef(name = "LosRcv", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> losRcv;
    @XmlElementRef(name = "LosRcvNtnlId", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> losRcvNtnlId;
    @XmlElementRef(name = "MapAgncCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapAgncCod;
    @XmlElementRef(name = "MapBrnhCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapBrnhCod;
    @XmlElementRef(name = "MapCorTypCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapCorTypCod;
    @XmlElementRef(name = "MapCurCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapCurCod;
    @XmlElementRef(name = "MapFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapFldDtlCod;
    @XmlElement(name = "PayAmnt")
    protected BigDecimal payAmnt;
    @XmlElementRef(name = "PayDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payDte;
    @XmlElement(name = "Rcy")
    protected BigDecimal rcy;
    @XmlElement(name = "Rtn")
    protected BigDecimal rtn;
    @XmlElement(name = "RtnExp")
    protected BigDecimal rtnExp;
    @XmlElement(name = "RtnRcy")
    protected BigDecimal rtnRcy;

    /**
     * Gets the value of the amnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmnt() {
        return amnt;
    }

    /**
     * Sets the value of the amnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmnt(BigDecimal value) {
        this.amnt = value;
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
     * Gets the value of the exp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExp() {
        return exp;
    }

    /**
     * Sets the value of the exp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExp(BigDecimal value) {
        this.exp = value;
    }

    /**
     * Gets the value of the losRcv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLosRcv() {
        return losRcv;
    }

    /**
     * Sets the value of the losRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLosRcv(JAXBElement<String> value) {
        this.losRcv = value;
    }

    /**
     * Gets the value of the losRcvNtnlId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLosRcvNtnlId() {
        return losRcvNtnlId;
    }

    /**
     * Sets the value of the losRcvNtnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLosRcvNtnlId(JAXBElement<String> value) {
        this.losRcvNtnlId = value;
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
     * Gets the value of the payAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayAmnt() {
        return payAmnt;
    }

    /**
     * Sets the value of the payAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayAmnt(BigDecimal value) {
        this.payAmnt = value;
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
     * Gets the value of the rcy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRcy() {
        return rcy;
    }

    /**
     * Sets the value of the rcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRcy(BigDecimal value) {
        this.rcy = value;
    }

    /**
     * Gets the value of the rtn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtn() {
        return rtn;
    }

    /**
     * Sets the value of the rtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRtn(BigDecimal value) {
        this.rtn = value;
    }

    /**
     * Gets the value of the rtnExp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtnExp() {
        return rtnExp;
    }

    /**
     * Sets the value of the rtnExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRtnExp(BigDecimal value) {
        this.rtnExp = value;
    }

    /**
     * Gets the value of the rtnRcy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtnRcy() {
        return rtnRcy;
    }

    /**
     * Sets the value of the rtnRcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRtnRcy(BigDecimal value) {
        this.rtnRcy = value;
    }

}
