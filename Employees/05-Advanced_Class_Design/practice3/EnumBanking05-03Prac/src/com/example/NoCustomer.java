package com.example;

public class NoCustomer {

    private String firstName;
    private String lastName;
    private NoAccount[] accounts;
    private int numberOfAccounts;
    
    private NoBranch branch;

    public NoCustomer(String f, String l, NoBranch b) {
        firstName = f;
        lastName = l;
        // initialize accounts array
        accounts = new NoAccount[10];
        numberOfAccounts = 0;
        branch = b;
    }
    
    public NoBranch getBranch() {
        return branch;
    }
    
    public void setBranch (NoBranch branch) {
        this.branch = branch;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(NoAccount acct) {
        int i = numberOfAccounts++;
        accounts[i] = acct;
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }

    public NoAccount getAccount(int accountIndex) {
        return accounts[accountIndex];
    }
}