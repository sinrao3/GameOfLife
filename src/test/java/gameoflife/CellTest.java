package gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CellTest {
    @Test
    void shouldBeAbleToInitialiseLiveCell() {
        Cell cell = new Cell(0, 0, true);
        assertTrue(cell.isAlive());
    }

    @Test
    void shouldBeAbleToInitialiseDeadCell() {
        Cell cell = new Cell(0, 0, false);
        assertFalse(cell.isAlive());
    }

    @Test
    void shouldBeAbleToKillAnAliveCell() {
        Cell cell = new Cell(0, 0, true);
        assertTrue(cell.isAlive());
        cell.kill();
        assertFalse(cell.isAlive());
    }

    @Test
    void shouldBeAbleToResurrectADeadCell() {
        Cell cell = new Cell(0, 0, false);
        assertFalse(cell.isAlive());
        cell.resurrect();
        assertTrue(cell.isAlive());
    }

    @Test
    void shouldBeAbleToGetThePosition() {
        int x = 1, y = 2;
        CellPosition expectedCellPosition = new CellPosition(x, y);
        Cell cell = new Cell(x, y);
        assertEquals(expectedCellPosition, cell.position);
    }
}
