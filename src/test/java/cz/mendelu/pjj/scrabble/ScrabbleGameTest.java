package cz.mendelu.pjj.scrabble;

import org.junit.jupiter.api.Test;

import static cz.mendelu.pjj.scrabble.GameBoard.createGameBoard;
import static cz.mendelu.pjj.scrabble.TilesBag.createTilesBag;
import static cz.mendelu.pjj.scrabble.TilesBag.get7tiles;
import static org.junit.jupiter.api.Assertions.*;

class ScrabbleGameTest {
    /**
     * if the board was created and if the start position is empty
     * @author xrieznik
     * @version etapa 2
     */
    @Test
    void startGame() {
        //setup
        GameBoard board = new GameBoard();
        createTilesBag();
        createGameBoard();
        Player player1 = new Player("Georgii", get7tiles());
        Player player2 = new Player("Inna", get7tiles());
        //when
        boolean startPosition = board.chekFirstMoveRequipments();
        //then
        assertNotNull(board);
        assertNotNull(player1);
        assertNotNull(player2);
        assertFalse(startPosition); // controll if the start position is empty
    }
}