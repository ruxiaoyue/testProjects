package com.senthink.test.designParttern.pk.pk1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/4/11.
 */
public class ClientPk1 {

    private final static Logger LOGGER = LoggerFactory.getLogger(ClientPk1.class);

    public static void main(String[] args) {
        ISuperMan chSuper = SuperManFactory.createSuperMan("child");

        chSuper.specialTalent();
    }
}
