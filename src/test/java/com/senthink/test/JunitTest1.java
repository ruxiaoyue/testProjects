package com.senthink.test;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

/**
 * Created by lenovo on 2018/1/25.
 */
public class JunitTest1 extends TestResult{
    //add the error
    public synchronized void addError(Test test, Throwable t) {
        super.addError((junit.framework.Test) test, t);
    }
    //add the failure
    public synchronized void addFailure(Test test, AssertionFailedError t) {
        super.addFailure((junit.framework.Test)test, t);
    }

    @org.junit.Test
    public void testAdd() {

    }

    public synchronized void stop() {}
}
