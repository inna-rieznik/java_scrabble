package cz.mendelu.pjj.scrabble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {
    /**
     * x and y is in range 1-15
     * @autor xrieznik
     * @version etapa 2
     */
    @Test
    void addLetterToXYTest() {
        int x = 2;
        int y = 2;
        char a = 'A';
        GameBoard b = new GameBoard();
        GameBoard.createGameBoard();
        b.addLetterToXY(x, y, a);
        assertEquals(a, GameBoard.Board[x-1][y-1].getLetter());
    }

    /**
     * x out of bound
     * @autor xrieznik
     * @version etapa 2
     */
   @Test
    void addLetterToXYOutOfBoundX() {
        int x = 100;
        int y = 1;
        char a = 'A';
        GameBoard b = new GameBoard();
        GameBoard.createGameBoard();

       // Exception exception =
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> b.addLetterToXY(x, y, a));
        //assertTrue(exception.getMessage().contains("index"));

    }

    /**
     * y out of bound
     * @autor xrieznik
     * @version etapa 2
     */
    @Test
    void addLetterToXYOutOfBoundY() {
        int x = 2;
        int y = -10;
        char a = 'A';
        GameBoard b = new GameBoard();
        GameBoard.createGameBoard();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            b.addLetterToXY(x, y, a);
        });
    }


}