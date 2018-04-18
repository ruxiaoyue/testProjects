package com.senthink.test.designParttern.pk.pk1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/4/11.
 */
public class SuperManFactory {

    private final static Logger LOGGER = LoggerFactory.getLogger(SuperManFactory.class);

    public static ISuperMan createSuperMan(String type) {
        if (type.equalsIgnoreCase("adult")){
            return new AdultSuperMan();
        }else if (type.equalsIgnoreCase("child")) {
            return new ChildSuperMan();
        }else {
            LOGGER.debug("都不符合");
            return null;
        }
    }
}
