package com.senthink.test;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2017/9/19.
 */
public class MyFirstVerticle extends AbstractVerticle{

    private final static Logger LOGGER = LoggerFactory.getLogger(MyFirstVerticle.class);

    public void start(Future<Void> future) {
        Vertx vertx = Vertx.vertx();

        vertx.createHttpServer().requestHandler(r ->{
            LOGGER.debug("get request from client");
            r.response().end("<h1>Hello from my first " +
                    "Vert.x 3 application</h1>");
        }).listen(8060, handler ->{
            if (handler.failed()) {
                future.fail( handler.cause().getLocalizedMessage());
            }else {
                future.complete();
            }
        });
    }
}
