package com.senthink.test.Class.volTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/2/27.
 */
public class TestMain {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestMain.class);

    public static void main(String[] args) {
        int im = 0;
        final TestVol testVol = new TestVol();

        for(int i = 0;i < 10 ;i++){
            LOGGER.debug("i={}", i);
            new Thread("testVol"){
                public void run() {
                    for(int j = 0;j < 10;j++)
                        testVol.increase();
                }
            }.start();
        }
        LOGGER.debug("activeCount={}", Thread.activeCount());
        while ( im == 0) {
            im++;
            Thread.yield();
        }
        LOGGER.debug("final inc={}", testVol.inc);
    }
}
