package cz.mendelu.pjj.scrabble;

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


    public void setPlayerHand(int i, char letter){

    }

}