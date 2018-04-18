package com.senthink.test.designParttern.iterator.exampleTwo;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/28.
 */
public class ProjectIterator implements IProjectIterator{

    private ArrayList projectList = new ArrayList();

    private static int currentIterm = 0;

    public ProjectIterator(ArrayList projectList) {
        this.projectList = projectList;
    }

    public boolean hasNext() {
        boolean b = true;
        if ((this.currentIterm >= this.projectList.size()) || (this.projectList.get(currentIterm) == null)) {
            b = false;
        }
        return b;
    }

    public IProjectOne next() {
        IProjectOne iProjectOne = (IProjectOne) this.projectList.get(this.currentIterm++);
        return iProjectOne;
    }
}
