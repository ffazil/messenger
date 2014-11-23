package com.leanthoughts.messenger;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author FFL
 * @since 21-11-2014
 * @version 0.1
 *
 * Envelope is a wrapper over a message.
 */
public interface Envelope {
    Message unwrap() throws IOException;

    /**
     * Implementation of Envelope for a text message.
     */
    final class Text implements Envelope{

        private Message message = new Message();
        private Set<MobileNumber> mobileNumbers = new HashSet<MobileNumber>(0);
        private String body;

        @Override
        public Message unwrap() throws IOException {
            return null;
        }

        public Text sender(MobileNumber mobileNumber){
            return this;
        }

        public Text recipient(MobileNumber mobileNumber){
            this.mobileNumbers.add(mobileNumber);
            return this;
        }

        public Text recipients(Set<MobileNumber> mobileNumbers){
            this.mobileNumbers.addAll(mobileNumbers);
            return this;
        }

        public Text subject(String subject){
            //TODO
            return this;
        }

        public Text body(String body){
            this.body = body;
            return this;
        }
    }
}
