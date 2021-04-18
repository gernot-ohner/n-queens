package computation;

import model.Coordinate;
import util.RandomUtils;
import util.Utils;

import java.util.Set;

public class RandomSolver implements NQueensSolver {
    @Override
    public Set<Coordinate> compute(int n) {
        if (n < 4) {
            System.out.println("Invalid input! There are no solutions for n < 4.");
            // TODO decouple the message from the implementation!
            // how? make NQueensComputer an abstract class instead? No, probably not.
        }

        Set<Coordinate> potentialSolution;
        do {
            potentialSolution = RandomUtils.getRandomSolutionCandidate(n);
        } while(!Utils.isValid(potentialSolution, n));

        return potentialSolution;
    }
}
