package cz.mendelu.pjj.scrabble;

public class Tile {
    private  char letter;
    private  int points;
    private  int count;

    public Tile(char letter, int points, int count) {
    this.letter = letter;
    this.points = points;
    this.count = count;

    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int number) {
        this.count = number;
    }
}
