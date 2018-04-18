package com.senthink.test;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Class.PrimeNumberChecker;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by hyacinth on 2018/1/25.
 */
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(PrimeNumberCheckerTest.class);

    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void initalize() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    public PrimeNumberCheckerTest(Integer inputNumber,Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection prieNumbers() {
        return Arrays.asList(new Object[][]{
            {2, true},{6, false},{19, true}
        });
    }

    @org.junit.Test
    public void testPrimNumberChecker() {
        LOGGER.debug("Parameterized Number is={}", inputNumber);
        assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
    }
}
