package com.example;

public class NoEmployeeTest {
    
    public static void main(String[] args) throws NoInvalidOperationException {
        NoEmployee e1 = new NoEmployee(0, "bob", "builder", 1250.50f);
        NoEmployeeImpl emp = new NoEmployeeImpl();
        emp.add(e1);
        NoEmployee e2 = new NoEmployee(1, "harry", "potter", 1250.50f);
        emp.add(e2);
        NoEmployee e3 = new NoEmployee(5, "harry", "potter", 1250.50f);
        emp.add(e3);
        NoEmployee[] allEmps = emp.getAllEmployees();
        for (NoEmployee employee : allEmps) {
            System.out.println(employee + "\n");
        }
        
      //emp.delete(7);
       
        
                }          
    
    
    
    }
