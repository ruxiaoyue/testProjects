package com.senthink.test.testNG;

import com.senthink.test.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by lenovo on 2018/2/5.
 */
public class GroupTest {

    private String message = ".com";

    private MessageUtil messageUtil = new MessageUtil(message);

    private final static Logger LOGGER = LoggerFactory.getLogger(GroupTest.class);

    @Test
    public void testPrint() {
        LOGGER.debug("testPrint");
        String newString = messageUtil.printMessage();
        Assert.assertEquals(message, newString);
    }

    @Test
    public void testOne() {
        LOGGER.debug("testOne");
        message = "Hi" + message;
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }

    @Test
    public void testTow() {
        LOGGER.debug("testTwo");
        message = "www." + message;
        Assert.assertEquals(message, messageUtil.exitMessage());
    }
}
