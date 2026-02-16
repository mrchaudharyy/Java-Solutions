package com.javasolutions.lowleveldesign.structuralpatterns.composite.filestructure.problem;

// Client Code
public class Client {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movies");

        File rentalReceipt = new File("RentalReceipt");
        movieDirectory.add(rentalReceipt);

        Directory comedyMovieDirectory = new Directory("ComedyMovies");
        File dumbAndDumber = new File("DumbAndDumber");
        comedyMovieDirectory.add(dumbAndDumber);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.printContents();
    }
}
