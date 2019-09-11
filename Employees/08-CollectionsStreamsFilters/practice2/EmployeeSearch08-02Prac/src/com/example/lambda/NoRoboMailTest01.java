package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Oracle
 * Streams and filters
 */
public class NoRoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<NoEmployee> pl = NoEmployee.createShortList();
    NoRoboMail01 robo = new NoRoboMail01();    
    
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Sales Execs");
    
    // roboMail Sales Executives
    pl.stream()
        .filter(p -> p.getRole().equals(NoRole.EXECUTIVE)&& p.getDept().equals("Sales"))
            .forEach(p -> robo.roboMail(p));
  }
}
