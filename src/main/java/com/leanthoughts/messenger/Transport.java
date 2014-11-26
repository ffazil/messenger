package com.leanthoughts.messenger;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author FFL
 * @since 21-11-2014
 * @version 0.1
 *
 * Transport represents the action of movement of messenger.
 */
public class Transport {
    private Wire wire;
    private Message message;

    public Transport(Wire wire){
        this.wire = wire;
    }

    public void push(Message message) throws IOException {
        /**
         * [1] Implement logic to open a URL connection.
         * [2] Get parameters and set as GET param list
         * [3] Invoke
         * [4] If a negative response is received retry.
         */

        URL url = null;
        try {
            url = new URL(wire.getURL()+"?uid="+wire.getUsername()+"&pin="+wire.getPassword()+"&mobile="+message.getMobile()+"&message="+message.getMessage());

        } catch (Exception e) {
            e.printStackTrace();
        }
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        /*int httpResponse=con.getResponseCode();
        System.out.println(httpResponse);

        if(httpResponse!=200)
            System.out.println(httpResponse);//TODO wait and retry

        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String response = "";
        while (null != (response = br.readLine())) {
            System.out.println(response);
        }*/

    }
}
