package gameoflife;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grid {
    private List<Cell> cells= new ArrayList<>();

    public void addNewCellToGrid(Cell cell) {
        cells.add(cell);
    }

    public List<Cell> getNeighbors(Cell cell) {
        List<Cell> neighbors = new ArrayList<>();

        for(Cell oneCell : cells){
            if(!oneCell.equals(cell)){
                neighbors.add(oneCell);
            }
        }
        return neighbors;
    }
}
