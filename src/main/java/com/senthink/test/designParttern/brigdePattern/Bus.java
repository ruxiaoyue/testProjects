package com.senthink.test.designParttern.brigdePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/19.
 */
public class Bus extends AbstractCar{

    private final static Logger LOGGER = LoggerFactory.getLogger(Bus.class);

    public void run() {
        LOGGER.debug("bus is there");
    }
}
