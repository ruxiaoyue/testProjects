package com.senthink.test.designParttern.interpreterPattern;

import java.util.HashMap;

/**
 * Created by lenovo on 2018/4/4.
 */
public class VarExpression extends Expression{

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    public int interpreter(HashMap var) {
        return (int)var.get(key);
    }
}
