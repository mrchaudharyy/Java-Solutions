package com.javasolutions.lowleveldesign.interviewquestions.chess.pieces;

import com.javasolutions.lowleveldesign.interviewquestions.chess.Board;
import com.javasolutions.lowleveldesign.interviewquestions.chess.Cell;
import com.javasolutions.lowleveldesign.interviewquestions.chess.Position;
import com.javasolutions.lowleveldesign.interviewquestions.chess.enums.PieceColour;
import com.javasolutions.lowleveldesign.interviewquestions.chess.enums.PieceType;

public abstract class Piece {

    private PieceColour colour;
    private boolean isCaptured;
    private PieceType pieceType;

    public Piece(PieceColour colour, PieceType pieceType) {
        this.colour = colour;
        this.isCaptured = false;
        this.pieceType = pieceType;
    }

    public PieceColour getColour() {
        return colour;
    }

    public void setColour(PieceColour colour) {
        this.colour = colour;
    }

    public boolean isCaptured() {
        return isCaptured;
    }

    public void setCaptured(boolean captured) {
        isCaptured = captured;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    boolean isPathClear(Board board, Cell start, Cell end) {
        int rowDir = Integer.compare(end.getPosition().getRow() - start.getPosition().getRow(), 0);
        int colDir = Integer.compare(end.getPosition().getCol() - start.getPosition().getCol(), 0);

        int currentRow = start.getPosition().getRow() + rowDir;
        int currentCol = start.getPosition().getCol() + colDir;

        while (currentRow != end.getPosition().getRow() || currentCol != end.getPosition().getCol()) {
            if (board.getCell(new Position(currentRow, currentCol)).getPiece() != null) {
                return false;
            }
            currentRow += rowDir;
            currentCol += colDir;
        }
        return true;
    }

    public abstract boolean isValidMove(Board board, Cell start, Cell end);

    @Override
    public String toString() {
        String symbol = switch (this.pieceType) {
            case KING -> "K";
            case QUEEN -> "Q";
            case ROOK -> "R";
            case BISHOP -> "B";
            case KNIGHT -> "N";
            case PAWN -> "P";
        };
        return this.colour == PieceColour.WHITE ? symbol : symbol.toLowerCase();
    }
}