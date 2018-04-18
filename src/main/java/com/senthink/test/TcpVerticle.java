package com.senthink.test;

import com.senthink.test.Handler.ConnectHandler;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.net.NetServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by lenovo on 2017/10/25.
 */
public class TcpVerticle extends AbstractVerticle{


    private final static Logger LOGGER = LoggerFactory.getLogger(TcpVerticle.class);

    private ConnectHandler connectHandler;



    public void start(Future<Void> voidFuture) {
        connectHandler = new ConnectHandler();
        LOGGER.debug("start");
        NetServer server = vertx.createNetServer();
        /*server.connectHandler(netSocket -> {
            netSocket.handler(buffer -> {
                LOGGER.debug("buffer={}", buffer);
            });
        });*/

        server.connectHandler(connectHandler);
        server.listen(8434, "10.200.2.25", res ->{
            if (res.succeeded()) {
                LOGGER.debug("server is listening");
                voidFuture.succeeded();
            }else {
                LOGGER.debug("listening is failed={}", res.cause().getLocalizedMessage());
                voidFuture.failed();
            }
        });

    }
}
