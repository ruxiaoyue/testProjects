package com.senthink.test.designParttern.brigdePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/19.
 */
public class Man extends People{

    private final static Logger LOGGER = LoggerFactory.getLogger(Man.class);

    public void run() {
        LOGGER.debug("man is run here");
        road.run();

    }
}
