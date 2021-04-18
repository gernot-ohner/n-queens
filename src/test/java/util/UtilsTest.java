package util;

import model.Coordinate;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void allAttackedCoordinates() {
        final var input = new Coordinate(0, 0);
        final var coordinates = Utils.allAttackedCoordinates(input, 4);
        // TODO finish this test
    }

    @Test
    void isValid() {

        final var validSet = Set.of(
                new Coordinate(0, 1),
                new Coordinate(1, 3),
                new Coordinate(2, 0),
                new Coordinate(3, 2)
        );

        final var actual = Utils.isValid(validSet, 4);
        assertTrue(actual);


    }

    @Test
    void isNotValid() {
        final var validSet = Set.of(
                new Coordinate(0, 1),
                new Coordinate(1, 3),
                new Coordinate(2, 0),
                new Coordinate(3, 1)
        );

        final var actual = Utils.isValid(validSet, 4);
        assertFalse(actual);

    }
}
