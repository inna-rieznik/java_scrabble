package cz.mendelu.pjj.scrabble;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Dictionary {

    /**
     *@autor xrieznik
     * @version etapa 3
     */
    private List<String> words = new ArrayList<>(Arrays.asList("hello"));

    /**
     * metoda spoji textovy dokument obsahujici vsehny existujici slova, ktere budeme potrebovat pro kontrolu slova od playeru
     *@autor xrieznik
     * @version etapa 3
     */
    public Dictionary(String dic, WordFilter wordFilter) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(dic), "UTF-8"))) {
            words = br.lines()
                    .collect(Collectors.toList());
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }
    /**
     * metoda kontroluje jestli slovo vytvorene hracem existuje v slovniku
     *
     *@autor xrieznik
     * @version etapa 3
     */
    public void ifWordIsInList(StringBuilder word) {
        if (words.contains(word)) {
            System.out.println(true);
        }
    }
    /**
     *
     *
     *@autor xrieznik
     * @version etapa 3
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dictionary that = (Dictionary) o;
        return Objects.equals(words, that.words);
    }
    /**
     *@autor xrieznik
     * @version etapa 3
     */
    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
    /**
     *@autor xmeliaki
     * @version etapa 3
     */
    @Override
    public String toString() {
        return "Dictionary{" +
                "words=" + words +
                '}';
    }
}
