package com.senthink.test.designParttern.iterator.exampleTwo;

/**
 * Created by lenovo on 2018/3/28.
 */
public interface IProjectOne {

    String getProjectInformation();

    void add(String name, int num, int cost);

    IProjectIterator iterator();
}
