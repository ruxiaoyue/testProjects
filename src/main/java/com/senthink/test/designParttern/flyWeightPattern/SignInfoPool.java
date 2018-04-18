package com.senthink.test.designParttern.flyWeightPattern;

/**
 * Created by lenovo on 2018/4/2.
 */
public class SignInfoPool {

    private String key;


    public SignInfoPool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
