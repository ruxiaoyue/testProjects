package com.senthink.test.designParttern.responsebility.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/21.
 */
public class DivisionManager extends AbsApply{

    private final static Logger LOGGER = LoggerFactory.getLogger(DivisionManager.class);

    public DivisionManager() {
        super(AbsApply.DT);
    }

    public void response(StaffAbs abs) {
        LOGGER.debug("divisionManager response ok");
    }

}
