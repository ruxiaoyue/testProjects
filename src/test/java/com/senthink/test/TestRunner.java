package com.senthink.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/1/25.
 */
public class TestRunner {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestRunner.class);

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestNGSimpleTest.class);
        for (Failure failure : result.getFailures()) {
            LOGGER.debug("failure={}", failure.toString());
        }
        LOGGER.debug("result={}", result.wasSuccessful());
    }
}
