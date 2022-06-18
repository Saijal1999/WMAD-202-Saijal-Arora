//Two SinglePolynomialFactor are considered the same, if they have the same
       // coefficient, baseFactor and exponent. Design an implement a function as following:
      //  oThe name of the function: checkSingleFactorEquality

package ca.ciccc.wmad.assignment.ca.question10;

public class question10 {

    public static boolean checkSingleFactorEquality(int statement1, int statement2) {
        if (statement1 == statement2) {
            return true;
        }
        return false;
    }
// Two PolynomialEquations are considered equal if they have exactly same
//SinglePolynomialFactors in the same order. If they have the same SinglePolynomialFactors
//but in a different orders, they are not considered as equal. Now design and implement a
//function as following:
//oThe name of the function: check PolynomialEquationsEquality
//oParameters of the function: Two PolynomialEquations
//oReturn type: The function will return True if the two given PolynomialEquations are
//equal, otherwise it returns False.

    public static boolean PolynomialEquationsEquality(int equation1, int equation2) {
        if (equation1 == equation2) {
            return true;
        }
        return false;
    }

    //Write a method which takes a PolynomialEqua-on and returns the degree of the
    //given polynomial equa-on. The degree of a polynomial equa-on is the biggest exponent value
    //in the equa-on. For instance in 10*x^5 + 8*x^4 + x^2 + 6 the degree is 5. Because 5 is biggest
    //exponents of Xs
    public static int highestDegree(int[] equation) {

        int biggestExponentValue = 0;
        for (int i = 0; i < equation.length; i++) {
            if (equation[i] != 0) biggestExponentValue = i;
        }

        return biggestExponentValue;
    }
    //Write  a  method  which  takes  two PolynomialEqua-ons  and  mathema-cally  add
    //them  together  and  print  the  result  in  PolynomialEqua-ons  format.  You  can  suppose  the
    //maximum degree of the PolynomialEqua-ons is 10.

    public void combineTwoPolynomialEquations(int[] p1, int[] p2) {
        int[] result = new int[11];

        for (int i = 0; i < p1.length; i++) {
            for (int i1 = 0; i1 < p2.length; i1++) {
                if (i == i1) {
                    result[i] = p1[i] + p2[i1];
                }
            }
        }

        int printCount = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            if (i == 0) {
                if (result[i] != 0) {
                    if (printCount == 0 || result[i] < 0) {
                        System.out.printf("%d", result[i]);
                    } else {
                        System.out.printf("+%d", result[i]);
                    }
                    printCount++;
                }
            } else if (i == 1) {
                if (result[i] != 0) {
                    if (printCount == 0 || result[i] < 0) {
                        System.out.printf("%dx", result[i]);
                    } else {
                        System.out.printf("+%dx", result[i]);
                    }
                    printCount++;
                }
            } else {
                if (result[i] != 0) {
                    if (printCount == 0 || result[i] < 0) {
                        System.out.printf("%dx^%d", result[i], i);
                    } else {
                        System.out.printf("+%dx^%d", result[i], i);
                    }
                    printCount++;
                }
            }
        }

        System.out.println();
    }
}
