package com.leanthoughts.messenger.test;

import com.leanthoughts.messenger.MobileNumber;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ffazil on 23/11/14.
 */
public class MobileNumberTest {


    @Test
    public void testValidMobileNumber() throws Exception {
        Set<String> numbers = new HashSet<String>(Arrays.asList("+919686046179", "9886114142", "08041667547"));
        MobileNumber mobileNumber;
        for(String number : numbers){
            mobileNumber = new MobileNumber(number);
            Assert.assertNotNull(mobileNumber.getNumber());
        }
    }

    //@Test
    public void testInValidMobileNumber() throws Exception {
        Set<String> numbers = new HashSet<String>(Arrays.asList("9886114142"));
        MobileNumber mobileNumber;
        for(String number : numbers){
            mobileNumber = new MobileNumber(number);
            Assert.assertNull(mobileNumber.getNumber());
        }
    }

}
