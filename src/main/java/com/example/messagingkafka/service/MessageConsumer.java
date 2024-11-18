package com.example.messagingkafka.service;

import java.util.function.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

  @Bean
  public Consumer<String> consumer() {
    return message -> System.out.println("Mensagem recebida: " + message);
  }
}
