package com.senthink.test.decorate;

import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;

/**
 * Created by hyacinth on 2018/3/7.
 */
public class JsonLogger extends LoggerDecorate{

    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void debug(String message) {
        JsonObject resultJson = new JsonObject();
        resultJson.put("message", message);
        logger.debug(resultJson.encode());
    }
}
