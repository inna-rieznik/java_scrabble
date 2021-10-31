package cz.mendelu.pjj.scrabble;

import com.sun.tools.jdeprscan.scan.Scan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

import static cz.mendelu.pjj.scrabble.TilesBag.*;
import static cz.mendelu.pjj.scrabble.GameBoard.*;


//nacist soubor po radcich a udelat s neho pole,
//if slovo existuje v hash mape -> existuje/ne ?

//while nekonecny loop
//spustit aplikaci dvakrat jako dva hraci -> simiulovat na pc

//napriklad kdyz na rade hrac 1 pro neho zobrazit prikazy : pridat slovo, pass, skip

//
public class Player {
    private String name;
    private int score;
    private char handPlayer[];
    static StringBuilder word = new StringBuilder();


    public Player(Scanner name, char[] tiles){

    }

    public Player(String name,char[] handPlayer) {
        this.name = name;
        score = 0;
        this.handPlayer = handPlayer;

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

    public void showPlayerHand(){
        for (int i = 0; i<7; i++) {
            System.out.print(handPlayer[i] + " ");
        }
    }

    public char swapOneTile(char znak){
        for (int i = 0; i<7; i++) {
            if(handPlayer[i] == znak){
               handPlayer[i] = getOneTile();
               return handPlayer[i];
            }

        }
        for (int i = 0; i<TheTilesBag.length; i++) {
            if(TheTilesBag[i].getLetter() == znak){
                TheTilesBag[i].setCount(TheTilesBag[i].getCount()+1);
            }

        }
        return znak;
    }

//jestli slovo existuje jen pak davat bonusy
    //TODO переименовать
    public void chooseLetter(GameBoard board) {
        //StringBuffer word = new StringBuffer();
        System.out.print("*Add X coordinate for letter(number from 1 to 15): ");
        Scanner s_x = new Scanner(System.in);
        int x = s_x.nextInt();
        System.out.print("*Add Y coordinate for letter(number from 1 to 15): ");
        Scanner s_y = new Scanner(System.in);
        int y = s_y.nextInt();
        System.out.print("*Add letter: ");
        Scanner s_letter = new Scanner(System.in);
        //String s_letter = scanner.nextLine();

        char letter = s_letter.nextLine().charAt(0);
            if (isLetterInHand(letter)){
                //TODO Убрать из руки буквы
                //pridat do bordu pismeno
                board.addLetterToXY(x, y, letter);
            }else{
                System.out.print("You dont have this letter " + letter);
            }

    }
    //+ метод создать слово
    //+ метод убрать буквы из руки в если слово будет не правельным.
    public void createWord(){

    }

    //TODO get word from choosen letters

// метод проверяет корректность введенной буквы
// todo в идеале целое слово так проверять га соответсвие символов
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

    /**  хотел сделать воод целого слова но нормально не придумал как
    private void proverka(String word, char handPlayer[]){
        for (int i=0; i< word.length(); i++){
            for (int j=0; j<7;j++){
                if (word.charAt(i) == handPlayer[i]){

                };
            }
        }
    }
     **/
}