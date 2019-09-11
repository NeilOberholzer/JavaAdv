package com.example;

public class NoMain {

    public static void main(String[] args) {
        NoBankOperations bank = new NoBank();
        initializeCustomers(bank);

        // run the customer report
        bank.generateReport();
    }

    private static void initializeCustomers(NoBankOperations bank) {
        NoCustomer customer;
        // Create several customers and their accounts
        bank.addCustomer("Will", "Smith",NoBranch.LA);
        customer = bank.getCustomer(0);
        customer.addAccount(new NoSavingsAccount(500.00));

        bank.addCustomer("Bradley", "Cooper", NoBranch.Boston);
        customer = bank.getCustomer(1);
        NoSavingsAccount sack = new NoSavingsAccount(500.00);
        customer.addAccount(sack);
        sack.deposit(500);

        bank.addCustomer("Jane", "Simms", NoBranch.Mumbai);
        customer = bank.getCustomer(2);
        customer.addAccount(new NoCheckingAccount(200.00, 400.00));

        bank.addCustomer("Owen", "Bryant", NoBranch.Bangalore);
        customer = bank.getCustomer(3);
        customer.addAccount(new NoCheckingAccount(200.00));

        bank.addCustomer("Tim", "Soley", NoBranch.LA);
        customer = bank.getCustomer(4);
        customer.addAccount(new NoCheckingAccount(200.00));

        bank.addCustomer("Maria", "Soley",NoBranch.Bangalore);
        customer = bank.getCustomer(5);
        NoCheckingAccount chkAcct = new NoCheckingAccount(100.00);

        customer.addAccount(chkAcct);

        if (chkAcct.withdraw(900.00)) {
            customer.addAccount(chkAcct);
            System.out.print(" withdraw is successful" + chkAcct.getBalance());
        }

    }
}
