package com.example;


public class NoCheckingAccount extends NoAccount {
    
    private final double overDraftLimit;
    
public NoCheckingAccount(double balance) {
    this(balance, 0);
}
    
    public NoCheckingAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance + overDraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Checking Account";
    }
    
}