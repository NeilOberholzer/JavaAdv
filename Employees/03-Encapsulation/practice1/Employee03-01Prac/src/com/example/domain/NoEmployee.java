package com.example.domain;

import java.text.NumberFormat;

public class NoEmployee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public NoEmployee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals(null)) {
            this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }
    
    public void raiseSalary(double increase){
        this.salary += Math.abs(increase);
    }
    
    public void printEmloyee() {
        System.out.println("Eployee ID: " + getEmpId() +
                            "\nEmployee name: " + getName() +
                            "\nEmployee SSN: " + getSsn() +
                            "\nEmployee salary: " + NumberFormat.getCurrencyInstance().format((double)getSalary()));
    }
}