//Read a number in base 10 (any positive, non-decimal number, like 452),
// and convert it to binary and prints the results.
// (Please research yourself on how to convert a number in base 10 to a binary number)
package ca.ciccc.wmad.assignment2.question3;
public class question3 {

    public static void toBinary(int number) {

        String result = " ";
        int div = number / 2;
        int rem = number % 2;
        result = String.valueOf(rem).concat(result);

        while (div != 0) {
            rem = div % 2;
            div = div / 2;
            result = String.valueOf(rem).concat(result);
        }

        System.out.printf("Binary Format: %S",result);

    }




















        //String result = " ";
        //int div =  number/2;
        //int remainder = number % 2;

        //while (div != 0) {
            //div = div / 2;
           // remainder = div% 2;
            //String digit = String.valueOf(remainder);
            //result = String.valueOf(remainder).concat(result);
        }
       // System.out.printf("The binary format is : %s", result);



        //int remainder = 0;
        //while (number != 0) {
        //  number = number / 2;
        //int remainder = number % 2;
        //String Binary = Integer.toBinaryString(number);
        //int final result= Integer(String(Binary));

        //Integer.toBinaryString(number);



