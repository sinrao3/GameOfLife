package gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Universe {

    @Test
    public void universeBlockPattern(){
        Grid seed = new Grid();
        seed.addNewCellToGrid(new Cell(1, 1));
        seed.addNewCellToGrid(new Cell(1, 2));
        seed.addNewCellToGrid(new Cell(2, 1));
        seed.addNewCellToGrid(new Cell(2, 2));
        System system = new System(seed);

        Grid nextGeneration = system.seeNextGeneration(seed);

        assertTrue(nextGeneration.contains(new Cell(1, 1)));
        assertTrue(nextGeneration.contains(new Cell(1, 2)));
        assertTrue(nextGeneration.contains(new Cell(2, 1)));
        assertTrue(nextGeneration.contains(new Cell(2, 2)));
    }

    @Test
    public void universeBoatPattern(){
        Grid seed = new Grid();
        seed.addNewCellToGrid(new Cell(0, 1));
        seed.addNewCellToGrid(new Cell(1, 0));
        seed.addNewCellToGrid(new Cell(2, 1));
        seed.addNewCellToGrid(new Cell(0, 2));
        seed.addNewCellToGrid(new Cell(1, 2));

        System system = new System(seed);

        Grid nextGeneration = system.seeNextGeneration(seed);

        assertTrue(nextGeneration.contains(new Cell(0, 1)));
        assertTrue(nextGeneration.contains(new Cell(1, 0)));
        assertTrue(nextGeneration.contains(new Cell(2, 1)));
        assertTrue(nextGeneration.contains(new Cell(0, 2)));
        assertTrue(nextGeneration.contains(new Cell(1, 2)));

    }

    @Test
    public void universeBlinkerPattern(){
        Grid seed = new Grid();
        seed.addNewCellToGrid(new Cell(1, 1));
        seed.addNewCellToGrid(new Cell(1, 0));
        seed.addNewCellToGrid(new Cell(1, 2));
        System system = new System(seed);

        Grid nextGeneration = system.seeNextGeneration(seed);

        assertTrue(nextGeneration.contains(new Cell(1, 1)));
        assertTrue(nextGeneration.contains(new Cell(0, 1)));
        assertTrue(nextGeneration.contains(new Cell(2, 1)));

    }

    @Test
    public void universeToadPattern(){
        Grid seed = new Grid();
        seed.addNewCellToGrid(new Cell(1, 1));
        seed.addNewCellToGrid(new Cell(1, 2));
        seed.addNewCellToGrid(new Cell(1, 3));
        seed.addNewCellToGrid(new Cell(2, 2));
        seed.addNewCellToGrid(new Cell(2, 3));
        seed.addNewCellToGrid(new Cell(2, 4));
        System system = new System(seed);

        Grid nextGeneration = system.seeNextGeneration(seed);

        assertTrue(nextGeneration.contains(new Cell(0, 2)));
        assertTrue(nextGeneration.contains(new Cell(1, 1)));
        assertTrue(nextGeneration.contains(new Cell(1, 4)));
        assertTrue(nextGeneration.contains(new Cell(2, 1)));
        assertTrue(nextGeneration.contains(new Cell(2, 4)));
        assertTrue(nextGeneration.contains(new Cell(3, 3)));
    }

}
