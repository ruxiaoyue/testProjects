package com.senthink.test.commond;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/12.
 */
public class Client {

    private final static Logger LOGGER = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        TV tv = new TV();
        AbstractCommond commond = new CommondOff(tv);
        AbstractCommond commond1 = new CommondOn(tv);
        AbstractCommond commond2 = new ChangeChannel(tv, 4);
        Controller controller = new Controller(commond2, commond1, commond);
        controller.turnOff();
        controller.turnOn();
        controller.changeChannel();
    }
}
