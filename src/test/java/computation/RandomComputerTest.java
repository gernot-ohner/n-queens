package computation;

import model.Coordinate;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RandomComputerTest {

    @org.junit.jupiter.api.Test
    void compute() {

        final var actual = new RandomSolver().compute(4);
        final var expected1 = Set.of(
                new Coordinate(0, 1),
                new Coordinate(1, 3),
                new Coordinate(2, 0),
                new Coordinate(3, 2)
        );
        final var expected2 = Set.of(
                new Coordinate(0, 2),
                new Coordinate(1, 0),
                new Coordinate(2, 3),
                new Coordinate(3, 1)
        );

        boolean solution1 = actual.containsAll(expected1) && expected1.containsAll(actual);
        boolean solution2 = actual.containsAll(expected2) && expected2.containsAll(actual);
        assertTrue(solution1 || solution2);
    }
}
