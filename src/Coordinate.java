import java.util.Locale;

public class Coordinate {
    private static final int ASCII_TO_ARRAY = 65;

    private final int row ;
    private final int col;

    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }

    //  Since we want our coordinates to be for example (row, col) --> (A,7), we need some changes.
    public static Coordinate coordinate(char row, int col) {
        return new Coordinate((int) Character.toUpperCase(row) - ASCII_TO_ARRAY, col - 1);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
