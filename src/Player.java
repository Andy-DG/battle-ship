public class Player {
    private static final Grid DEFAULT_GRID = null;

    private String name;
    private Grid grid;

    public Player(String name) {
        this.name = name;
        this.grid = DEFAULT_GRID;
    }

    public void placeShip(ShipType ship, Coordinate coordinate) {
        grid.placeShip(ship, coordinate);
    }

    public void createGrid(int width, int length){
        this.grid = new Grid (width, length);
    }

    public Grid getGrid() {
        return grid;
    }

    public void printGrid() {
        grid.printGrid();
    }
}
