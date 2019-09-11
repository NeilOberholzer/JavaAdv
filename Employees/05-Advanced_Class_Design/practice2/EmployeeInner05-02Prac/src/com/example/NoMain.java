package com.example;

/**
 *
 * @author Neil
 */
public class NoMain {
    public static void main(String[] args) {
        NoEmployee jane = new NoEmployee("Jane Doe", "Manager", "HR", 65_000);
        NoEmployee john = new NoEmployee("John Doe", "Staff", "HR", 55_000);
        
        System.out.println("Jane's witholding: " + jane.getWithholding());
        System.out.println("John's bonus " + john.getBonus());
    }
}
