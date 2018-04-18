package com.senthink.test.thread.thread4;

/**
 * Created by lenovo on 2018/3/9.
 */
public class Open {

    public static void main(String[] args) {
        KFC kfc = new KFC();

        Consumer consumer = new Consumer(kfc);
        Consumer consumer1 = new Consumer(kfc);
        Consumer consumer2 = new Consumer(kfc);


        Product product = new Product(kfc);
        Product product1 = new Product(kfc);

        consumer.start();
        consumer1.start();
        consumer2.start();
        product.start();
        product1.start();
    }
}
