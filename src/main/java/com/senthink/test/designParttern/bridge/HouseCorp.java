package com.senthink.test.designParttern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/4/3.
 */
public class HouseCorp extends Corp{

    private final static Logger LOGGER = LoggerFactory.getLogger(HouseCorp.class);


    protected void produce() {
        LOGGER.debug("produce house");
    }

    protected void sell() {
        LOGGER.debug("sell house");
    }

    public void makeMoney() {
        super.makeMoney();
        LOGGER.debug("HouseCorp::make money!!");
    }

}
