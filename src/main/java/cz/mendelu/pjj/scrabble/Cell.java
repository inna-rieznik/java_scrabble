package cz.mendelu.pjj.scrabble;


public class Cell {
    private char letter;
    private String bonus;
    /**
     * Standardní konstruktor.
     *
     */
    public Cell(){
        letter = ' ';
        bonus = null;
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




}
