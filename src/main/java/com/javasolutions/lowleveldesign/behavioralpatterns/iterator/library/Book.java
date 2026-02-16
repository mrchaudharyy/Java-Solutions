package com.javasolutions.lowleveldesign.behavioralpatterns.iterator.library;

// Book class representing individual books in a library
public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private int price;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + ", ISBN=" + isbn + "]";
    }
}
