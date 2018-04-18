package com.senthink.test.Class;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Service.Watcher;

/**
 * Created by lenovo on 2017/11/16.
 */
public class Police implements Watcher{

    private final static Logger LOGGER = LoggerFactory.getLogger(Police.class);

    public void update() {
        LOGGER.debug("police accept the notice");
    }
}
