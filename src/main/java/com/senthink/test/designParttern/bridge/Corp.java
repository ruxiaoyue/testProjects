package com.senthink.test.designParttern.bridge;

/**
 * Created by lenovo on 2018/4/3.
 */
public abstract class Corp {

    protected abstract void produce();

    protected abstract void sell();

    public void makeMoney(){
            this.produce();
            this.sell();
    }
}
