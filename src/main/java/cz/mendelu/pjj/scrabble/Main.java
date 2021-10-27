package cz.mendelu.pjj.scrabble;

import static cz.mendelu.pjj.scrabble.TilesBag.CreateTilesBag;
import static cz.mendelu.pjj.scrabble.TilesBag.get7tiles;


public class Main {


    public static void main(String[] args) {

        System.out.println(" ************* ");
        CreateTilesBag();

        Player player1 = new Player("Georgii", get7tiles());
        player1.showPlayerHand();
        System.out.println(" ************* ");


//        Player player2 = new Player("Georgii", get7tiles());
//        player2.showPlayerHand();
//        System.out.println(" ************* ");

        player1.swapOneTile('E');
        player1.showPlayerHand();
    }

}