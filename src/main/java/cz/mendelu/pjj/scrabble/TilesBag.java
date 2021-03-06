package cz.mendelu.pjj.scrabble;

import java.util.Objects;

public class TilesBag {
    public static Tile[] TheTilesBag = new Tile[27];
    static public int allCount = 110;

    /**
     *
     */
    public TilesBag() {
    }



    /**
     * @autor xmeliaki
     * @version etapa 3
     */
    public static void createTilesBag() {
        TheTilesBag[0] = new Tile('*', 0, 2);
        TheTilesBag[1] = new Tile('A', 1, 9);
        TheTilesBag[2] = new Tile('E', 1, 12);
        TheTilesBag[3] = new Tile('I', 1, 9);
        TheTilesBag[4] = new Tile('L', 1, 4);
        TheTilesBag[5] = new Tile('N', 1, 6);
        TheTilesBag[6] = new Tile('O', 1, 8);
        TheTilesBag[7] = new Tile('R', 1, 6);
        TheTilesBag[8] = new Tile('S', 1, 4);
        TheTilesBag[9] = new Tile('T', 1, 6);
        TheTilesBag[10] = new Tile('U', 1, 4);
        TheTilesBag[11] = new Tile('D', 2, 4);
        TheTilesBag[12] = new Tile('G', 2, 3);
        TheTilesBag[13] = new Tile('B', 3, 2);
        TheTilesBag[14] = new Tile('C', 3, 2);
        TheTilesBag[15] = new Tile('M', 3, 2);
        TheTilesBag[16] = new Tile('P', 3, 2);
        TheTilesBag[17] = new Tile('F', 4, 2);
        TheTilesBag[18] = new Tile('H', 4, 2);
        TheTilesBag[19] = new Tile('V', 4, 2);
        TheTilesBag[20] = new Tile('W', 4, 2);
        TheTilesBag[21] = new Tile('Y', 4, 2);
        TheTilesBag[22] = new Tile('K', 5, 1);
        TheTilesBag[23] = new Tile('J', 8, 1);
        TheTilesBag[24] = new Tile('X', 8, 1);
        TheTilesBag[25] = new Tile('Q', 10, 1);
        TheTilesBag[26] = new Tile('Z', 10, 1); //110
    }

    /**
     * @autor xmeliaki
     * @version etapa 3
     */
    private static boolean checkCountOfSameTails(int i) {
        if (TheTilesBag[i].getCount() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metoda ktera vyda 1 kamen
     *
     * @autor xmeliaki
     * @version etapa 3
     */
    public static char getOneTile() {
        int tileNumber = (int) (Math.random() * 27);
        if (checkCountOfSameTails(tileNumber) == true) {
            TheTilesBag[tileNumber].setCount(TheTilesBag[tileNumber].getCount() - 1);
            return TheTilesBag[tileNumber].getLetter();
        } else return getOneTile();
    }

    /**
     * Metoda vyda 7 kamenu(tiles) playeru
     *
     * @autor xrieznik
     * @version etapa 3
     */
    public static char[] get7tiles() {
        char[] handBuffer = new char[7];
        for (int i = 0; i < 7; i++) {
            handBuffer[i] = getOneTile();
        }
        return handBuffer;
    }

    /**
     * @autor xmeliaki
     * @version etapa 3
     *
     */
    public static int getBonusLetter(char letter) {
        int pointsletter = 0;
        for (int i = 0; i < TheTilesBag.length; i++) {
            if (TheTilesBag[i].getLetter() == letter) {
                pointsletter = TheTilesBag[i].getPoints();
            }
        }

        return pointsletter;
    }

}


