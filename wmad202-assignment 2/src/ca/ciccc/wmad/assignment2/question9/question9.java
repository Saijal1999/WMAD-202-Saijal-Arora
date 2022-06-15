//Write a Java program which keeps asking the user to enter a name. The program checks
//the entered name. If the entered name contains any digit, then the program terminates, if
//the entered name has no digits and only contains alphabets, then converts the name to
//uppercase and prints it and asks for the next name from the user and repeats.


package ca.ciccc.wmad.assignment2.question9;

import java.util.Scanner;

public class question9 {

    public static void upperCaseConversion(){
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word=input.next();

        if(word.matches("[a-zA-Z]+")) {
            while(word.matches("[a-zA-Z]+")) {
                String uppercase = word.toUpperCase();
                System.out.printf("Result: %S\n", uppercase);
                System.out.println("Please enter a word:");
                word = input.next();
            }}

        System.out.println("Invalid Input!!");
                }

            }
