package ca.ciccc.wmad.assignment5.question1;

import java.util.ArrayList;

public class Students {
    private int studentId;
    private ArrayList<Integer>grades;
    private String Name;

    public Students(int studentId,ArrayList<Integer>grades,String Name){
        this.studentId=studentId;
        this.grades=grades;
        this.Name=Name;
    }
    public void studentNameAndId(int studentId,String Name) {
        this.studentId = studentId;
        this.Name = Name;
        this.grades = new ArrayList<>();
    }
    public void addGrade(int grades){
        this.grades.add(grades);
    }
    public  double calculateGpa(){
        int sum=0;
        for(Integer grade: grades){
            sum=sum+grade;
        }
         double result =sum/grades.size();
        return result;
    }
    public void printingInformation() {
        System.out.printf("The ID of the student: %d\n", this.studentId);
        System.out.printf("The List of grades: %s\n", this.grades);
        System.out.printf("Student Name: %s\n", this.Name);
        System.out.printf("The GPA of the student: %f\n", calculateGpa());
    }
    public int compareGpa(Students student1){
        if(this.calculateGpa()>student1.calculateGpa()) {
            return 1;
            //System.out.printf("1");
        }
        else{
            if (this.calculateGpa()<student1.calculateGpa()){
                return -1;
                //System.out.printf("-1");
            }
        }
        System.out.printf("0");
        return 0;
    }


    }



