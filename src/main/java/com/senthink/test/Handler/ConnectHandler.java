package com.senthink.test.Handler;


import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.DecodeException;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.NetSocket;
import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.gwUtil.GwData;


/**
 * Created by hyacinth on 2017/10/25.
 */
public class ConnectHandler implements Handler<NetSocket> {
    private final static Logger LOGGER = LoggerFactory.getLogger(ConnectHandler.class);

    @Override
    public void handle(NetSocket socket) {
        socket.handler(buffer -> {
            int length = buffer.length();
            LOGGER.debug("buffer length={}", buffer.length());
            if (length < 0) {
                LOGGER.debug("buffer is null={}", buffer);
                return;
            }
            //LOGGER.debug("sendBuffer={}", Hex.encodeHexString(sendBuffer().getBytes()));


            //String hexString = Hex.encodeHexString(buffer.getBytes());
            //LOGGER.debug("hexString ={}", hexString);
            //socket.write(Buffer.buffer().appendInt(45));
            try{
                byte[] bytes = buffer.getBytes(0, 2);
                LOGGER.debug("bytes={}", Hex.encodeHex(bytes));
                LOGGER.debug("body={}", buffer.getBuffer(2, buffer.length() - 2).toJsonObject());
                JsonObject body = buffer.toJsonObject();
                LOGGER.debug("body={}", body);
                GwData gwData = new GwData(buffer);
                gwData.getBody();
                if (gwData.getId() == 6) {
                    LOGGER.debug("join");
                    JsonObject serverJson = new JsonObject().put("ip", "10.200.2.25").put("port", 8435);
                    body.put("id", 7);
                    body.put("body", new JsonObject().put("gwS", serverJson));
                    LOGGER.debug("body={}", body);
                    socket.write(resultBuffer(body));
                }else if (gwData.getId() == 0){
                    LOGGER.debug("update");
                    if (body.getJsonObject("body").getJsonObject("stat") != null) {
                        LOGGER.debug("stat={}", body.getJsonObject("body").getJsonObject("stat"));
                    }
                    if (body.getJsonObject("body").getJsonObject("rxpk") != null) {
                        LOGGER.debug("rxpk={}", body.getJsonObject("body").getJsonObject("rxpk"));
                    }
                    JsonObject upDateAck = new JsonObject();
                    upDateAck.put("id", 1);
                    upDateAck.put("eui", gwData.getEui());
                    upDateAck.put("token", gwData.getToken());
                    upDateAck.put("ver", gwData.getVer());
                    Buffer socketBuffer = Buffer.buffer();
                    socketBuffer.appendString("0102");
                    socket.write("\r\n");
                }else if (gwData.getId() == 2) { //heart
                    LOGGER.debug("heart up");
                    JsonObject upHeartAck = new JsonObject();
                    upHeartAck.put("id", 4);
                    upHeartAck.put("eui", gwData.getEui());
                    upHeartAck.put("token", gwData.getToken());
                    upHeartAck.put("ver", gwData.getVer());
                    socket.write(resultBuffer(upHeartAck));
                }
            }catch (DecodeException e) {
                e.printStackTrace();
                LOGGER.debug("buffer={}", buffer);
                LOGGER.debug("e={}", e.getCause().getMessage());
            }

        });
    }

    private Buffer resultBuffer(JsonObject json) {
        byte[] start = new byte[] {0x02, 0x02};
        byte[] end = new byte[] {0x03, 0x03};
        Buffer buffer = Buffer.buffer();
        buffer.appendBytes(start);
        buffer.appendString(json.encode());
        buffer.appendBytes(end);
        return buffer;
     }

     private Buffer sendBuffer() {
        Buffer buffer = Buffer.buffer();
         byte[] start = new byte[] {0x02, 0x02};
         byte[] end = new byte[] {0x03, 0x03};
         buffer.appendBytes(start);
        JsonObject rxpkJson = new JsonObject();
        rxpkJson.put("tmst", 9164316).put("pingtime", 37789).put("chan", 0).put("rfch", 0)
                .put("freq", 482.300000).put("stat", 1)
        .put("modu", "LORA").put("datr", "SF9BW125").put("codr", "4/5")
        .put("lsnr", -0.8).put("rssi", -81).put("size", 21)
        .put("data", "gOvjAVYAE/QKi+fpg9kZWkQ1lCFL");
         JsonObject json = new JsonObject();
         json.put("ver", 1).put("token", 5).put("id", 0).put("eui", "fffe6cecebd7e038")
                 .put("body", new JsonObject().put("rxpk", rxpkJson));
         buffer.appendString(json.encode());
         buffer.appendBytes(end);

        return buffer;
     }

}
