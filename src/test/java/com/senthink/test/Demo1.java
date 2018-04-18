package com.senthink.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2018/1/26.
 */
public class Demo1 {

    public static void main(String[] args){
        System.out.println("hello");

    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }

    @Test
    public static void TestNgLearn() {
        System.out.println("this is TestNG test case");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
}
