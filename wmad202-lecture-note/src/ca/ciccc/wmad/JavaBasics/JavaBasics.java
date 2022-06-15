
//Ask the user to enter the age. if age is only greater than 19, a user is allowed in the club
//otherwise not allowed

package ca.ciccc.wmad.JavaBasics;
import java.util.Scanner;
public class JavaBasics {
    final static int CLUB_AGE = 19;

    public static void isPersonAllowedToTheClub() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age > CLUB_AGE) {
            System.out.println("you are eligible to enter the club");
        } else {
            System.out.println("You are not allowed to enter the Club.");
        }

    }


    //practice :2 getting input parameter and then evaluating it.
    public static void evaluate(int grade) {
        if (grade >= 80) {
            System.out.printf("You got a great grade %d\n", grade);
        } else if (grade >= 60 && grade < 80) {
            System.out.printf("You got a good grade %d\n", grade);
        } else if (grade >= 50 && grade < 60) {
            System.out.printf("You got a passing grade %d\n", grade);
        } else {
            System.out.printf("You failed");
        }
    }
//practicing while function with average

    public static float calculatingAverage() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number(Enter 0 to terminate the program) : ");

        int counter = 0;
        int total = 0;
        int number = input.nextInt();

        while (number != 0) {
            counter = counter + 1;
            total = total + number;
            System.out.println("Please enter a number(Enter 0 to terminate the program) : ");
            number = input.nextInt();
        }
        if (counter > 0) {
            float average = (float) total / counter;
            System.out.printf("The average is %f\n", average);
            return average;
        } else {
            System.out.println("The Number is invalid!!");
            return -1;
        }
    }

    // practicing division
    public static void dividingTwoNumbers() {
        int numb1 = 13;
        int numb2 = 12;
        double numb3 = 19.456;
        float numb4 = 6.8f;

        System.out.println(numb1 / numb2);
        System.out.println(numb2 / numb4);
        System.out.println((float) numb1 / numb4);
    }
// practice minimum character

    //public static char findMinimumCharacter(String word) {
    public static char findMinimumCharacterInString(String word) {
        char minimum = word.charAt(0);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= minimum) {
                minimum = word.charAt(i);
            }
        }


        return minimum;
    }

//practice is prime

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("The number is not prime.");
                return false;
            }
        }
        System.out.println("The number is prime.");
        return true;
    }

    //practicing different ways of input
    public static int add1() {
        int numb1 = 64;
        int numb2 = 65;
        int sum = numb1 + numb2;
        System.out.printf("The sum is %d",sum);
        return sum;
    }

public static int add2(){
    Scanner in =new Scanner(System.in);
    System.out.println("Please enter number 1: ");
    int number1= in.nextInt();

    System.out.println("Please enter number 2: ");
    int number2=in.nextInt();

    int sum= number1+ number2;
    System.out.printf("The sum is %d",sum);
    return sum;
    }

public static int add3(int numb1,int numb2){
        int sum = numb1+numb2;
        System.out.printf("sum: %d",sum);
        return sum;
    }
public static void firstAndLastName(){
    Scanner in= new Scanner(System.in);
    System.out.println("Please enter your First name:");
    char FirstName= (char) in.nextInt();

    System.out.println("Please enter your last name:");
    char LastName= (char) in.nextInt();




    }
}



