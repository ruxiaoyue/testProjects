package com.senthink.test.designParttern.bridge.bridgeExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/4/3.
 */
public class ClothesEx extends Product{

    private final static Logger LOGGER = LoggerFactory.getLogger(ClothesEx.class);

    public void beProducted() {
        LOGGER.debug("clothes is producted========");
    }

    public void beSelled() {
        LOGGER.debug("clothes is selled=====");
    }
}
