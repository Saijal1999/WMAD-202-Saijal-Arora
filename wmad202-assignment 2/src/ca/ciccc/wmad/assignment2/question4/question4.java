package ca.ciccc.wmad.assignment2.question4;

import java.util.Scanner;

public class question4 {

    public static void maxAndMin(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        int maxNum=number;
        int minNum=number;
        System.out.println("Enter a number: ");
        while(in.hasNextInt()) {
            number = in.nextInt();
            if(maxNum<number){
                maxNum=number;
            }
            if(minNum>number){
                minNum=number;
            }
            System.out.println("Enter a number:");
        }
        int abs=maxNum-minNum;
        System.out.printf("Maximum number : %d\n", maxNum);
        System.out.printf("Minimum number : %d\n", minNum);
        System.out.printf("Absolute distance : %d\n", abs);





    }
}
