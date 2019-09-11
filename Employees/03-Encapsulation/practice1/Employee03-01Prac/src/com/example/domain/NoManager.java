package com.example.domain;

/**
 *
 * @author Neil
 */
public class NoManager extends NoEmployee {
    private String deptName;
    
    public String getDeptName() {
        return deptName;
    }
    
    public NoManager (int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }
}
