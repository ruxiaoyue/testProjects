package com.senthink.test.designParttern.builderPattern;

/**
 * Created by lenovo on 2018/3/29.
 */
public interface Builder {

    void builderHead();

    void builderBody();

    void builderFoot();

    Person builderPerson();
}
