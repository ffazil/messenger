package com.leanthoughts.messenger;

import com.google.common.base.Joiner;

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
     **/
    final class Text implements Envelope{

        private Message message = new Message();
        private Set<MobileNumber> mobileNumbers = new HashSet<MobileNumber>(0);
        private String body;
        private int tempid;

        @Override
        public Message unwrap() throws IOException {
            message.setMessage(this.body);
            message.setMobile(getNumbersCS());
            message.setTempid(this.tempid);
            return message;
        }

        //public Text sender(MobileNumber mobileNumber){
        //    return this;
        //}

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

        public Text tempid(int tempid){
            this.tempid = tempid;
            return this;
        }

        public String getNumbersCS(){
            String result = Joiner.on(",").join(asNumberSet());
            return result;

        }

        public Set<String> asNumberSet(){
            Set<String> numbers = new HashSet<String>(0);
            for(MobileNumber mobileNumber : mobileNumbers){
                numbers.add(mobileNumber.getNumber());
            }
            return numbers;
        }
    }
}
