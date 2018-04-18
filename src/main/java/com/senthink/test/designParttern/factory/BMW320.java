package com.senthink.test.designParttern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.designParttern.factory.simple.BMW;

/**
 * 具体的产品类 继承抽象产品类
 * Created by lenovo on 2018/3/15.
 */
public class BMW320 extends BMW{

    private final static Logger LOGGER = LoggerFactory.getLogger(BMW523.class);

    public BMW320() {
        LOGGER.debug("product bwm320");
    }
}
