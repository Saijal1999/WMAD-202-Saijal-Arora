/*Write a method which receives a list and returns a number. In the list, all numbers have
been repeated twice except one number that is repeated once. The method should return
the number that is repeated once and return it*/


package ca.ciccc.wmad.assignment4.question4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class question4 {

    public static void nonRepeatedNumber() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number for list: ");

        ArrayList<Integer> List = new ArrayList<>();

        int numb = 0;
        while (in.hasNextInt()) {
            numb = in.nextInt();
            List.add(numb);
            System.out.println("Enter number for list: ");
        }

        HashMap<Integer,Integer> hashMap= new HashMap<>();
        //ArrayList<Integer>newList= new ArrayList<>();
        for (Integer i : List) {
            if(hashMap.containsKey(i)){
                hashMap.remove(i);
            }
            else{
                hashMap.put(i,1);
            }
        }

       for(Integer i: hashMap.keySet()){
           System.out.printf("Non Repeated number : %d\n",i);
       }


       // System.out.println("Non Repeated number:");
        //System.out.print(hashMap);


    }
}
   /* HashSet<Integer>SetOfValues=new HashSet<>();
        for(int i=0;i<= List.size()-1;i++) {
        SetOfValues.add(List.get(i));
    }
        System.out.printf(String.valueOf(SetOfValues));*/


    /*int j = 0;
    int i;
        for (i = 0; i < List.size(); i++) {
        for (j = i + 1; j <List.size() ; j++) {
        if (List.get(i) == List.get(j)) {
        List.remove(j);*/