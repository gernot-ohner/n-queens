package visualization;

import model.Coordinate;

import java.util.List;

public class CommandLineVisualizer implements NQueensVisualizer {
    @Override
    public void visualize(List<Coordinate> coordinateList) {
        System.out.println("coordinateList = " + coordinateList);
    }
}
