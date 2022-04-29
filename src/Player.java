public class Player {
    private String name;
    private Grid grid;

    public Player(String name, Grid grid) {
        this.name = name;
        this.grid = grid;
    }

    public Grid getGrid() {
        return grid;
    }

    public void placeShip(String name, Coordinate[] array) {
        grid.placeShip(name, array);
    }
}
