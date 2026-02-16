package com.javasolutions.lowleveldesign.structuralpatterns.composite.filestructure.problem;

public class File {
    String fileName;

    public File(String name) {
        this.fileName = name;
    }

    public void printContents() {
        System.out.println("File name: " + fileName);
    }
}

