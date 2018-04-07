
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for WbsV4PlcyMthReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4PlcyMthReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalcDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapFldDtlCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlcyUnqCod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreVal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Val" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="YrCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4PlcyMthReq", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "calcDte",
    "mapFldDtlCod",
    "plcyUnqCod",
    "preVal",
    "val",
    "yrCod"
})
public class WbsV4PlcyMthReq {

    @XmlElementRef(name = "CalcDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calcDte;
    @XmlElementRef(name = "MapFldDtlCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapFldDtlCod;
    @XmlElement(name = "PlcyUnqCod")
    protected Long plcyUnqCod;
    @XmlElement(name = "PreVal")
    protected BigDecimal preVal;
    @XmlElement(name = "Val")
    protected BigDecimal val;
    @XmlElement(name = "YrCod")
    protected Integer yrCod;

    /**
     * Gets the value of the calcDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalcDte() {
        return calcDte;
    }

    /**
     * Sets the value of the calcDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalcDte(JAXBElement<String> value) {
        this.calcDte = value;
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
     * Gets the value of the preVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreVal() {
        return preVal;
    }

    /**
     * Sets the value of the preVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreVal(BigDecimal value) {
        this.preVal = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVal(BigDecimal value) {
        this.val = value;
    }

    /**
     * Gets the value of the yrCod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYrCod() {
        return yrCod;
    }

    /**
     * Sets the value of the yrCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYrCod(Integer value) {
        this.yrCod = value;
    }

}
