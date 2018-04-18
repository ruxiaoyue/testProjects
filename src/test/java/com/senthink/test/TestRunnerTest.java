package com.senthink.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

/**
 * Created by hyacinth on 2018/1/26.
 */
public class TestRunnerTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(TestRunnerTest.class);

    /*EmployeeDetails employ = new EmployeeDetails();
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    @Test
    public void testMain() throws Exception {
        LOGGER.debug("test");
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine", str);
    }
*/
    /*@Test
    public void testTrue() throws AssertionFailedError{
        try{
            String s = "nd";
            assertNull("s not null", s == null);
        }catch (AssertionError e){
            LOGGER.debug("e ={}", e.getMessage());
        }
    }

    @Test
    public void testCalculateAppriasal() {
        employ.setName("rejeev");
        employ.setAge(25);
        employ.setMonthlysalary(4000);
        double appraisal = empBusinessLogic.calculateAppraisal(employ);
        Assert.assertEquals(500, appraisal, 0.0, "500");
    }

    @Test
    public void testCaculateYearlySalary() {
        employ.setMonthlysalary(12000);
        employ.setName("man");
        employ.setAge(25);
        double salary = empBusinessLogic.calculateYearlySalary(employ);
        Assert.assertEquals(144000, salary, 0.0, "8000");
    }*/

    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }

    // test case 2
    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("in beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("in afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("in beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("in afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("in beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("in afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("in beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("in afterSuite");
    }

}