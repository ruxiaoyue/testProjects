package com.senthink.test.designParttern.adapterPattern;

import java.util.Map;

/**
 * Created by lenovo on 2018/3/29.
 */
public class OuterUserInfo extends OuterUser implements IUserInfo{

    private Map<String, String> baseInfo = super.getUserBaseInfo();

    private Map<String, String> homeInfo = super.getUserHomeInfo();

    private Map<String, String> officeInfo = super.getUserOfficeInfo();

    public String getHomeAddress() {
        String homeAddress = baseInfo.get("homeAddress");
        return homeAddress;
    }

    public String getHomeTelNumber() {
        String homeNumber = this.homeInfo.get("homeTelNumber");
        return homeNumber;
    }

    public String getJobPositon() {
        String jobPositon = this.officeInfo.get("jobPosition");
        return jobPositon;
    }

    public String getMobileNumber() {
        String mobileNum = this.baseInfo.get("mobileNumber");
        return mobileNum;
    }

    public String getOfficeTelNumber() {
        String officeNumber = this.officeInfo.get("officeTelNumber");
        return officeNumber;
    }

    public String getUserName() {
        String userName = this.baseInfo.get("userName");
        return userName;
    }

}
