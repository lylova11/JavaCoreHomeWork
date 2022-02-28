package hw4.task1;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        Set<String> uniqueWords = new HashSet<String>();
        uniqueWords.add("one");
        uniqueWords.add("two");
        uniqueWords.add("three");
        uniqueWords.add("one");
        uniqueWords.add("one");
        uniqueWords.add("seven");
        uniqueWords.add("two");
        uniqueWords.add("one");
        uniqueWords.add("eleven");
        uniqueWords.add("two");
        uniqueWords.add("four");
        uniqueWords.add("five");
        uniqueWords.add("one");
        uniqueWords.add("five");

        for(String k : uniqueWords){
            System.out.println(k);
        }

    }

}