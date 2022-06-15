/*Create  a  package  called  problem2  and  inside  this  package,
create  a  Java  class  called  Problem2.
  Write a Java program which receives a string from input and does the following:
     • Reverse the string and print it
        • Check whether the input string and its reverse is the same (like BaBa). It considers
        case-sensitivity which means (Baba and BaBa are not the same)*/


package ca.ciccc.wmad.assignment2.question5;

import java.util.Scanner;

public class question5 {
    public static void reversingString(){
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word= input.next();

        if (word.matches("[a-zA-Z]+")) {
            int i;
            String result = " ";
            for (i = word.length() - 1; i >= 0; i--) {
                result = result.concat(String.valueOf(word.charAt(i)));
            }
            System.out.printf("Reverse :%s", result);
        }else{
            System.out.println("Invalid input!!");
        }
    }
}
//System.out.println(word.charAt(i));
// result = word.charAt(i)+(result);