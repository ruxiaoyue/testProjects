package com.senthink.test;

import com.senthink.test.Util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by lenovo on 2017/12/1.
 */
public class DateUtilTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(DateUtilTest.class);

    public static void main(String[] args){
        DateUtil dateUtil = new DateUtil();
        //JsonObject beaconTime = dateUtil.getBeaconStartTime();
        //String before = beaconTime.getString("before");
        //String after = beaconTime.getString("after");
        String time = dateUtil.getNow();
        //LOGGER.debug("before={}, after={}", before, after);
        LOGGER.debug("time={}", time);
    }
}
