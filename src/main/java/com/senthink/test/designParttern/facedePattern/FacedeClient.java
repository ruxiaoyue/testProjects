package com.senthink.test.designParttern.facedePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/20.
 */
public class FacedeClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(FacedeClient.class);

    public static void main(String[] args) {
        Facede face = new Facede();
        face.test();
    }
}
