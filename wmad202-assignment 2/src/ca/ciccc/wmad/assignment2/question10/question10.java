//Consider two following mathematical functions:
      //  • F1(x) = 2^x
       // • F2(x) = x^5
      //  • ^ means exponent. Example: 2^3 = 2*2*2 = 8

      //  The program should find the positive number (and greater than 3), (let’s call is T) which has
       // the following characteristic:
       // • For all numbers (x) which are less than T we have F1(x)< F2(x)
      //  • For x greater than or equal T (x>=T) we have F1(x)> F2(x)

package ca.ciccc.wmad.assignment2.question10;

public class question10 {

    public static void test(){
        double f1x=0;
        double f2x=0;
        int x=3;
        while(f1x<=f2x){
            f1x=Math.pow(2,x);
            f2x=Math.pow(x,5);
            System.out.println("x="+x+"  f1x="+f1x+"  f2x="+f2x);
            x++;

        }
        System.out.println("x="+x+"  f1x="+f1x+"  f2x="+f2x);
    }
}
