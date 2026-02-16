package com.javasolutions.lowleveldesign.interviewquestions.chess;

import com.javasolutions.lowleveldesign.interviewquestions.chess.enums.PieceColour;
import com.javasolutions.lowleveldesign.interviewquestions.chess.pieces.*;

public class Board {
    Cell[][] cells;

    public Board() {
        cells = new Cell[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new Cell(null, new Position(i, j));
            }
        }
        initPieces();
    }

    public Cell getCell(Position position) {
        int i = position.getRow();
        int j = position.getCol();
        if (i < 0 || i > 7 || j < 0 || j > 7) {
            System.out.println("[ERR] Index out of bound");
            System.exit(0); // end game
        }
        return cells[i][j];
    }

    private void initPieces() {

        // Initialize white pieces
        cells[0][0].setPiece(new Rook(PieceColour.WHITE));
        cells[0][1].setPiece(new Knight(PieceColour.WHITE));
        cells[0][2].setPiece(new Bishop(PieceColour.WHITE));
        cells[0][3].setPiece(new Queen(PieceColour.WHITE));
        cells[0][4].setPiece(new King(PieceColour.WHITE));
        cells[0][5].setPiece(new Bishop(PieceColour.WHITE));
        cells[0][6].setPiece(new Knight(PieceColour.WHITE));
        cells[0][7].setPiece(new Rook(PieceColour.WHITE));

        // Initialize white pawns
        for (int i = 0; i < 8; i++) {
            cells[1][i].setPiece(new Pawn(PieceColour.WHITE));
        }

        // Initialize black pieces
        cells[7][0].setPiece(new Rook(PieceColour.BLACK));
        cells[7][1].setPiece(new Knight(PieceColour.BLACK));
        cells[7][2].setPiece(new Bishop(PieceColour.BLACK));
        cells[7][3].setPiece(new Queen(PieceColour.BLACK));
        cells[7][4].setPiece(new King(PieceColour.BLACK));
        cells[7][5].setPiece(new Bishop(PieceColour.BLACK));
        cells[7][6].setPiece(new Knight(PieceColour.BLACK));
        cells[7][7].setPiece(new Rook(PieceColour.BLACK));

        // Initialize black pawns
        for (int i = 0; i < 8; i++) {
            cells[6][i].setPiece(new Pawn(PieceColour.BLACK));
        }
    }

}