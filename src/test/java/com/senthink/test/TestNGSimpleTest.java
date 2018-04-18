package com.senthink.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by lenovo on 2018/1/26.
 */
public class TestNGSimpleTest {

    @Test
    public void testAdd() {
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine", str);
    }
}
