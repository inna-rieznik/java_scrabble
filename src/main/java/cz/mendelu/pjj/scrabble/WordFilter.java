package cz.mendelu.pjj.scrabble;

public interface WordFilter {

    boolean acceptWord(String word);

    String transformWord(String word);
}
