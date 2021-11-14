package cz.mendelu.pjj.scrabble;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Dictionary {


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
