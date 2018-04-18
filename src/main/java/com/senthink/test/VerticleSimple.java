package com.senthink.test;

import com.senthink.test.Handler.RequestHandler;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.net.*;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.CorsHandler;
import io.vertx.redis.RedisClient;
import io.vertx.redis.RedisOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hyacinth on 2017/9/18.
 */
public class VerticleSimple extends AbstractVerticle{

    private final static Logger LOGGER = LoggerFactory.getLogger(VerticleSimple.class);

    private RequestHandler requestHandler;

    //private HttpClientHandler httpClientHandler = new HttpClientHandler(vertx);
    public void start(Future<Void> voidFuture) {
        //EventBus eventBus = vertx.eventBus();
        //redisServer(vertx);

        vertx.createHttpServer().requestHandler(createRouter()::accept)
                .listen(8090, "10.200.2.25", result->{
            if (result.failed()) {
                voidFuture.fail(result.cause());
            }else {
                LOGGER.debug("httpServer start success");
                voidFuture.succeeded();
            }
        });

        //httpClientHandler.httpClient();

        //server(vertx);
        this.requestHandler = new RequestHandler();

        /*vertx.setPeriodic(10000, handler-> {
            //socketJsSend();
            LOGGER.debug("eventBus send data");
            //eventBus.publish("feed", new JsonObject().put("time", new Date().toString()));
            eventBus.send("feed", "eventBus send", reply->{
                if (reply != null) {
                    if (reply.succeeded()) {
                        LOGGER.debug("succeed={}", reply.result().body());
                    }else {
                        LOGGER.debug("failed={}", reply.cause());
                    }
                }else {
                    LOGGER.debug("reply is null");
                }

            });
        });*/

        /*eventBus.consumer("feed", r ->{
            LOGGER.debug("consummer r ={}", r.body());
            r.reply("message is reached successly");
        });*/




    }

    private Router createRouter() {
        Router router = Router.router(vertx);

        router.route().handler(BodyHandler.create());

        //router.route().handler(StaticHandler.create());

        enableCorsSupport(router);

        router.get("/index").handler(routingContext -> requestHandler.loginPage(routingContext));

        router.post("/api/hdis/up").handler(context -> requestHandler.nodeUpDataHandler(context));

        return router;
    }


    protected void enableCorsSupport(Router router) {

        Set<String> allowHeaders = new HashSet<>();
        allowHeaders.add("x-requested-with");
        allowHeaders.add("Access-Control-Allow-Origin");
        allowHeaders.add("origin");
        allowHeaders.add("Content-Type");
        allowHeaders.add("accept");
        allowHeaders.add("Authorization");

        Set<HttpMethod> allowMethods = new HashSet<>();
        allowMethods.add(HttpMethod.GET);
        allowMethods.add(HttpMethod.POST);
        allowMethods.add(HttpMethod.DELETE);
        allowMethods.add(HttpMethod.PATCH);
        allowMethods.add(HttpMethod.PUT);

        router.route().handler(CorsHandler.create("*")
                .allowedHeaders(allowHeaders)
                .allowedMethods(allowMethods));
    }

    private void server(Vertx vertx) {
        NetServerOptions options = new NetServerOptions().setPort(8400);
        NetServer server = vertx.createNetServer(options);


        server.connectHandler(socket -> {
            LOGGER.debug("recieve a connect");
            socket.handler(buffer -> {
                LOGGER.debug("server received some bytes={} length={}", buffer, buffer.length());
            });
            Buffer buffer = Buffer.buffer().appendInt(123);
            socket.write(buffer);

            socket.closeHandler(v ->{
                LOGGER.debug("the socket has been closed");
            });

            socket.exceptionHandler(e ->{
                LOGGER.debug("exception handler");
            });
        });

        server.close(result ->{
            if (result.succeeded()) {
                LOGGER.debug("server is now closed");
            }
        });

        server.listen(8400, "0.0.0.0", res -> {
            if (res.succeeded()) {
                LOGGER.debug("server is now listening!");
            }else {
                LOGGER.debug("failed to bind");
            }
        });

    }

    private void createClient() {
        NetClientOptions options = new NetClientOptions()
                .setConnectTimeout(10000)
                .setReconnectAttempts(10)
                .setReconnectInterval(500);
        NetClient client = vertx.createNetClient(options);
        client.connect(8400, "0.0.0.0", res ->{
            if (res.succeeded()) {
                LOGGER.debug("connected!");
                NetSocket socket = res.result();
            }else {
                LOGGER.debug(" client failed to connect +{}", res.cause().getMessage());
            }
        });
    }

    private void redisServer(Vertx vertx) {
        RedisOptions options = new RedisOptions().setHost("10.200.2.118");
        RedisClient redisClient = RedisClient.create(vertx, options);

        redisClient.hget("lark_task_queue:1111:task:398", "filed", r ->{
            if (r.succeeded()) {
                LOGGER.debug("get success r ={}", r.result());
            }else {
                LOGGER.debug("get failed cause={}", r.cause().getLocalizedMessage());
            }
        });
    }

}
