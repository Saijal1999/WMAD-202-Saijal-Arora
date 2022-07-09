/*Write a method which has no input parameter. The method asks the user to enter
        numbers. The user can enter repeated numbers but if the user entered a number which
        was already entered, the method will provide an error message to the user and ask the
        user to enter another one. The user can enter numbers as long as s/he has not entered 0.
        Once a 0 is entered, the method returns the sum of all distinct numbers the user had
        entered*/


package ca.ciccc.wmad.assignment4.question1;

import java.util.HashSet;
import java.util.Scanner;

public class question1 {

    public static void repeatedNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number [Enter 0 to exit]: ");
        int numb = in.nextInt();

        HashSet<Integer> set = new HashSet<>();
       // while (in.hasNextInt())
            while (numb!=0){
                if (set.contains(numb)) {
                    System.out.println("Please enter another distinct number:");
                    numb = in.nextInt();

            } else if(!set.contains(numb)){
                set.add(numb);
                System.out.println("Enter a number [Enter 0 to exit]:");
                numb = in.nextInt();

            }
            //System.out.printf("The sum of all numbers is : %d", sumOfSet);
        }
        int sum = 0;
        for (Integer i : set) {
            sum += i;

           //System.out.printf("The sum of all numbers is : %d\n", sum);
        }
        System.out.printf("The sum of all numbers is : %d\n", sum);
    }


}



    //private  static int sumOfSet(){
           // int sum =0;
            //for(Integer i:set){
              //  sum += i;
