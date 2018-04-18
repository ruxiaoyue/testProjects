package com.senthink.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/1/25.
 */
public class MessageUtil {

    private final static Logger LOGGER = LoggerFactory.getLogger(MessageUtil.class);

    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage(){
        LOGGER.debug("message={}", message);
        return message;
    }

    public void testExpect() {
        LOGGER.debug("testExpect");
        int a = 0;
        int b= 1/a;
    }

    public String salutationMessage() {
        message = "Hi" + message;
        return message;
    }

    public String exitMessage() {
        message = "www." + message;
        return message;
    }
}
