package com.senthink.test.designParttern.interpreterPattern.example;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/4/4.
 */
public class Context {

    private Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable var, int value) {
        map.put(var, new Integer(value));
    }

    public int lookup(Variable var) throws IllegalArgumentException{
        Integer value = map.get(var);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value.intValue();
    }
}
