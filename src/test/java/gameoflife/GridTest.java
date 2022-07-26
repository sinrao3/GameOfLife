package gameoflife;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GridTest {

    @Test
    void aSingleCellShouldHaveNoNeighbours() {
        Grid grid = new Grid();
        grid.addNewCellToGrid(new Cell(0, 0));

        List<Cell> neighbors = grid.getAliveNeighbours(new Cell(0, 0));

        assertEquals(0, neighbors.size());
    }

    @Test
    void twoCellsNextToEachOtherShouldBeNeighbors() {
        Grid grid = new Grid();
        grid.addNewCellToGrid(new Cell(0, 0));
        grid.addNewCellToGrid(new Cell(0, 1));

        List<Cell> neighborsOfFirstCell = grid.getAliveNeighbours(new Cell(0, 0));
        List<Cell> neighborsOfSecondCell = grid.getAliveNeighbours(new Cell(0, 1));

        assertArrayEquals(new Cell[]{new Cell(0, 1)}, neighborsOfFirstCell.toArray());
        assertArrayEquals(new Cell[]{new Cell(0, 0)}, neighborsOfSecondCell.toArray());

    }

    @Test
    void twoCellsFarFromEachOtherShouldHaveZeroNeighbors() {
        Grid grid = new Grid();
        grid.addNewCellToGrid(new Cell(0, 0));
        grid.addNewCellToGrid(new Cell(3, 3));

        List<Cell> neighborsOfFirstCell = grid.getAliveNeighbours(new Cell(0, 0));
        List<Cell> neighborsOfSecondCell = grid.getAliveNeighbours(new Cell(3, 3));

        assertEquals(0, neighborsOfFirstCell.size());
        assertEquals(0, neighborsOfSecondCell.size());
    }
}
