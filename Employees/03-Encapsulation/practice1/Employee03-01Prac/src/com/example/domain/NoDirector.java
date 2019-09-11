package com.example.domain;

/**
 *
 * @author Neil
 */
public class NoDirector extends NoManager {
    private double budget;
    
    public NoDirector (int empId, String name, String ssn, double salary, String deptName, double budget) {
        super(empId, name, ssn, salary, deptName);
        this.budget = budget;
    }
}
