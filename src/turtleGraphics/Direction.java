package turtleGraphics;

public enum Direction {
    WEST("SOUTH", "NORTH"),
    SOUTH("WEST", "EAST"),
    NORTH("EAST","WEST"),
    EAST("NORTH", "SOUTH");
    private String right;
    private String left;
    Direction(String left, String right){
        this.left = left;
        this.right = right;
    }
    public Direction turnLeft(){
        return Direction.valueOf(this.left);
    }
    public Direction turnRight(){
        return Direction.valueOf(this.right);
    }

}
