package com.senthink.test.designParttern.builderPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/29.
 */
public class Man extends Person{

    private final static Logger LOGGER = LoggerFactory.getLogger(Man.class);

    public Man() {
        LOGGER.debug("builder man");
    }
}
