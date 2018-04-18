package com.senthink.test.testNG;

import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpClientOptions;
import io.vertx.core.http.HttpClientRequest;
import io.vertx.core.json.JsonObject;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/2/7.
 */
public class LoRaWANTest {

    private Vertx vertx;

    private final static Logger LOGGER = LoggerFactory.getLogger(LoRaWANTest.class);

    private String baseUrl = "https://larknc.staging.senthink.com";

    private String loginUrl = "/api/login";

    private String getListUrl = "/api/api/core/node/uplink/004A77006600173D";

    private HttpClient httpClient;

    @Before
    public void setUp() {
        this.vertx = Vertx.vertx();
        LOGGER.debug("setUp");
        vertx = Vertx.vertx();
        HttpClientOptions options = new HttpClientOptions()
                .setSsl(true).setDefaultHost("10.200.0.50");
        httpClient = vertx.createHttpClient(options);

    }

    @Test
    public void testLogin() {
        String url = baseUrl + loginUrl;
        LOGGER.debug("loginUrl={}", url);
        if (httpClient == null) {
            LOGGER.debug("httpClient null");
        }

        HttpClientRequest request = httpClient.postAbs(url, handler->{
            LOGGER.debug("code={}", handler.statusCode());
            if (handler.statusCode() == 200) {
                LOGGER.debug("request success");
                handler.bodyHandler(body -> {
                    LOGGER.debug("body={}", body.toJsonObject());
                });
            }else {
                LOGGER.debug("failed");
            }
        });
        JsonObject body = new JsonObject().put("username", "hyacinth").put("password", "MTIzNDU2");
        request.exceptionHandler(exception -> {
            LOGGER.error("LorawanTest:: http request exception: {}", exception.getLocalizedMessage());
            exception.printStackTrace();
        });

        request.putHeader("content-type", "application/json");
                //.putHeader("accept", "application/json");
        request.setTimeout(8000);
        request.end(Buffer.buffer(body.encode()));

    }
 }
