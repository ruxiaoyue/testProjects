package com.senthink.test.designParttern.observerPattern;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

/**
 * Created by lenovo on 2018/3/20.
 */
public class Transport implements Watchered{

    private final static Logger LOGGER = LoggerFactory.getLogger(Transport.class);

    private List<Watcher> watchers = Lists.newArrayList();

    public void notifyWatchers() {
        LOGGER.debug("notify all size={}", watchers.size());
        for (Watcher watcher:watchers) {
            watcher.update();
        }
    }

    public void removeWatcher(Watcher watcher) {
        watchers.remove(watcher);
    }

    public void addWatcher(Watcher watcher) {
        watchers.add(watcher);
    }
}
