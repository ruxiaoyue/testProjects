package com.senthink.test.designParttern.observerPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/20.
 */
public class ObsClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(ObsClient.class);

    public static void main(String[] args) {
        Watcher police = new Police();
        Watcher thief = new Thief();
        Watcher security = new Security();
        Watchered watchered = new Transport();
        watchered.addWatcher(police);
        watchered.addWatcher(thief);
        watchered.addWatcher(security);
        watchered.notifyWatchers();
    }
}
