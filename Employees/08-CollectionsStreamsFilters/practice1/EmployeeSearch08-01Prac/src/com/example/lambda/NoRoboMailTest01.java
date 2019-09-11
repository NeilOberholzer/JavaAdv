package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Oracle
 * Reuse lambda expressions
 */
public class NoRoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<NoEmployee> pl = NoEmployee.createShortList();
    NoRoboMail01 robo = new NoRoboMail01();

    Predicate<NoEmployee> salesExecutives = 
      p -> p.getRole().equals(NoRole.EXECUTIVE) 
        && p.getDept().equals("Sales");
    
    Predicate<NoEmployee> salesEmployeesOver50 = 
      p -> p.getAge() >= 50 && p.getDept().equals("Sales");
    
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Sales Execs ===");
//    robo.mail(pl, salesExecutives); // Convert to stream and forEach
    pl.stream().filter(salesExecutives).forEach(p -> robo.roboMail(p));
//    robo.text(pl, salesExecutives); // Convert to stream and forEach
    pl.stream().filter(salesExecutives).forEach(p -> robo.roboText(p));

    System.out.println("\n=== All Sales ===");
//    robo.mail(pl, salesEmployeesOver50); // Convert to stream and forEach
    pl.stream().filter(salesEmployeesOver50).forEach(p -> robo.roboMail(p));
//    robo.text(pl, salesEmployeesOver50); // Convert to stream and forEach  
    pl.stream().filter(salesEmployeesOver50).forEach(p -> robo.roboText(p));    
  }
}
