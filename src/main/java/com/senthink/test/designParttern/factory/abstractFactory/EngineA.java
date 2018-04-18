package com.senthink.test.designParttern.factory.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/15.
 */
public class EngineA implements Engine{

    private final static Logger LOGGER = LoggerFactory.getLogger(EngineA.class);

    public EngineA() {
        LOGGER.debug("product engineA");
    }
}
