package com.javasolutions.lowleveldesign.interviewquestions.chess.pieces;

import com.javasolutions.lowleveldesign.interviewquestions.chess.Board;
import com.javasolutions.lowleveldesign.interviewquestions.chess.Cell;
import com.javasolutions.lowleveldesign.interviewquestions.chess.Position;
import com.javasolutions.lowleveldesign.interviewquestions.chess.enums.PieceColour;
import com.javasolutions.lowleveldesign.interviewquestions.chess.enums.PieceType;

public class Pawn extends Piece {

    public Pawn(PieceColour colour) {
        super(colour, PieceType.PAWN);
    }

    @Override
    public boolean isValidMove(Board board, Cell start, Cell end) {
        if (start.equals(end)) return false;

        // If the target cell has piece of same colour, then it is invalid move
        if (end.getPiece() != null && end.getPiece().getColour() == start.getPiece().getColour()) return false;

        int direction = this.getColour() == PieceColour.WHITE ? 1 : -1;

        int rowDiff = Math.abs(end.getPosition().getRow() - start.getPosition().getRow());
        int colDiff = Math.abs(end.getPosition().getCol() - start.getPosition().getCol());

        // Move forward - 1 step
        if (colDiff == 0 && rowDiff == 1) {
            return board.getCell(end.getPosition()).getPiece() == null;
        }

        // First move - 2 steps
        if (colDiff == 0 && !hasMovedBefore(start) && rowDiff == 2) {
            Position intermediate = new Position(start.getPosition().getRow() + direction, start.getPosition().getCol());
            return board.getCell(intermediate).getPiece() == null && board.getCell(end.getPosition()).getPiece() == null;
        }

        // Capture - diagonal
        if (colDiff == 1 && rowDiff == 1) {
            Piece targetPiece = board.getCell(end.getPosition()).getPiece();
            return targetPiece != null && targetPiece.getColour() != start.getPiece().getColour();
        }
        return false;
    }

    private boolean hasMovedBefore(Cell start) {
        return start.getPosition().getRow() != 1 && start.getPosition().getRow() != 6;
    }
}