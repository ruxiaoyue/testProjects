package com.senthink.test.testNG;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

/**
 * Created by lenovo on 2018/2/5.
 */
public class Simple1 {

    private final static Logger LOGGER = LoggerFactory.getLogger(Simple1.class);

    @BeforeClass
    public void before() {
        LOGGER.debug("before class");
    }

    @Test(groups = {"fast"})
    public void testFaset() {
        LOGGER.debug("test FASET");
    }

    @Test(groups = {"slow"})
    public void testSlow() {
        LOGGER.debug("test slow");
    }

    @AfterClass
    public void afterTest() {
        LOGGER.debug("after class");
    }
}
