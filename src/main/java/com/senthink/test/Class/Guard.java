package com.senthink.test.Class;

import com.senthink.test.Service.Watcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2017/11/16.
 */
public class Guard implements Watcher {

    private final static Logger LOGGER = LoggerFactory.getLogger(Guard.class);
    public void update() {
        LOGGER.debug("GUARD accept the notice");
    }
}
