package com.senthink.test.designParttern.singletonParttern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/30.
 */
public class Emperor {

    private static final Logger LOGGER = LoggerFactory.getLogger(Emperor.class);

    private static final Emperor emperor = new Emperor();

    private Emperor() {}

    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        LOGGER.debug("it is me > emperor");
    }
}
