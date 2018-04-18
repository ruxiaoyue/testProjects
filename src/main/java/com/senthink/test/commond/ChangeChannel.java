package com.senthink.test.commond;

/**
 * Created by lenovo on 2018/3/12.
 */
public class ChangeChannel implements AbstractCommond{

    private TV t;

    private int channel;

    public ChangeChannel(TV t, int channel) {
        this.t = t;
        this.channel = channel;
    }

    public void excute() {
        t.changeChannel(channel);
    }
}
