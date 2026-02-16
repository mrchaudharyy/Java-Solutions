package com.javasolutions.lowleveldesign.behavioralpatterns.iterator.library;

import java.util.List;

// Concrete Aggregate
public class Library implements BookCollection {

    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> createIterator() {
        return new LibraryIterator(books);
    }

    @Override
    public Iterator<Book> createReverseIterator() {
        return new ReverseLibraryIterator(books);
    }
}
