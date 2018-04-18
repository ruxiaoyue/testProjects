package com.senthink.test;

import com.senthink.test.Exception.Aexception;
import com.senthink.test.Exception.Bexception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2017/11/29.
 */
public class ExceptionTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionTest.class);

    public static void main(String[] arg) throws Exception{

        try{
            testMath();
            testException();
            test(3);
        }catch (Exception e) {
            LOGGER.debug("catch aException");
            e.printStackTrace();
            if (e instanceof Aexception || e instanceof Bexception) {
                LOGGER.debug("catch aException");
                e.printStackTrace();
            }else {
                LOGGER.debug("both not");
            }
        }
    }

    public static void test(int interger) throws Aexception, Bexception{
        if (interger > 2) {
            throw new Aexception("aexception");
        }
        if (interger < 4) {
            throw new Bexception();
        }
    }

    public static void testException() throws Exception{

        int a = 12;
        int b = 2;
        int c;
        for (int i = 0; i < 3; i++) {
            b--;
            c = a/b;
            LOGGER.debug("c={}", c);
        }
    }

    public static void testMath() {
        int i = 1512093500;
        int j = 3;
        int testMod = Math.floorMod(11,3);
        int mod = Math.floorMod(i, j);
        LOGGER.debug("mod ={}, testMod ={}", mod, testMod);
    }
}
