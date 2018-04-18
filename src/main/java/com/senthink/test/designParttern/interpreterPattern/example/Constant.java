package com.senthink.test.designParttern.interpreterPattern.example;

/**
 * Created by lenovo on 2018/4/4.
 */
public class Constant extends ExpressionEx{

    private int value;

    public Constant(int value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        if (o != null && o instanceof Constant) {
            return this.value == ((Constant)o).value;
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public int interpret(Context context) {
        return value;
    }

    public String toString() {
        return new Integer(value).toString();
    }
}
