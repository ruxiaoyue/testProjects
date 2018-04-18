package com.senthink.test.designParttern.pk.pk1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/4/11.
 */
public class ChildSuperMan implements ISuperMan{

    private final static Logger LOGGER = LoggerFactory.getLogger(ChildSuperMan.class);

    public void specialTalent() {
        LOGGER.debug("chiledSuperMan 刀枪不入 快速运动");
    }
}
