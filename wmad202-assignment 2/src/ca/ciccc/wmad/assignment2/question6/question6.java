/*The Java program receives a statement which contains only alphabet variables and binary
 operations including +, -, *, / and % and check whether the statement is a valid arithmetic
 statement or not.
 • The statement might contain parenthesis as well. For instance:
 • a+b*a+c/c%y
 • (a+b)*(a/d-(a/b))

  • You can make this assumption that the variable names contain only one alphabet
   (like a, b, c) and cannot have more than one alphabets (like ab, temp, sum, ...)
    • Note: Such an statement is valid if two conditions are met at the same time:
  o 1- Number of open and close parenthesises in the statement is the same.
  o 2- At any point (character or index) of the statement, number of the open
        parenthesises is bigger than or equal the number of close parenthesises.*/


package ca.ciccc.wmad.assignment2.question6;

import java.util.Scanner;

public class question6 {
    public static void test(){
        int numberOfOpenParentheses=0;
        int numberOfClosedParentheses=0;

        boolean isValidStatement=true;
        Scanner in = new Scanner(System.in);
        String Statement=in.next();

        for(int i=0;i<Statement.length();i++) {
            if (Statement.charAt(i) == '(') {
                numberOfOpenParentheses++;
            } else if (Statement.charAt(i) == ')') {
                numberOfClosedParentheses++;
            }
            if (numberOfClosedParentheses > numberOfOpenParentheses) {
                isValidStatement = false;
                break;
            }
        }
        if(numberOfClosedParentheses!=numberOfOpenParentheses){
            isValidStatement=false;
        }
        if(isValidStatement){
            System.out.println("The statement is valid");
        }else {
            System.out.println("The statement is not valid");
        }
    }
}
