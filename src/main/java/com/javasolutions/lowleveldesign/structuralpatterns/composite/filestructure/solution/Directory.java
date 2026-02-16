package com.javasolutions.lowleveldesign.structuralpatterns.composite.filestructure.solution;

import java.util.ArrayList;
import java.util.List;

// Step 3: Composite - Folder
public class Directory implements FileSystemComponent {
    String directoryName;
    List<FileSystemComponent> children;

    public Directory(String name) {
        this.directoryName = name;
        children = new ArrayList<>();
    }

    public void add(FileSystemComponent fileSystemComponent) {
        children.add(fileSystemComponent);
    }

    public void remove(FileSystemComponent fileSystemComponent) {
        children.remove(fileSystemComponent);
    }

    @Override
    public void printContents() {
        System.out.println("Directory Name: " + directoryName);
        for (FileSystemComponent child : children) {
            child.printContents();
        }
    }
}
