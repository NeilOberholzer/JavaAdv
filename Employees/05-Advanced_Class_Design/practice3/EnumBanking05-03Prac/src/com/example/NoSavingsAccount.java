

package com.example;


public class NoSavingsAccount extends NoAccount{
     Double rateofinterest=0.06;

    public NoSavingsAccount(double balance) {
        super(balance);
    }

    
    
 
    

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance ) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    
     @Override
     public void  deposit(double amount) {
       balance += amount;
       balance +=balance * rateofinterest;
       
        }
    
    @Override
    public String getDescription() {
        return "Savings Account";
    }
    
}
