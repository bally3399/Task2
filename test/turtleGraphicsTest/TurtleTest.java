package turtleGraphicsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleGraphics.Turtle;
import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    private Turtle turtle;
    @BeforeEach
    public  void initializer(){
        turtle = new Turtle();
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
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnLeft2(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnLeft3(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
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
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnRight2(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnRight3(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(EAST, turtle.getCurrentDirection());
    }

}
