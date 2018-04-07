
package ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WbsV4PersonTypeReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbsV4PersonTypeReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CmpPrsnTypNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapPrsnTypCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrsnTypCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsV4PersonTypeReq", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "cmpPrsnTypNam",
    "mapPrsnTypCod",
    "prsnTypCod"
})
public class WbsV4PersonTypeReq {

    @XmlElementRef(name = "CmpPrsnTypNam", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpPrsnTypNam;
    @XmlElementRef(name = "MapPrsnTypCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapPrsnTypCod;
    @XmlElementRef(name = "PrsnTypCod", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prsnTypCod;

    /**
     * Gets the value of the cmpPrsnTypNam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpPrsnTypNam() {
        return cmpPrsnTypNam;
    }

    /**
     * Sets the value of the cmpPrsnTypNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpPrsnTypNam(JAXBElement<String> value) {
        this.cmpPrsnTypNam = value;
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
     * Gets the value of the prsnTypCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrsnTypCod() {
        return prsnTypCod;
    }

    /**
     * Sets the value of the prsnTypCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrsnTypCod(JAXBElement<Integer> value) {
        this.prsnTypCod = value;
    }

}
