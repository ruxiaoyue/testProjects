package com.senthink.test.designParttern.interpreterPattern;


import java.util.Stack;

/**
 * Created by lenovo on 2018/4/4.
 */
public class Calculator {

    private Expression expression;

    public Calculator(String expStr) {
        Stack stack = new Stack();
        char[] charArray = expStr.toCharArray();
        Expression left = null;
        Expression right = null;
        for (String token: expStr.split(" ")) {
            if (token.equalsIgnoreCase("+")){
                left = (Expression)stack.pop();
                right = (Expression) stack.pop();
                Expression subExpression = new AddExpression(left, right);
                stack.push(subExpression);
            }else if (token.equalsIgnoreCase("-")) {
                right = (Expression) stack.pop();
                left = (Expression) stack.pop();
                Expression susExpression = new SubExpression(left, right);
                stack.push(susExpression);
            }else {
                stack.push(new VarExpression(token));
            }
        }
        expression = (Expression) stack.pop();
     }
}
