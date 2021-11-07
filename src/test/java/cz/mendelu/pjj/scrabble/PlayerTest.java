package cz.mendelu.pjj.scrabble;

import org.junit.jupiter.api.Test;

import static cz.mendelu.pjj.scrabble.TilesBag.*;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    /**
     *
     * @autor xrieznik
     * @version etapa 2
     */
    @Test
    void swapOneTileTest() {
        createTilesBag();
        Tile t = new Tile('C', 3, 2);
        int resCount = t.getCount();
        char znak = t.getLetter();
        int expCount = 0;
        for(int i=0; i<TheTilesBag.length; i++){
            if(znak == TheTilesBag[i].getLetter()) {
               expCount = TheTilesBag[i].getCount();
            }
        }
        assertEquals(expCount, resCount);
    }
    @Test
    void isLetterInHand() {
        char[] handPlayer = {'A','B','C','E','*','F','F'};
        char letter = 'B';
        boolean res = true;

        boolean letterEx = false;
        for (int i =0; i<7; i++){
            if (letter == handPlayer[i]){
                letterEx = true;
                break;
                //return true;
            } else {
                letterEx = false;
                //return false;
            }
        }
        assertEquals(res, letterEx);
    }

    @Test
    void isLetterInHandV2() {
        char[] handPlayer = {'A','B','C','E','*','F','F'};
        char letter = 'Z';
        boolean res = false;

        boolean letterEx = false;
        for (int i =0; i<7; i++){
            if (letter == handPlayer[i]){
                letterEx = true;
                break;
                //return true;
            } else {
                letterEx = false;
                //return false;
            }
        }
        assertEquals(res, letterEx);
    }
}