package com.example;


import com.example.domain.NoAdmin;
import com.example.domain.NoDirector;
import com.example.domain.NoEmployee;
import com.example.domain.NoEngineer;
import com.example.domain.NoManager;
import com.example.bussiness.*;

public class NoEmployeeTest {
    public static void printEmployee(NoEmployee emp) {
        System.out.println(emp);
    }

    
    public static void printEmployee(NoEmployee emp, NoEmployeeStockPlan esp) {
        System.out.println("Employee type: " + emp.getClass().getSimpleName());
        printEmployee(emp);
        System.out.println("Stock Options: " + esp.grantStock(emp));
    }

    public static void main(String[] args) {
        

        // Create the classes as per the practice
        NoEngineer eng = new NoEngineer(101, "Jane Smith", "012-34-5678", 120_345.27);

        NoManager mgr = new NoManager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");

        NoAdmin adm = new NoAdmin(304, "Bill Munroe", "108-23-6509", 75_002.34);

        NoDirector dir = new NoDirector(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        NoEmployeeStockPlan esp = new NoEmployeeStockPlan();
        
        printEmployee(eng, esp);

        printEmployee(adm, esp);
        printEmployee(mgr, esp);
        printEmployee(dir, esp);

        System.out.println("\nTesting raiseSalary and setName on Manager:");
        mgr.setName("Barbara Johnson-Smythe");
        mgr.raiseSalary(10_000.00);
        printEmployee(mgr, esp);
    }
}
