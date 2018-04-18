package com.senthink.test.Handler;

import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.client.HttpRequest;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.WebClientOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2017/10/30.
 */
public class WebClientHandler {

    private Vertx vertx;

    private final static Logger LOGGER = LoggerFactory.getLogger(WebClientHandler.class);

    private WebClientHandler(Vertx vertx) {
        this.vertx = vertx;
    }

    public void webClient() {
        WebClientOptions options = new WebClientOptions();
        options.setKeepAlive(false);
        options.setMaxRedirects(10);
        options.setFollowRedirects(false);
        WebClient webClient = WebClient.create(vertx, options);
        HttpRequest request = webClient.get("");
        request.method(HttpMethod.GET);
        request.addQueryParam("param", "value");
        request.setQueryParam("param", "value1");
         webClient.post("").sendBuffer(Buffer.buffer(), re ->{
             if (re.succeeded()) {

             }
         });
         request.timeout(50000);

        webClient.get(8083, "localhost", "/springdemon/student/getAllStudent")
                .addQueryParam("param", "value")
                .send(r ->{
                    if (r.succeeded()) {
                        HttpResponse response = r.result();
                        LOGGER.debug("webClient get success ={}", response.statusCode());
                    }else {
                        LOGGER.debug("webClient get failed ={}", r.cause().getLocalizedMessage());
                    }
                });
    }


}
