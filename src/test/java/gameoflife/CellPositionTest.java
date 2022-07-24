package gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CellPositionTest {


    @Test
    void shouldBeAbleToGetCoordinates(){
        int x=1,y=2;
        CellPosition cellPosition = new CellPosition(x,y);
        assertEquals(x,cellPosition.x);
        assertEquals(y,cellPosition.y);
    }

    @Test
    void shouldTestThatTwoCellPositionsWithSameCoordinatesAreSame(){
        int x=1,y=2;
        CellPosition cellPosition1 = new CellPosition(x,y);
        CellPosition cellPosition2 = new CellPosition(x,y);
        assertEquals(cellPosition1,cellPosition2);
    }
}
