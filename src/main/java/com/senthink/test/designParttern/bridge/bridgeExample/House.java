package com.senthink.test.designParttern.bridge.bridgeExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/4/3.
 */
public class House extends Product{

    private final static Logger LOGGER = LoggerFactory.getLogger(House.class);

    public void beProducted() {
        LOGGER.debug("生产出的房子是这样的----");
    }

    public void beSelled() {
        LOGGER.debug("生产出的房子卖出去了------");
    }
}
