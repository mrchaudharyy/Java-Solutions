package com.javasolutions.lowleveldesign.interviewquestions.chess;

import com.javasolutions.lowleveldesign.interviewquestions.chess.enums.PieceColour;

public class ChessDemo {
    public static void main(String[] args) {
        System.out.println("\n###### LLD of Chess Game Demo ######");
        Player p1_white = new Player("Alice", PieceColour.WHITE);
        Player p2_black = new Player("Bob", PieceColour.BLACK);

        Game game = new Game(p1_white, p2_black);
        game.display();

        // Shortest Game: Fool's Mate Demo

        // Move 1: White[Pawn f2 -> f3]
        game.playMove(p1_white, new Position(1, 5), new Position(2, 5));
        game.display();

        //Move 2: Black[Pawn e7 -> e5]
        game.playMove(p2_black, new Position(6, 4), new Position(4, 4));
        game.display();

        // Move 3: White[Pawn g2 -> g4]
        game.playMove(p1_white, new Position(1, 6), new Position(3, 6));
        game.display();

        // Move 4: Black[Queen d8 -> h4]
        game.playMove(p2_black, new Position(7, 3), new Position(3, 7));
        game.display();

        // Move 5: White[Pawn a2 -> a3]
        game.playMove(p1_white, new Position(1, 0), new Position(2, 0));
        game.display();

        // Move 6: Black[Queen h4 -> e1] [Checkmate]
        game.playMove(p2_black, new Position(3, 7), new Position(0, 4));

        System.out.println("\nMoves History: ");
        game.displayMovesHistory();
        System.out.println("\nGame demo completed!");

    }
}
