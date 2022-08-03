package ca.ciccc.wmad.assignment9.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Assignment9Driver {
    public static void main(String[] args){
        Consumer<Integer>c= (x)-> System.out.printf("Grade : %d\n",x);
        c.accept(23);

        Predicate<Integer> a = (x)->x>7;
        System.out.println("The outcome is : " + a.test(6));
        //System.out.printf("Outcome: ");


    ArrayList<String > names= new ArrayList<>();
        names.add("Saijal");
        names.add("ramneek");
        names.add("Sam");
        names.add("new");
        names.add("Sa");
        names.add("quan");
        names.add("abhytf");

      //  Predicate<String>P=(x)->x.length()>3;

        List<String> FilteredNames = names.stream().filter((x)->x.length()>4).collect(Collectors.toList());
        System.out.println(FilteredNames);

        // Supplier Interface : one abstract method: get function: no input value;
        Supplier<String> i= ()-> "Have a nice day!!";
        System.out.println(i.get());






}}

