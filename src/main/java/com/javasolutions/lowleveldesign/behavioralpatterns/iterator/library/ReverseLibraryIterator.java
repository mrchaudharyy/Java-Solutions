package com.javasolutions.lowleveldesign.behavioralpatterns.iterator.library;

import java.util.List;

// Concrete Iterator - for Library
public class ReverseLibraryIterator implements Iterator<Book> {
    private final List<Book> books;
    private int position;

    public ReverseLibraryIterator(List<Book> books) {
        this.books = books;
        this.position = books.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0 && books.get(position) != null;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            return null;
        }
        return books.get(position--); // Return current book and move backward
    }
}
