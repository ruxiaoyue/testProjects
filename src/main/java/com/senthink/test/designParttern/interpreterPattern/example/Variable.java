package com.senthink.test.designParttern.interpreterPattern.example;

/**
 * Created by lenovo on 2018/4/4.
 */
public class Variable extends ExpressionEx{

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if ( o!= null && o instanceof Variable) {
            return this.name.equalsIgnoreCase(((Variable)o).name);
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return name;
    }

    public int interpret(Context context) {
        return context.lookup(this);
    }
}
