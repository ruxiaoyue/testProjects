package com.senthink.test;

import com.senthink.test.Class.Police;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2017/12/4.
 */
public class TestEqual {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestEqual.class);

    public static void main(String[] args) {
        String a = new String("100");
        String b = new String("100");

        LOGGER.debug("a equals b::{}", a.equals(b));

        Integer i = new Integer(10);
        Long j = new Long(10);
        Integer.valueOf(i);
        if (a.equalsIgnoreCase(b))
            LOGGER.debug("if is ture");

        LOGGER.debug("i equals j ::{}", j.equals(i));

        Police p1 = new Police();
        Police p2 = new Police();
        LOGGER.debug("p1 equals p2::{}", p1.equals(p2));

        Integer m = new Integer(1000);
        Integer n = new Integer(1000);
        LOGGER.debug("m equals n::{}, ==::{}", m.equals(n), m == n);

    }
}
