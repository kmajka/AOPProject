package com.musicdemo.maestro.track;

import org.springframework.stereotype.Component;

@Component
public class TrackInfo {
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    private String author;
    private String title;

    public TrackInfo() {
    }

    public TrackInfo(String author, String title) {
        this.author = author;
        this.title = title;
    }
}
