package com.senthink.test.designParttern.adapterPattern;

/**
 * Created by lenovo on 2018/3/29.
 */
public class AdapterClient {

    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        youngGirl.getMobileNumber();

        IUserInfo outerYount = new OuterUserInfo();
        outerYount.getMobileNumber();

    }
}
