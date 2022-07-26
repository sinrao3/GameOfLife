package gameoflife;

public class System {

    public Grid seed;

    public System(Grid seed) {
        this.seed = seed;
    }

    public Grid seeNextGeneration(Grid seed) {
        Grid nextGeneration = seed.getNextGeneration();
        return nextGeneration;
    }
}
