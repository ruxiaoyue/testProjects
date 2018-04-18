package com.senthink.test.testNG;

import com.senthink.test.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2018/2/6.
 */
public class DependencyTest {

    private String message = "com";

    private final static Logger LOGGER = LoggerFactory.getLogger(DependencyTest.class);

    private MessageUtil messageUtil = new MessageUtil(message);

    @Test(groups = {"init"})
    public void testPrint() {
        LOGGER.debug("print");
        String newMessage = messageUtil.printMessage();
        Assert.assertEquals(newMessage, message);
    }

    @Test(dependsOnGroups = {"init.*"})
    public void testD() {
        LOGGER.debug("testD");
        message = "Hi" + message;
        String me = messageUtil.salutationMessage();
        Assert.assertEquals(me, message);
    }

    @Test(groups = {"init"})
    public void dependentMethod() {
        LOGGER.debug("dependent");
    }
}
