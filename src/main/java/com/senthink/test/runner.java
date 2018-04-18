package com.senthink.test;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2017/9/19.
 */
public class runner {

    private static final Logger LOGGER = LoggerFactory.getLogger(runner.class);

    /**
     * main方法 程序入口
     * @param arg
     */
    public static void main(String[] arg) {
        Vertx vertx = Vertx.vertx();
        DeploymentOptions options = new DeploymentOptions();
        options.setConfig(new JsonObject().put("host", "0.0.0.0").put("port", 9070));//
        //vertx.deployVerticle(MqttVerticle.class.getCanonicalName(), options, result ->{
        vertx.deployVerticle(VerticleSimple.class.getCanonicalName(), options, result ->{
            if (result.succeeded()) {
                LOGGER.debug("verticle deploy success");
            }else {
                LOGGER.debug("Verticle deploy faield ::{}", result.cause().getLocalizedMessage());
            }
        });
    }
}
