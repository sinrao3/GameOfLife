package gameoflife_test;

import gameoflife.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CellTest {
    @Test
    public void shouldGetNextGenerationForBlockPattern() {
        int[][] LiveCells =new int[][]{{1,1},{1,2},{2,1},{2,2}};
        Grid grid= new Grid(3,3);
        int[][] FirstGenerationGrid=grid.createFirstGenerationGrid(LiveCells);
        int [][] expectedGeneration = new int[][]{
                {0, 0, 0},
                {0, 1, 1},
                {0, 1, 1},
        };
        int[][] nextGeneration = grid.getNextGeneration(FirstGenerationGrid);
        assertArrayEquals(expectedGeneration, nextGeneration);
    }

    @Test
    public void shouldGetNextGenerationForBoatPattern() {
        int[][] LiveCells =new int[][]{{0,1},{1,0},{2,1},{0,2},{1,2}};
        Grid grid= new Grid(3,3);
        int[][] FirstGenerationGrid=grid.createFirstGenerationGrid(LiveCells);
        int [][] expectedGeneration = new int[][]{
                {0, 1, 1},
                {1, 0, 1},
                {0, 1, 0}
        };
        int[][] nextGeneration = grid.getNextGeneration(FirstGenerationGrid);
        assertArrayEquals(expectedGeneration, nextGeneration);
    }

    @Test
    public void shouldGetNextGenerationForOscillatorPattern() {
        int[][] LiveCells =new int[][]{{1,1},{1,0},{1,2}};
        Grid grid= new Grid(3,3);
        int[][] FirstGenerationGrid=grid.createFirstGenerationGrid(LiveCells);
        int [][] expectedGeneration = new int[][]{
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0}
        };
        int[][] nextGeneration = grid.getNextGeneration(FirstGenerationGrid);
        assertArrayEquals(expectedGeneration, nextGeneration);
    }

    @Test
    public void shouldGetNextGenerationForToadPattern() {
        int[][] LiveCells =new int[][]{{1,1},{1,2},{1,3},{2,2},{2,3},{2,4}};
        Grid grid= new Grid(5,5);
        int[][] FirstGenerationGrid=grid.createFirstGenerationGrid(LiveCells);
        int [][] expectedGeneration = new int[][]{
                {0, 0, 1, 0, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };
        int[][] nextGeneration = grid.getNextGeneration(FirstGenerationGrid);
        assertArrayEquals(expectedGeneration, nextGeneration);
    }

}
