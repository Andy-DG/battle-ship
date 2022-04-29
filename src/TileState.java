public enum TileState {
    OCEAN,
    SHIP,
    HIT,
    MISS;

    public boolean isValidChange(TileState status){
        return switch (this) {
            case OCEAN -> status == SHIP || status == MISS;
            case SHIP -> status == HIT;
            case HIT, MISS -> false;
        };
    }
}
