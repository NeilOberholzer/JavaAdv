package com.example;

public class NoCountRunnable implements Runnable{
  
  final int count;
  final String threadName;
  
  // Setup Constructor to initialize variables
  public NoCountRunnable (int count, String name){
      this.count = count;
      this.threadName = name;
  }
  
  @Override
  public void run(){ 
    // Count with for loop
    for (int i = 1; i <= count; i++)
        System.out.println("Thread " + threadName + ": " + i);
  }
}
