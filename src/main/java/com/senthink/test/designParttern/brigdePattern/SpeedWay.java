package com.senthink.test.designParttern.brigdePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/19.
 */
public class SpeedWay extends AbstractRoad{


    private final static Logger LOGGER = LoggerFactory.getLogger(SpeedWay.class);


    public void run() {
        abstractCar.run();
        LOGGER.debug("running on speedway");

    }
}
