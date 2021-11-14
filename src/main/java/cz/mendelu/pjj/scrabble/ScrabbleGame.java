package cz.mendelu.pjj.scrabble;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

import static cz.mendelu.pjj.scrabble.GameBoard.createGameBoard;
import static cz.mendelu.pjj.scrabble.GameBoard.showGameBoard;
import static cz.mendelu.pjj.scrabble.TilesBag.*;
import static cz.mendelu.pjj.scrabble.Player.*;

public class ScrabbleGame {

    private Dictionary dic;

    public ScrabbleGame(Dictionary dic) {
        this.dic = dic;
    }

    /**
     * @autor xrieznik
     * @version etapa 3
     */
    static void startGame() {
        //test: if board exist ? is player1,2 exists ?
        GameBoard board = new GameBoard();
        System.out.println("*********************************************");
        createTilesBag();
        Player player1 = new Player("Georgii", get7tiles());
        Player player2 = new Player("Jon", get7tiles());
        createGameBoard();
        Player activePlayer = player1;
        System.out.println("------Now plays player: " + activePlayer.getName() + "------");

        while (true) {
            System.out.println();
            System.out.print("Chose a command: \nEXIT - to finish the game \nPASS - to let another player create word" +
                    "\nWORD - to enter new word \nLETTERS - to show what letters you have \nBOARD - to show game board" +
                    "\nINFO - to show players score" +
                    "\nstart there -> ");
            Scanner s_input = new Scanner(System.in);
            String input = s_input.nextLine();
            if (input.equals("exit")) {
                System.out.println("**************************");
                System.out.println("**********The End*********");
                System.out.println("**************************");
                break;
            } else if (input.toLowerCase().equals("pass")) {
                activePlayer = player2;
                System.out.println("------Now plays" + activePlayer.getName() + "------");
            } else if (input.toLowerCase().equals("word")) {
                //TODO zkontrolovat to slovo jestli existuje v dictionary
                //TODO jestli existuje odebrat pismena u playera, pridat body
                //TODO jestli slovo neexistuje odebrat pismena s bordu
                activePlayer.moveOn(board);
            } else if (input.toLowerCase().equals("letters")) {

                System.out.print("------Letters: ");
                activePlayer.showPlayerHand();
                System.out.println();
            } else if (input.toLowerCase().equals("board")) {
                showGameBoard();
            }else if (input.toLowerCase().equals("info")) {
                System.out.println(activePlayer.toString());
            }else{
                System.out.println("Dont know this command");
            }
        }
    }

    private void checkEndOfTheGame() {

    }
    /**
     * @autor xrieznik
     * @version etapa 3
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScrabbleGame that = (ScrabbleGame) o;
        return Objects.equals(dic, that.dic);
    }
    /**
     * @autor xrieznik
     * @version etapa 3
     */
    @Override
    public int hashCode() {
        return Objects.hash(dic);
    }
}