package com.javasolutions.lowleveldesign.behavioralpatterns.iterator.library;

// Aggregate interface
public interface BookCollection {
    Iterator<Book> createIterator();

    Iterator<Book> createReverseIterator();
}
