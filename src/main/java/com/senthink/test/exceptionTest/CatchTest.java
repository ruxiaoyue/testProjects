package com.senthink.test.exceptionTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2018/3/5.
 */
public class CatchTest {

    private static boolean value = true;

    private final static Logger LOGGER = LoggerFactory.getLogger(CatchTest.class);

    public static void main(String[] args) {
        try{
            testException(value);
        }catch (Exception e) {
            LOGGER.debug("main exception catch");
        }finally {
            LOGGER.debug("main finanlly ");
        }

        LOGGER.debug("main end");

    }

    public static boolean testException(boolean value) throws Exception{
        try{
            testExceptionOne(value);
        }catch (Exception e) {
            LOGGER.debug("testException catch exception");
            throw e;
        }finally {
            value = false;
            LOGGER.debug("testException finally value={}", value);
            return value;
        }
    }

    private static boolean testExceptionOne(boolean value) throws Exception{
        try {
            testExceptionTwo(value);
        }catch (Exception e) {
            LOGGER.debug("testExceptionOne catch excepton");
            throw new Exception("45");
        }finally {
            value = false;
            LOGGER.debug("testExceptionOne finally value ={}", value);
            return value;
        }
    }

    private static boolean testExceptionTwo(boolean value) throws Exception{
        try{
            int a = 1;
            for (int i = 2; i > -2 ; i--) {
                LOGGER.debug("i={}", i);
                a = a/i;
            }
        }catch (Exception e) {
            LOGGER.debug("testExceptionTwo catch exception:{}", e.getMessage());
            throw new Exception("E={}" + e.getMessage());
        }finally {
            value = false;
            LOGGER.debug("testExceptionTwo finally value ={}", value);
            return value;
        }
    }
}
