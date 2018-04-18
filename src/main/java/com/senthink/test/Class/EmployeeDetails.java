package com.senthink.test.Class;

/**
 * Created by lenovo on 2018/1/25.
 */
public class EmployeeDetails {

    private String name;

    private double Monthlysalary;

    private int age;

    public double getMonthlysalary() {
        return Monthlysalary;
    }

    public void setMonthlysalary(double monthlysalary) {
        Monthlysalary = monthlysalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
