package com.senthink.test.commond;

/**
 * Created by lenovo on 2018/3/12.
 */
public class CommondOn implements AbstractCommond{

    private TV tv;

    public CommondOn(TV tv) {
        this.tv = tv;
    }
    public void excute() {
        tv.turnOn();
    }
}
