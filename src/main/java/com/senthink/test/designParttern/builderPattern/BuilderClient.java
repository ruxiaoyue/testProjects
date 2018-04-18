package com.senthink.test.designParttern.builderPattern;

/**
 * Created by lenovo on 2018/3/29.
 */
public class BuilderClient {

    public static void main(String[] args) {
        Direct direct = new Direct();
        Person woman = direct.constructPerson(new ConcrectWomanBuilder());

        Person man = direct.constructPerson(new ConcrectManBuilder());

    }
}
