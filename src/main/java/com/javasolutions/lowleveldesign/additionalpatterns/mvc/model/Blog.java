package com.javasolutions.lowleveldesign.additionalpatterns.mvc.model;

import java.util.Date;

// Model class: Blog - Holds data about a single blog post.
public class Blog {
    private String title;
    private String content;
    private String author;
    private Date createdAt;

    // Constructor
    public Blog(String title, String content, String author, Date createdAt) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
    }

    // Getters and Setters
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
