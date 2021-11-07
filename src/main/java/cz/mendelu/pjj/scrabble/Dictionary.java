package cz.mendelu.pjj.scrabble;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Dictionary {

//    public void readFromFile() throws FileNotFoundException {
//        Set<String> words = new HashSet<String>();
//        Scanner s = new Scanner(new File("src/main/resources/words.txt"));
//        while (s.hasNextLine()){
//            words.add(s.nextLine());
//        }
//        System.out.println(words);
//    }

    private List<String> words = new ArrayList<>(Arrays.asList("hello"));

    public Dictionary(String dic, WordFilter wordFilter){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(dic),"UTF-8"))) {
            words = br.lines()
                      .collect(Collectors.toList());
        }catch (IOException | NullPointerException e){
            e.printStackTrace();
        }
    }

    public void ifWordIsInList(StringBuilder word){
        if(words.contains(word)){
            System.out.println(true);
        }
    }

}
