package com.javasolutions.lowleveldesign.structuralpatterns.composite.filestructure.solution;

// Step 4: Client code with Composite Pattern
public class FileSystemDemo {
    public static void main(String[] args) {
        System.out.println("======= Composite Design Pattern ======");

        // Create files
        File receipt = new File("receipt.pdf");
        File invoice = new File("invoice.pdf");
        File torrentLinks = new File("torrentLinks.txt");
        File tomCruise = new File("tomCruise.jpg");
        File dumbAndDumber = new File("DumbAndDumber.mp4");
        File hangoverI = new File("HangoverI.mp4");

        // Create directories
        Directory moviesDirectory = new Directory("Movies");
        Directory comedyMovieDirectory = new Directory("ComedyMovies");

        // Build the tree structure hierarchically
        moviesDirectory.add(receipt);
        moviesDirectory.add(invoice);
        moviesDirectory.add(torrentLinks);
        moviesDirectory.add(tomCruise);
        moviesDirectory.add(comedyMovieDirectory);
        comedyMovieDirectory.add(dumbAndDumber);
        comedyMovieDirectory.add(hangoverI);

        // Display full structure
        moviesDirectory.printContents();
    }
}
