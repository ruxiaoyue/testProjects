package com.senthink.test.decorate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/6.
 */
public class DecorateTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(DecorateTest.class);

    public static void main(String[] args) {
        Coffee decaf = new Decaf();
        decaf = new Dressing(decaf);
        decaf = new Mocha(decaf);
        decaf = new Whip(decaf);
        double cost = decaf.cost();
        LOGGER.debug("mocha cost={}", cost);

    }
}

