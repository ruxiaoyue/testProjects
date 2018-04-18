package com.senthink.test.designParttern.responsebility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2018/3/21.
 */
public class Husband extends IHandler{

    private final static Logger LOGGER = LoggerFactory.getLogger(Husband.class);

    public Husband() {
        super(HL);
    }


    public void response(WomanImpl woman) {
        LOGGER.debug("wife 向 husband 请求 " + woman.getRequest());
        LOGGER.debug("husband  response is accept");
    }

}
