package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 * 
 */
public class NoRoboMail01 {
  
    
  public void roboMail(NoEmployee p){
    System.out.println("Emailing: " + p.getGivenName() 
      + " " + p.getSurName() + " age " + p.getAge() 
      + " at " + p.getEmail());
  }
  
  public void roboText(NoEmployee p) {
    System.out.println("Texting: " + p.getGivenName()
      + " " + p.getSurName() + " age " + p.getAge()
      + " at " + p.getPhone());
  }
}