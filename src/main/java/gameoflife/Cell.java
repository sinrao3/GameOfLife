package gameoflife;

public class Cell {


    public CellPosition position;
    private boolean isAlive;

    public Cell(int x, int y, boolean isAlive) {
        this.isAlive= isAlive;
        this.position=new CellPosition(x,y);
    }

    public Cell(int x, int y) {
        this(x,y,false);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        if (isAlive != cell.isAlive) return false;
        return position != null ? position.equals(cell.position) : cell.position == null;
    }

    @Override
    public int hashCode() {
        int result = position != null ? position.hashCode() : 0;
        result = 31 * result + (isAlive ? 1 : 0);
        return result;
    }
}
