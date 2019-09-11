package com.example.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.Optional;
import java.util.Comparator;

/**
 *
 * @author oracle
 */
public class NoRadioHutTest {
    
    public static void main(String[] args) {

        List<NoSalesTxn> tList = NoSalesTxn.createTxnList();
        Consumer<NoSalesTxn> radioReport = 
          t -> System.out.printf("ID: " + t.getTxnId() + "  Seller: " + t.getSalesPerson() 
          + "-- Buyer: " + t.getBuyerName() + " -- State: " 
          + t.getState() + " -- Amt: $%,9.0f%n", t.getTransactionTotal());
        
        // Print out Radio Hut Transactions
        System.out.println("=== Radio Hut Transactions ===");
        tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .forEach(radioReport);

        
        // Print out the total number of transactions
        System.out.print("Total Transactions: ");
        long tCount = tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .count();
        System.out.println(tCount);
        
        // Print largest transaction
        System.out.println("=== Radio Hut Largest ===");
        Optional<NoSalesTxn> tLarger = tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .max(Comparator.comparing(NoSalesTxn :: getTransactionTotal));
            if(tLarger.isPresent()){ radioReport.accept(tLarger.get());}
        
        
        // Print smallest transaction
        System.out.println("=== Radio Hut Smallest ===");
        Optional<NoSalesTxn> tSmall = tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .min(Comparator.comparing(NoSalesTxn :: getTransactionTotal));
            if(tSmall.isPresent()){ radioReport.accept(tSmall.get());}
        
        
        
    }
}
