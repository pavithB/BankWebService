/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankEmployee;


/**
 *
 * @author Pavith Buddhima
 */



public class Employee {
    
    
    
    private String emp_Name;
    private String emp_Position;
    private String emp_UserName;
    private String emp_PassWord;    
    
    

    public Employee(String emp_Name, String emp_Position, String emp_UserName, String emp_PassWord) {
        this.emp_Name = emp_Name;
        this.emp_Position = emp_Position;
        this.emp_UserName = emp_UserName;
        this.emp_PassWord = emp_PassWord;
    }
    
    
    
    
    

    public String getEmp_Name() {
        return emp_Name;
    }

    public String getEmp_Position() {
        return emp_Position;
    }

    public String getEmp_UserName() {
        return emp_UserName;
    }

    public String getEmp_PassWord() {
        return emp_PassWord;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public void setEmp_Position(String emp_Position) {
        this.emp_Position = emp_Position;
    }

    public void setEmp_UserName(String emp_UserName) {
        this.emp_UserName = emp_UserName;
    }

    public void setEmp_PassWord(String emp_PassWord) {
        this.emp_PassWord = emp_PassWord;
    }

   
    
    




    
    
            }