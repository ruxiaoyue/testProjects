package com.senthink.test.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/8.
 */
public class Person extends Thread{

    private Bank bank;

    private final static Logger LOGGER = LoggerFactory.getLogger(Person.class);

    public Person(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (Bank.money > 200) {
            bank.counter(200);
        }
        try{
            sleep(1000);
        }catch (InterruptedException e) {
            LOGGER.debug("e={}", e.getCause());
        }

    }
}
