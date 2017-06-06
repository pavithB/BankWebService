
package bankemployee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emp_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emp_PassWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emp_Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emp_UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", propOrder = {
    "empName",
    "empPassWord",
    "empPosition",
    "empUserName"
})
public class Employee {

    @XmlElement(name = "emp_Name")
    protected String empName;
    @XmlElement(name = "emp_PassWord")
    protected String empPassWord;
    @XmlElement(name = "emp_Position")
    protected String empPosition;
    @XmlElement(name = "emp_UserName")
    protected String empUserName;

    /**
     * Gets the value of the empName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Sets the value of the empName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpName(String value) {
        this.empName = value;
    }

    /**
     * Gets the value of the empPassWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpPassWord() {
        return empPassWord;
    }

    /**
     * Sets the value of the empPassWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpPassWord(String value) {
        this.empPassWord = value;
    }

    /**
     * Gets the value of the empPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpPosition() {
        return empPosition;
    }

    /**
     * Sets the value of the empPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpPosition(String value) {
        this.empPosition = value;
    }

    /**
     * Gets the value of the empUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpUserName() {
        return empUserName;
    }

    /**
     * Sets the value of the empUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpUserName(String value) {
        this.empUserName = value;
    }

}
