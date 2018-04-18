package com.senthink.test.designParttern.responsebility.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/21.
 */
public class ReClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(ReClient.class);

    public static void main(String[] args) {
        AbsApply project = new ProjectManager();
        AbsApply division = new DivisionManager();
        AbsApply genaral = new GenaralManager();
        project.setNext(division);
        division.setNext(genaral);

        Staff staff = new Staff(1500, "appley");
        project.applyHandler(staff);
    }
}
