
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for UpdWbsV4DocLosReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdWbsV4DocLosReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AncDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CmpDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocLosUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FleDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LosEvl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LosEvlNtnlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapAgncCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapBrnhCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapCorTypCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OcrDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlcyUnqCod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdWbsV4DocLosReq", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "ancDte",
    "cmpDocNo",
    "docLosUnqCod",
    "fleDte",
    "losEvl",
    "losEvlNtnlId",
    "mapAgncCod",
    "mapBrnhCod",
    "mapCorTypCod",
    "mapFldDtlCod",
    "ocrDte",
    "plcyUnqCod"
})
public class UpdWbsV4DocLosReq {

    @XmlElementRef(name = "AncDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ancDte;
    @XmlElementRef(name = "CmpDocNo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpDocNo;
    @XmlElement(name = "DocLosUnqCod")
    protected Long docLosUnqCod;
    @XmlElementRef(name = "FleDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fleDte;
    @XmlElementRef(name = "LosEvl", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> losEvl;
    @XmlElementRef(name = "LosEvlNtnlId", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> losEvlNtnlId;
    @XmlElementRef(name = "MapAgncCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapAgncCod;
    @XmlElementRef(name = "MapBrnhCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapBrnhCod;
    @XmlElementRef(name = "MapCorTypCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapCorTypCod;
    @XmlElementRef(name = "MapFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapFldDtlCod;
    @XmlElementRef(name = "OcrDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ocrDte;
    @XmlElement(name = "PlcyUnqCod")
    protected BigDecimal plcyUnqCod;

    /**
     * Gets the value of the ancDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAncDte() {
        return ancDte;
    }

    /**
     * Sets the value of the ancDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAncDte(JAXBElement<String> value) {
        this.ancDte = value;
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
     * Gets the value of the fleDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFleDte() {
        return fleDte;
    }

    /**
     * Sets the value of the fleDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFleDte(JAXBElement<String> value) {
        this.fleDte = value;
    }

    /**
     * Gets the value of the losEvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLosEvl() {
        return losEvl;
    }

    /**
     * Sets the value of the losEvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLosEvl(JAXBElement<String> value) {
        this.losEvl = value;
    }

    /**
     * Gets the value of the losEvlNtnlId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLosEvlNtnlId() {
        return losEvlNtnlId;
    }

    /**
     * Sets the value of the losEvlNtnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLosEvlNtnlId(JAXBElement<String> value) {
        this.losEvlNtnlId = value;
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
     * Gets the value of the ocrDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOcrDte() {
        return ocrDte;
    }

    /**
     * Sets the value of the ocrDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOcrDte(JAXBElement<String> value) {
        this.ocrDte = value;
    }

    /**
     * Gets the value of the plcyUnqCod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlcyUnqCod() {
        return plcyUnqCod;
    }

    /**
     * Sets the value of the plcyUnqCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlcyUnqCod(BigDecimal value) {
        this.plcyUnqCod = value;
    }

}
