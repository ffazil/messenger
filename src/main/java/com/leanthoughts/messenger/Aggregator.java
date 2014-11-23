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

    public Aggregator(URL url, String username, String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public Transport connect() throws IOException {
        return null;
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
}
