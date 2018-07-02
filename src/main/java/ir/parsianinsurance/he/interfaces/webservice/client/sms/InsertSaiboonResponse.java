
package ir.parsianinsurance.he.interfaces.webservice.client.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Insert_SaiboonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "insertSaiboonResult"
})
@XmlRootElement(name = "Insert_SaiboonResponse")
public class InsertSaiboonResponse {

    @XmlElement(name = "Insert_SaiboonResult")
    protected String insertSaiboonResult;

    /**
     * Gets the value of the insertSaiboonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertSaiboonResult() {
        return insertSaiboonResult;
    }

    /**
     * Sets the value of the insertSaiboonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertSaiboonResult(String value) {
        this.insertSaiboonResult = value;
    }

}
