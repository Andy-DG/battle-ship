public class Tile {
    private static final TileStatus TILE_STATUS_DEFAULT = TileStatus.OCEAN;
    private final int xCoordinate;
    private final int yCoordinate;
    private TileStatus tileStatus;

    public Tile(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.tileStatus = TILE_STATUS_DEFAULT;
    }

    public void setTileStatus(TileStatus tileStatus) {
        this.tileStatus = tileStatus;
    }

    public void placeShip() {
        this.tileStatus = TileStatus.SHIP;
    }

    @Override
    public String toString() {
        return "Tile " +
                "(" + xCoordinate +
                ", " + yCoordinate +
                ") " + tileStatus;
    }
}
