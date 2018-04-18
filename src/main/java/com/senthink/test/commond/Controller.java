package com.senthink.test.commond;

/**
 * Created by lenovo on 2018/3/12.
 */
public class Controller {

    private AbstractCommond commondOff;
    private AbstractCommond commondOn;
    private AbstractCommond changeChannel;

    public Controller(AbstractCommond changeChannel, AbstractCommond commondOn, AbstractCommond commondOff) {
        this.changeChannel = changeChannel;
        this.commondOn = commondOn;
        this.commondOff = commondOff;
    }

    public void turnOn() {
        commondOn.excute();
    }

    public void turnOff() {
        commondOff.excute();
    }

    public void changeChannel() {
        changeChannel.excute();
    }
}
