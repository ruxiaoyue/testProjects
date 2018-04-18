package com.senthink.test.Class;

import com.senthink.test.Service.impl.RealSubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Service.Isubject;

/**
 * Created by lenovo on 2018/1/24.
 */
public class AdminProxy implements Isubject{

    private final static Logger LOGGER = LoggerFactory.getLogger(AdminProxy.class);

    private RealSubject realSubject;

    public AdminProxy(RealSubject realSubject) {
        super();
        this.realSubject = realSubject;
    }

    public void doSomething() {
        LOGGER.debug("start.....");
        realSubject.doSomething();
        LOGGER.debug("end......");
    }
}
