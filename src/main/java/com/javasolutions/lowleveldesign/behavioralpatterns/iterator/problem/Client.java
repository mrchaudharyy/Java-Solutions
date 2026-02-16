package com.javasolutions.lowleveldesign.behavioralpatterns.iterator.problem;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        System.out.println("\n###### Problem without Iterator Pattern Demo ######");
        // Client has access to the entire book list in the library
        List<Book> bookList = Book.getBooks();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}