//Suppose a list of posi-ve numbers is given like the following list (remember this is only
//an example and the list could be any list of posi-ve numbers)
//exampleList:
//We would like to know the “prime visibility” of each index of the list. The “prime visibility”
//of a given index shows how many numbers in the list with indexes lower than the given
//index are prime. For instance, in the examplList, the “prime visibility” of the index 4 is 2
//because there are 2 numbers (19 and 11) before index 4 that are prime.
//To solve this problem, design and implement a method called primeVisibility with two input
//parameters:
//.1The list of numbers
//.2The index
//The method finds and returns the “prime visibility” of the given index.
//Note: Reuse the method defined in problem 1.


package ca.ciccc.wmad.assignment.ca.question9;

import java.util.ArrayList;
import java.util.Scanner;

import static ca.ciccc.wmad.assignment.ca.question1.question1.checkPrime;

public class question9 {
    public static void primeVisibility(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter numbers for list [enter Terminate to finish the list]: ");
        ArrayList<Integer>List=new ArrayList<>();
        while (in.hasNextInt()){
            int number = in.nextInt();
            List.add(number);
            System.out.println("Enter numbers for list [enter Terminate to finish the list]: ");
        }

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the index: ");
        int index= s.nextInt();

        int count=0;
        for(int i= index;i>=0;i--){
            if(checkPrime(List.get(i))){
                count++;
            }
        }
        System.out.printf("The prime visibility below given index number: %d",count);
    }
}
