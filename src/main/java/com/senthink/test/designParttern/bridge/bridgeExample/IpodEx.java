package com.senthink.test.designParttern.bridge.bridgeExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/4/3.
 */
public class IpodEx extends Product{

    private final static Logger LOGGER = LoggerFactory.getLogger(IpodEx.class);

    public void beProducted() {
        LOGGER.debug("生产出的ipod是这样的-----");
    }

    public void beSelled() {
        LOGGER.debug("生产出的ipod卖出去了------");
    }
}
