package com.example;

public class NoMain {
  public static void main(String[] args) {
      NoPeerSingleton peerList01 = NoPeerSingleton.getInstance();
      
      NoPeerSingleton peerList02 = NoPeerSingleton.getInstance();
      
      for (String hostName : peerList01.getHostNames()) {
          System.out.println("Host name: " + hostName);
      }
      
      System.out.println("");
      
      for (String hostName : peerList02.getHostNames()) {
          System.out.println("Host name: " + hostName);
      }
  }  
}
