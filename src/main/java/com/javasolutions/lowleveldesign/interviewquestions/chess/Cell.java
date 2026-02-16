package com.javasolutions.lowleveldesign.interviewquestions.chess;

import com.javasolutions.lowleveldesign.interviewquestions.chess.pieces.Piece;

public class Cell {

    private Piece piece;
    private Position position;

    public Cell(Piece piece, Position position) {
        this.piece = piece;
        this.position = position;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Cell [piece=" + piece + ", position=" + position + "]";
    }
}
