package com.example;

import com.example.domain.NoEmployee;
import com.example.domain.NoEngineer;
import com.example.domain.NoManager;
import com.example.domain.NoAdmin;
import com.example.domain.NoDirector;

public class NoEmployeeTest {

    public static void main(String[] args) {
        NoEngineer engineer = new NoEngineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        
        NoManager manager = new NoManager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        manager.raiseSalary(3_004.56);
        
        NoAdmin admin = new NoAdmin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        admin.raiseSalary(-1_006.33);
        
        NoDirector director = new NoDirector(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
        
        engineer.printEmloyee();
        System.out.println("\n===================\n");
        manager.printEmloyee();
        System.out.println("\n===================\n");
        admin.printEmloyee();
        System.out.println("\n===================\n");
        director.printEmloyee();
    }
}