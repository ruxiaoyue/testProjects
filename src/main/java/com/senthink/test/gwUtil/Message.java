package com.senthink.test.gwUtil;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;

import java.util.Optional;

/**
 * Created by Message on 2017/12/30.
 */
public interface Message {

    int id();

    int token();

    int ver();

    String eui();

    Optional<JsonObject> body();

    Buffer marshal();

}
