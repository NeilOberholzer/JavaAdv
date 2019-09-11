package com.example.client;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class NoNetworkClientMain {

    public static void main(String[] args) {
//    String host = "localhost";
//        for (int port = 10000; port < 10010; port++) {
//            NoRequestResponse lookup = new NoRequestResponse(host, port);
//            try (Socket sock = new Socket(lookup.host, lookup.port);
//                    Scanner scanner = new Scanner(sock.getInputStream());) {
//                lookup.response = scanner.next();
//                System.out.println(lookup.host + ":" + lookup.port + " " + lookup.response);
//            } catch (NoSuchElementException | IOException ex) {
//                System.out.println("Error talking to " + host + ":" + port);
//            }
//        }
        
    ExecutorService es = Executors.newCachedThreadPool();
    
    Map<NoRequestResponse, Future<NoRequestResponse>> callables = new HashMap<>();
    
        String host = "localhost";
        for (int port = 10000; port < 10010; port++) {
            NoRequestResponse lookup = new NoRequestResponse(host, port);
            NoNetworkClientCallable callable = new NoNetworkClientCallable(lookup);
            Future<NoRequestResponse> future = es.submit(callable);
            callables.put(lookup, future);
        }
        
        es.shutdown();
        
        try {
            es.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            System.out.println("Stopped waiting early");
        }
        
        for (NoRequestResponse lookup : callables.keySet()) {
            Future<NoRequestResponse> future = callables.get(lookup);
            try {
                lookup = future.get();
                System.out.println(lookup.host + ":" + lookup.port + " " + lookup.response);
             } catch (ExecutionException | InterruptedException ex) {
                //This is why the callables Map exists
                //future.get() fails if the task failed
                System.out.println("Error talking to " + lookup.host + ":" + lookup.port);
            }
        }
    }
}