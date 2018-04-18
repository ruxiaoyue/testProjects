package com.senthink.test.Service;

/**
 * Created by hyacinth on 2017/11/7.
 */
public interface Subject {

    void registObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservables();
}
