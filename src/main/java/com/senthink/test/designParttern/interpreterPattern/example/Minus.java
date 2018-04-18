package com.senthink.test.designParttern.interpreterPattern.example;

/**
 * Created by lenovo on 2018/4/4.
 */
public class Minus extends ExpressionEx{

    private ExpressionEx left, right;

    public Minus(ExpressionEx left, ExpressionEx right) {
        this.left = left;
        this.right = right;
    }

    public boolean equals(Object o) {
        if (o != null && o instanceof Minus) {
            return left.equals(((Minus) o).left) && right.equals(((Minus) o).right);
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public int interpret(Context context){
        return left.interpret(context) - right.interpret(context);
    }

    public String toString() {
        return "(" +left.toString() +"-" + right.toString() + ")";
    }
}
