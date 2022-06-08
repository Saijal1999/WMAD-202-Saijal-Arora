package ca.assignment1.question5;


import java.util.Scanner;

public class question5 {

    public static final double PI=3.14;

    public void circleArea(){

        System.out.format("Please enter the radius:");
        Scanner scanner = new Scanner(System.in);
        float radius= scanner.nextFloat();

        System.out.format("The radius is %f and the area is %f",radius,radius*radius*PI);
    }
}
