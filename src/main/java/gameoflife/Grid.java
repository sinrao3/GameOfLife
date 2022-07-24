package gameoflife;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private List<Cell> cells= new ArrayList<>();

    public void addNewCellToGrid(Cell cell) {
        cells.add(cell);
    }

    public List<Cell> getAliveNeighbors(Cell cell) {
        List<Cell> neighbors = new ArrayList<>();

        for(int dx=-1;dx<=1;dx++){
            for(int dy=-1;dy<=1;dy++){
                Cell oneCell= new Cell(cell.position.x+dx,cell.position.y+dy);
                if(cells.contains(oneCell) && !oneCell.equals(cell) && !neighbors.contains(oneCell))
                    neighbors.add(oneCell);
            }
        }
        return neighbors;
    }
}
