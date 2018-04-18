package com.senthink.test.commond;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/12.
 */
public class TV {

    private int currentChannel = 0;

    private final static Logger LOGGER = LoggerFactory.getLogger(TV.class);

    public void turnOn() {
        LOGGER.debug("turn on");
    }

    public void turnOff() {
        LOGGER.debug("turn off");
    }

    public void changeChannel(int channel) {
        this.currentChannel = channel;
        LOGGER.debug("turn channel {}", channel);
    }
}
