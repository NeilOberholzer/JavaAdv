package com.example.lambda;

import java.util.List;

/**
 * @author Oracle
 * Streams and filters
 */
public class NoRoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<NoEmployee> pl = NoEmployee.createShortList();
    NoRoboMail01 robo = new NoRoboMail01();

   
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Male Eng Under 65");
    
    // Mail mail, Eng employees < 65
    pl.stream()
            .filter(p -> p.getAge() < 65 && p.getDept().equals("Eng") && p.getGender().equals(NoGender.MALE))
            .forEach(p -> robo.roboMail(p));
  }
}
