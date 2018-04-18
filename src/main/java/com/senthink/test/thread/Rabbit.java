package com.senthink.test.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2018/3/8.
 */
public class Rabbit extends Animal{

    private final static Logger LOGGER = LoggerFactory.getLogger(Rabbit.class);

    public Rabbit() {
        setName("rabbit");
    }

    public void running() {
        double rate = 0.5;
        length -= rate;
        while (length <= 0) {
            length = 0;
            LOGGER.debug("rabbit is win");
            if (callToBack != null) {
                callToBack.win();
            }
        }

        LOGGER.debug("rabbit 跑了" + rate + "米还剩" + length);
        try {
            if (length % 2 == 0) {
                sleep(10000);
            }
        }catch (InterruptedException e) {
            LOGGER.debug("e ={}", e.getCause());
        }
    }
}
