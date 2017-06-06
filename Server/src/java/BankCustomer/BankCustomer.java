/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankCustomer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author admin
 */
@WebService(serviceName = "BankCustomer")
public class BankCustomer {
Connection connection;
Statement stmt;
  

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addCustomer")
    @Oneway
    public void addCustomer(@WebParam(name = "sql") String sql) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/customer";
        String userName = "root";
        String passWord = "";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver not found please install the driver");
        }
        try {
            connection = DriverManager.getConnection(url,userName,passWord);
        } catch (SQLException ex) {
            System.err.println("Not Connected to Database Please Start the Connection");
        }
        try
        {
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        }  
        catch (SQLException e){
            e.printStackTrace();
        } 
        finally{
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.err.println("Cannot Close Connection");
                }
            }
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAccounts")
    public ArrayList<Customer> getAccounts() {
        //TODO write your implementation code here:
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        

        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/customer";
        String userName = "root";
        String passWord = "";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver not found please install the driver");
        }
        try {
            connection = DriverManager.getConnection(url,userName,passWord);
        } catch (SQLException ex) {
            System.err.println("Not Connected to Database Please Start the Connection");
        }
        try
        {
            stmt = connection.createStatement();
            
        String sql = ("SELECT * FROM customer");
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
        String cus_Name = (rs.getString("cus_Name"));
        String cus_Mobile = (rs.getString("cus_Mobile"));
        String cus_Email = (rs.getString("Cus_Email"));
        String cus_Dob = (rs.getString("cus_Dob"));
        String cus_CardNo = (rs.getString("cus_CardNo"));
        String cus_Address = (rs.getString("cus_Address"));
        String cus_AccType = (rs.getString("cus_AccType"));
        String cus_AccSortCode = (rs.getString("cus_AccSortCode"));
        String cus_AccNo = (rs.getString("cus_AccNo"));
        String cus_AccBalanc = (rs.getString("cus_AccBalance"));
        
        
        
        Customer getCustomer = new Customer( cus_Name,  cus_Dob,  cus_Address,  cus_Mobile,  cus_Email,  cus_AccType,  cus_AccNo,  cus_AccSortCode,  cus_AccBalanc,  cus_CardNo);
        
        customerList.add(getCustomer);
        
        } 
        }  
        catch (SQLException e){
            e.printStackTrace();
        } 
        finally{
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.err.println("Cannot Close Connection");
                }
            }
        }
        return customerList;
    }
    
    
      /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteCustomer")
    @Oneway
    public void deleteCustomer(@WebParam(name = "sql") String sql) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/customer";
        String userName = "root";
        String passWord = "";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver not found please install the driver");
        }
        try {
            connection = DriverManager.getConnection(url,userName,passWord);
        } catch (SQLException ex) {
            System.err.println("Not Connected to Database Please Start the Connection");
        }
        try
        {
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        }  
        catch (SQLException e){
            e.printStackTrace();
        } 
        finally{
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.err.println("Cannot Close Connection");
                }
            }
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updateCustomer")
    @Oneway
    public void updateCustomer(@WebParam(name = "sql") String sql) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/customer";
        String userName = "root";
        String passWord = "";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver not found please install the driver");
        }
        try {
            connection = DriverManager.getConnection(url,userName,passWord);
        } catch (SQLException ex) {
            System.err.println("Not Connected to Database Please Start the Connection");
        }
        try
        {
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        }  
        catch (SQLException e){
            e.printStackTrace();
        } 
        finally{
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.err.println("Cannot Close Connection");
                }
            }
        }
    }
}
