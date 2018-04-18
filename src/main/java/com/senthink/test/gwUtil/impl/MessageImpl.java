package com.senthink.test.gwUtil.impl;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import com.senthink.test.gwUtil.Message;
import java.util.Optional;

/**
 * Created by hyacinth on 2017/12/30.
 */
public abstract class MessageImpl implements Message {

    protected JsonObject content;

    private final static byte[] startByte = new byte[]{0x02, 0x02};

    private final static byte[] endByte = new byte[] {0x03, 0x03};

    protected MessageImpl(JsonObject jsonObject) {
        this.content = jsonObject;
    }

    @Override
    public Buffer marshal() {
        Buffer buffer = Buffer.buffer();
        buffer.appendBytes(startByte);
        buffer.appendString(this.content.encode());
        buffer.appendBytes(endByte);
        return buffer;
    }

    @Override
    public int id() {
       return this.content.getInteger("id", 0);
    }

    @Override
    public int ver() {
        return this.content.getInteger("ver", 0);
    }

    @Override
    public int token() {
        return this.content.getInteger("token", 0);
    }

    @Override
    public String eui() {
        return this.content.getString("eui");
    }

    @Override
    public Optional<JsonObject> body() {
        return Optional.ofNullable(this.content.getJsonObject("body"));
    }

    protected void bodyGuard() {
        if (!this.body().isPresent()) {
            this.content.put("body", new JsonObject());
        }
    }


}
