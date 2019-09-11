package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NoMain {

  public static void main(String[] args) {
    // Setup Executor
    ExecutorService es = Executors.newCachedThreadPool();
    
    // Submit Runnable
    es.submit(new NoCountRunnable(20, "A"));
    es.submit(new NoCountRunnable(20, "B"));
    es.submit(new NoCountRunnable(20, "C"));
    
    // Showndown ExectuorService
    es.shutdown();
  }
}
