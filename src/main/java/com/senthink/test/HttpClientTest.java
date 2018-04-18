package com.senthink.test;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import com.senthink.test.Handler.HttpClientHandler;

/**
 * Created by lenovo on 2017/12/27.
 */
public class HttpClientTest {

    private final static int concurrencyNumber = 1000;

    public static void main(String[] args) {

        HttpClientHandler httpClientHandler = new HttpClientHandler(Vertx.vertx());

        //httpClientHandler.httpClient();
        httpClientHandler.httpsClient(new JsonObject());
    }
}
