package com.example.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class NoCollectTest {
    
    public static void main(String[] args) {

        List<NoSalesTxn> tList = NoSalesTxn.createTxnList();
        List<NoSalesTxn> rList;
        
        // Print out Transactions over $300k
        System.out.println("=== Transactions over $300k ===");
        rList = tList; // Replace with sorting stream and collect            
        
        rList.stream()
            .filter(t -> t.getTransactionTotal() > 300_000)
            .sorted(Comparator.comparing(NoSalesTxn :: getTransactionTotal))
            .forEach( t -> 
                System.out.printf(
                    "Id: " + t.getTxnId() + " Seller: " + t.getSalesPerson() + 
                    " Buyer: " + t.getBuyerName() +
                    " Amt: $%,9.2f%n", t.getTransactionTotal()
                )
            );
        
        
    }
}
