package cz.mendelu.pjj.scrabble;

import java.util.Scanner;

import static cz.mendelu.pjj.scrabble.GameBoard.*;
import static cz.mendelu.pjj.scrabble.ScrabbleGame.*;
import static cz.mendelu.pjj.scrabble.TilesBag.*;


public class Main {

    //player bude volit od ktereho policka bude davat pismeno
    //a potrebujeme kontrolu jestli tam to muze dat
    //
    public static void main(String[] args) {

        GameBoard board = new GameBoard();
        System.out.println("******************");
        createTilesBag();
        Player player1 = new Player("Georgii", get7tiles());
        Player player2 = new Player("Jon", get7tiles());

        System.out.println();
        createGameBoard();
        Player activePlayer = player1;
        System.out.println("Hraje hrac: " + activePlayer.getName());

        while (true){
            Scanner s_input = new Scanner(System.in);
            String input = s_input.nextLine();
            if (input.equals("exit")) {
                System.out.println("Konec hry");
                break;
            } else if (input.equals("pass")) {
                activePlayer = player2;
                System.out.println("Hraje hrac " + activePlayer.getName());
            } else if (input.equals("slovo")) {
                //TODO zkontrolovat to slovo jestli existuje v dictionary
                //TODO jestli existuje odebrat pismena u playera, pridat body
                //TODO jestli slovo neexistuje odebrat pismena s bordu
                activePlayer.chooseLetter(board);
            } else if (input.equals("pismena")) {
                activePlayer.showPlayerHand();
            } else if (input.equals("board")) {
                showGameBoard();
            }
            else {
                System.out.println("Neznamy prikaz");
            }
        }



    }


}