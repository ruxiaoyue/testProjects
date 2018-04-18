package com.senthink.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Created by hyacinth on 2018/1/25.
 */
public class JunitTest {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        int num = 5;
        String temp = null;
        messageUtil.testExpect();
        /*assertEquals(message, messageUtil.printMessage());
        assertFalse(num > 6);
        assertNotNull(message);*/
    }
}
