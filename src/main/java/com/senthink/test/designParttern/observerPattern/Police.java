package com.senthink.test.designParttern.observerPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/20.
 */
public class Police implements Watcher{
    private final static Logger LOGGER = LoggerFactory.getLogger(Police.class);

    public void update() {
        LOGGER.debug("police is notified");
    }
}
