package com.senthink.test.designParttern.interpreterPattern;

import java.util.HashMap;

/**
 * Created by lenovo on 2018/4/4.
 */
public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left, Expression right){
        super(left, right);
    }

    public int interpreter(HashMap var){
        return super.left.interpreter(var) + super.rigth.interpreter(var);
    }
}
