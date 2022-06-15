/*Write a Java program which asks the user for a number which is the length of the side of
        a square. The program should find the area of a circle which is crossing from all corners
        of the square.*/

package ca.ciccc.wmad.assignment2.question7;

import java.util.Scanner;

public class question7 {

    public static float areaOfCircle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        float length = input.nextFloat();

        float Pi = (float) 3.14;
        //since the diagonal of square is the length*underRoot2 and the radius of circle will be
        // equal to half-length of diagonal of square.
        float diagonal = (float) Math.sqrt(2)*length;
        float radius = (float) (diagonal / 2);
        float Area = Pi * radius * radius;
        System.out.printf("Area of circle: %f", Area);
        return Area;


    }
}
