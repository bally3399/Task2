package turtleGraphics;

public class Position {
    public int column;
    private int row;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }


    public Position(int row, int column) {
        this.row = row;
        this.column = column;

    }

    @Override
    public String toString() {
        return "Position{" +
                "row =" + row + ":" +
                "column =" + column +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Position position){
            return row == position.row && column == position.column;
        }
        return false;
    }
}
