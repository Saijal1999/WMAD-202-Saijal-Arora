//Define and implement a function which does Linear Search. This function receives two
//input parameters, one is a list of integers and the other one is a number to search for. The
//method returns -1 (negative one) if the number (the second parameter of the function)
//does not exist in the list or returns the index of the number if the number exists in the list.
//-If there are more than one occurrence of the number, the function will return the index of
//the first occurrence




package ca.ciccc.wmad.assignment.ca.question7;

import java.util.ArrayList;
import java.util.Scanner;

public class question7 {
    public static int linearSearch() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for list[ Enter quit to complete the list]: ");
        ArrayList<Integer> List = new ArrayList<>();

        while (input.hasNextInt()) {
            int number = input.nextInt();
            List.add(number);
            System.out.println("Enter a number for list[ Enter quit to complete the list]: ");
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for linear search: ");
        int linearSearchNumb = s.nextInt();

        int i;
        for (i = 0; i < List.size(); i++) {
            if (linearSearchNumb == List.get(i)) {
                System.out.printf("The index of linear search number is %d", i);
                return i;
            }
        }
        //return -1;
        System.out.print("-1");
        return -1;
}}
