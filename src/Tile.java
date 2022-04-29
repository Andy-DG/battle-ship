public class Tile {
    private static final TileState TILE_STATE_DEFAULT = TileState.OCEAN;
    private final Coordinate coordinate;
    private TileState tileState;


    public Tile(Coordinate coordinate) {
        this.coordinate = coordinate;
        this.tileState = TILE_STATE_DEFAULT;
    }

    public void setTileStatus(TileState tileStatus) {
        this.tileState = tileStatus;
    }

    public void placeShip() {
        setTileState(TileState.SHIP);
    }

    public TileState getTileState() {
        return tileState;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    private void setTileState(TileState state) {
        if (this.tileState.isValidChange(state)) {
            this.tileState = state;
        }
    }

    public void printTile() {
        switch (this.tileState){
            case SHIP -> System.out.print("S  ");
            case OCEAN -> System.out.print("O  ");
            case HIT -> System.out.print("X  ");
            case MISS -> System.out.println("0  ");
        };
    }
}
