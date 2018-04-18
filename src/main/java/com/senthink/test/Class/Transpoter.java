package com.senthink.test.Class;

import com.senthink.test.Service.Watched;
import com.senthink.test.Service.Watcher;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/11/16.
 */
public class Transpoter implements Watched {

    private List<Watcher> watchers;

    public Transpoter() {
        watchers = new ArrayList<>();
    }

    public void removeWatcher(Watcher watcher) {
        if (watchers.contains(watcher)) {
            watchers.remove(watcher);
        }
    }

    public void noticeWatchers() {
        for (Watcher watcher:watchers) {
            watcher.update();
        }
    }

    public void registWatcher(Watcher watcher) {
        watchers.add(watcher);
    }
}
