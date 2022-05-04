package gameoflife;

public class Cell {

public static int countLiveNeighbours(int i, int j, int[][]grid){
    int liveNeighbours=0;
    int[][] directions =new int[][]{{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
    for(int[] direction : directions){
        int x= direction[0] + i;
        int y= direction[1] + j;
        if(x>=0 && x<grid[0].length && y>=0 && y<grid.length && grid[x][y]==1)
            liveNeighbours++;
    }
    return liveNeighbours;
}

}
