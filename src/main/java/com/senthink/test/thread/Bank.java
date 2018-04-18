package com.senthink.test.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/8.
 */
public class Bank {

    private final static Logger LOGGER = LoggerFactory.getLogger(Bank.class);

    public static int money = 1000;

    public void counter(int money){
        Bank.money -= money;
        LOGGER.debug("A取走了" + money + "还剩" + Bank.money);
    }

    public void atm(int money) {
        Bank.money -= money;
        LOGGER.debug("B取走了" + money + "还剩" + Bank.money);
    }
}
