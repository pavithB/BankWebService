
package bankcustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cus_AccBalanc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cus_AccNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cus_AccSortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cus_AccType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cus_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cus_CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cus_Dob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cus_Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cus_Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cus_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "cusAccBalanc",
    "cusAccNo",
    "cusAccSortCode",
    "cusAccType",
    "cusAddress",
    "cusCardNo",
    "cusDob",
    "cusEmail",
    "cusMobile",
    "cusName"
})
public class Customer {

    @XmlElement(name = "cus_AccBalanc")
    protected String cusAccBalanc;
    @XmlElement(name = "cus_AccNo")
    protected String cusAccNo;
    @XmlElement(name = "cus_AccSortCode")
    protected String cusAccSortCode;
    @XmlElement(name = "cus_AccType")
    protected String cusAccType;
    @XmlElement(name = "cus_Address")
    protected String cusAddress;
    @XmlElement(name = "cus_CardNo")
    protected String cusCardNo;
    @XmlElement(name = "cus_Dob")
    protected String cusDob;
    @XmlElement(name = "cus_Email")
    protected String cusEmail;
    @XmlElement(name = "cus_Mobile")
    protected String cusMobile;
    @XmlElement(name = "cus_Name")
    protected String cusName;

    /**
     * Gets the value of the cusAccBalanc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusAccBalanc() {
        return cusAccBalanc;
    }

    /**
     * Sets the value of the cusAccBalanc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusAccBalanc(String value) {
        this.cusAccBalanc = value;
    }

    /**
     * Gets the value of the cusAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusAccNo() {
        return cusAccNo;
    }

    /**
     * Sets the value of the cusAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusAccNo(String value) {
        this.cusAccNo = value;
    }

    /**
     * Gets the value of the cusAccSortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusAccSortCode() {
        return cusAccSortCode;
    }

    /**
     * Sets the value of the cusAccSortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusAccSortCode(String value) {
        this.cusAccSortCode = value;
    }

    /**
     * Gets the value of the cusAccType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusAccType() {
        return cusAccType;
    }

    /**
     * Sets the value of the cusAccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusAccType(String value) {
        this.cusAccType = value;
    }

    /**
     * Gets the value of the cusAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusAddress() {
        return cusAddress;
    }

    /**
     * Sets the value of the cusAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusAddress(String value) {
        this.cusAddress = value;
    }

    /**
     * Gets the value of the cusCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusCardNo() {
        return cusCardNo;
    }

    /**
     * Sets the value of the cusCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusCardNo(String value) {
        this.cusCardNo = value;
    }

    /**
     * Gets the value of the cusDob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusDob() {
        return cusDob;
    }

    /**
     * Sets the value of the cusDob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusDob(String value) {
        this.cusDob = value;
    }

    /**
     * Gets the value of the cusEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusEmail() {
        return cusEmail;
    }

    /**
     * Sets the value of the cusEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusEmail(String value) {
        this.cusEmail = value;
    }

    /**
     * Gets the value of the cusMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusMobile() {
        return cusMobile;
    }

    /**
     * Sets the value of the cusMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusMobile(String value) {
        this.cusMobile = value;
    }

    /**
     * Gets the value of the cusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusName() {
        return cusName;
    }

    /**
     * Sets the value of the cusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusName(String value) {
        this.cusName = value;
    }

}
