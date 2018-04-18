package com.senthink.test.designParttern.interpreterPattern.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/4/4.
 */
public class ClientEx {
    private final static Logger LOGGER = LoggerFactory.getLogger(ClientEx.class);

    public static void main(String[] args) {
        Context context = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant c = new Constant(1);
        context.assign(x, 2);
        context.assign(y, 3);
        ExpressionEx exp = new PlusEx(new PlusEx(c, x), new Minus(y, x));
        LOGGER.debug(exp.toString() + "=" + exp.interpret(context));

    }
}
