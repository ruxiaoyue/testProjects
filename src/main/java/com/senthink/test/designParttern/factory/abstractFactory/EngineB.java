package com.senthink.test.designParttern.factory.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/15.
 */
public class EngineB implements Engine{

    private final static Logger LOGGER = LoggerFactory.getLogger(EngineB.class);

    public EngineB() {
        LOGGER.debug("product engineB");
    }
}
