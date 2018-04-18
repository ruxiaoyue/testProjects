package com.senthink.test.Service;

/**
 * Created by lenovo on 2017/11/16.
 */
public interface Watched {

    void registWatcher(Watcher watcher);

    void removeWatcher(Watcher watcher);

    void noticeWatchers();
}
