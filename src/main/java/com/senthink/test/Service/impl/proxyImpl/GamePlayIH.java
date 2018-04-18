package com.senthink.test.Service.impl.proxyImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lenovo on 2018/2/2.
 */
public class GamePlayIH implements InvocationHandler{

    private final static Logger LOGGER = LoggerFactory.getLogger(GamePlayIH.class);

    //被代理者
    private Class cls;
    //被代理的实例
    private Object object;

    public GamePlayIH(Object o) {
        this.object = o;
    }

    public Object invoke(Object object, Method method, Object[] args) throws Exception{
        if (method.getName().equalsIgnoreCase("login")) {
            LOGGER.debug("有人登录我的账号");
        }
        return method.invoke(this.object, args);
    }
}
