package com.senthink.test.designParttern.interpreterPattern.example;


/**
 * Created by lenovo on 2018/4/4.
 */
public class PlusEx extends ExpressionEx{

    private ExpressionEx left, rigth;

    public PlusEx(ExpressionEx left, ExpressionEx right) {
        this.left = left;
        this.rigth = right;
    }

    public boolean equals(Object o) {
        if (o != null && o instanceof PlusEx) {
            return left.equals(((PlusEx) o).left) && rigth.equals(((PlusEx)o).rigth);
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public int interpret(Context ctx) {
        return left.interpret(ctx) + rigth.interpret(ctx);
    }

    public String toString() {
        return "(" + left.toString() + "+" + rigth.toString() +")";
    }
}
