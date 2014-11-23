package com.leanthoughts.messenger;

import java.io.IOException;
import java.net.URL;

/**
 * @author FFL
 * @since 21-11-2014
 * @version 0.1
 *
 * Wire represents the medium of Transport.
 */
public interface Wire {
    Transport connect() throws IOException;
    public URL getURL();
    public String getUsername();
    public String getPassword();

    public String toString();
}
