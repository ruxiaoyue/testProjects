package com.senthink.test.Class;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/12/26.
 */
public class GenericDemo {

    private final static Logger LOGGER = LoggerFactory.getLogger(GenericDemo.class);

    public <T> List<T> newArray() {
        return new ArrayList<T>();
    }

    public void show(List<?> list) {
        for (Object o:list) {
            LOGGER.debug("o={}", o);
        }
    }

    public <T extends Number> void out(T t) {
        LOGGER.debug("t={}", t.getClass());
    }
}
