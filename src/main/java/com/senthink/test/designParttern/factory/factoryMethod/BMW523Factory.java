package com.senthink.test.designParttern.factory.factoryMethod;

import com.senthink.test.designParttern.factory.BMW523;
import com.senthink.test.designParttern.factory.simple.BMW;

/**
 * Created by lenovo on 2018/3/15.
 */
public class BMW523Factory implements AbstractoryFactory{

    public BMW create() {
        BMW bmw = new BMW523();
        return bmw;
    }
}
