package cz.mendelu.pjj.scrabble;

import java.io.*;

import static cz.mendelu.pjj.scrabble.ScrabbleGame.startGame;


public class Main {


    //player bude volit od ktereho policka bude davat pismeno
    //a potrebujeme kontrolu jestli tam to muze dat
    //
    public static void main(String[] args) throws IOException {
        Dictionary dic = new Dictionary("words.txt", null);
        ScrabbleGame scrabbleGame = new ScrabbleGame(dic);
                //dic.getSize();
        //String wordInput = scrabbleGame.createWord();
       // String wi2 = scrabbleGame.createWordFromLettersInBoard();
       // dic.ifWordIsInList(wordInput);
        startGame();

    }



}