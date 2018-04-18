package com.senthink.test.designParttern.strategyParttern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/22.
 */
public class ConcrecteStrategy3 implements Strategy{

    private final static Logger LOGGER = LoggerFactory.getLogger(ConcrecteStrategy3.class);

    public void operate() {
        LOGGER.debug("strategy 孙夫人断后");
    }
}
