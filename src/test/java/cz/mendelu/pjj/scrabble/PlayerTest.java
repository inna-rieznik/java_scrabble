package cz.mendelu.pjj.scrabble;

import org.junit.jupiter.api.Test;

import static cz.mendelu.pjj.scrabble.TilesBag.*;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {


    /**
     * NOT ?????test if letters were swapped and if the count of the returned letter increased for 1 item
     * @author xrieznik
     * @version etapa 2
     */
    @Test
    void swapOneTileTest() {
        //setup
        createTilesBag();
        Tile t = new Tile('C', 3, 2);
        //when
        int resCount = t.getCount();
        char znak = t.getLetter();
        int expCount = 0;
        for(int i=0; i<TheTilesBag.length; i++){
            if(znak == TheTilesBag[i].getLetter()) {
               expCount = TheTilesBag[i].getCount();
            }
        }
        //then
        assertEquals(expCount, resCount);
    }
    /**
     *
     * @author xmeliaki
     * @version etapa 2
     */
    @Test
    void isLetterInHandTest() {
        //setup
        char[] handPlayer = {'A','B','C','E','*','F','F'};
        Player player1 = new Player("Georgii", handPlayer);
        char letter = 'A';
        //when
        boolean res = false;
        for (int i=0; i<7; i++){
           if(letter == handPlayer[i]){
            res=true;
            break;
           }else{
               res=false;
           }
        }
        //then
        assertTrue(res);
    }
    /**
     *
     * @author xmeliaki
     * @version etapa 2
     */
    @Test
    void isLetterInHandV2() {
        //char[] handPlayer = {'A','B','C','E','*','F','F'};
        char[] handPlayer = get7tiles();
        char letter = 'Z';
        boolean res = false;

        boolean letterEx = false;
        assertEquals(res, letterEx);
    }
}