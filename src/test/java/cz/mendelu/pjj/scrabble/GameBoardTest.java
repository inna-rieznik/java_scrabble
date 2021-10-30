package cz.mendelu.pjj.scrabble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    @Test
    void addLetterToXY() {
        int x = 1;
        int y = 1;
        char a = 'A';
        GameBoard b = new GameBoard();
        GameBoard.createGameBoard();

        b.addLetterToXY(x, y, a);
        assertEquals(a, GameBoard.Board[x][y].getLetter());
    }

    @Test
    void addLetterToXYOutOfBound() {
        int x = 100;
        int y = 1;
        char a = 'A';
        GameBoard b = new GameBoard();
        GameBoard.createGameBoard();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            b.addLetterToXY(x, y, a);
        });
    }

}