package com.example.client;

import java.util.Objects;

public class NoRequestResponse {

    public String host; //request
    public int port; //request
    public String response; //response

    public NoRequestResponse(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NoRequestResponse) {
            NoRequestResponse lookup = (NoRequestResponse) obj;
            if (host.equals(lookup.host) && port == lookup.port) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.host);
        hash = 97 * hash + this.port;
        return hash;
    }
}