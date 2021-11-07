package cz.mendelu.pjj.scrabble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrabbleGameTest {

    @Test
    /**
     * if the board was created
     * @autor xrieznik
     * @version etapa 2
     */
    void startGame() {
        GameBoard board = new GameBoard();
        assertNotNull(board);
    }
}