package com.senthink.test;


import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.rxjava.ext.unit.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by hyacinth on 2018/1/24.
 */
@RunWith(VertxUnitRunner.class)
public class TestSample {

    @Test(timeout = 1000l)
    public void testSomething(TestContext context) {

    }


    public void testMethod(){
        TestSuite suite = TestSuite.create("the_test_suite");
        suite.test("my_test_case", context -> {
            String s = "value";
            context.assertEquals("value", s);
        });
        suite.run();
    }


}
