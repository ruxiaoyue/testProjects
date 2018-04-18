package com.senthink.test.designParttern.interpreterPattern.example;

/**
 * Created by lenovo on 2018/4/4.
 */
public abstract class ExpressionEx {

    public abstract int interpret(Context context);

    public abstract boolean equals(Object object);

    public abstract int hashCode();

    public abstract String toString();
}
