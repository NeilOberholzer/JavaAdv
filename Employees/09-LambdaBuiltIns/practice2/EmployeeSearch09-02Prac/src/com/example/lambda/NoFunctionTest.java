package com.example.lambda;

import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author oracle
 */
public class NoFunctionTest {
  
  public static void main(String[] args) {
    
    List<NoEmployee> eList = NoEmployee.createShortList();
    NoEmployee first = eList.get(0);
    
    ToDoubleFunction<NoEmployee> eFunc = e -> e.getSalary() * NoBonus.byRole(e.getRole()); // Write your function lambda here
      
    System.out.println("=== First Employee Bonus");
    first.printSummary();
    System.out.println("Bonus: " + eFunc.applyAsDouble(first)); // Print the result here
    
  }
}
