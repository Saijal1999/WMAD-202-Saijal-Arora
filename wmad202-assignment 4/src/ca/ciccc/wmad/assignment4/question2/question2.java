/*Write a method which lets the user enter English words. The user can keep entering
English words as long as the user has not entered the word “exit”. Once the user enters
“exit” the method will return and print the list of all distinct words starts with English
alphabets. Like:
A: Ali, apple, ...
B: Bob, book
... until Z*/

package ca.ciccc.wmad.assignment4.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class question2 {
    public static void englishWords() {

        Scanner in = new Scanner(System.in);
        HashMap<Character, ArrayList<String>> englishWords = new HashMap<>();


        for (char i = 'A'; i<='Z'; i++) {
            englishWords.put(i, new ArrayList<>());
        }

        System.out.format("Enter a word: ");

        String word = in.nextLine();

        while (!word.equals("exit")) {
            char firstLetter = word.toUpperCase().charAt(0);
            if (!englishWords.get(firstLetter).contains(word)) {
                englishWords.get(firstLetter).add(word);
                Collections.sort(englishWords.get(firstLetter));
            }
            System.out.format("Enter a word: ");
            word = in.nextLine();
        }
        System.out.println(englishWords);
    }}