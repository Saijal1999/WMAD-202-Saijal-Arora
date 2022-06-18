//Write a method, which receives a list of positive integers between 1 and 99, which may
//or may not contain repeated numbers.
//-The methods should print out how many each item in the list is repeated


package ca.ciccc.wmad.assignment.ca.question5;

import java.util.ArrayList;
import java.util.Scanner;

public class question5 {

    public static void repeatedNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 99: ");
        ArrayList<Integer> List = new ArrayList<>();
        int[] frequencies = new int[100];

        while (input.hasNextInt()) {
            int numbers = input.nextInt();
            List.add(numbers);
            System.out.println("Enter a number between 1 to 99: ");
        }

        for (Integer number : List) {
            frequencies[number]++;
        }

        for (int i = 1; i < frequencies.length; i++) {
            System.out.printf("%d has been repeated %d times\n", i, frequencies[i]);


        }
    }
}
