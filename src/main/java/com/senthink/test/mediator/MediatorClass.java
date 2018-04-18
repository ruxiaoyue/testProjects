package com.senthink.test.mediator;

/**
 * Created by lenovo on 2018/3/12.
 */
public abstract class MediatorClass {

    public Colleage colleageA;
    public Colleage colleageB;

    public MediatorClass(Colleage a, Colleage b) {
        this.colleageA = a;
        this.colleageB = b;
    }

    public abstract void affectA();

    public abstract void affectB();
}
