package com.senthink.test;

import io.vertx.core.json.JsonArray;
import io.vertx.redis.RedisOptions;
import io.vertx.rxjava.core.Vertx;
import io.vertx.rxjava.redis.RedisClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Observable;

/**
 * Created by hyacinth on 2017/11/28. redisClientTest
 */
public class RedisTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(RedisTest.class);

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        RedisOptions redisOptions = new RedisOptions().setHost("10.200.2.118");

        String a = "jh";
        a.equalsIgnoreCase("");
        a.hashCode();

        try{
            Observable.range(1,10)
                    .subscribe(integer -> {
                        RedisClient client = RedisClient.create(vertx, redisOptions);

                        try{
                            client.ping(v -> {
                                LOGGER.debug("start" + integer);
                                Observable<Integer> ob = Observable.range(1, 100);

                                Observable<Long> set = ob.flatMap(rm -> client.hsetnxObservable("testRedis", null, "test"));

                                Observable<String> get = ob.flatMap(r -> client.hgetObservable("testRedis", null));

                                Observable<JsonArray> key = ob.flatMap(r -> client.hkeysObservable("testRedis"));

                                Observable.merge(set, get, key)
                                        .finallyDo(() -> client.closeObservable().subscribe())
                                        .subscribe();
                            });
                        }catch (Exception e) {
                            LOGGER.debug("Exception e={}", e.getCause().getLocalizedMessage());
                        }


                    });
        }catch (Exception e) {
            LOGGER.debug("e :: {}", e.getCause().getLocalizedMessage());
        }

    }
}
