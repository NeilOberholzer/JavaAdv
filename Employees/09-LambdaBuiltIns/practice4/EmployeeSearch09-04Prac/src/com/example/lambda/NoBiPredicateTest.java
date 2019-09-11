package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author oracle
 */
public class NoBiPredicateTest {
  
  public static void main(String[] args) {
    
    List<NoEmployee> eList = NoEmployee.createShortList();
    NoEmployee first = eList.get(0);
    String searchState = "KS";
    
    BiPredicate<NoEmployee, String> eBiPred = (e, s) -> e.getState().equals(s); // Wrtie your BiPredicate here
      
    System.out.println("=== Print matching list");
    for(NoEmployee e:eList){
      if (true){// Use BiPredicate for test
        e.printSummary();
      }
    }
  }
}
