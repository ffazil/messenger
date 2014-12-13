package com.leanthoughts.messenger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author FFL
 * @since 21-11-2014
 * @version 0.1
 *
 * MobileNumber represents a recipients mobile number and it's validation.
 */
public class MobileNumber {

    private String number = null;

    public MobileNumber(String number) throws Exception{
        boolean validated = validate(number);
        if(validated) {
            if (number.length() > 10) {
                String tempnum = number.substring(number.length() - 10);
                number = tempnum;
            }
            this.number = number;

        }
        else
            System.out.println("Invalid Number");//!!!!!!THROW EXCEPTION!!!!!!!!
    }

    public String getNumber() {
        return number;
    }

    private boolean validate(String number) {
        boolean flag;
        int length=number.length();
        String pattern;

        if(length>10)
            pattern="^(?:0091|\\+91|91|0)[7-9][0-9]{9}$";
        else
            pattern="^[7-9][0-9]{9}$";

        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(number);
        flag=m.matches();
        return flag;
    }



}
