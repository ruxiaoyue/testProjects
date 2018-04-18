package com.senthink.test;

import com.senthink.test.Class.EmpBusinessLogic;
import com.senthink.test.Class.EmployeeDetails;

import static org.junit.Assert.assertEquals;

/**
 * Created by lenovo on 2018/1/25.
 */
public class TestEmployeeDetails {

    EmpBusinessLogic empBusinessLogic =new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    //test to check appraisal
    @org.junit.Test(timeout = 1000l)
    public void testCalculateAppriasal() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlysalary(8000);
        double appraisal= empBusinessLogic.calculateAppraisal(employee);
        assertEquals(500, appraisal, 0.0);
    }

    // test to check yearly salary
    @org.junit.Test
    public void testCalculateYearlySalary() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlysalary(8000);
        double salary= empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96000, salary, 0.0);
    }
}
