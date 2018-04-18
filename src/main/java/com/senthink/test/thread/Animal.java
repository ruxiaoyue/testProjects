package com.senthink.test.thread;

/**
 * Created by lenovo on 2018/3/8.
 */
public abstract class Animal extends Thread{

    public CallToBack callToBack;

    public static double length = 20;

    public abstract void running();


    public void run(){
        super.run();
        while (length > 0) {
            running();
        }
    }

    public interface CallToBack {
        void win();
    }
}
