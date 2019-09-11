package com.example.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class NoJoinTest {
    
    public static void main(String[] args) {

        List<NoSalesTxn> tList = NoSalesTxn.createTxnList();
        
        // Print out a sorted list of unique buyer names
        System.out.println("=== Sorted Buyer's List ===");
        String result = tList.stream()
                .map(t -> t.getBuyerName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", ")); //Replace with your stream
        
        System.out.println("Buyer list: " + result);
            
        
        
        
    }
}
