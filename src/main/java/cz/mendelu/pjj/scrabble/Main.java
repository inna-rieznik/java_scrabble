package cz.mendelu.pjj.scrabble;

import java.io.*;


public class Main {


    //player bude volit od ktereho policka bude davat pismeno
    //a potrebujeme kontrolu jestli tam to muze dat
    //
    public static void main(String[] args) throws IOException {
        Dictionary dic = new Dictionary("words.txt", null);
        ScrabbleGame scrabbleGame = new ScrabbleGame(dic);
        //startGame();
        dic.getSize();
    }



}