package com.senthink.test.designParttern.builderPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/29.
 */
public class ConcrectWomanBuilder implements Builder{

    private final static Logger LOGGER = LoggerFactory.getLogger(ConcrectWomanBuilder.class);

    private Person person;

    public ConcrectWomanBuilder() {
        person = new Person();
    }
    public void builderFoot() {
        LOGGER.debug("builder the foot");
        person.setFoot("builder foot");
    }

    public void builderBody() {
        LOGGER.debug("builder the body");
        person.setBody("builder body");
    }

    public void builderHead() {
        LOGGER.debug("builder the head");
        person.setHead("builder head");
    }

    public Person builderPerson() {
        return person;
    }
}
