package com.senthink.test.mediator;

/**
 * Created by lenovo on 2018/3/12.
 */
public class MediatorImpl extends MediatorClass{

    public MediatorImpl(Colleage a, Colleage b) {
        super(a, b);
    }

    public void affectA() {
        int number = colleageB.getNumber();
        colleageA.setNumber(number*100);
    }

    public void affectB() {
        int number = colleageA.getNumber();
        colleageB.setNumber(number/100);
    }
}
