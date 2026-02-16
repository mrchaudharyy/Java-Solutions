package com.javasolutions.lowleveldesign.structuralpatterns.flyweight.wordprocessor.issue;

public class Character {
    char character;
    String fontType;
    int size;
    int row;
    int column;

    public Character(char character, String fontType, int size, int row, int column) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
        this.row = row;
        this.column = column;
    }
}