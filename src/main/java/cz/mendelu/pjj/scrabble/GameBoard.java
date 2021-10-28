package cz.mendelu.pjj.scrabble;

public class GameBoard {
    public static Cell[][] Board = new Cell[15][15];

    public GameBoard() {

    }

    public static void createGameBoard(){
       for (int i =0; i < 15; i++){
            for (int j=0; j < 15; j++ ){
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

    public static void showGameBoard(){
     for (int i =0; i < 15; i++){
      for (int j=0; j < 15; j++ ){
       System.out.print("["+Board[i][j].getLetter() + "] ");
      }
      System.out.println();
     }
    }

}
