package gameoflife;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GridTest {

    @Test
    void aSingleCellShouldHaveNoNeighbours(){
        Grid grid= new Grid();
        grid.addNewCellToGrid(new Cell(0,0));

        List<Cell> neighbors= grid.getNeighbors(new Cell(0,0));

        assertEquals(0,neighbors.size());
    }
    @Test
    void twoCellsNextToEachOtherShouldBeNeighbors(){
        Grid grid= new Grid();
        grid.addNewCellToGrid(new Cell(0,0));
        grid.addNewCellToGrid(new Cell(0,1));

        List<Cell> neighborsOfFirstCell= grid.getNeighbors(new Cell(0,0));
        List<Cell> neighborsOfSecondCell= grid.getNeighbors(new Cell(0,1));

        assertArrayEquals(new Cell[]{new Cell(0,1)}, neighborsOfFirstCell.toArray());
        assertArrayEquals(new Cell[]{new Cell(0,0)}, neighborsOfSecondCell.toArray());

    }


}
