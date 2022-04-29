public class BattleShipApplication {
    public static void main(String[] args) {

        //  Create 2 players and their boards
        Player player1 = new Player("Brecht", new Grid(10, 10));
        Player player2 = new Player("Jurgen", new Grid(10, 10));
        System.out.println(player1.getGrid().getTile(6, 0));

        //  Let players place their ships on the grid
        player1.getGrid().getTile().setTileStatus();
        player1.placeShip("Destroyer", )
    }
}
