package com.example.maeily_mobile;

public class Channel {
    String title;
    String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Channel(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
