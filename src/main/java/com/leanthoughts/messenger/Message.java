package com.leanthoughts.messenger;

/**
 * @author FFL
 * @since 21-11-2014
 * @version 0.1
 *
 * Message represents a message to be sent.
 */
public class Message {

    private String uid;
    private String pin;
    private String mobile;
    private String message;
    private String pushid;

    public Message(){

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPushid() {
        return pushid;
    }

    public void setPushid(String pushid) {
        this.pushid = pushid;
    }
}
