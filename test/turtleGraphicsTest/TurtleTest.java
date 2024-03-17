package turtleGraphicsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleGraphics.Position;
import turtleGraphics.SketchPad;
import turtleGraphics.Turtle;
import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    private Turtle turtle;
    private SketchPad sketchPad;
    @BeforeEach
    public  void initializer(){
        turtle = new Turtle();
        sketchPad = new SketchPad(5, 5);
    }
    @Test
    public void PenIsUpTest(){
        assertTrue(turtle.isPenUp());
    }
    @Test
    public void penUpTest(){
        assertTrue(turtle.isPenUp());
        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }
    @Test
    public void penIsDownTest(){
        turtle.penUp();
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    public void testThatTurtleCanTurnLeft(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnLeft1(){
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnLeft2(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnLeft3(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(EAST, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnRight(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnRight1(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnRight2(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnRight3(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(EAST, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        turtle.moveForward(5, sketchPad);
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingSouthTest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        turtle.moveForward(5, sketchPad);
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchPad);
        assertEquals(new Position(4, 4), turtle.getCurrentPosition());
    }

    @Test
    public void turtleCamMoveForwardWhileFacingWest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        turtle.moveForward(5, sketchPad);
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());

        turtle.moveForward(5, sketchPad);
        assertEquals(new Position(4, 4), turtle.getCurrentPosition());
    }

    @Test
    public void turtleCamMoveForwardWhileFacingNorth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        turtle.moveForward(5, sketchPad);
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());

        turtle.moveForward(5, sketchPad);
        assertEquals(new Position(4, 4), turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanDrawWhileFacingEastTest(){
        turtle.penDown();
        assertEquals(EAST, turtle.getCurrentDirection());
        assertEquals(turtle.getCurrentPosition(), new Position(0, 0));
        assertFalse(turtle.isPenUp());
        turtle.moveForward(5, sketchPad);
        assertEquals(turtle.getCurrentPosition(), new Position(0,4));
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[0][4]);

    }
    @Test
    public void turtleCanDrawWhileFacingSouthTest() {
        turtle.penDown();
        assertEquals(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        assertFalse(turtle.isPenUp());
        turtle.moveForward(5, sketchPad);
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchPad);
        assertEquals(new Position(4, 4), turtle.getCurrentPosition());
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][4]);
        assertEquals(1, floor[1][4]);
        assertEquals(1, floor[2][4]);
        assertEquals(1, floor[3][4]);
        assertEquals(1, floor[4][4]);
    }
    @Test
    public void turtleCanDrawWhileFacingWestTest() {
        turtle.penDown();
        assertEquals(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        assertFalse(turtle.isPenUp());
        turtle.moveForward(5, sketchPad);
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchPad);
        assertEquals(new Position(4, 4), turtle.getCurrentPosition());
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[1][0]);
        assertEquals(1, floor[2][0]);
        assertEquals(1, floor[3][0]);
        assertEquals(1, floor[4][0]);
    }

}
