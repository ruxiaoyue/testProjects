package com.senthink.test.designParttern.responsebility.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/21.
 */
public class GenaralManager extends AbsApply{

    private final  static Logger LOGGER = LoggerFactory.getLogger(GenaralManager.class);

    public GenaralManager() {
        super(GT);
    }

    public void response(StaffAbs abs) {
        LOGGER.debug("genaralManager response ok");
    }
}
