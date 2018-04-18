package com.senthink.test.mediator;

/**
 * Created by lenovo on 2018/3/12.
 */
public class ColleageA extends Colleage{

    public void setNumber(int number, MediatorClass mediatorClass) {
        this.setNumber(number);
        //colleage.setNumber(number*100);
        mediatorClass.affectB();
    }
}
