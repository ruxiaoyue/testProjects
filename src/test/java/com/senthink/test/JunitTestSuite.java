package com.senthink.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by lenovo on 2018/1/25.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({JunitTest1.class, JunitTest.class})
public class JunitTestSuite {
    private final static Logger LOGGER = LoggerFactory.getLogger(JunitTestSuite.class);

    /*public static void main(String[] args) {
        TestSuite suite = new TestSuite(JunitTest.class, JunitTest1.class, JavaTest.class);
        TestResult result = new TestResult();
        suite.run(result);
        LOGGER.debug("number of test case ={}", result.runCount());
    }*/
}

