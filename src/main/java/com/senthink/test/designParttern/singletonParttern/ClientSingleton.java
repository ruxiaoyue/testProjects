package com.senthink.test.designParttern.singletonParttern;

/**
 * Created by lenovo on 2018/3/30.
 */
public class ClientSingleton {

    public static void main(String[] args) {
        //单例模式
        /*Emperor emperor = Emperor.getInstance();

        for (int i = 0; i <3 ; i++) {
            emperor.say();
        }*/

        //有上限的多例模式
        for (int i = 0; i < 5 ; i++) {
            EmperorTwo emperorTwo = EmperorTwo.getInstance();
            emperorTwo.say();
        }
    }
}
