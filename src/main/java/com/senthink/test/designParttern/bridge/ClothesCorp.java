package com.senthink.test.designParttern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2018/4/3.
 */
public class ClothesCorp extends Corp{

    private final static Logger LOGGER = LoggerFactory.getLogger(ClothesCorp.class);

    protected void produce() {
        LOGGER.debug("produce clothes");
    }

    protected void sell() {
        LOGGER.debug("sell clothes");
    }

    public void makeMoney() {
        super.makeMoney();
        LOGGER.debug("clothes makeMoney");
    }
}
