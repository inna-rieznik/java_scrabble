package cz.mendelu.pjj.scrabble;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static cz.mendelu.pjj.scrabble.TilesBag.TheTilesBag;
import static cz.mendelu.pjj.scrabble.TilesBag.getOneTile;

public class Player {
    private String name;
    private int score;
    private char handPlayer[];
    static StringBuilder word = new StringBuilder();
    private int firstX = 0;
    private int firstY = 0;

    /**
     *
     */
    public Player(Scanner name, char[] tiles) {

    }

    /**
     *
     */
    public Player(String name, char[] handPlayer) {
        this.name = name;
        score = 0;
        this.handPlayer = handPlayer;

    }

    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    public void showPlayerHand() {
        for (int i = 0; i < 7; i++) {
            System.out.print(handPlayer[i] + " ");
        }
    }

    /**
     * Metoda vyměni 1 kamen, ktery zvoli player za novy z TilesBagu
     *
     * @autor xmeliaki
     * @version etapa 3
     */
    public char swapOneTile(char znak) {
        //vymeni zvolene pismeno za nove
        for (int i = 0; i < 7; i++) {
            if (handPlayer[i] == znak) {
                handPlayer[i] = getOneTile();
                return handPlayer[i];
            }
        }
        //zvysi count pro vracene pismeno
        for (int i = 0; i < TheTilesBag.length; i++) {
            if (TheTilesBag[i].getLetter() == znak) {
                TheTilesBag[i].setCount(TheTilesBag[i].getCount() + 1);
            }
        }
        return znak;
    }

    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    public void moveOn(GameBoard board) {
        //TODO after player submit end of the word -> call method replace '_' for new letters
        int countLetters = 0;
        int endMove = 0;
        while (endMove != 1) {
            char letter = chooseLetter();
            choosePositions(letter, board, countLetters);
            removeUsedLetter(letter);
            countLetters++;
            System.out.print("konec slova? 0-for NO, 1-for YES: ");
            Scanner s_endMove = new Scanner(System.in);
            endMove = s_endMove.nextInt();
        }

        if (board.chekFirstMoveRequipments() == false) {
            System.out.println("Nespravny pervni krok. Prvni pismeno ma byt na [8][8]");
            board.nullBoard();
        }
        //TODO kodLetters must be

    }

    /**
     * this method will remove used letters
     *
     * @param letter
     * @autor xrieznik
     * @version etapa 3
     */
    public void removeUsedLetter(char letter) {
        for (int i = 0; i < handPlayer.length - 1; i++) {
            for (int j = i + 1; j < handPlayer.length; j++) {
                if (handPlayer[i] == letter) {
                    if (handPlayer[i] == handPlayer[j]) {
                        handPlayer[j] = '_';
                    } else {
                        handPlayer[i] = '_';
                    }
                }
            }
        }
    }

    /**
     * metoda umoznuje pro playera zvolit pismeno (a koordinaty x,y) ktere chce vlozit do bordu, a dale metoda umisti pismeno na zvolenou bunku na boardu
     *
     * @author xrieznik
     * @version etapa 3
     */
    public char chooseLetter() {
        //@jestli slovo existuje jen pak davat bonusy
        //StringBuffer word = new StringBuffer();
        System.out.print("*Add letter: ");
        Scanner s_letter = new Scanner(System.in);
        char letter = s_letter.nextLine().toUpperCase().charAt(0);
        if (isLetterInHand(letter)) {
        } else {
            System.out.print("You dont have this letter " + letter);
            chooseLetter();
        }
        return letter;
    }

    /**
     * Metoda kontroluje spravnost zadaného písmene, hráč má vybrané písmeno.
     *
     * @author xmeliaki
     * @version etapa 3
     */
    private boolean isLetterInHand(char letter) {
        boolean letterEx = false;
        for (int i = 0; i < 7; i++) {
            if (letter == handPlayer[i]) {
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

    /**
     * Metoda pro volbu pozice pro pismena na game-board
     * @author xrieznik
     * @version etapa 3
     */
    public void choosePositions(char letter, GameBoard board, int countLetters) {
        System.out.print("*Add X coordinate for letter(number from 1 to 15): ");
        Scanner s_x = new Scanner(System.in);
        int x = s_x.nextInt();
        if (x > 15) {
            System.out.print("ne spravny X");
            choosePositions(letter, board, countLetters);
        }
        System.out.print("*Add Y coordinate for letter(number from 1 to 15): ");
        Scanner s_y = new Scanner(System.in);
        int y = s_y.nextInt();
        if (y > 15) {
            System.out.print("ne spravny Y");
            choosePositions(letter, board, countLetters);
        }
        board.addLetterToXY(y, x, letter);
//        if (board.cellIsNull(y,x)){
//            board.addLetterToXY(y,x,letter);
//        } else {
//            System.out.println("pozice obsazena");
//        }


        if (countLetters == 0)
            firstX = x;//   to to je posledni X a Y od nich zacneme chledat slovo
        firstY = y;//
    }
    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    public String getName() {
        return name;
    }
    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *@autor xrieznik
     * @version etapa 3
     */
    public int getScore() {
        return score;
    }
    /**
     *@autor xrieznik
     * @version etapa 3
     */
    public static void setScore(int score) {
        score = score;
    }
    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    public int getFirstX() {
        return firstX;
    }
    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    public void setFirstX(int firstX) {
        this.firstX = firstX;
    }
    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    public int getFirstY() {
        return firstY;
    }
    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    public void setFirstY(int firstY) {
        this.firstY = firstY;
    }
    /**
     *@autor xrieznik
     * @version etapa 3
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return score == player.score && firstX == player.firstX && firstY == player.firstY
                && Objects.equals(name, player.name) && Arrays.equals(handPlayer, player.handPlayer);
    }
    /**
     *@autor xrieznik
     * @version etapa 3
     */
    @Override
    public int hashCode() {
        int result = Objects.hash(name, score, firstX, firstY);
        result = 31 * result + Arrays.hashCode(handPlayer);
        return result;
    }

    /**
     * @autor xrieznik
     * @version etapa 3
     */
    @Override
    public String toString() {
        return "----------------------------------" +
                "\nPlayer name=" + name +
                "\nscore=" + score +
                "\nLetters=" + Arrays.toString(handPlayer) +
                "\n----------------------------------";
    }
}