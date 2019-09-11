package com.example.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 *
 * @author Neil
 */
public class NoNetworkClientCallable implements Callable<NoRequestResponse>{
    NoRequestResponse req;

    private final NoRequestResponse lookup;
    
        public NoNetworkClientCallable(NoRequestResponse lookup){
            this.lookup = lookup;
        }

    @Override
    public NoRequestResponse call() throws Exception {
        try (Socket sock = new Socket(lookup.host, lookup.port);
                Scanner scanner = new Scanner(sock.getInputStream())){
            lookup.response = scanner.next();
            return lookup;
        }
    }
}