package com.chatsocket.chatsocket.dto;

public class ChatMessage {
    private String message;
    private String user;

    // Constructor vacío necesario para Jackson
    public ChatMessage() {
    }

    public ChatMessage(String message, String user) {
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}