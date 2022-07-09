package ca.ciccc.wmad.assignment5.question5;

import java.util.Arrays;

public class PolynomialEquationCalculator {

    private final int[] p1;
    private final int[] p2;

    public PolynomialEquationCalculator(int[] p1, int[] p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean checkEquationsEquality() {
        return Arrays.equals(this.p1, this.p2);
    }


    public int[] biggestExponentValue() {
        int[] biggestExponentValue = new int[2];
        biggestExponentValue[0] = this.findBiggestExponentValue(this.p1);
        biggestExponentValue[1] = this.findBiggestExponentValue(this.p2);
        return biggestExponentValue;
    }


    public void printingThePolynomialEquation(int[] p) {
        int printCount = 0;
        for (int i = p.length - 1; i >= 0; i--) {
            if (i == 0) {
                if ( p[i] != 0) {
                    if (printCount==0||p[i] < 0) {
                        System.out.printf("%d", p[i]);
                    } else {
                        System.out.printf("+%d", p[i]);
                    }
                    printCount++;

                }
            } else if (i == 1) {
                if (p[i] != 0) {
                    if (printCount == 0 || p[i] < 0) {
                        System.out.printf("%d*x", p[i]);
                    } else {
                        System.out.printf("+%d*x", p[i]);
                    }
                    printCount++;
                }

            } else {
                if (p[i] != 0) {
                    if (printCount == 0 || p[i] < 0) {
                        System.out.printf("%d*x^%d", p[i], i);
                    } else {
                        System.out.printf("+%d*x^%d", p[i], i);
                    }
                    printCount++;
                }
            }
        }
        System.out.println();

    }





    public int[] combineTwoPolynomials() {
        int[] result = new int[11];
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p2.length; j++) {
                if (i == j) {
                result[i] = this.p1[i] + this.p2[j];
                }
            }
        }
        return result;
    }

    public static boolean checkSingleFactorPolynomials(int[] s1, int[] s2) {
        return Arrays.equals(s1, s2);
    }


    private int findBiggestExponentValue(int[] p) {
        int BiggestExponentValue = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] != 0) {
                BiggestExponentValue = i;
            }
        }
        return BiggestExponentValue;
    }
}





