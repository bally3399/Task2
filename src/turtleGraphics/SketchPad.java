package turtleGraphics;

public class SketchPad {
    private int[][] floor = new int[20][20];

    public SketchPad(int rows, int columns) {
        floor = new int[rows][columns];
    }

    public int[][] getFloor() {
       return floor;
    }

    public void displayFloor() {
        for (var row : floor) {
            for (var column : row) {
                if(column == 1) System.out.print("* ");
                if(column == 0) System.out.println(" ");
            }
            System.out.println();
        }
    }

}
