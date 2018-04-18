package com.senthink.test.decorate;

/**
 * Created by lenovo on 2018/3/6.
 */
public class Dressing implements Coffee{

    private Coffee coffee;

    public Dressing(Coffee coffee) {
        this.coffee = coffee;
    }
    public double cost() {
        return coffee.cost();
    }
}
