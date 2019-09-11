package com.example;

import com.example.domain.NoEmployee;
/**
 *
 * @author Neil
 */
public class NoEmployeeTest {
    public static void main(String[] args) {
        NoEmployee employee101 = new NoEmployee();
        
        employee101.setEmployeeID(101);
        employee101.setEmployeeName("Jane Smith");
        employee101.setEmployeeSSN("012-34-5678");
        employee101.setEmployeeSalary(120_345.27);
        
        NoEmployee employee102 = new NoEmployee();
        
        employee102.setEmployeeID(102);
        employee102.setEmployeeName("Shane Pitout");
        employee102.setEmployeeSSN("098-76-5432");
        employee102.setEmployeeSalary(210_445.19);
        
        NoEmployee employee103 = new NoEmployee();
        
        employee103.setEmployeeID(103);
        employee103.setEmployeeName("Leander Barns");
        employee103.setEmployeeSSN("034-12-7856");
        employee103.setEmployeeSalary(150_678.89);
        
        System.out.println("Eployee ID: " + employee101.getEmployeeID() +
                "\nEmployee name: " + employee101.getEmployeeName() +
                "\nEmployee SSN: " + employee101.getEmployeeSSN() +
                "\nEmployee salary: $" + employee101.getEmployeeSalary());
        
        System.out.println("\n=====================\n");
        
        System.out.println("Eployee ID: " + employee102.getEmployeeID() +
                "\nEmployee name: " + employee102.getEmployeeName() +
                "\nEmployee SSN: " + employee102.getEmployeeSSN() +
                "\nEmployee salary: $" + employee102.getEmployeeSalary());
        
        System.out.println("\n=====================\n");
        
        System.out.println("Eployee ID: " + employee103.getEmployeeID() +
                "\nEmployee name: " + employee103.getEmployeeName() +
                "\nEmployee SSN: " + employee103.getEmployeeSSN() +
                "\nEmployee salary: $" + employee103.getEmployeeSalary());
    }
}
