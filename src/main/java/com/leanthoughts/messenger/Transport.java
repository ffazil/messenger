package com.leanthoughts.messenger;

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

    public void push(Message message){
        /**
         * [1] Implement logic to open a URL connection.
         * [2] Get parameters and set as GET param list
         * [3] Invoke
         * [4] If a negative response is received retry.
         */
        System.out.println(this.wire.toString());
        System.out.println(message.toString());
    }
}
