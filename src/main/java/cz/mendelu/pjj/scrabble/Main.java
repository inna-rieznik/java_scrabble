package cz.mendelu.pjj.scrabble;

import static cz.mendelu.pjj.scrabble.GameBoard.*;
import static cz.mendelu.pjj.scrabble.ScrabbleGame.*;
import static cz.mendelu.pjj.scrabble.TilesBag.*;


public class Main {


    public static void main(String[] args) {

        System.out.println("******************");
        createTilesBag();
        Player player1 = new Player("Georgii", get7tiles());
        player1.showPlayerHand();
        player1.chooseLetter();


    }


}