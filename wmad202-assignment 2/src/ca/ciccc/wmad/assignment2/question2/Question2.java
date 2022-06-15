//Using  Java,  write  a  program  which  reads  a  number  from  the  input  (like  123).  You  make  the
//assumption that the user does not enter a decimal number (like 123.4). The number entered by the
//user should not be divisible by 10 and if the user enters a number that is divisible by 10 (like 560),
// it is considered invalid and the application should keep asking until the user enters a valid input.
// Once the user enters a valid input, the program calculates the reverse of the number (for 153, the
//  reverse is 351) and prints the result.


package ca.ciccc.wmad.assignment2.question2;
import java.util.Scanner;
public class Question2 {

        public static void returnReverse() {
                Scanner s = new Scanner(System.in);


                System.out.println("Please enter a number: ");
                int number = s.nextInt();
                while (number%10==0){
                        System.out.println("Invalid number!! Please enter another number: ");
                         number = s.nextInt();
                }
                int reverse = 0;


                while (number != 0 && number % 10 != 0) {
                        int remainder = number % 10;
                        reverse = (reverse * 10) + remainder;
                        number = number / 10;
                        }
                        System.out.printf("The reverse of the given number is : %d", reverse);
                }
        }

