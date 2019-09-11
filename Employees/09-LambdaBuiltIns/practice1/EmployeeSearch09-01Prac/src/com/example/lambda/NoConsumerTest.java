package com.example.lambda;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class NoConsumerTest {
  
  public static void main(String[] args) {
    
    List<NoEmployee> eList = NoEmployee.createShortList();
    NoEmployee first = eList.get(0);
    
    Consumer<NoEmployee> eCons = e -> System.out.println("Name: " + e.getSurName() + " Role: "
    + " Salary: " + e.getSalary()); // Write your consumer lambda here
    
    
    System.out.println("=== First Salary");
    // Call your consumer here
    eCons.accept(first);
  }
}
