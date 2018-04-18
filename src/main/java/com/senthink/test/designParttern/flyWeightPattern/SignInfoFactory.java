package com.senthink.test.designParttern.flyWeightPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lenovo on 2018/4/2.
 */
public class SignInfoFactory {

    private static ConcurrentHashMap<String, SignInfo> pool = new ConcurrentHashMap<>();

    private final static Logger LOGGER = LoggerFactory.getLogger(SignInfoFactory.class);
    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result;
        if (pool.containsKey(key)) {
            LOGGER.debug("直接从池中获取");
            result = pool.get(key);
        }else {
            LOGGER.debug("建立对象并放到pool中" + key);
            result = new SignInfo();
            pool.put(key, result);
        }
        return result;
    }
}
