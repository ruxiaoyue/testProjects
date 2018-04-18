package com.senthink.test.productConsumerDesign;

/**
 * Created by lenovo on 2018/3/9.
 */
public class Client {

    public static void main(String[] args) {
        Storage<Phone> storage = new Storage<>();

        new Thread(new Producter(storage)).start();
        new Thread(new Consumer(storage)).start();
    }
}
