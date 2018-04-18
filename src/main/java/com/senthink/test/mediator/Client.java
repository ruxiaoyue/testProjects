package com.senthink.test.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/12.
 */
public class Client {

    private final static Logger LOGGER = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        /*Colleage colleageA = new ColleageA();
        Colleage colleageB = new ColleageB();
        colleageA.setNumber(1, colleageB);
        LOGGER.debug("colleageA num ={}, colleageB num={}", colleageA.getNumber(), colleageB.getNumber());

        colleageB.setNumber(200, colleageA);
        LOGGER.debug("colleageA num ={}, colleageB num={}", colleageA.getNumber(), colleageB.getNumber());*/

        Colleage colleageA = new ColleageA();
        Colleage colleageB = new ColleageB();
        MediatorClass mediator = new MediatorImpl(colleageA, colleageB);
        colleageA.setNumber(100,mediator);
        LOGGER.debug("colleageA number={}, B={}", colleageA.getNumber(), colleageB.getNumber());
    }
}
