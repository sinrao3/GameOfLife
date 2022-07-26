package gameoflife;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private List<Cell> cells = new ArrayList<>();

    public void addNewCellToGrid(Cell cell) {
        cells.add(cell);
    }

    public List<Cell> getAllNeighbours(Cell cell) {
        List<Cell> allNeighbours = new ArrayList<>();

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                Cell oneCell = new Cell(cell.position.x + dx, cell.position.y + dy);
                allNeighbours.add(oneCell);
            }
        }
        return allNeighbours;
    }

    public List<Cell> getAliveNeighbours(Cell cell) {
        List<Cell> aliveNeighbours = new ArrayList<>();

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                Cell oneCell = new Cell(cell.position.x + dx, cell.position.y + dy);
                if (cells.contains(oneCell) && !oneCell.equals(cell) && !aliveNeighbours.contains(oneCell))
                    aliveNeighbours.add(oneCell);
            }
        }
        return aliveNeighbours;
    }


    public boolean contains(Cell cell) {
        return cells.contains(cell);
    }

    public Grid getNextGeneration() {
        Grid nextGeneration = new Grid();
        List<Cell> allNeighboursList = new ArrayList<>();
        for (Cell cell : cells) {
            if (getAliveNeighbours(cell).size() == 2 || getAliveNeighbours(cell).size() == 3)
                nextGeneration.addNewCellToGrid(cell);
            allNeighboursList.addAll(getAllNeighbours(cell));
        }
        for (Cell c : allNeighboursList) {
            if (getAliveNeighbours(c).size() == 3)
                nextGeneration.addNewCellToGrid(c);
        }
        return nextGeneration;
    }

}
