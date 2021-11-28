package cz.mendelu.pjj.scrabble;


import java.util.Objects;

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

    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    @Override
    public String toString() {
        return "Cell{" +
                "letter=" + letter +
                ", bonus='" + bonus + '\'' +
                ", kodStavu=" + kodStavu +
                '}';
    }
    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return letter == cell.letter && kodStavu == cell.kodStavu && Objects.equals(bonus, cell.bonus);
    }
    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    @Override
    public int hashCode() {
        return Objects.hash(letter, bonus, kodStavu);
    }
}
