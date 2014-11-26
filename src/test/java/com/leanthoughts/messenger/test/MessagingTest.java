package com.leanthoughts.messenger.test;

import com.leanthoughts.messenger.Aggregator;
import com.leanthoughts.messenger.Envelope;
import com.leanthoughts.messenger.Messenger;
import com.leanthoughts.messenger.MobileNumber;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author FFL
 * @since 21-11-2014
 * @version 0.1
 *
 * Test cases to send messages.
 */
public class MessagingTest {



    /**
     * Test case to send a text message.
     * @throws MalformedURLException
     */
    @Test
    public void sendTextMessage() throws Exception {
        Messenger messenger = new Messenger.Default()
                .using(new Aggregator(new URL("http://www.smsalertbox.com/api/sms.php"), "666168616466617a696c736d73", "5471e920c22f3")
        );

        messenger.send(
                new Envelope.Text()
                        .sender(new MobileNumber("+919686046179"))
                        .recipient(new MobileNumber("+918971877369")) //plural method available
                        .recipient(new MobileNumber("+919986050253"))
                        .subject("New Order")
                        .body("order+details")
        );
    }
}
