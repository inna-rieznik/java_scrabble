package cz.mendelu.pjj.scrabble;

import java.util.Locale;
import java.util.Scanner;

import static cz.mendelu.pjj.scrabble.GameBoard.createGameBoard;
import static cz.mendelu.pjj.scrabble.GameBoard.showGameBoard;
import static cz.mendelu.pjj.scrabble.TilesBag.*;
import static cz.mendelu.pjj.scrabble.Player.*;

public class ScrabbleGame {

    private static void createPlayers(){
        //TODO add scanner to read players names
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter name of the first player: ");
//        String name = n.nextLine();
/**        Player player1 = new Player("Georgii", get7tiles());
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
 */
    }

    static void startGame(){
        GameBoard board = new GameBoard();
        System.out.println("*********************************************");
        createTilesBag();
        Player player1 = new Player("Georgii", get7tiles());
        Player player2 = new Player("Jon", get7tiles());

        System.out.println();
        createGameBoard();
        Player activePlayer = player1;
        System.out.println("Now plays player: " + activePlayer.getName());

        while (true){
            System.out.println();
            System.out.print("Chose a command: \nEXIT - to finish the game \nPASS - to let another player create word" +
                    "\nWORD - to eenter new word \nLETTERS - to show what letters you have \nBOARD - to show game board" +
                    "\nstart there -> ");
            Scanner s_input = new Scanner(System.in);
            String input = s_input.nextLine();
            if (input.equals("exit")) {
                System.out.println("The End");
                break;
            } else if (input.toLowerCase().equals("pass")) {
                activePlayer = player2;
                System.out.println("Now plays " + activePlayer.getName());
            } else if (input.toLowerCase().equals("word")) {
                //TODO zkontrolovat to slovo jestli existuje v dictionary
                //TODO jestli existuje odebrat pismena u playera, pridat body
                //TODO jestli slovo neexistuje odebrat pismena s bordu
                activePlayer.chooseLetter(board);
            } else if (input.toLowerCase().equals("letters")) {
                System.out.println();
                System.out.print("Letters: ");
                activePlayer.showPlayerHand();
                System.out.println();
            } else if (input.toLowerCase().equals("board")) {
                showGameBoard();
            }
            else {
                System.out.println("Dont know this command");
            }
        }
    }
//


    private void checkEndOfTheGame() {

    }

}
