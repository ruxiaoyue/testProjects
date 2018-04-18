package com.senthink.test.testNG;

import com.senthink.test.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2018/2/5.
 */
public class TestIgnore {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestIgnore.class);

    private String message = "ignoreString";

    MessageUtil messageUtil = new MessageUtil(message);

    @Test(enabled = false)
    public void test() {
        LOGGER.debug("test print");
        messageUtil.printMessage();
    }

    @Test
    public void testTwo() {
        LOGGER.debug("test tow");
        String me = messageUtil.salutationMessage();
        Assert.assertEquals("HiignoreString", me);
    }
}
