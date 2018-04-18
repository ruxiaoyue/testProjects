package com.senthink.test.productConsumerDesign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Thread.sleep;

/**
 * Created by lenovo on 2018/3/9.
 */
public class Consumer implements Runnable{

    private Storage<Phone> storage;

    private final static Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    public Consumer(Storage<Phone> storage) {
        this.storage = storage;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            storage.consumer();
            try{
                sleep(100);
            }catch (InterruptedException e) {
                LOGGER.debug("e =}", e.getCause());
            }

        }
    }
}
