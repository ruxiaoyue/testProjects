package com.senthink.test.designParttern.factory.factoryMethod;

/**
 * Created by lenovo on 2018/3/15.
 */
public class MethodClient {

    public static void main(String[] args) {
        AbstractoryFactory factory = new BMW320Factory();
        factory.create();
    }
}
