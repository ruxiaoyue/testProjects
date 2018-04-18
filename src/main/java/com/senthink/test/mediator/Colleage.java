package com.senthink.test.mediator;

/**
 * Created by lenovo on 2018/3/12.
 */
public abstract class Colleage {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void setNumber(int number, MediatorClass mediatorClass);
}
