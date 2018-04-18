package com.senthink.test.designParttern.pk.pk1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/4/11.
 */
public class AdultSuperMan implements ISuperMan{

    private final static Logger LOGGER = LoggerFactory.getLogger(AdultSuperMan.class);

    public void specialTalent() {
        LOGGER.debug("superMan 力大无穷");
    }
}
