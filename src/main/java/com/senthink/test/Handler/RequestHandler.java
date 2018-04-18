package com.senthink.test.Handler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * 调试节点上行数据推送到客户端并给出节点下行
 * Created by hyacinth on 2017/9/19.
 */
public class RequestHandler {

    private final static Logger LOGGER = LoggerFactory.getLogger(RequestHandler.class);

    public void loginPage(RoutingContext ctx) {
        ctx.reroute("/sockJs.html");
    }

    public void nodeUpDataHandler(RoutingContext context) {
        LOGGER.debug("get post method");
        HttpServerResponse response = context.response();
        response.setChunked(true);
        //JsonObject jsonObject = context.getBodyAsJson();
        LOGGER.debug("client reciveUp json={}", context.getBodyAsJson());
        Gson gson = new GsonBuilder().create();
        String bodyGson = gson.toJson(context.getBodyAsJson());
        LOGGER.debug("bodyGson={}", bodyGson);
        Buffer buffer = Buffer.buffer();
        buffer.appendString(context.getBodyAsJson().toString(), "utf-8");
        LOGGER.debug("buffer ={}", buffer.toString());

        JsonObject resJson = new JsonObject();
        resJson.put("size", 4).put("code", 1002).put("msg", "success");
        resJson.put("data", "MDEwMjAz")
                .put("hexData", false)
                .put("nonce", "2")
                .put("timeStamp", new Date().toString())
                .put("pending", 0)
                .put("devEui", "004A77006600173D")
                .put("dataType", 0)
                .put("sign", "US7wvIPivi6VqVu7XR3eFNpVX7Sfu88dymA9/YXLWPQ=");
        response.write(resJson.encode()).end();
    }
}
