package com.senthink.test.commond;

/**
 * Created by lenovo on 2018/3/12.
 */
public class CommondOff implements AbstractCommond{

    private TV T;

    public CommondOff(TV t) {
        this.T = t;
    }
    public void excute() {
        T.turnOff();
    }
}
