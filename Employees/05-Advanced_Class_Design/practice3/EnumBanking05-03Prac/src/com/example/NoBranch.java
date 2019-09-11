package com.example;

/**
 *
 * @author Neil
 */
public enum NoBranch {
    LA("Basic"), BOSTON("Loan"),
    BANGALORE("Full"), MUMBAI("Full");
    
    String serviceLevel;
    
    private NoBranch(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }
}
