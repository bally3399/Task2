package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {
    private Direction currentDirection = Direction.EAST;
    private boolean isPenUp = true;

    public Turtle() {
    }

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penUp() {
        isPenUp = true;
    }

    public void penDown() {
        isPenUp = false;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> currentDirection = NORTH;
            case NORTH -> currentDirection = WEST;
            case WEST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = EAST;
        }
    }

    public void turnRight() {
        switch (currentDirection){
            case EAST -> currentDirection = SOUTH;
            case NORTH -> currentDirection = EAST;
            case WEST ->  currentDirection = NORTH;
            case SOUTH -> currentDirection = WEST;
        }
    }
}
