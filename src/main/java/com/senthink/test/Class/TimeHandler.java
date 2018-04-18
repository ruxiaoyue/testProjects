package com.senthink.test.Class;

import com.senthink.test.Util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lenovo on 2018/1/31.
 */
public class TimeHandler implements InvocationHandler{

    private DateUtil dateUtil;

    public Object target;

    private final static Logger LOGGER = LoggerFactory.getLogger(TimeHandler.class);

    public TimeHandler(Object target) {
        super();
        this.target = target;
        dateUtil = new DateUtil();
    }

    public Object invoke(Object o, Method method, Object[] os) throws Exception{
        String time = dateUtil.getNow();
        LOGGER.debug("start time::{}", time);
        method.invoke(target, os);
        LOGGER.debug("after={}", dateUtil.getNow());
        return null;
    }
}
