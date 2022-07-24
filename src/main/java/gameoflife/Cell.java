package gameoflife;

public class Cell {


    public CellPosition position;
    private boolean isAlive;

    public Cell(int x, int y, boolean isAlive) {
        this.isAlive= isAlive;
        this.position=new CellPosition(x,y);
    }

    public Cell(int x, int y) {
        this(x,y,true);
    }

    public void setState(boolean isAlive) {
        this.isAlive=isAlive;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void kill() {
        this.isAlive=false;
    }

    public void resurrect() {
        this.isAlive=true;
    }

}
