package com.senthink.test.designParttern.strategyParttern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/22.
 */
public class ConcrecteStrategy2 implements Strategy{

    private final static Logger LOGGER = LoggerFactory.getLogger(ConcrecteStrategy2.class);

    public void operate() {
        LOGGER.debug("strategy 求吴太国放行");
    }
}
