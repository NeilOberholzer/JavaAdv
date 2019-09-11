package com.example;

import com.example.domain.NoEmployee;
import com.example.domain.NoEngineer;

import java.text.NumberFormat;

public class NoEmployeeTest {

    public static void main(String[] args) {

        // Create the classes as per the practice
        NoEngineer eng = new NoEngineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        NoEmployee emp = new NoEmployee(13, "Lionel Power", "099-90-6789", 67_990.90);
        NoEngineer obj = new NoEngineer(102, "Robert Stock", "012-54-7812", 220_345.27);

        eng.engineerMethod();
        printEmployee(obj);

        NoEngineer engobj = new NoEngineer(1, "Brenda Wills", "013-78-5678", 221_500.00);
        printEmployee(engobj);

        //String s = (String) emp;

    }

    
    public static void printEmployee(NoEmployee emp) {
        System.out.println(); // Print a blank line as a separator
        // Print out the data in this NoEmployee object
        System.out.println("Employee id:         " + emp.getEmpId());
        System.out.println("Employee name:       " + emp.getName());
        System.out.println("Employee Soc Sec #:  " + emp.getSsn());
        System.out.println("Employee salary:     " + NumberFormat.getCurrencyInstance().format((double) emp.getSalary()));
    }
}
