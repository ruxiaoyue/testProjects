package com.senthink.test.exceptionTest;

import com.senthink.test.Exception.Aexception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2018/3/2.
 */
public class SortException {

    private final static Logger LOGGER = LoggerFactory.getLogger(SortException.class);

    public static int quotient(int x, int y) throws Aexception {
        if (y < 0) {
            throw new Aexception("aException");
        }
        LOGGER.debug("sortException go on");
        return x/y;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = -8;
        try{
            int result = quotient(a, b);
            LOGGER.debug("result={}", result);
        }catch (Aexception e) {
            LOGGER.debug("aException={}", e.getMessage());
        }catch (ArithmeticException e) {
            LOGGER.debug("除数不能为0");
        }catch (Exception e) {
            LOGGER.debug("程序发生了其他异常");
        }
        LOGGER.debug("main end");

    }
}
