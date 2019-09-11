package com.example;

public final class NoPeerSingleton {

    private static final String[] hostNames = new String[5];
    private static final NoPeerSingleton instance = new NoPeerSingleton();

    static {
        // Read from File
        hostNames[0] = "192.168.1.2";
        hostNames[1] = "192.168.1.4";
        hostNames[2] = "192.168.2.3";
        hostNames[3] = "192.168.2.5";
        hostNames[4] = "192.168.2.14";
    }

    public static NoPeerSingleton getInstance(){
        return instance;
    }
    
    private NoPeerSingleton() {
    }
    

    public String[] getHostNames() {
        return hostNames;
    }
}
