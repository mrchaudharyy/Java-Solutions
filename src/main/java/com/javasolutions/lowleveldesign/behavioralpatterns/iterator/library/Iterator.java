package com.javasolutions.lowleveldesign.behavioralpatterns.iterator.library;

// Iterator interface
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
