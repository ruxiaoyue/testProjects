package com.senthink.test.designParttern.flyWeightPattern.currencyClass;

import java.util.HashMap;

/**
 * Created by lenovo on 2018/4/2.
 */
public class FlyweightFactory {

    private static HashMap pool = new HashMap();

    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsic)) {
            flyweight = (Flyweight)pool.get(extrinsic);
        }else {
            flyweight = new ConcreteFlyweight1(extrinsic);
            pool.put(extrinsic, flyweight);
        }
        return flyweight;
    }
}
