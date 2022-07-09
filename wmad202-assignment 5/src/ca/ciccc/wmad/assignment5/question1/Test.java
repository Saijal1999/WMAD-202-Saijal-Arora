package ca.ciccc.wmad.assignment5.question1;

import java.util.ArrayList;

public class Test {

    public void Test() {

        ArrayList<Integer> GradeOfStudent1 = new ArrayList<Integer>();
        GradeOfStudent1.add(80);
        GradeOfStudent1.add(78);
        GradeOfStudent1.add(65);
        GradeOfStudent1.add(34);

        ArrayList<Integer> GradeOfStudent2 = new ArrayList<Integer>();
        Students student1 = new Students( 77889911,GradeOfStudent1,"Dave" );
        Students student2 = new Students(66553322,GradeOfStudent2,"James ");

        GradeOfStudent2.add(87);
        GradeOfStudent2.add(63);
        GradeOfStudent2.add(45);
        GradeOfStudent2.add(91);

        //double result1= student1.calculateGpa();
        //double result2=student2.calculateGpa();
        //System.out.printf("GPA of Student1 and Student2 are %s , %s",result1,result2);

        student1.printingInformation();


        student2.printingInformation();


       int  result= student1.compareGpa(student2);
        if(result==1){
            System.out.println("Student1 GPA is higher.");
        } else if (result==-1) {
            System.out.println("Student2 GPA is higher.");
        }
        else {
            System.out.println("GPA of both the students is equal.");
        }


        }
    }

