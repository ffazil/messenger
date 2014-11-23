package com.leanthoughts.messenger;

/**
 * @author FFL
 * @since 21-11-2014
 * @version 0.1
 *
 * MobileNumber represents a recipients mobile number and it's validation.
 */
public class MobileNumber {

    private static final String pattern = "^([0]|\\+91)?\\d{10}";

    private String number = null;

    public MobileNumber(String number){
        boolean validated = validate(number);
        if(validated)
            this.number = number;
    }

    public String getNumber() {
        return number;
    }

    private boolean validate(String number) {
        return number.matches(pattern);
    }

}
