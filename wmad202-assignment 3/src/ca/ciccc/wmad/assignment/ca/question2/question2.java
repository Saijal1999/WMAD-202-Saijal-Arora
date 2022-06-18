//Design and implement a function with one parameter which is a positive
// integer and finds the next prime number which is bigger than the given
// input parameter and returns
//it. Reuse (call) the method you have defined for Problem 1 (above).


package ca.ciccc.wmad.assignment.ca.question2;

import static ca.ciccc.wmad.assignment.ca.question1.question1.checkPrime;

public class question2 {

    public static void findNextPrime(int Number) {
        int newNum= Number+1;
        while(!checkPrime(newNum)){
                newNum++;
        }
        System.out.printf("The next Prime number : %d",newNum);

    }

            }
