package cz.mendelu.pjj.scrabble;


public class Cell {
    private char letter;
    private String bonus;
    private int kodStavu;


    /**
     * Standardní konstruktor.
     *
     */
    public Cell(){
        letter = ' ';
        bonus = null;
        kodStavu = 0; // 0 - prazdna, 1 - ma pismeno ale stara, 2-ma picmeno a nova
    }
    /**
     *
     *
     */
    public Cell(char letter){
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public int getKodStavu() {
        return kodStavu;
    }

    public void setKodStavu(int kodStavu) {
        this.kodStavu = kodStavu;
    }



}
