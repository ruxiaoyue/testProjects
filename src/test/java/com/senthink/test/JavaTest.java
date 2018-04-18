package com.senthink.test;

import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/1/25.
 */
public class JavaTest extends TestCase{

    private final static Logger LOGGER = LoggerFactory.getLogger(TestCase.class);

    protected double value1, value2;

    protected void setUp() {
        value1=2.0;
        value2=3.0;
    }

    public void testAdd(){
        LOGGER.debug("no of test case={}", this.countTestCases());
        String name = this.getName();
        LOGGER.debug("Test case name={}", name);
        this.setName("testNewAdd");
        LOGGER.debug("update Test case name ={}", this.getName());
    }

    public void tearDown() {}
}
