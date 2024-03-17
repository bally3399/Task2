package turtleGraphics;


import java.util.Arrays;

import static turtleGraphics.Direction.*;

public class Turtle {
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0, 0);
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
        currentDirection = currentDirection.turnLeft();

    }

    public void turnRight() {
        currentDirection = currentDirection.turnRight();
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void moveForward(int numbersOfStep, SketchPad sketchPad) {
        if (!isPenUp) drawOnBoard(sketchPad, numbersOfStep);
        switch (currentDirection){
            case EAST -> moveForwardEastWard(numbersOfStep);
            case SOUTH -> moveForwardSouthWard(numbersOfStep);
            case NORTH -> moveForwardViaNorth(numbersOfStep);
            case WEST -> moveForwardViaWest(numbersOfStep);
        }
    }

    private void drawOnBoard(SketchPad sketchPad, int numberOfSteps) {
        int[][] floorBoard = sketchPad.getFloor();
        switch (currentDirection) {
            case EAST:
                drawEastWard(floorBoard, numberOfSteps);
                break;
            case SOUTH:
                drawSouthWard(floorBoard, numberOfSteps);
                break;
            case WEST:
                drawWestWard(floorBoard, numberOfSteps);
                break;
//            case NORTH:
//                markNorthWard(floorBoard, numberOfSteps);
//                break;
        }


    }

    private void drawWestWard(int[][] floorBoard, int numberOfSteps) {
        for (int index = 0; index < numberOfSteps; index++) {
            floorBoard[index][currentPosition.getColumn()] = 1;
            System.out.println(Arrays.deepToString(floorBoard));
        }

    }


    private void drawSouthWard(int[][] floorBoard, int numberOfSteps) {
        for (int index = 0; index < numberOfSteps; index++) {
            floorBoard[index][currentPosition.getColumn()] = 1;
        }

    }

    private void drawEastWard(int[][] floorBoard, int numberOfSteps) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        for (int index = 0; index < numberOfSteps; index++) {
            floorBoard[row][column + index] = 1;
        }
    }


    private void moveForwardViaWest(int numbersOfStep) {
        int newRow = currentPosition.getRow() + numbersOfStep - 1;
        int newColumn = currentPosition.getColumn() ;
        currentPosition = new Position(newRow, newColumn);
    }

    private void moveForwardViaNorth(int numbersOfStep) {
        int newRow = currentPosition.getRow() + numbersOfStep - 1;
        int newColumn = currentPosition.getColumn() ;
        currentPosition = new Position(newRow, newColumn);
    }

    private void moveForwardSouthWard(int numberOfStep) {
        int newRow = currentPosition.getRow() + numberOfStep - 1;
        int newColumn = currentPosition.getColumn() ;
        currentPosition = new Position(newRow, newColumn);
    }


    private void moveForwardEastWard(int numbersOfStep) {
        currentPosition.setColumn(currentPosition.getRow() + numbersOfStep -1);
    }

}
