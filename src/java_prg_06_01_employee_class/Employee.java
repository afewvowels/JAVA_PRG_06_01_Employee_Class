/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_01_employee_class;

/**
 *
 * @author bluebackdev
 */
public class Employee {
    private String strName;
    private String strDepartment;
    private String strPosition;
    
    private int intIDNumber;
    
    /**
        Constructor
        @param name The employee's name.
        @param idNum The employee's ID Number.
        @param dept The employee's department.
        @param pos The employee's position.
     */
    
    public Employee(String name, int idNum, String dept, String pos) {
        strName = name;
        intIDNumber = idNum;
        strDepartment = dept;
        strPosition = pos;
    }
    
    /**
        Partial Constructor
        @param name The employee's name
        @param idnum The employee's ID Number.
     */
    
    public Employee(String name, int idnum) {
        strName = name;
        intIDNumber = idnum;
        strDepartment = "";
        strPosition = "";
    }
    
    /**
        No-arg Constructor
     */
    
    public Employee() {
        strName = "";
        intIDNumber = 0;
        strDepartment = "";
        strPosition = "";
    }
    
    /**
        The setName method sets the employee's name to the desired input.
     */
    public void setName(String name) {
        strName = name;
    }
        
    /**
        The getName method returns the employee's name.
     */
    public String getName() {
        return strName;
    }
        
    /**
        The setIDNum method sets the employee's ID number to the desired input.
     */
    public void setIDNum(int idNum) {
        intIDNumber = idNum;
    }
        
    /**
        The getIDNum method returns the employee's ID Number.
     */
    public int getIDNum() {
        return intIDNumber;
    }
        
    /**
        The setDepartment method sets the employee's department
        to the desired input.
     */
    public void setDepartment(String dept) {
        strDepartment = dept;
    }
        
    /**
        The getDepartment method returns the employee's department.
     */
    public String getDepartment() {
        return strDepartment;
    }
    
    /**
        The setPosition method sets the employee's position to the desired input.
     */
    public void setPosition(String pos) {
        strPosition = pos;
    }
        
    /**
        The getName method returns the employee's position.
     */
    public String getPosition() {
        return strPosition;
    }
}
