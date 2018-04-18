package com.senthink.test.designParttern.builderPattern;

/**
 * Created by lenovo on 2018/3/29.
 */
public class Direct {

    public Person constructPerson(Builder builder) {
        builder.builderBody();
        builder.builderFoot();
        builder.builderHead();
        return builder.builderPerson();
    }
}
