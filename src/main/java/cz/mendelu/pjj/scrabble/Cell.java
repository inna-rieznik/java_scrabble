package cz.mendelu.pjj.scrabble;


public class Cell {
    private char letter;
    private String bonus;
    private int kodStavu;


    /**
     * Standardní konstruktor.
     */
    public Cell() {
        letter = ' ';
        bonus = null;
        kodStavu = 0; // 0 - prazdna, 1 - ma pismeno ale stara, 2-ma picmeno a nova
    }

    /**
     *
     */
    public Cell(char letter) {
        this.letter = letter;
    }
    /**
     *@autor xrieznik
     * @version etapa 3
     */
    public char getLetter() {
        return letter;
    }
    /**
     *@autor xrieznik
     * @version etapa 3
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }
    /**
     *@autor xrieznik
     * @version etapa 3
     */
    public String getBonus() {
        return bonus;
    }
    /**
     *@autor xrieznik
     * @version etapa 3
     */
    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    public int getKodStavu() {
        return kodStavu;
    }
    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    public void setKodStavu(int kodStavu) {
        this.kodStavu = kodStavu;
    }


}
