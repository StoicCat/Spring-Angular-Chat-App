package com.stoic.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import com.stoic.chat.model.ChatMessage;

@Controller
public class ChatController {
  @MessageMapping("/chat")
  @SendTo("/topic/messages")
  public ChatMessage sendMessage(ChatMessage message) throws Exception {
      // Simulate delay or processing
      Thread.sleep(500);
      return message;
  }
}
