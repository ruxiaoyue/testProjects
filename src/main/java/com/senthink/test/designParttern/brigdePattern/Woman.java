package com.senthink.test.designParttern.brigdePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/19.
 */
public class Woman extends People{
    private final static Logger LOGGER = LoggerFactory.getLogger(Woman.class);
    public void run() {
        road.run();
        LOGGER.debug("woman is run here");
    }
}
