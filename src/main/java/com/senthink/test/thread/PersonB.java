package com.senthink.test.thread;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by lenovo on 2018/3/8.
 */
public class PersonB extends Thread{

    private Bank bank;

    private final static Logger LOGGER = LoggerFactory.getLogger(PersonB.class);

    public PersonB(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {

        while (Bank.money >= 100) {
            bank.atm(100);
        }

        try{
            sleep(100);
        }catch (InterruptedException e) {
            LOGGER.debug("e ={}", e.getCause());
        }
    }
}
