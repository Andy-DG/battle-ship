public class BattleShipApplication {
    public static void main(String[] args) {

        //  Create 2 players ==> Ask their names
        Player player1 = new Player("Brecht");
        Player player2 = new Player("Jurgen");

        //  Create their boards ==> Ask the dimensions
        player1.createGrid(9, 9);
        player2.createGrid(9, 9);

        //  Let players place their ships on the grid ==> Ask what ship and their starting coordinate.
        //  Let players place their ships on the grid ==> Ask what ship and their starting coordinate.
        //  Let players place their ships on the grid ==> Ask what ship and their starting coordinate.
        //  player1.getGrid().getTile().setTileStatus(); //<-- this is bad coding
        player1.placeShip(ShipType.BATTLESHIP, Coordinate.coordinate('A', 1));
        //  player2.placeShip("Destroyer", 3, 3);

        player1.printGrid();
        //player2.printGrid();


    }
}
