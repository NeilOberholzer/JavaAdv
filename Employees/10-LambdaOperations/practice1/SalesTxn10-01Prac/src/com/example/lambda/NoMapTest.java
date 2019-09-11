package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class NoMapTest {
    
    public static void main(String[] args) {

        List<NoSalesTxn> tList = NoSalesTxn.createTxnList();
   
        // Calculate sales tax for CA Transactions
        System.out.println("=== Widget Pro Sales Tax in CA ===");
        tList.stream()
                .filter(t -> t.getState().equals(NoState.CA))
                .filter(t ->t.getProduct().equals("Widget Pro"))
                .map(t -> t.getTransactionTotal() * NoTaxRate.byState(t.getState()))
                .forEach(amt -> System.out.printf("Txn tax: $%,9.2f%n", amt));
    }
}
