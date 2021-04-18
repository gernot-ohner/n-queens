package util;

import model.Coordinate;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Utils {

    public static Set<Coordinate> allAttackedCoordinates(Coordinate queenPosition, int boardSize) {
        final var attackedCoordinates = new HashSet<Coordinate>();
        final int queenRow = queenPosition.getRow();
        final int queenCol = queenPosition.getCol();

        for (int i = 0; i < boardSize; i++) {
            addIfOnBoard(boardSize, attackedCoordinates, queenRow, i);
            addIfOnBoard(boardSize, attackedCoordinates, i, queenCol);
            addIfOnBoard(boardSize, attackedCoordinates, queenRow + i, queenCol + i);
            addIfOnBoard(boardSize, attackedCoordinates, queenRow + i, queenCol - i);
            addIfOnBoard(boardSize, attackedCoordinates, queenRow - i, queenCol + i);
            addIfOnBoard(boardSize, attackedCoordinates, queenRow - i, queenCol - i);
        }

        attackedCoordinates.remove(queenPosition);
        return attackedCoordinates;
    }

    private static void addIfOnBoard(int boardSize, HashSet<Coordinate> attackedCoordinates, int row, int col) {
        if (row >= 0 && row < boardSize && col >= 0 && col < boardSize) {
            attackedCoordinates.add(new Coordinate(row, col));
        }
    }

    public static boolean isValid(Set<Coordinate> coordinates, int boardSize) {
        if (coordinates == null || coordinates.size() != boardSize) {
            return false;
        }

        for (Coordinate coordinate : coordinates) {
            Set<Coordinate> attackedCoordinates = allAttackedCoordinates(coordinate, boardSize);
            attackedCoordinates.retainAll(coordinates);
            if(!attackedCoordinates.isEmpty()) {
                return false;
            }
        }

        return true;
    }

}
