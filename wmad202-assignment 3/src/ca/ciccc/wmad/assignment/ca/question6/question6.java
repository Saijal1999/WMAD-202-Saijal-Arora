//Write a method which receives a list of integers which may contains repeated numbers.
//The method removes the repeated numbers and keeps the distinct numbers. The function
//should return the list of distinct numbers

package ca.ciccc.wmad.assignment.ca.question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class question6 {
    public static void removeRepeatedNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number[ Enter quit to Terminate]: ");
        ArrayList<Integer> List = new ArrayList<>();

        while (input.hasNextInt()) {
            int number = input.nextInt();
            List.add(number);
            System.out.println("Enter a positive number[ Enter quit to Terminate]: ");
        }

        for (int i = 0; i < List.size(); i++) {
            int j;
            for (j = i + 1; j < List.size(); j++) {
                if (List.get(i) == List.get(j)) {
                    List.remove(j);
                }
            }

        }
        System.out.print((Arrays.toString(List.toArray())));
                        //List.get(i).toString());

        }
    }

