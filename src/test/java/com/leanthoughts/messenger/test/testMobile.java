package com.leanthoughts.messenger.test;

import com.leanthoughts.messenger.MobileNumber;
import org.junit.Test;

/**
 * Created by Fahad Fazil on 13-12-2014.
 */


public class testMobile {
    @Test
    public void mobileTest() throws Exception {
        MobileNumber num = new MobileNumber("09895598535");
        System.out.println(num.getNumber());
    }
}
