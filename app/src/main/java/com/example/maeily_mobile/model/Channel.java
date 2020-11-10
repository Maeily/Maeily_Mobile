package com.example.maeily_mobile.model;

public class Channel {
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    void setContent(String content) {
        this.content = content;
    }

    public Channel(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
