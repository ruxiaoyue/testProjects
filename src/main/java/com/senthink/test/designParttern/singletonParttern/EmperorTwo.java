package com.senthink.test.designParttern.singletonParttern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lenovo on 2018/3/30.
 */
public class EmperorTwo {

    private static int MAXCOUNT = 6;

    private static EmperorTwo emperorTwo = new EmperorTwo();

    private static ArrayList nameList = new ArrayList();

    private static Map<Integer, EmperorTwo> map = new ConcurrentHashMap<>();

    private static int index = 0;

    private final static Logger LOGGER = LoggerFactory.getLogger(EmperorTwo.class);

    private EmperorTwo() {}

    static {
        for (int i = 0; i < MAXCOUNT; i++) {
            //map.put(i, new EmperorTwo());
            nameList.add(i);
        }
    }

    public static EmperorTwo getInstance() {
        Random random = new Random();
        index = random.nextInt(MAXCOUNT);
        emperorTwo = new EmperorTwo();
        //emperorTwo = map.get(index);
        return emperorTwo;
    }

    public void say() {
        LOGGER.debug("it is me " + nameList.get(index));
    }
}
