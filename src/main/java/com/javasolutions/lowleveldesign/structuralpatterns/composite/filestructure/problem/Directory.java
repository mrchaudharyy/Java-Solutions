package com.javasolutions.lowleveldesign.structuralpatterns.composite.filestructure.problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList;

    public Directory(String name) {
        this.directoryName = name;
        objectList = new ArrayList<>();
    }

    public void add(Object object) {
        objectList.add(object);
    }

    public void remove(Object object) {
        objectList.remove(object);
    }

    // Display full structure
    // Breaks OCP - if we want to add a new file type, we need to modify this method to add another if/else condition
    public void printContents() {
        System.out.println("Directory Name: " + directoryName);
        for (Object obj : objectList) {
            if (obj instanceof File) {
                ((File) obj).printContents();
            } else if (obj instanceof Directory) {
                ((Directory) obj).printContents();
            }
        }
    }
}
