package cz.mendelu.pjj.scrabble;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

import static cz.mendelu.pjj.scrabble.TilesBag.*;

public class Player {
    private String name;
    private int score;
    private char handPlayer[];


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


    //TODO переименовать
    public void chooseLetter() {
        StringBuffer word = new StringBuffer();
        Scanner scanner = new Scanner(System.in);

        String s_letter = scanner.nextLine();

        char letter = s_letter.charAt(0);

            if (proverka(letter) == true){
                //TODO Убрать из руки буквы
            }else{

            }
    }
    //+ метод создать слово
    //+ метод убрать буквы из руки в если слово будет не правельным.

// метод проверяет корректность введенной буквы
// todo в идеале целое слово так проверять га соответсвие символов
    private boolean proverka(char letter){
    boolean letterEx = false;
        for (int i =0; i<7; i++){
            if (letter == handPlayer[i]){
                letterEx = true;
                break;
            } else {
                letterEx = false;
            }
        }
        if (letterEx == true){
        return true;
        } else {
            return false;
        }
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