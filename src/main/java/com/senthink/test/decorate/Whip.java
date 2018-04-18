package com.senthink.test.decorate;

/**
 * Created by lenovo on 2018/3/6.
 */
public class Whip extends Dressing{

    public Whip(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return super.cost() + 0.2;
    }
}
