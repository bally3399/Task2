package oop5;

public class Player {
    private final String name;
    private final Cell cell;

    public Player(String name, Cell cell) {
        this.name = name;
        this.cell = cell;
    }

    public String getName() {
        return name;
    }

    public Cell getCell() {
        return cell;
    }
}
