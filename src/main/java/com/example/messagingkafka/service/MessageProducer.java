package com.example.messagingkafka.service;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

  private final StreamBridge streamBridge;

  public MessageProducer(StreamBridge streamBridge) {
    this.streamBridge = streamBridge;
  }

  public void sendMessage(String message) {
    streamBridge.send("producer-out-0", message);
  }
}
