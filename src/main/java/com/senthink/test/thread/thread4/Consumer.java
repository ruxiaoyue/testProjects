package com.senthink.test.thread.thread4;

/**
 * Created by lenovo on 2018/3/9.
 */
public class Consumer extends Thread{

    private KFC kfc;

    public Consumer(KFC kfc) {
        this.kfc = kfc;
    }

    public void run(){
        int index = (int) Math.random() * 5;
        while (true) {
            kfc.consume(index);
        }
    }
}
