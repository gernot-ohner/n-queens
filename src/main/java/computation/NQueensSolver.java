package computation;

import model.Coordinate;

import java.util.Set;

public interface NQueensSolver {
    public Set<Coordinate> compute(int n);
}
