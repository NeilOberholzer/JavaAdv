package com.example;

public interface NoAccountOperations {
    public double getBalance();
    
    public void deposit(double amount);
    
    public abstract boolean withdraw(double amount);
    
    public abstract String getDescription();
}
