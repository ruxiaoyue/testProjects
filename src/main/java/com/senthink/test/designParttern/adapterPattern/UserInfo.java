package com.senthink.test.designParttern.adapterPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/29.
 */
public class UserInfo implements IUserInfo{

    private final static Logger LOGGER = LoggerFactory.getLogger(UserInfo.class);

    public String getUserName() {
        LOGGER.debug("get name");
        return null;
    }

    public String getHomeAddress() {
        LOGGER.debug("get home address");
        return null;
    }

    public String getMobileNumber() {
        LOGGER.debug("get mobile number");
        return null;
    }

    public String getOfficeTelNumber() {
        LOGGER.debug("get office telNumber");
        return null;
    }

    public String getJobPositon() {
        LOGGER.debug("get JobPosition");
        return null;
    }

    public String getHomeTelNumber(){
        LOGGER.debug("get home telNumber");
        return null;
    }
}
