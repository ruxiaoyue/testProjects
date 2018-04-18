package com.senthink.test.designParttern.observerPattern;

/**abstract watchered
 * Created by lenovo on 2018/3/20.
 */
public interface Watchered {

    void addWatcher(Watcher w);

    void removeWatcher(Watcher w);

    void notifyWatchers();
}
