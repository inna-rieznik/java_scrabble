package cz.mendelu.pjj.scrabble;

import java.util.Scanner;

import static cz.mendelu.pjj.scrabble.GameBoard.*;
import static cz.mendelu.pjj.scrabble.TilesBag.*;

public class ScrabbleGame {

    private Dictionary dic;

    public ScrabbleGame(Dictionary dic){
        this.dic = dic;
    }

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

    /**
     * @autor xrieznik
     * @version etapa 3
     */
    static void startGame(){
        //test: if board exist ? is player1,2 exists ?
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
                System.out.println("*************");
                System.out.println("***The End***");
                System.out.println("*************");
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

    /**
     * tato metoda slouzi jen pro kontrolu jestli je mozne vyhledat slovo v dictionary
     * @return
     */



//just a test method
    public String createWord(){
        //TODO get word from choosen letters
        //string buffer : word = ' ' -> word.append
        System.out.print("Enter word: ");
        Scanner s_word = new Scanner(System.in);
        String word = s_word.nextLine().toUpperCase();
        return word;
    }


    private void checkEndOfTheGame() {

    }

}