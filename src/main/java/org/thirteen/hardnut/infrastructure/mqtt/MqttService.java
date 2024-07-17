package org.thirteen.hardnut.infrastructure.mqtt;

import lombok.RequiredArgsConstructor;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MqttService {
    private final MqttGateway mqttGateway;

    public void send(String message) {
        mqttGateway.sendToMqtt(message);
    }
}

@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
interface MqttGateway {
    void sendToMqtt(@Payload String message);
}