package ca.ciccc.wmad.assignment5.question3;

import java.util.HashMap;
import java.util.HashSet;


public class Book {
    private final String title;
    private final String author;
    private final HashSet<Page> pages;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = new HashSet<>();
    }


    public Book(String title, String author, HashSet<Page> pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }


    public void addPage(Page page) {
        this.pages.add(page);
    }


    public void printAllWordOccurrences() {
        HashMap<String, Integer> allWordOccurrences = this.getAllWordOccurrences();
        for (String key: allWordOccurrences.keySet()) {
            System.out.printf("%s: %d\n", key, allWordOccurrences.get(key));
        }
    }


    public void printParticularWordOccurrences(String word) {
        System.out.printf("%s: %d\n", word, this.getParticularWordOccurrences(word));
    }


    private HashMap<String, Integer> getAllWordOccurrences() {
        HashMap<String, Integer> occurrences = new HashMap<>();


        for (Page page : this.pages) {
            HashMap<String, Integer> occurrencesPerPage = page.getAllWordOccurrences();
            for (String key: occurrencesPerPage.keySet()) {
                if (occurrences.containsKey(key)) {
                    occurrences.put(key, occurrences.get(key) + occurrencesPerPage.get(key));
                } else {
                    occurrences.put(key, occurrencesPerPage.get(key));
                }
            }
        }


        return occurrences;
    }


    private int getParticularWordOccurrences(String word) {
        HashMap<String, Integer> allWordOccurrences = this.getAllWordOccurrences();
        return allWordOccurrences.getOrDefault(word, 0);
    }
}












