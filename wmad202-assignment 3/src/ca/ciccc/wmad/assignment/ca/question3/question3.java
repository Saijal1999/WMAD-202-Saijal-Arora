//Design and implement a method which receives a positive integer as its first input
//parameter and a format (which is either SHAPE1 or SHAPE2 or SHAPE3) as the second
//input parameter and prints the following patterns. See the examples below:
//-Example: number: 5 - format: SHAPE1
//*****
      //  ***
        //*
//-Example: number: 5 - format: SHAPE2
//*****
//****
//***
//**
//*
//-Example: number: 5 - format: SHAPE3
//*
//**
//***
//****
//*****

package ca.ciccc.wmad.assignment.ca.question3;

import java.util.Scanner;

public class question3 {

    public static void formatPrinting() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = s.nextInt();
        System.out.println("Enter a shape from SHAPE1, SHAPE2, SHAPE3");
        String Shape = s.next();


        switch (Shape) {
            case "Shape1"->printShape1Pattern(number);
            case "Shape2"->printShape2Pattern(number);
            case "Shape3"->printShape3Pattern(number);

        }
        }
    private static void printShape1Pattern(int number) {
        int blanks = 0;

        for (int i = number; 0 <= i; i-=2) {
            for (int i1 = 0; i1 < blanks; i1++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
            blanks++;
        }
    }
    private static void printShape2Pattern(int number) {
        for (int i = number; 0 <= i ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void printShape3Pattern(int number) {
        for (int i = 1; i < number + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}