package com.example;

public class NoBank implements NoBankOperations{

    private NoCustomer[] customers;
    private int numberOfCustomers;

    public NoBank() {
        customers = new NoCustomer[10];
        numberOfCustomers = 0;
    }

    @Override
    public void addCustomer(String f, String l,NoBranch b) {
        int i = numberOfCustomers++;
        customers[i] = new NoCustomer(f, l,b);
    }

    @Override
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    @Override
    public NoCustomer getCustomer(int customerIndex) {
        return customers[customerIndex];
    }
}