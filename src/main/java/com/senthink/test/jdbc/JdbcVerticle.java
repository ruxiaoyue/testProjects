package com.senthink.test.jdbc;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.ext.jdbc.JDBCClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/30.
 */
public class JdbcVerticle extends AbstractVerticle{

    private final static Logger LOGGER = LoggerFactory.getLogger(JdbcVerticle.class);

    public void start(Future<Void> future) {
        LOGGER.debug("config" + config());
        JDBCClient jdbcClient = JDBCClient.createShared(vertx, config(), "My-Whisky-Collection");
        jdbcClient.getConnection(re ->{
            if (re.failed()){
                LOGGER.debug("re failed " + re.cause().getMessage());
                re.cause().printStackTrace();
            }
        });

    }
}
