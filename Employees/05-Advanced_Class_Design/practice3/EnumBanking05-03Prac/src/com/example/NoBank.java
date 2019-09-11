package com.example;

public class NoBank {

    private NoCustomer[] customers;
    private int numberOfCustomers;

    public NoBank() {
        customers = new NoCustomer[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l, NoBranch b) {
        int i = numberOfCustomers++;
        customers[i] = new NoCustomer(f, l, b);
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public NoCustomer getCustomer(int customerIndex) {
        return customers[customerIndex];
    }
}