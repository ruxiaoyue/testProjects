package com.senthink.test.function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/14.
 */
public class FunctionTest{

    private final static Logger LOGGER = LoggerFactory.getLogger(FunctionTest.class);

    public static void main(String[] args) {
        int n = 20;
        long value = recursion(n);
        int values = recursionTwo(5);
        LOGGER.debug("value={}", value);
        LOGGER.debug("values={}", values);
        testF(new int[]{2,5,1,7,3,4});
    }

    public static long recursion(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }else {
            return n * recursion(n - 1);
        }
    }

    private static int recursionTwo(int m) {
        if (m == 0) {
            return 0;
        }else if (m == 1) {
            return 1;
        }else if (m == 2) {
            return 2;
        }else {
            return recursionTwo(m -1) + recursionTwo(m -2);
        }
    }

    public static void testF(int[] a) {
        int size = a.length;
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size -1; j++) {
                int temp;
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        LOGGER.debug("a={}", a);
    }
}
