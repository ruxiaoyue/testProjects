package com.senthink.test.testNG;

import com.senthink.test.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/**
 * Created by lenovo on 2018/2/5.
 */
public class Test2 {

    private String message = "Manisha";

    MessageUtil messageUtil = new MessageUtil(message);

    private final static Logger LOGGER = LoggerFactory.getLogger(Test2.class);

    public void testSalutationMessage() {
        LOGGER.debug("inside testSalutationMessage");
        message = "Hi" + "Manisha";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}
