//Design and implement a function which receives a positive integer as its
// input parameter
//and checks whether the number is a prime number or not.
// If it is a prime number, the
//method returns true and if not the method will return false

package ca.ciccc.wmad.assignment.ca.question1;

public class question1 {

    public static boolean checkPrime(int Numb) {
       // System.out.printf("%d\n",Numb);
        int i;
        for (i = 2; i < Numb; i++) {
            if (Numb % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void isPrime (int numb) {
        if(checkPrime(numb)){
            System.out.println("True");

        }else{
            System.out.println("False");
        }
    }
}




