package com.senthink.test.designParttern.iterator.beforeExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/28.
 */
public class ConProject implements IProject{

    private String proName;

    private int peopleNum;

    private int cost;

    private final static Logger LOGGER = LoggerFactory.getLogger(ConProject.class);

    public ConProject(String proName, int peopleNum, int cost) {
        this.peopleNum = peopleNum;
        this.proName = proName;
        this.cost = cost;
    }

    public void getProjectInformation() {
       LOGGER.debug("project " + proName + ":人员数量" + peopleNum + ">花费" + cost);
    }
}
