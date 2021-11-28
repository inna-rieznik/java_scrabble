package cz.mendelu.pjj.scrabble;

public class GameBoard {
    public static Cell[][] Board = new Cell[15][15];

    public GameBoard() {
    }

    /**
     * Metoda pridava pismeno do bunky
     *
     * @autor xrieznik
     * @version etapa 3
     */
    public void addLetterToXY(int x, int y, char letter) {
        //if ( (x>0 && x<16) && (y>0 && y<16) ){ //if (Board[x-1][y-1].getLetter() == ' '){
        Board[x - 1][y - 1].setLetter(letter);
        // } else { // System.out.println("There is a letter in the cell: " + x + " " + y); //} // }else { //  System.out.println("x or y is out of range"); // }
    }

 /*public StringBuffer createWordFromLettersInBoard(){
  char letter = board.getLetter();
  StringBuffer word = new StringBuffer();
  word = word.append(letter);
  return word;
 }*/

    /**
     * @autor xmeliaki
     * @version etapa 3
     */
    public static void createGameBoard() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                Board[i][j] = new Cell();
            }
        }
        //TRIPLE WORD
        Board[0][0].setBonus("3W");
        Board[0][7].setBonus("3W");
        Board[0][14].setBonus("3W");
        Board[7][0].setBonus("3W");
        Board[7][14].setBonus("3W");
        Board[14][0].setBonus("3W");
        Board[14][7].setBonus("3W");
        Board[14][14].setBonus("3W");

        //DOUBLE WORD
        Board[1][1].setBonus("2W");
        Board[2][2].setBonus("2W");
        Board[3][3].setBonus("2W");
        Board[4][4].setBonus("2W");

        Board[4][10].setBonus("2W");
        Board[3][11].setBonus("2W");
        Board[2][12].setBonus("2W");
        Board[1][13].setBonus("2W");

        Board[13][1].setBonus("2W");
        Board[12][2].setBonus("2W");
        Board[11][3].setBonus("2W");
        Board[10][4].setBonus("2W");

        Board[10][10].setBonus("2W");
        Board[11][11].setBonus("2W");
        Board[12][12].setBonus("2W");
        Board[13][13].setBonus("2W");

        //TRIPLE LETTER
        Board[1][5].setBonus("3L");
        Board[1][9].setBonus("3L");
        Board[5][1].setBonus("3L");
        Board[5][5].setBonus("3L");
        Board[5][9].setBonus("3L");
        Board[5][13].setBonus("3L");
        Board[9][1].setBonus("3L");
        Board[9][5].setBonus("3L");
        Board[9][9].setBonus("3L");
        Board[9][13].setBonus("3L");
        Board[13][5].setBonus("3L");
        Board[13][9].setBonus("3L");

        //DOUBLE LETTER 24
        Board[0][3].setBonus("2L");
        Board[0][11].setBonus("2L");
        Board[2][6].setBonus("2L");
        Board[2][8].setBonus("2L");
        Board[3][0].setBonus("2L");

        Board[3][7].setBonus("2L");
        Board[3][14].setBonus("2L");
        Board[6][2].setBonus("2L");
        Board[6][6].setBonus("2L");
        Board[6][8].setBonus("2L");

        Board[6][12].setBonus("2L");
        Board[7][3].setBonus("2L");
        Board[7][11].setBonus("2L");
        Board[8][2].setBonus("2L");
        Board[8][6].setBonus("2L");

        Board[8][8].setBonus("2L");
        Board[8][12].setBonus("2L");
        Board[11][0].setBonus("2L");
        Board[11][7].setBonus("2L");
        Board[11][14].setBonus("2L");

        Board[12][6].setBonus("2L");
        Board[12][8].setBonus("2L");
        Board[14][3].setBonus("2L");
        Board[14][11].setBonus("2L");

    }

    /**
     * @autor xmeliaki
     * @version etapa 3
     */
    public static void showGameBoard() {
        System.out.print("   ");
        for (int k = 0; k < 15; k++) {
            System.out.print((k + 1) + "  ");
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            if (i < 9) {
                System.out.print((i + 1) + " ");
            } else {
                System.out.print((i + 1));
            }

            for (int j = 0; j < 15; j++) {
                if (j < 10) {
                    System.out.print("[" + Board[i][j].getLetter() + "]");
                } else {
                    System.out.print(" [" + Board[i][j].getLetter() + "]");
                }
            }
            System.out.println();
        }
    }
    /**
     * @autor xmeliaki
     * @version etapa 3
     * */
    public boolean chekFirstMoveRequipments() {
        if (Board[7][7].getLetter() != ' ') {
            return true;
        } else {
            return false;
        }
    }
    /**
     * @autor xmeliaki
     * @version etapa 3*/
    public void nullBoard() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                Board[i][j].setLetter(' ');
            }
        }
    }
    /**
     * @autor xmeliaki
     * @version etapa 3
     * */
    public boolean cellIsNull(int x, int y) {
        if (Board[x][y].getLetter() != ' ') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @autor xmeliaki
     * @version etapa 3
     * toString()
     */
    public String readWordByX(int firstX, int firstY, GameBoard board) {
        int i = 0;
        String word = null;
        String error = " ";
        int realFirstX = 0;

        while (Board[firstX - i][firstY].getKodStavu() != 0) {
            realFirstX = firstX - i;
            i++;
        }

        i = 0;
        while (Board[realFirstX + i][firstY].getKodStavu() != 0) {
            i = realFirstX;
            word = new StringBuilder().append(Board[i][firstY].getLetter()).toString();
            i++;
        }
        if (true) { //todo controla slova
            Player.setScore(pointsСounting(realFirstX, firstY, i, 0, board));
            return word;
        } else {
            return error;
        }
        //todo dobavit body
    }

    /**
     * @autor xmeliaki
     * @version etapa 3
     * toString()
     */
    public String readWordByY(int firstX, int firstY, GameBoard board) {
        int j = 0;
        String word = null;
        String error = " ";
        int realFirstY = 0;

        while (Board[firstX][firstY - j].getKodStavu() != 0) {
            realFirstY = firstY - j;
            j++;
        }
        j = 0;
        while (Board[firstX][firstY + j].getKodStavu() != 0) {
            j = firstY;
            word = new StringBuilder().append(Board[firstX][j].getLetter()).toString();
            j++;
        }
        if (true) { //todo controla slova
            Player.setScore(pointsСounting(firstX, realFirstY, 0, j, board));
            return word;
        } else {
            return error;
        }
    }
    /**
     * @autor xmeliaki
     * @version etapa 3
     * toString()
     */
    public void createWord(int firstX, int firstY, GameBoard board, int countLetters) {
        readWordByX(firstX, firstY, board);
        readWordByY(firstX, firstY, board);
    }
    /**
     * @autor xmeliaki
     * @version etapa 3
     * toString()
     */
    public char getLetter(int x, int y) {
        return Board[x][y].getLetter();
    }
    /**
     * @autor xmeliaki
     * @version etapa 3
     * toString()
     */
    public int pointsСounting(int firstX, int firstY, int i, int j, GameBoard board) {
        int ponts = 0;
        int bonusCoefficient = 1;
        while (i > 0 || j > 0) {
            if (Board[firstX + i][firstY + j].getBonus() == null) {
                ponts = ponts + TilesBag.getBonusLetter(Board[firstX + i][firstY + j].getLetter());
            } else if (Board[firstX + i][firstY + j].getBonus() == "2L") {
                ponts = ponts + TilesBag.getBonusLetter(Board[firstX + i][firstY + j].getLetter()) * 2;
            } else if (Board[firstX + i][firstY + j].getBonus() == "3L") {
                ponts = ponts + TilesBag.getBonusLetter(Board[firstX + i][firstY + j].getLetter()) * 3;
            } else if (Board[firstX + i][firstY + j].getBonus() == "2W") {
                bonusCoefficient = 2;
            } else if (Board[firstX + i][firstY + j].getBonus() == "2W") {
                bonusCoefficient = 3;
            }
        }
        return bonusCoefficient * ponts;
    }


}
