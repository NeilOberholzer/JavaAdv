package com.example;

public class NoCustomer {

    private String firstName;
    private String lastName;
    private NoAccountOperations[] accounts;
    private int numberOfAccounts;
    private NoBranch branch;

    public NoCustomer(String f, String l,NoBranch b) {
        firstName = f;
        lastName = l;
        // initialize accounts array
        accounts = new NoAccountOperations[10];
        numberOfAccounts = 0;
        branch=b;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(NoAccountOperations acct) {
        int i = numberOfAccounts++;
        accounts[i] = acct;
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }

    public NoAccountOperations getAccount(int accountIndex) {
        return accounts[accountIndex];
    }
    
    public NoBranch getBranch() {
        return branch;
    }

    public void setBranch(NoBranch branch) {
        this.branch = branch;
    }

}