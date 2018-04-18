package com.senthink.test.designParttern.factory.abstractFactory;


/**
 * Created by lenovo on 2018/3/15.
 */
public class BWM523F implements AbstrFactory{

    public Engine create() {
        Engine engine = new EngineB();
        return engine;
    }
}
