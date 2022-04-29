public class Grid {
    private int width;
    private int length;
    private Tile[][] tiles;

    public Grid(int width, int length) {
        this.width = width;
        this.length = length;
        this.tiles = new Tile[width][length];
        for (int row = 0; row < width; row++) {
            for (int col = 0; col < length; col++) {
                assert false;
                tiles[row][col] = new Tile(row, col);
            }
        }
    }

    public void placeShip(String name, Coordinate[] coordinates) {
        for(Coordinate coordinate: coordinates) {
            getTile(coordinate).placeShip();
        }
    }

    public Tile getTile(int xCoordinate, int yCoordinate) {
        return tiles[xCoordinate][yCoordinate];
    }

}
