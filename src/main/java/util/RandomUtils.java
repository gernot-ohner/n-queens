package util;

import model.Coordinate;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtils {
    public static Set<Coordinate> getRandomSolutionCandidate(int boardSize) {
        Set<Coordinate> potentialSolution = new HashSet<>();
        while (potentialSolution.size() < boardSize) {
            potentialSolution.add(getRandomCoordinate(boardSize));
        }
        return potentialSolution;
    }


    public static Coordinate getRandomCoordinate(int boardSize) {
        final var random = new Random();
        return new Coordinate(random.nextInt(boardSize), random.nextInt(boardSize));
    }
}
