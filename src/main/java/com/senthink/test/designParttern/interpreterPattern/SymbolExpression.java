package com.senthink.test.designParttern.interpreterPattern;

/**
 * Created by lenovo on 2018/4/4.
 */
public abstract class SymbolExpression extends Expression{
    protected Expression left;

    protected Expression rigth;

    public SymbolExpression(Expression left, Expression rigth) {
        this.left = left;
        this.rigth = rigth;
    }
}
