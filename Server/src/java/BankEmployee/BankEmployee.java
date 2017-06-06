/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankEmployee;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
@WebService(serviceName = "BankEmployee")
public class BankEmployee {
    Connection connection;
    Statement stmt;
    PreparedStatement statement ;
    ResultSet rs;
    /**
     * Web service operation
     */
    @WebMethod(operationName = "addEmployee")
    @Oneway
    public void addEmployee(@WebParam(name = "sql") String sql) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/employee";
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
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "uName") String uName, @WebParam(name = "pWord") String pWord) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/employee";
        String userName = "root";
        String passWord = "";
        String message = "";
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
        String sql = "select * from employee where emp_UserName=? and emp_PassWord=?";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, uName);
            statement.setString(2, pWord);
            rs = statement.executeQuery();
            if (rs.next()) {
                message = "Login Successfull!";
            } else {
                message = "Invalid Login! Please try again";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return message;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteEmployee")
    @Oneway
    public void deleteEmployee(@WebParam(name = "sql") String sql) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/employee";
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

//    /**
//     * Web service operation
//     */
//    @WebMethod(operationName = "updateEmployee")
//
//    public void updateEmployee(@WebParam(name = "empName") String empName, @WebParam(name = "empPosition") String empPosition, @WebParam(name = "empUName") String empUName, @WebParam(name = "empUPass") String empUPass, @WebParam(name = "empOldName") String empOldName) {
//
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//    }
//    
    
        /**
     * Web service operation
     */
    @WebMethod(operationName = "getAccounts")
    public ArrayList<Employee> getAccounts() {
        //TODO write your implementation code here:
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        

        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/employee";
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
            
        String sql = ("SELECT * FROM employee");
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()) {
        String emp_Name = (rs.getString("emp_Name"));
        String emp_Position = (rs.getString("emp_Position"));
        String emp_UserName = (rs.getString("emp_UserName"));
        String emp_PassWord = (rs.getString("emp_PassWord"));

        
        
        
        Employee getEmployee = new Employee( emp_Name,  emp_Position,  emp_UserName,  emp_PassWord);
        
        employeeList.add(getEmployee);
        
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
        return employeeList;
    }
    
}
