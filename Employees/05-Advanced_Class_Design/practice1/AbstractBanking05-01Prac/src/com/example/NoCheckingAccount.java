package com.example;

/**
 *
 * @author Neil
 */
public class NoCheckingAccount extends NoAccount {
    private final double overDraftLimit;
    
    public NoCheckingAccount(double balance, double overDraftLimit){
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }
    
    public NoCheckingAccount(double balance){
        this(balance, 0);
    }
    
    @Override
    public String getDescription() {
        return "Checking Account";
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
}
