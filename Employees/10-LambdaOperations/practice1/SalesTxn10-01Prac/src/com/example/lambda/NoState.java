package com.example.lambda;

/**
 *
 * @author oracle
 */
public enum NoState {    
    CA("CA"),
    CO("CO"),
    MA("MA");
    
    private final String str;
    
    NoState(String stateStr){
        this.str = stateStr;
    }
    
    public String getStr(){
        return str;
    }        
   
}
