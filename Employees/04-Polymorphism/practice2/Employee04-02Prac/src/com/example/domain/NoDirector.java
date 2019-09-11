package com.example.domain;

public class NoDirector extends NoManager {

    private double budget;

    public NoDirector(int empId, String name, String ssn, double salary, String department, double budget) {
        super(empId, name, ssn, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}