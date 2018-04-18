package com.senthink.test.decorate;

/**
 * Created by lenovo on 2018/3/6.
 */
public class Mocha extends Dressing{

    public Mocha(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return super.cost() + 0.1;
    }
}
