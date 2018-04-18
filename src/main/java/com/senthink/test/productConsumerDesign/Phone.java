package com.senthink.test.productConsumerDesign;

/**
 * Created by hyacinth on 2018/3/9.
 */
public class Phone {

    private int id;

    public Phone(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "phone id" + id;
    }
}
