package cz.mendelu.pjj.scrabble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TilesBagTest {

    /**

     */
    @Test
    void getOneTile() {
        Tile t = new Tile('A',1,1);
        t.setLetter('A');
        char letter = t.getLetter();

        assertNotNull(letter);
        assertEquals('A',letter);

    }
}