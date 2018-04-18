package com.senthink.test.Handler;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpClientOptions;
import io.vertx.core.http.HttpClientRequest;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.WebClientOptions;
import io.vertx.rxjava.ext.web.client.HttpResponse;
import io.vertx.rxjava.ext.web.client.WebClient;
import io.vertx.rxjava.ext.web.codec.BodyCodec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Single;

import java.util.List;

/**
 * 模拟客户端调用LoRaWAN2.0外网服务器接口测试用户认证
 * Created by hyacinth on 2017/12/27.
 */
public class HttpClientHandler {

    //private final static String LOGIN = "https://larknc.staging.senthink.com/api/login";

    private final static String LOGIN = "https://larknc.staging.senthink.com/api/login";

    //private final static String LIST = "https://larknc.staging.senthink.com/api/node/004A77006600173D";

    private final static String LIST = "http://10.200.0.50:8080/api/node/004A77006600173D";

    private final static String SEND = "http://being-notify.other.ren/lora/up.json";

    private final static String WEISAI = "https://ceshi.icloudcare.com/icare/lora";

    private final Vertx vertx;

    private final static Logger LOGGER = LoggerFactory.getLogger(HttpClientHandler.class);

    public HttpClientHandler(Vertx vertx) {
        this.vertx = vertx;
    }

    public Future<Void> httpClient() {
        HttpClientOptions options = new HttpClientOptions()
                .setSsl(true)
                .setDefaultHost("10.200.2.25");
        HttpClient client = vertx.createHttpClient(options);
        HttpClientRequest request = client.postAbs(WEISAI).handler(response ->{
            response.bodyHandler(handler ->{
                LOGGER.debug("status code ={}", response.statusCode());
                if (response.statusCode() == 200) {

                    /*List<String> cookies = response.cookies();
                    LOGGER.debug("cookie size={}", cookies.size());
                    for (int i = 0; i < cookies.size(); i++) {
                        LOGGER.debug("cookie={}", cookies.get(i));
                    }
                    LOGGER.debug("handler={}", handler.toJsonObject());
                    String accessToken = handler.toJsonObject().getString("accessToken");
                    String authorization = new StringBuilder().append("bearer").append(" ").append(accessToken).toString();
                    //getLists(authorization, cookies);*/
                }else {
                    LOGGER.debug("failed");
                }
            });
        });

        request.exceptionHandler(hand -> {
            hand.printStackTrace();
            LOGGER.debug("requestException::{}", hand.getMessage());
        });

        request.putHeader("content-type", "application/json").putHeader("accept", "application/json");
        request.setTimeout(8000);
        JsonObject body = new JsonObject().put("username", "hyacinth").put("password", "MTIzNDU2");
        request.end(Buffer.buffer(body.encode()));
        return Future.succeededFuture();
    }

    private Future<Void> getLists(String authorization, List<String> cookies){
        HttpClientOptions options = new HttpClientOptions()
                .setSsl(true)
                .setDefaultHost("10.200.0.50");
        HttpClient client = vertx.createHttpClient(options);
        HttpClientRequest request = client.getAbs(LIST, response->{
            LOGGER.debug("get code={}", response.statusCode());
            response.bodyHandler(body ->{
                LOGGER.debug("body={}", body.toJsonObject());
            });
        });


        request.setChunked(true);
        request.putHeader("content-type", "application/json")
                .putHeader("accept", "application/json")
                .putHeader("Authorization", authorization)
        .putHeader("Cookie", cookies);
        request.exceptionHandler(exceptionHandler ->{
            LOGGER.debug("get httpClient exception:{}", exceptionHandler.getMessage());
        });

        request.setTimeout(8000);
        request.end();
        return Future.succeededFuture();
    }

    public void httpsClient(JsonObject data) {
        data.put("time", 125455);

        WebClient webClient = WebClient.create(io.vertx.rxjava.core.Vertx.newInstance(vertx), options(new JsonObject()));
        Single<HttpResponse<JsonObject>> responseSingle = webClient.postAbs(WEISAI)
                .ssl(true)
                .as(BodyCodec.jsonObject())
                .rxSendJsonObject(data);

        responseSingle.subscribe(res -> {
            if (res.statusCode() == 200) {
                LOGGER.debug("success");
            }else {
                LOGGER.debug("r " + res.statusCode());
            }
        });
    }

    private WebClientOptions options(JsonObject config) {
        WebClientOptions options = new WebClientOptions()
                .setKeepAlive(config.getBoolean("keepAlive", true))
                .setIdleTimeout(config.getInteger("idleTimeout", 10))
                .setMaxWaitQueueSize(config.getInteger("maxWaitQueueSize", 100))
                .setConnectTimeout(config.getInteger("connectTimeout", 5000));
        return options;
    }
}
