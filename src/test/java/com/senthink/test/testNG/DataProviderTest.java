package com.senthink.test.testNG;

import com.senthink.test.Class.testClass.PrimeNumberChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2018/2/7.
 */
public class DataProviderTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(DataProviderTest.class);

    private PrimeNumberChecker primeNumberChecker;

    @BeforeTest
    public void setup() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider() {
        return new Object[][]{{5,true}, {6, false}, {15, false}};
    }

    @Test(dataProvider = "data")
    public void testNumber(Integer num, Boolean result) {
        LOGGER.debug("num={}, result={}", num, result);
        Assert.assertEquals(result, primeNumberChecker.checkerNumer(num));
    }
}
