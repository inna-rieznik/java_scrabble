package cz.mendelu.pjj.scrabble;

//import com.sun.tools.jdeprscan.scan.Scan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

import static cz.mendelu.pjj.scrabble.TilesBag.*;
import static cz.mendelu.pjj.scrabble.GameBoard.*;


//nacist soubor po radcich a udelat s neho pole,
//if slovo existuje v hash mape -> existuje/ne ?



//
public class Player {
    private String name;
    private int score;
    private char handPlayer[];
    static StringBuilder word = new StringBuilder();

    /**
     *
     */
    public Player(Scanner name, char[] tiles){

    }
    /**
     *
     */
    public Player(String name,char[] handPlayer) {
        this.name = name;
        score = 0;
        this.handPlayer = handPlayer;

    }

    /**
     *
     *
     */
    public void showPlayerHand(){
        for (int i = 0; i<7; i++) {
            System.out.print(handPlayer[i] + " ");
        }
    }

    /**
     * Metoda vyměni 1 kamen, ktery zvoli player za novy z TilesBagu
     *
     * @autor xmeliaki
     * @version etapa 3
     */
    public char swapOneTile(char znak){
        //vymeni zvolene pismeno za nove
        for (int i = 0; i<7; i++) {
            if(handPlayer[i] == znak){
               handPlayer[i] = getOneTile();
               return handPlayer[i];
            }
        }
        //zvysi count pro vracene pismeno
        for (int i = 0; i<TheTilesBag.length; i++) {
            if(TheTilesBag[i].getLetter() == znak){
                TheTilesBag[i].setCount(TheTilesBag[i].getCount()+1);
            }
        }
        return znak;
    }


    /**
     * metoda umoznuje pro playera zvolit pismeno (a koordinaty x,y) ktere chce vlozit do bordu, a dale
     * metoda umisti pismeno na zvolenou bunku na boardu
     *
     * @autor xrieznik
     * @version etapa 3
     */
    public void chooseLetter(GameBoard board) {
        //@jestli slovo existuje jen pak davat bonusy
        //StringBuffer word = new StringBuffer();
        int endWord = 0;

        while(endWord !=1) {
            System.out.print("*Add X coordinate for letter(number from 1 to 15): ");
            Scanner s_x = new Scanner(System.in);
            int x = s_x.nextInt();
            System.out.print("*Add Y coordinate for letter(number from 1 to 15): ");
            Scanner s_y = new Scanner(System.in);
            int y = s_y.nextInt();
            System.out.print("*Add letter: ");
            Scanner s_letter = new Scanner(System.in);
            //String s_letter = scanner.nextLine();
            char letter = s_letter.nextLine().toUpperCase().charAt(0);

            if (isLetterInHand(letter)) {
                //TODO Убрать из руки буквы
                //pridat do bordu pismeno
                board.addLetterToXY(x, y, letter);
            } else {
                System.out.print("You dont have this letter " + letter);
            }

            System.out.print("End?");
            Scanner e_w = new Scanner(System.in);
            endWord = e_w.nextInt();
        }
        if (board.chekFirstMoveRequipments() == false ){
            System.out.println("ne spravny pervni krok");
            board.nullBoard();
        }

    }
    /**
     *
     */
    public void createWord(){
    //TODO get word from choosen letters
        throw new UnsupportedOperationException("Not implemented yet.");
    }


    /**
     * Metoda kontroluje správnost zadaného písmene, hráč má vybrané písmeno.
     *
     * @autor xmeliaki
     * @version etapa 3
     */
    private boolean isLetterInHand(char letter){
    boolean letterEx = false;
        for (int i =0; i<7; i++){
            if (letter == handPlayer[i]){
                letterEx = true;
                break;
                //return true;
            } else {
                letterEx = false;
                //return false;
            }
        }
        return letterEx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}