package com.example.domain;
/**
 *
 * @author Neil
 */
public class NoEmployee {
    public int EmployeeID;
    public String EmployeeName;
    public String EmployeeSSN;
    public double EmployeeSalary;
    
    public NoEmployee(){
        
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmployeeSSN() {
        return EmployeeSSN;
    }

    public void setEmployeeSSN(String EmployeeSSN) {
        this.EmployeeSSN = EmployeeSSN;
    }

    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(double EmployeeSalary) {
        this.EmployeeSalary = EmployeeSalary;
    }
}
