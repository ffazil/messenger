package com.leanthoughts.messenger;

import java.io.IOException;
import java.net.URL;

/**
 * @author FFL
 * @since 21-11-2014
 * @version 0.1
 *
 * Aggregator is an SMS API provider.
 */
public class Aggregator implements Wire{

    private final URL url;
    private final String username;
    private final String password;
    private final int route;
    private final String senderid;

    public Aggregator(URL url, String username, String password, int route, String senderid){
        this.url = url;
        this.username = username;
        this.password = password;
        this.route = route;
        this.senderid = senderid;
    }

    @Override
    public Transport connect() throws IOException {
        Transport transport = new Transport(this);
        return transport;
    }

    @Override
    public URL getURL() {
        return url;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
     public String getPassword() {
        return password;
    }

    @Override
    public int getRoute() {
        return route;
    }

    @Override
    public String getSenderid() { return senderid; }

    @Override
    public String toString() {
        return "Aggregator{" +
                "url=" + url +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", route='" + route + '\'' +
                ", senderid='" + senderid + '\'' +
                '}';
    }
}
