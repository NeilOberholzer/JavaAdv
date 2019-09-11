package com.example;

public class NoCustomerReport {

    private NoBank bank;

    public NoBank getBank() {
        return bank;
    }

    public void setBank(NoBank bank) {
        this.bank = bank;
    }

    public void generateReport() {

        // Print report header
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        // For each customer...
        for (int custIndex = 0; custIndex < bank.getNumOfCustomers(); custIndex++) {
            NoCustomer customer = bank.getCustomer(custIndex);

            // Print the customer's name
            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            // For each account for this customer...
            for (int acctIndex = 0; acctIndex < customer.getNumOfAccounts(); acctIndex++) {
                NoAccount account = customer.getAccount(acctIndex);

                // Print the current balance of the account
                System.out.println("    " + account);
            }
        }
    }
}
