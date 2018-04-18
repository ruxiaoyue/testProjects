package com.senthink.test.productConsumerDesign;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by hyacinth on 2018/3/9.
 */
public class Storage<T> {

    private static int index = 0;

    private final static int MAX = 10;

    private List<T> storage = Lists.newArrayList();

    private final static Logger LOGGER = LoggerFactory.getLogger(Storage.class);

    public synchronized void product(T item) {
        while (index >= MAX) {
            LOGGER.debug("storage is full");
            try{
                LOGGER.debug("storage is full wait...");
                this.wait();
            }catch (InterruptedException e) {
                LOGGER.debug("e ={}", e.getCause());
            }
        }

        LOGGER.debug("storage is empty product");
        storage.add(item);
        index++;
        notify();
    }

    public synchronized T consumer() {
        while (index <= 0) {
            LOGGER.debug("storage is empty wait to consumer");
            try{
                this.wait();
            }catch (InterruptedException e) {
                LOGGER.debug("e={}", e.getCause());
            }
        }

        LOGGER.debug("start to consumer");
        index--;
        T item = storage.remove(index);
        LOGGER.debug("consumer {}", item.toString());
        notify();
        return item;
    }
}
