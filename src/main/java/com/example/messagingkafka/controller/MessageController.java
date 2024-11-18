package com.example.messagingkafka.controller;

import com.example.messagingkafka.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
  @Autowired MessageProducer messageProducer;

  @PostMapping("/message")
  public ResponseEntity<String> newMessage(@RequestBody String message) {

    messageProducer.sendMessage(message);
    return ResponseEntity.ok("");
  }
}
