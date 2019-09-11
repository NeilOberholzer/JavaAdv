package com.example;

import java.util.ArrayList;
import java.util.List;

public class NoEmployeeImpl {

    // not thread-safe
    private static NoEmployee[] employeeArray = new NoEmployee[10];

    // package level access
    NoEmployeeImpl() {
    }

    public void add(NoEmployee emp) throws NoInvalidOperationException {
        if (employeeArray[emp.getId()] != null) {
            throw new NoInvalidOperationException("Error adding employee , employee id already exists " + emp.getId());
        }
        try {
            employeeArray[emp.getId()] = emp;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoInvalidOperationException("Error adding employee , id must be less than " + employeeArray.length);
        } 
    }

    public void delete(int id) throws NoInvalidOperationException {
        if (employeeArray[id] == null) {
            throw new NoInvalidOperationException("Error deleting employee, no such employee " + id);
        }
        try {
            employeeArray[id] = null;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoInvalidOperationException("Error deleting employee, id must be less than " + employeeArray.length);
        }
    }

    public NoEmployee findById(int id) throws NoInvalidOperationException {
        try {
            return employeeArray[id];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoInvalidOperationException("Error finding employee ", e);
        }
    }
    
    public NoEmployee[] getAllEmployees() {
        List<NoEmployee> emps = new ArrayList<>();
        // Iterate through the memory array and find NoEmployee objects
        for (NoEmployee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new NoEmployee[0]);
    }

}
