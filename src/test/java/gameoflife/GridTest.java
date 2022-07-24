package gameoflife;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GridTest {

    @Test
    void aSingleCellShouldHaveNoNeighbours(){
        Grid grid= new Grid();
        grid.addNewCellToGrid(new Cell(1,1,true));

        List<Cell> neighbors= grid.getNeighbors();

        assertEquals(0,neighbors.size());
    }
}
