package com.senthink.test.designParttern.responsebility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/21.
 */
public class Son extends IHandler{

    private final static Logger LOGGER = LoggerFactory.getLogger(Son.class);

    public Son() {
        super(SL);
    }


    public void response(WomanImpl woman) {
        LOGGER.debug("mother ask for son" + woman.getRequest());
        LOGGER.debug("son response is ok");
    }

}
