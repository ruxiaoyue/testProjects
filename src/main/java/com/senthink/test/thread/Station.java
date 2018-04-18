package com.senthink.test.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/8.
 */
public class Station extends Thread{

    public static int ticket = 20;

    public Object key = "aa";

    private final static Logger LOGGER = LoggerFactory.getLogger(Station.class);

    public Station(String name) {
        super(name);
    }

    @Override
    public void run(){
        while (ticket > 0) {
            synchronized (key) {
                if (ticket > 0) {
                    LOGGER.debug(getName()+"卖出了第{}", ticket + "张票");
                    ticket--;
                }else {
                    LOGGER.debug("已经卖完了");
                }
            }
            try{
                sleep(1000);
            }catch (InterruptedException e) {
                LOGGER.debug("e={}", e.getCause());
            }
        }
    }

}
