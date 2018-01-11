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
public class JAVA_PRG_06_01_Employee_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee Susan = new Employee();
        Employee Mark = new Employee();
        Employee Joy = new Employee();
        
        Susan.setName("Susan Meyers");
        Susan.setIDNum(47899);
        Susan.setDepartment("Accounting");
        Susan.setPosition("Vice President");
        
        Mark.setName("Mark Jones");
        Mark.setIDNum(39119);
        Mark.setDepartment("IT");
        Mark.setPosition("Programmer");
        
        Joy.setName("Joy Rogers");
        Joy.setIDNum(81774);
        Joy.setDepartment("Manufacturing");
        Joy.setPosition("Engineer");
        
        System.out.println(Susan.getName());
        System.out.println(Susan.getIDNum());
        System.out.println(Susan.getDepartment());
        System.out.println(Susan.getPosition());
        System.out.println("\n");
        
        System.out.println(Mark.getName());
        System.out.println(Mark.getIDNum());
        System.out.println(Mark.getDepartment());
        System.out.println(Mark.getPosition());
        System.out.println("\n");
        
        System.out.println(Joy.getName());
        System.out.println(Joy.getIDNum());
        System.out.println(Joy.getDepartment());
        System.out.println(Joy.getPosition());
        System.out.println("\n");
    }
    
}
