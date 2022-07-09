package ca.ciccc.wmad.assignment5.question5;

import java.util.Arrays;

public class TestPolynomialEquation {

    public void test() {
        int[] s1 = {0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] s2 = {0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0}; // -3*x^2
        int[] p1 = {6, 0, 1, 0, 8, 10, 0, 0, 0, 0, 0}; // 10*x^5 + 8*x^4 + x^2 + 6
        int[] p2 = {6, 0, -3, 0, 5, 0, 0, 0, 0, 0, 0}; // 5*x^4 – 3*x^2 + 6


        System.out.println(PolynomialEquationCalculator.checkSingleFactorPolynomials(s1, s2));

        PolynomialEquationCalculator polynomialEquationCalculator = new PolynomialEquationCalculator(p1, p2);

        System.out.println(polynomialEquationCalculator.checkEquationsEquality());
        System.out.println(Arrays.toString(polynomialEquationCalculator.biggestExponentValue()));
        polynomialEquationCalculator.printingThePolynomialEquation(polynomialEquationCalculator.combineTwoPolynomials());

    }
}

