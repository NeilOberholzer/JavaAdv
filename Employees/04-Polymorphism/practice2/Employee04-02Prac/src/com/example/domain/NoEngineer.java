package com.example.domain;

public class NoEngineer extends NoEmployee {
   

    public NoEngineer(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }
    public void engineerMethod(){
           System.out.println("Method specific to Engineer class");
    }
}