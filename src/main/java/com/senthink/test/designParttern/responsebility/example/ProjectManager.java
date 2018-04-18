package com.senthink.test.designParttern.responsebility.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/21.
 */
public class ProjectManager extends AbsApply{

    private final static Logger LOGGER = LoggerFactory.getLogger(ProjectManager.class);

    public ProjectManager() {
        super(PO);
    }

    public void response(StaffAbs abs) {
        LOGGER.debug("projectManage response ok");
    }
}
