
package bankcustomer;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankCustomer", targetNamespace = "http://BankCustomer/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankCustomer {


    /**
     * 
     * @param sql
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "addCustomer", targetNamespace = "http://BankCustomer/", className = "bankcustomer.AddCustomer")
    @Action(input = "http://BankCustomer/BankCustomer/addCustomer")
    public void addCustomer(
        @WebParam(name = "sql", targetNamespace = "")
        String sql);

    /**
     * 
     * @param sql
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "updateCustomer", targetNamespace = "http://BankCustomer/", className = "bankcustomer.UpdateCustomer")
    @Action(input = "http://BankCustomer/BankCustomer/updateCustomer")
    public void updateCustomer(
        @WebParam(name = "sql", targetNamespace = "")
        String sql);

    /**
     * 
     * @return
     *     returns java.util.List<bankcustomer.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccounts", targetNamespace = "http://BankCustomer/", className = "bankcustomer.GetAccounts")
    @ResponseWrapper(localName = "getAccountsResponse", targetNamespace = "http://BankCustomer/", className = "bankcustomer.GetAccountsResponse")
    @Action(input = "http://BankCustomer/BankCustomer/getAccountsRequest", output = "http://BankCustomer/BankCustomer/getAccountsResponse")
    public List<Customer> getAccounts();

    /**
     * 
     * @param sql
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "deleteCustomer", targetNamespace = "http://BankCustomer/", className = "bankcustomer.DeleteCustomer")
    @Action(input = "http://BankCustomer/BankCustomer/deleteCustomer")
    public void deleteCustomer(
        @WebParam(name = "sql", targetNamespace = "")
        String sql);

}
