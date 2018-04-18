package com.senthink.test.decorate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2018/3/7.
 */
public class LoggerDecorateTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(LoggerDecorateTest.class);

    //private final static Logger log = JsonLoggerFacto

    public static void main(String[] args) {
       LOGGER.debug("name");
    }
}
