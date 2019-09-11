package com.example;

public class NoCustomer {

    private String firstName;
    private String lastName;
    private NoAccount[] accounts;
    private int numberOfAccounts;

    public NoCustomer(String f, String l) {
        firstName = f;
        lastName = l;
        // initialize accounts array
        accounts = new NoAccount[10];
        numberOfAccounts = 0;
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