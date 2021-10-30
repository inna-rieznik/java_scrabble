package cz.mendelu.pjj.scrabble;

// сделал клас для ячеек. чтоб матрицу заполнить
public class Cell {
    private char letter;
    private String bonus; // типы бонуса за ячейку

    public Cell(){
        letter = ' ';
        bonus = null;
    }

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
