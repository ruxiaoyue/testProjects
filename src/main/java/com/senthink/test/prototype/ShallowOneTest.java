package com.senthink.test.prototype;

import com.senthink.test.prototype.exampleTwo.Admin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/12.
 */
public class ShallowOneTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(ShallowOneTest.class);

    public static void main(String[] args) {
        Admin admin = new Admin("man", 50);
        ShallowOne shallowOne = new ShallowOne();
        ArrayList<Admin> doubles = shallowOne.getShallowCopyArrayList();
        doubles.add(admin);

        try{
            ArrayList<Admin> cloneJsonArray = shallowOne.clone().getShallowCopyArrayList();
            cloneJsonArray.add(new Admin("woman", 25));
        }catch (CloneNotSupportedException e) {
            LOGGER.debug("e ={}", e.getCause());
        }

        LOGGER.debug("jsonArray={}", doubles.toString());
    }
}
