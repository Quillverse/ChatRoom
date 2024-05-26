package com.alibou.websocket.chat;

public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

    // No-arguments constructor
    public ChatMessage() {
    }

    // All-arguments constructor
    public ChatMessage(MessageType type, String content, String sender) {
        this.type = type;
        this.content = content;
        this.sender = sender;
    }

    // Getters and Setters
    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    // Builder pattern
    public static class Builder {
        private MessageType type;
        private String content;
        private String sender;

        public Builder() {
        }

        public Builder type(MessageType type) {
            this.type = type;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public ChatMessage build() {
            return new ChatMessage(type, content, sender);
        }
    }

    // Static builder method
    public static Builder builder() {
        return new Builder();
    }
}
