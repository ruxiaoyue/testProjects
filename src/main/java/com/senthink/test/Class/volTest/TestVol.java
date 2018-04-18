package com.senthink.test.Class.volTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/2/27.
 */
public class TestVol {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestVol.class);

    public volatile int inc = 0;

    public void increase() {
        inc++;
        LOGGER.debug("inc={}", inc);
    }
}
