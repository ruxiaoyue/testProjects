package com.senthink.test.testNG;

import com.senthink.test.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/2/5.
 */
public class Test1 {

    String message = "Manisha";

    private final static Logger LOGGER = LoggerFactory.getLogger(Test1.class);

    MessageUtil messageUtil = new MessageUtil(message);

    public void testPrintMessage() {
        LOGGER.debug("inside testPrintMessage");
    }

}
