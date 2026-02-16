package com.javasolutions.lowleveldesign.behavioralpatterns.iterator.library;

import java.util.List;

// Client
public class LibraryIteratorDemo {

    public static void main(String[] args) {
        System.out.println("\n###### Iterator Design Pattern ######");

        // Create Library
        Library library = getLibrary();

        // Forward iteration
        Iterator<Book> iterator = library.createIterator();
        System.out.println("\n==> Forward iteration:");
        displayLibrary(iterator);

        // Reverse iteration
        Iterator<Book> reverseIterator = library.createReverseIterator();
        System.out.println("\n==> Reverse iteration:");
        displayLibrary(reverseIterator);
    }

    private static Library getLibrary() {
        List<Book> books = List.of(
                new Book("To Kill a Mockingbird", "Harper Lee", "978-0-74-7356-5"),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "778-0-24-7156-5"),
                new Book("The Catcher in the Rye", "J.D. Salinger", "333-0-28-7446-8"),
                new Book("The Hobbit", "J.R.R. Tolkien", "783-0-14-1951-8"),
                new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "183-0-12-1491-8"),
                new Book("Pride and Prejudice", "Jane Austen", "289-0-12-1678-8")
        );
        Library library = new Library(books);
        return library;
    }

    private static void displayLibrary(Iterator<Book> iterator) {
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}