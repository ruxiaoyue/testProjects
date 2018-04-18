package com.senthink.test.prototype;


import com.senthink.test.prototype.exampleTwo.Admin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/12.
 */
public class ShallowOne implements Cloneable{

    private final static Logger LOGGER = LoggerFactory.getLogger(ShallowOne.class);

    public ArrayList<Admin> shallowCopyArrayList = new ArrayList<Admin>();;

    public ArrayList<Admin> getShallowCopyArrayList() {
        return shallowCopyArrayList;
    }

    public void setShallowCopyArrayList(ArrayList<Admin> shallowCopyArrayList) {
        this.shallowCopyArrayList = shallowCopyArrayList;
    }

    @Override
    protected ShallowOne clone() throws CloneNotSupportedException{
        //只有clone 浅拷贝
        ShallowOne shallowOne = (ShallowOne) super.clone();
        //手动操作 深拷贝
        shallowOne.shallowCopyArrayList = (ArrayList<Admin>) this.shallowCopyArrayList.clone();
        LOGGER.debug("shallowOne +{}", shallowOne.getShallowCopyArrayList().toString());
        return shallowOne;
    }
}
