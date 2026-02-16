package com.javasolutions.lowleveldesign.interviewquestions.chess;

public class Position {
    private int row;
    private int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isValid() {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Position)) return false;
        Position p = (Position) obj;
        return this.row == p.row && this.col == p.col;
    }

    @Override
    public String toString() {
        return (char) ('a' + col) + String.valueOf(row + 1);
    }

}