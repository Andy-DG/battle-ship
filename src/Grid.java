public class Grid {
    private final Tile[][] tiles;
    private final int width;
    private final int length;
    private Coordinate[] coordinates;

    public Grid(int width, int length) {
        this.width = width;
        this.length = length;
        this.tiles = new Tile[width][length];
        this.coordinates = new Coordinate[width * length];

        //  Create tiles
        createTiles(width, length);
    }

    public void createTiles(int width, int length) {
        int counter = 0;
        for (int row = 0; row < width; row++) {
            for (int col = 0; col < length; col++) {
                this.coordinates[counter] = new Coordinate(row, col);
                this.tiles[row][col] = new Tile(new Coordinate(row, col));
                counter++;
            }
        }
    }

    public void placeShip(ShipType ship, Coordinate coordinate) {
        getTile(coordinate).placeShip();
    }


    public Tile getTile(Coordinate coordinate) {
        return tiles[coordinate.getRow()][coordinate.getCol()];
    }

    public void printGrid() {
        int rowCount = 1;
        printCoordinateRow();
        for (int i = 0; i < coordinates.length; i++) {
            if (i == 0) System.out.print((char) (i + 65)  + "  ");
            getTile(this.coordinates[i]).printTile();
            if ((i + 1) % width == 0) {
                System.out.println("");
                if (rowCount < length) {
                    System.out.print((char) (rowCount + 65) + "  ");
                    rowCount++;
                }
            }
        }
    }

    private void printCoordinateRow() {
        for (int j = 0; j < width + 1; j++) {
            if (j == 0) {
                System.out.print("   ");
            } else {
                System.out.print(j + "  ");
            }
            if (j == width) {
                System.out.println("");
            }
        }
    }
}
