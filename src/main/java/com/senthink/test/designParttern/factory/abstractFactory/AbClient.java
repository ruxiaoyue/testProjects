package com.senthink.test.designParttern.factory.abstractFactory;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/15.
 */
public class AbClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(AbClient.class);

    public static void main(String[] args) {
        /*AbstrFactory factory = new BWM320F();
        factory.create();*/

        Gson gson = new Gson();

        String sign = "p30nIPyTZ8kZOe89k25MLBEheugxPuImpSEKUNQ0clU=";
        gson.toJson(sign);
        LOGGER.debug("gson={}", gson.toJson(sign));
    }
}
