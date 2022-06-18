//Implement a function which receives a list of positive integers as input parameter. The
       // numbers in the list are only between 1 and 99. The list might have repeated numbers. The
    //    method will return the number that is repeated the most. If there are multiple numbers
     //   that are repeated the most, returns only one of them. -
      //  -Example: for this list [1,4,5,6,1,2,4,5,6,5]
//  the function returns 5 because it is the only numbers repeated 3
       // times (the most)


package ca.ciccc.wmad.assignment.ca.question4;

import java.util.ArrayList;
import java.util.Scanner;

public class question4 {

        public static void repeatedNumbers() {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a number between 1 to 99:  ");
                ArrayList<Integer> list = new ArrayList<Integer>();
                int[] frequencies = new int[100];

                while (input.hasNextInt()) {
                        int number = input.nextInt();
                        list.add(number);
                        System.out.println("Enter a number between 1 to 99 :");
                }

                        for (Integer number : list) {
                                frequencies[number]++;
                        }
                       // System.out.printf(frequencies.toString());

                        int mostRepeatedNumber=0;
                        int mostRepeated=0;

                        for(int i =1;i< frequencies.length;i++) {
                                if (mostRepeated < frequencies[i]) {
                                        mostRepeatedNumber = i;
                                        mostRepeated = frequencies[i];
                                }
                        }
                        System.out.printf("Most Repeated number : %d", mostRepeatedNumber);

                        }


                }


