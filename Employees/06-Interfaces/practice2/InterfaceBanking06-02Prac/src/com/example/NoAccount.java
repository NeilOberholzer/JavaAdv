package com.example;

public abstract class NoAccount implements NoAccountOperations{
    
    protected double balance;
    
    public NoAccount(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "Current balance is " + balance;
    }
}