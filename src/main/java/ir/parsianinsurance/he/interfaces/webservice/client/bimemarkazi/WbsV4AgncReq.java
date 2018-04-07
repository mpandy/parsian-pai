
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for WbsV4AgncReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4AgncReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adrs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgncFldTypCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BgnDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrstNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrntDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LstNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapAgncCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapBrnhCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MngNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NtnlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrvnCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SngDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SttDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4AgncReq", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "adrs",
    "agncFldTypCod",
    "bgnDte",
    "expDte",
    "frstNam",
    "grntDte",
    "lstNam",
    "mapAgncCod",
    "mapBrnhCod",
    "mbl",
    "mngNam",
    "ntnlId",
    "prvnCod",
    "sngDte",
    "sttDte",
    "tel"
})
public class WbsV4AgncReq {

    @XmlElementRef(name = "Adrs", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adrs;
    @XmlElement(name = "AgncFldTypCod")
    protected Integer agncFldTypCod;
    @XmlElementRef(name = "BgnDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bgnDte;
    @XmlElementRef(name = "ExpDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expDte;
    @XmlElementRef(name = "FrstNam", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frstNam;
    @XmlElementRef(name = "GrntDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grntDte;
    @XmlElementRef(name = "LstNam", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lstNam;
    @XmlElementRef(name = "MapAgncCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapAgncCod;
    @XmlElementRef(name = "MapBrnhCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapBrnhCod;
    @XmlElementRef(name = "Mbl", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mbl;
    @XmlElementRef(name = "MngNam", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mngNam;
    @XmlElementRef(name = "NtnlId", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ntnlId;
    @XmlElement(name = "PrvnCod")
    protected Integer prvnCod;
    @XmlElementRef(name = "SngDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sngDte;
    @XmlElementRef(name = "SttDte", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sttDte;
    @XmlElementRef(name = "Tel", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tel;

    /**
     * Gets the value of the adrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrs() {
        return adrs;
    }

    /**
     * Sets the value of the adrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrs(JAXBElement<String> value) {
        this.adrs = value;
    }

    /**
     * Gets the value of the agncFldTypCod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgncFldTypCod() {
        return agncFldTypCod;
    }

    /**
     * Sets the value of the agncFldTypCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgncFldTypCod(Integer value) {
        this.agncFldTypCod = value;
    }

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
     * Gets the value of the expDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpDte() {
        return expDte;
    }

    /**
     * Sets the value of the expDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpDte(JAXBElement<String> value) {
        this.expDte = value;
    }

    /**
     * Gets the value of the frstNam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrstNam() {
        return frstNam;
    }

    /**
     * Sets the value of the frstNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrstNam(JAXBElement<String> value) {
        this.frstNam = value;
    }

    /**
     * Gets the value of the grntDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrntDte() {
        return grntDte;
    }

    /**
     * Sets the value of the grntDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrntDte(JAXBElement<String> value) {
        this.grntDte = value;
    }

    /**
     * Gets the value of the lstNam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLstNam() {
        return lstNam;
    }

    /**
     * Sets the value of the lstNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLstNam(JAXBElement<String> value) {
        this.lstNam = value;
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
     * Gets the value of the mngNam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMngNam() {
        return mngNam;
    }

    /**
     * Sets the value of the mngNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMngNam(JAXBElement<String> value) {
        this.mngNam = value;
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
     * Gets the value of the prvnCod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrvnCod() {
        return prvnCod;
    }

    /**
     * Sets the value of the prvnCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrvnCod(Integer value) {
        this.prvnCod = value;
    }

    /**
     * Gets the value of the sngDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSngDte() {
        return sngDte;
    }

    /**
     * Sets the value of the sngDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSngDte(JAXBElement<String> value) {
        this.sngDte = value;
    }

    /**
     * Gets the value of the sttDte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSttDte() {
        return sttDte;
    }

    /**
     * Sets the value of the sttDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSttDte(JAXBElement<String> value) {
        this.sttDte = value;
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

}
