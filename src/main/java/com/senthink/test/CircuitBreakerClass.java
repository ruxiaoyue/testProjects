package com.senthink.test;

import io.vertx.circuitbreaker.CircuitBreaker;
import io.vertx.circuitbreaker.CircuitBreakerOptions;
import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2017/12/4.
 */
public class CircuitBreakerClass {

    private final static Logger LOGGER = LoggerFactory.getLogger(CircuitBreakerClass.class);

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        CircuitBreakerOptions options = new CircuitBreakerOptions();
        options.setTimeout(2000);
        options.setFallbackOnFailure(true);
        options.setResetTimeout(1000);
        options.setMaxFailures(10);
        CircuitBreaker circuitBreaker = CircuitBreaker.create("circuit-breaker", vertx, options);
        circuitBreaker.execute(r ->{
            vertx.createHttpServer().listen(8010, "0.0.0.0", future ->{
               if (future.succeeded()) {
                   LOGGER.debug("success create a httpServer");
               }else {
                   LOGGER.debug("failed to create a httpServer cause::{}", future.cause());
               }
            });
        }).setHandler(re ->{
            LOGGER.debug("re::{}", re.result());
        });
    }
}
