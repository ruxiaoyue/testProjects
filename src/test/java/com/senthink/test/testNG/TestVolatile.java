package com.senthink.test.testNG;

import com.senthink.test.Class.volTest.TestVol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
;

/**
 * Created by lenovo on 2018/2/27.
 */
public class TestVolatile {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestVolatile.class);

    @Test
    public void testVolatile() {
        final TestVol testVol = new TestVol();

        for (int i = 0; i < 5; i++) {
            try{
                new Thread("testVol") {
                    public void run() {
                        for (int j = 0; j < 5; j++) {
                            testVol.increase();
                        }
                    }
                }.start();
            }catch (Exception e) {

            }

        }
        LOGGER.debug("active count={}", Thread.activeCount());

        /*while (Thread.activeCount() > 1)
            Thread.yield();*/


        LOGGER.debug("i ={}", testVol.inc);
    }
}
