package gameoflife;

public class Grid {
    private final int numberOfRows;
    private final int numberOfColumns;
    public Grid(int x, int y) {
       this.numberOfRows=x;
       this.numberOfColumns=y;
    }

    public int[][] createFirstGenerationGrid(int[][] LiveCells) {
        //create array with user input
        int[][] grid = new int[numberOfRows][numberOfColumns];
        for(int[] LiveCell :LiveCells){
            int x= LiveCell[0];
            int y= LiveCell[1];
            grid[x][y]= 1;
        }
        return grid;

    }

    public int[][] getNextGeneration(int[][] grid){
        int[][] nextGrid=new int[numberOfRows][numberOfColumns];
        for(int i=0;i<numberOfRows;i++){
            for (int j = 0; j < numberOfColumns; j++){
                int liveNeighbours= Cell.countLiveNeighbours(i,j,grid);
                if(grid[i][j]==1 &&(liveNeighbours==2 || liveNeighbours==3))
                    nextGrid[i][j]=1;
                else if(grid[i][j]==0 && liveNeighbours==3)
                    nextGrid[i][j]=1;
            }
        }
        return nextGrid;
    }
}
