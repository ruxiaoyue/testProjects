package com.senthink.test.designParttern.factory.simple;


/**客户类
 * Created by lenovo on 2018/3/15.
 */
public class Customer {

    public static void main(String[] args) {
        FactoryExample factory = new FactoryExample("BMW320");
        factory.product();
    }
}
