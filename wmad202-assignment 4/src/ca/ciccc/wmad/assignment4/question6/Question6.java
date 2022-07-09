/*Write a Java method which receives 3 lists as its input parameters and combines the lists
and remove repeated numbers from the combined list and return the combined list. For
instance, if the input is [1,2,3,4,2,3] and [3,4,6,7] and [-1,0,23,4] the result is
[1,2,3,4,6,7,-1,0,23]
- Note, the order the lists are combinedtogether does not matter.   */


package ca.ciccc.wmad.assignment4.question6;

import java.util.HashSet;

public class Question6 {

    public static void combiningLists() {
        int[] List1 = {1, 2, 3, 2, 7, 9, 10,};
        int[] List2 = {4, 6, 1, 7, 9, 10, 11, 12, 4, 3,};
        int[] List3 = {1, 6, 8, 4};

        HashSet<Integer> combinedSet = new HashSet<>();
        int i;
        for (i = 0; i <= List1.length - 1; i++) {
            combinedSet.add(List1[i]);
        }
        for (i = 0; i <= List2.length - 1; i++) {
            combinedSet.add(List2[i]);
        }
        for (i = 0; i <= List3.length - 1; i++) {
            combinedSet.add(List3[i]);
        }
        System.out.println(combinedSet);
    }
}
