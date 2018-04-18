package com.senthink.test.designParttern.iterator.exampleTwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/28.
 */
public class ProjectOne implements IProjectOne{

    private String proName;

    private int proNum;

    private int cost;

    private ArrayList arrayList = new ArrayList();

    private final static Logger LOGGER = LoggerFactory.getLogger(ProjectOne.class);

    public ProjectOne() {}

    public ProjectOne(String proName, int proNum, int cost) {
        LOGGER.debug("带参数构造函数");
        this.proName = proName;
        this.proNum = proNum;
        this.cost = cost;
    }

    public void add(String name, int num, int cost) {
        this.arrayList.add(new ProjectOne(name, num, cost));
    }

    public String getProjectInformation() {
        String info = "项目名称:" + this.proName + ">项目人员" + this.proNum + ">项目花费" + this.cost;
        return info;
    }

    public IProjectIterator iterator() {
        return new ProjectIterator(this.arrayList);
    }
}
