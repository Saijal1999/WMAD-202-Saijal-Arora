//Design and implement a method which has one input parameter, called topLimit, which is
//a number between 40 and 100. Also, the method has a second input parameter which is
//also a positive integer, called number.
//-The method should create and returns list which contains all numbers in range 2 (two) to
//topLimit that are divisible to number.

package ca.ciccc.wmad.assignment.ca.question8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class question8 {

    public static void divisibleByNumber(){
             Scanner in = new Scanner(System.in);
             System.out.println("Enter a number between 40 to 100: ");
             int topLimit = in.nextInt();


             Scanner input = new Scanner(System.in);
             System.out.println("Enter a positive number: ");
             int number = input.nextInt();
             System.out.println("Divisible numbers are : ");
             System.out.format(creatingRange(topLimit,number));
    }
    private static String creatingRange(int topLimit, int number){
        int i;
        ArrayList<Integer>List=new ArrayList<>();
        for(i=2;i<=topLimit;i++) {
            if (i % number == 0) {
                List.add(i);
            }}


        return (Arrays.toString(List.toArray()));
    }}

