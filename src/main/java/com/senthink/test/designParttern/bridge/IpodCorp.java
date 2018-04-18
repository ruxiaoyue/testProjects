package com.senthink.test.designParttern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2018/4/3.
 */
public class IpodCorp extends Corp{

    private final static Logger LOGGER = LoggerFactory.getLogger(IpodCorp.class);

    protected void produce() {
        LOGGER.debug("produce ipod");
    }

    protected void sell() {
        LOGGER.debug("sell ipod");
    }

    public void makeMoney() {
        super.makeMoney();
        LOGGER.debug("corp makeMoney");
    }
}
