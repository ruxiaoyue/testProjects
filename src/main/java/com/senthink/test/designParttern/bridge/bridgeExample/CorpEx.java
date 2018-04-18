package com.senthink.test.designParttern.bridge.bridgeExample;

/**
 * Created by lenovo on 2018/4/3.
 */
public abstract class CorpEx {

    private Product product;

    public CorpEx(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }
}
