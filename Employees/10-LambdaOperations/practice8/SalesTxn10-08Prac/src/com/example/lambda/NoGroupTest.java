package com.example.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class NoGroupTest {
    
    public static void main(String[] args) {

        List<NoSalesTxn> tList = NoSalesTxn.createTxnList();
        Map<String, List<NoSalesTxn>> tMap;
        
        // Print out transactions grouped by Buyer
        System.out.println("=== Transactions Grouped by Buyer ===");
        tMap = tList.stream()
                .collect(Collectors.groupingBy(NoSalesTxn :: getBuyerName));
        
        tMap.forEach((k,v) -> {
            System.out.println("\nBuyer: " + k);
            v.forEach(NoSalesTxn :: printSummary);
        });
    }
}
