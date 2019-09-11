package com.example.lambda;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author oracle
 */
public class NoBuyer {

    private String name;
    private NoBuyerClass buyerClass;
    
    private NoBuyer(){
        super();
    }
    
    private NoBuyer(String name, NoBuyerClass buyerClass){
        this.name = name;
        this.buyerClass = buyerClass;
    }
    
    public static NoBuyer getInstance(String name, NoBuyerClass buyerClass){
        return new NoBuyer(name, buyerClass);
    }
    
    public String getName(){
        return name;
    }
    
    public NoBuyerClass getBuyerClass(){
        return buyerClass;
    }
    
    public static Map<String, NoBuyer> getBuyerMap(){
        Map<String, NoBuyer> buyerMap = new HashMap<>();
            
        // Create NoBuyer list
        buyerMap.put("Acme", NoBuyer.getInstance("Acme Electronics", NoBuyerClass.SILVER));
        buyerMap.put("BestDeals", NoBuyer.getInstance("Best Deals", NoBuyerClass.GOLD));
        buyerMap.put("GreatDeals", NoBuyer.getInstance("Great Deals", NoBuyerClass.BASIC));
        buyerMap.put("MomAndPops", NoBuyer.getInstance("Mom and Pops", NoBuyerClass.BASIC));
        buyerMap.put("RadioHut", NoBuyer.getInstance("Radio Hut", NoBuyerClass.PLATINUM));
        buyerMap.put("PriceCo", NoBuyer.getInstance("PriceCo", NoBuyerClass.SILVER));
        
        return buyerMap;
    }
}
