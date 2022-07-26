package gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SystemTest {

    @Test
    public void aSingleCellShouldDieInNextGeneration() {
        Grid seed = new Grid();
        seed.addNewCellToGrid(new Cell(0, 0));
        System system = new System(seed);

        Grid nextGeneration = system.seeNextGeneration(seed);

        assertFalse(nextGeneration.contains(new Cell(0, 0)));
    }

    @Test
    public void aCellWithLessThanTwoNeighborsShouldDieInNextIteration() throws Exception {
        Grid seed = new Grid();
        seed.addNewCellToGrid(new Cell(0, 1));
        seed.addNewCellToGrid(new Cell(1, 1));
        System system = new System(seed);

        Grid nextGeneration = system.seeNextGeneration(seed);

        assertFalse(nextGeneration.contains(new Cell(0, 0)));
    }

    @Test
    public void cellWithTwoNeighborsShouldLiveInNextIteration() throws Exception {
        Grid seed = new Grid();
        seed.addNewCellToGrid(new Cell(0, 1));
        seed.addNewCellToGrid(new Cell(1, 1));
        seed.addNewCellToGrid(new Cell(1, 0));
        System system = new System(seed);

        Grid nextGeneration = system.seeNextGeneration(seed);

        assertTrue(nextGeneration.contains(new Cell(1, 1)));
    }

    @Test
    public void aDeadCellWithThreeNeighborsShouldResurrectInNextIteration() throws Exception {
        Grid seed = new Grid();
        seed.addNewCellToGrid(new Cell(0, 1));
        seed.addNewCellToGrid(new Cell(1, 1));
        seed.addNewCellToGrid(new Cell(1, 0));
        System system = new System(seed);

        Grid nextGeneration = system.seeNextGeneration(seed);

        assertTrue(nextGeneration.contains(new Cell(0, 0)));
    }

    @Test
    public void cellWithMoreThanThreeNeighborsShouldDieInNextIteration() throws Exception {
        Grid seed = new Grid();
        seed.addNewCellToGrid(new Cell(0, 1));
        seed.addNewCellToGrid(new Cell(1, 0));
        seed.addNewCellToGrid(new Cell(1, 1));
        seed.addNewCellToGrid(new Cell(1, 2));
        seed.addNewCellToGrid(new Cell(2, 1));
        System system = new System(seed);

        Grid nextGeneration = system.seeNextGeneration(seed);

        assertFalse(nextGeneration.contains(new Cell(1, 1)));
    }

    @Test
    public void cellWithThreeNeighborsShouldLiveInNextIteration() throws Exception {
        Grid seed = new Grid();
        seed.addNewCellToGrid(new Cell(0, 1));
        seed.addNewCellToGrid(new Cell(1, 1));
        seed.addNewCellToGrid(new Cell(1, 0));

        System system = new System(seed);

        Grid nextGeneration = system.seeNextGeneration(seed);

        assertTrue(nextGeneration.contains(new Cell(0, 0)));
    }
}
