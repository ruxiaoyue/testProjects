package com.senthink.test.Class;

import com.senthink.test.Service.MoveAble;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Created by lenovo on 2018/1/31.
 */
public class CarRealSubject implements MoveAble {

    private final static Logger LOGGER = LoggerFactory.getLogger(MoveAble.class);
    public void move() throws Exception{
        Thread.sleep(new Random().nextInt(1000));
        LOGGER.debug("car is running....");
    }
}
