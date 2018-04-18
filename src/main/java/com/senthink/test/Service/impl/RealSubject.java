package com.senthink.test.Service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Service.Isubject;

/**
 * Created by lenovo on 2018/1/24.
 */
public class RealSubject implements Isubject{


    private final static Logger LOGGER = LoggerFactory.getLogger(RealSubject.class);

    public void doSomething() {
        LOGGER.debug("realSubject do something");
    }
}
