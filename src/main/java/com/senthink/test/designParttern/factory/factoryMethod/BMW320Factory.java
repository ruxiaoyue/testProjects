package com.senthink.test.designParttern.factory.factoryMethod;

import com.senthink.test.designParttern.factory.BMW320;
import com.senthink.test.designParttern.factory.simple.BMW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/15.
 */
public class BMW320Factory implements AbstractoryFactory{

    private final static Logger LOGGER = LoggerFactory.getLogger(BMW320Factory.class);

    public BMW320Factory() {}

    public BMW create() {
        BMW bmw = new BMW320();
        return bmw;
    }
}
