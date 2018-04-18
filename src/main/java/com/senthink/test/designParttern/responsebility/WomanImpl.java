package com.senthink.test.designParttern.responsebility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/21.
 */
public class WomanImpl implements WomanAbstrat{

    private int type;

    private String request;

    private final static Logger LOGGER = LoggerFactory.getLogger(WomanImpl.class);

    public WomanImpl(int type, String message) {
        this.type = type;
        this.request = message;

        switch (this.type) {
            case 1:
                LOGGER.debug("女儿的请求是" + this.request);
                break;
            case 2:
                LOGGER.debug("妻子的请求是" + this.request);
                break;
            case 3:
                LOGGER.debug("母亲的请求是" + this.request);
                break;
            default:
                LOGGER.debug("不满足条件");
        }
    }

    public int getType() {
        return this.type;
    }

    public String getRequest() {
        return this.request;
    }
}
