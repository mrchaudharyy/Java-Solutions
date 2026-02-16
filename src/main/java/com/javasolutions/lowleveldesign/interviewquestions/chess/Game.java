package com.javasolutions.lowleveldesign.interviewquestions.chess;

import com.javasolutions.lowleveldesign.interviewquestions.chess.enums.GameStatus;
import com.javasolutions.lowleveldesign.interviewquestions.chess.enums.PieceColour;
import com.javasolutions.lowleveldesign.interviewquestions.chess.pieces.King;
import com.javasolutions.lowleveldesign.interviewquestions.chess.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> movesHistory;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        if (player1.getPlayingSide().equals(PieceColour.WHITE))
            this.currentTurn = player1;
        else
            this.currentTurn = player2;
        this.status = GameStatus.IN_PROGRESS;
        this.movesHistory = new ArrayList<>();
    }

    public boolean playMove(Player player, Position start, Position end) {
        Cell startCell = board.getCell(start);
        Cell endCell = board.getCell(end);
        Move move = new Move(player, startCell, endCell);
        return this.makeMove(move, player);
    }

    private boolean makeMove(Move move, Player player) {
        Piece startPiece = move.getStart().getPiece();
        Piece endPiece = move.getEnd().getPiece();

        if (startPiece == null) return false;
        if (startPiece.getColour() != player.getPlayingSide()) return false;
        if (!startPiece.isValidMove(board, move.getStart(), move.getEnd())) return false;

        if (endPiece != null) {
            endPiece.setCaptured(true);
            move.setPieceKilled(endPiece);
        }

        move.setPieceMoved(startPiece);
        move.getEnd().setPiece(startPiece);
        move.getStart().setPiece(null);

        this.movesHistory.add(move);

        if (endPiece instanceof King) {
            System.out.println("\n===>>> Its a Checkmate!!!");
            if (player.getPlayingSide() == PieceColour.WHITE) {
                this.setStatus(GameStatus.WHITE_WIN);
                System.out.println("===>>> Game Status: " + this.getStatus());
            } else {
                this.setStatus(GameStatus.BLACK_WIN);
                System.out.println("===>>> Game Status: " + this.getStatus());
            }
        }

        if (currentTurn == player1) this.currentTurn = player2;
        else this.currentTurn = player1;

        return true;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void displayMovesHistory() {
        for (Move move : movesHistory) {
            System.out.println(move);
        }
    }

    public void display() {
        System.out.println("\nCurrent turn: " + currentTurn);
        System.out.println("Game status: " + status);
    }
}
