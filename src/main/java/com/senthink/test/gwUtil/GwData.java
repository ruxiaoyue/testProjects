package com.senthink.test.gwUtil;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;

/**
 * Created by lenovo on 2017/12/30.
 */
public class GwData {


    private JsonObject json;

    public GwData(Buffer buffer) {
        this.json = buffer.toJsonObject();
    }

    public GwData() {
        
    }

    private int ver;

    private int token;

    private int id;

    private String eui;

    private JsonObject body;

    public int getVer() {
        return json.getInteger("ver");
    }

    public void setVer(int ver) {
        this.ver = ver;
    }

    public int getToken() {
        return json.getInteger("token");
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int getId() {
        return json.getInteger("id");
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEui() {
        return json.getString("eui");
    }

    public void setEui(String eui) {
        this.eui = eui;
    }

    public JsonObject getBody() {
        return json.getJsonObject("body");
    }

    public void setBody(JsonObject body) {
        this.body = body;
    }
}
