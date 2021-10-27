package cz.mendelu.pjj.scrabble;

import java.util.Scanner;

import static cz.mendelu.pjj.scrabble.TilesBag.*;
import static cz.mendelu.pjj.scrabble.Player.*;

public class ScrabbleGame {

    private static void createPlayers(){
        //TODO add scanner to read players names
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter name of the first player: ");
//        String name = n.nextLine();
        Player player1 = new Player("Georgii", get7tiles());
        System.out.println("Player 1: " + player1.getName());
        System.out.println("Score:" + player1.getScore());
        System.out.print("Letters: ");
        player1.showPlayerHand();

        System.out.println(" ");
        System.out.println("******************");

        Player player2 = new Player("Inna", get7tiles());
        System.out.println("Player 2: " + player2.getName());
        System.out.println("Score:" + player2.getScore());
        System.out.print("Letters: ");
        player2.showPlayerHand();
        System.out.println(" ");
        System.out.println("******************");
    }

    static void startGame(){
        createTilesBag();
        createPlayers();
    }

//


    private void checkEndOfTheGame() {

    }

}
