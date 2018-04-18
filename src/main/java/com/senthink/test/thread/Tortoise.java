package com.senthink.test.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/8.
 */
public class Tortoise extends Animal{

    private final static Logger LOGGER = LoggerFactory.getLogger(Tortoise.class);

    public Tortoise() {
        setName("tortoise");
    }

    public void running() {
        double rate = 0.1;
        length -= rate;
        while (length <= 0) {
            length = 0;
            LOGGER.debug("tortoise is win");
            if (callToBack != null) {
                callToBack.win();
            }
        }

        LOGGER.debug("tortoise 跑了" + rate + "米还剩" + length);
        try{
            sleep(1000);
        }catch (InterruptedException e) {
            LOGGER.debug("e ={}", e.getCause());
        }
    }
}
