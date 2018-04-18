package com.senthink.test;

import io.netty.handler.codec.mqtt.MqttQoS;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.mqtt.MqttClient;
import io.vertx.mqtt.MqttServer;
import io.vertx.mqtt.MqttServerOptions;
import io.vertx.mqtt.MqttTopicSubscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/3/2.
 */
public class MqttVerticle extends AbstractVerticle{

    private final static Logger LOGGER = LoggerFactory.getLogger(MqttVerticle.class);

    public void start(Future<Void> future) {
        MqttServerOptions options = new MqttServerOptions()
                .setPort(8883);

        MqttServer mqttServer = MqttServer.create(vertx, options);
        mqttServer.endpointHandler(endpoint->{
            if (endpoint.auth() != null) {
                LOGGER.debug("username ={}, password ={}", endpoint.auth().userName(), endpoint.auth().password());
            }
            if (endpoint.will() != null) {
                LOGGER.debug("will topic ={}", endpoint.will().willTopic());
            }

            endpoint.publishHandler(message ->{
                LOGGER.debug("publish handler message ={}", message.payload().toJsonObject());
            }).publishReleaseHandler(messageId ->{
                LOGGER.debug("messageId ={}", messageId);
                endpoint.publishComplete(messageId);
            });

            endpoint.subscribeHandler(subscribe->{
                LOGGER.debug("subscrib={}", subscribe.messageId());
                List<MqttQoS> grantedQosLevels = new ArrayList<>();
                for (MqttTopicSubscription s: subscribe.topicSubscriptions()) {
                    System.out.println("Subscription for " + s.topicName() + " with QoS " + s.qualityOfService());
                    grantedQosLevels.add(s.qualityOfService());
                }
                // ack the subscriptions request
                endpoint.subscribeAcknowledge(subscribe.messageId(), grantedQosLevels);
            });
            endpoint.accept(false);
        }).listen(ar ->{
           if (ar.succeeded()) {
               LOGGER.debug("MQTT server is listening on port{}", ar.result().actualPort());
           }else {
               LOGGER.debug("Error on starting the server");
           }
        });
        mqttClient();
    }

    private void mqttClient() {
        MqttClient mqttClient = MqttClient.create(vertx);
        mqttClient.connect(8883, "10.200.2.25", s ->{
            mqttClient.publishHandler(message->{
                LOGGER.debug("mqttClient topic={}", message.topicName());
                LOGGER.debug("mqttclient payload={}", message.payload().toString());
            }).subscribe("mytopic", 2);
            //mqttClient.disconnect();
        });



        /*vertx.setPeriodic(10000, r ->{
            mqttClient.publish("mytopic", Buffer.buffer("hello"), MqttQoS.AT_LEAST_ONCE, false, false);
        });*/

    }
}
