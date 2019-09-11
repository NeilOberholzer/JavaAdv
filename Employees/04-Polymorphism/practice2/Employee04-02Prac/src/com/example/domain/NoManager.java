package com.example.domain;

public class NoManager extends NoEmployee {
    private String deptName;
   

    public NoManager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
    public void managerMethod(){
}
}