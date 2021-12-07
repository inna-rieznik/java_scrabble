package cz.mendelu.pjj.scrabble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    /**
     * x and y is in range 1-15
     * @author xrieznik
     * @version etapa 2
     */
    @Test
    void addLetterToXYTest() {
        //setup
        GameBoard b = new GameBoard();
        GameBoard.createGameBoard();
        int x = 2;
        int y = 2;
        char a = 'A';
        b.addLetterToXY(x, y, a);
        //when
        char cellValue = GameBoard.Board[x-1][y-1].getLetter();
        //then
        assertEquals(a,cellValue);
        assertNotNull(cellValue);
    }

    /**
     * x out of bound
     * @author xrieznik
     * @version etapa 2
     */
   @Test
    void addLetterToXYOutOfBoundX() {
       //setup
       GameBoard b = new GameBoard();
       GameBoard.createGameBoard();
       int x = 100;
       int y = 1;
       char a = 'A';
       //when + then
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> b.addLetterToXY(x, y, a)
        );
    }

    /**
     * y out of bound
     * @author xrieznik
     * @version etapa 2
     */
    @Test
    void addLetterToXYOutOfBoundY() {
        //setup
        int x = 2;
        int y = -10;
        char a = 'A';
        GameBoard b = new GameBoard();
        GameBoard.createGameBoard();
        //when + then
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () ->  b.addLetterToXY(x, y, a));
    }
    /**
     * x and y out of bound
     * @author xrieznik
     * @version etapa 2
     */
    @Test
    void addLetterToXYOutOfBoundXY() {
        //setup
        int x = 25;
        int y = -10;
        char a = 'A';
        GameBoard b = new GameBoard();
        GameBoard.createGameBoard();
        //when + then
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> b.addLetterToXY(x, y, a));
    }

}