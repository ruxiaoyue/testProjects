package com.senthink.test.designParttern.bridge.bridgeExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/4/3.
 */
public class HouseCorpEx extends CorpEx{

    private final static Logger LOGGER = LoggerFactory.getLogger(HouseCorpEx.class);

    public HouseCorpEx(House house) {
        super(house);
    }

    public void makeMoney() {
        super.makeMoney();
        LOGGER.debug("house corp make money");
    }
}
