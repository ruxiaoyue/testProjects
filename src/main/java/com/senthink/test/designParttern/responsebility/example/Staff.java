package com.senthink.test.designParttern.responsebility.example;

/**
 * Created by lenovo on 2018/3/21.
 */
public class Staff implements StaffAbs{

    private int number;

    private String request;

    public Staff(int number, String request) {
        this.number = number;
        this.request = request;
    }

    public int getNumber() {
        return this.number;
    }

    public String getRequest() {
        return this.request;
    }
}
