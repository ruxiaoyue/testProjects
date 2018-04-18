package com.senthink.test.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/8.
 */
public class StopOne implements Animal.CallToBack{

    private final static Logger LOGGER = LoggerFactory.getLogger(StopOne.class);

    private Animal animal;

    public StopOne(Animal animal) {
        this.animal = animal;
    }

    public void win() {
        LOGGER.debug("stop");
        animal.yield();
        animal.stop();
    }
}
