package com.example.chatapp;

public class AwesomeMessage {

    String text;
    String name;
    String imageUrl;

    public AwesomeMessage(){

    }

    public AwesomeMessage(String text, String name, String imageUrl) {
        this.text = text;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
