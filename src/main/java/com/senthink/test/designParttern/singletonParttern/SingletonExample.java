package com.senthink.test.designParttern.singletonParttern;

/**
 * Created by lenovo on 2018/3/30.
 */
public class SingletonExample {

    private static SingletonExample singletonExample = null;

    private SingletonExample() {}

    public SingletonExample getInstence() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }
}
