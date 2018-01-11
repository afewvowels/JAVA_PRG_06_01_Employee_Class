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
}
