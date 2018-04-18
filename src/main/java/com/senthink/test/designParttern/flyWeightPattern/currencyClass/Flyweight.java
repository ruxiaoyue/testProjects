package com.senthink.test.designParttern.flyWeightPattern.currencyClass;

/**
 * Created by lenovo on 2018/4/2.
 */
public abstract class Flyweight {

    private String intrinsic;

    protected final String extrinsic;

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
