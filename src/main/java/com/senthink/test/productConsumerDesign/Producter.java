package com.senthink.test.productConsumerDesign;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Thread.sleep;

/**
 * Created by lenovo on 2018/3/9.
 */
public class Producter implements Runnable{

    private Storage<Phone> storage = new Storage<>();

    private final static Logger LOGGER = LoggerFactory.getLogger(Producter.class);

    public Producter(Storage<Phone> storage) {
        this.storage = storage;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            storage.product(new Phone(i));
            try{
                sleep(1000);
            }catch (InterruptedException e) {
                LOGGER.debug("e ={}", e.getCause());
            }

        }
    }
}
