/*Design and implement a method which has one input parameter which is a number which
is greater than 50, called num. Then the method will create a dictionary whose keys are 2
and 3 and 4 and 5 and 6 and 7 and 8 and 9. Then the method calculates the values for
each of the above keys. The value for a key is all the numbers between 2 and input “num”
that are divisible by the key. The method eventually will print the result.
 - Hint: Use a dictionary whose values are lists.
- Example:
num = 20
2: [2,4,6,8,10,12,14,16,18,20]
3: [3,6,9,12,15,18]
4: [4,8,12,16,20]
5: [5,10,15,20]
6: [6,12,18]
7: [7, 14]
8: [8, 16]
9: [9, 18]*/

package ca.ciccc.wmad.assignment4.question3;

import java.util.*;

public class question3 {

    public static void divisibleNumber() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number greater than 50: ");
        int numb = in.nextInt();


        HashMap<Integer, ArrayList<Integer>> Dictionary = new HashMap<>();

        for(int i=2;i<=9;i++) {
            Dictionary.put(i, new ArrayList<>());
        }
        if (numb>50){
            for(int i=2;i<=9;i++){
                for(int j=2;j<=numb;j++) {
                    if(j%i==0){
                        Dictionary.get(i).add(j);
                        Collections.sort(Dictionary.get(i));

                    }
                }

            }


        }
        System.out.println(Dictionary);
    }
}
