package com.chatsocket.chatsocket.controller;

import com.chatsocket.chatsocket.dto.ChatMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/chat/{roomId}")
    @SendTo("/topic/{roomId}")
    //se usa roomId para especificara a que room se va a conectar el cliente
    public ChatMessage chat(@DestinationVariable String roomId, ChatMessage message) {
        return new ChatMessage(message.getMessage(), message.getUser());
    }
}
