package cz.mendelu.pjj.scrabble;

import org.junit.jupiter.api.Test;

import static cz.mendelu.pjj.scrabble.TilesBag.*;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void swapOneTile() {
        char znak = 'C';
        int expCount = 3;
        int resCount=0;

        for(int i=0; i<TheTilesBag.length; i++){
            if(znak == TheTilesBag[i].getLetter()) {
                resCount = TheTilesBag[i].getCount();
            }
        }
        assertNotNull(expCount);
        assertEquals(expCount, resCount);
    }
}