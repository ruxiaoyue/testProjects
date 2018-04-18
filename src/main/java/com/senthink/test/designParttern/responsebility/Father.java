package com.senthink.test.designParttern.responsebility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/21.
 */
public class Father extends IHandler{

    private final static Logger LOGGER = LoggerFactory.getLogger(Father.class);

    public Father() {
        super(FL);
    }

    @Override
    public void response(WomanImpl woman) {
        LOGGER.debug("女儿像父亲请求");
        LOGGER.debug("father is handling request "+ woman.getRequest());
    }
}
