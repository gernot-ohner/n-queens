import computation.RandomSolver;

public class Main {
    public static void main(String[] args) {

        final var randomComputer = new RandomSolver();
        final var before = System.nanoTime();
        final var compute = randomComputer.compute(4);
        final var after = System.nanoTime();
        System.out.println("compute = " + compute);
        System.out.println("Took: " + (after - before) / 1000000 + "ms");
    }
}
