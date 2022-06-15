//Read two numbers from input (like A and B) and
   //     • First prints all numbers between A and B (A and B not included), which are divisible to
     //   both 3 and 5.
       // • Then prints all numbers between A and B (A included by B not included), which are
        //divisible by either 6 or 7. • Finally prints all numbers between A and B (A and B both included), which are not
        //divisible by 3


package ca.ciccc.wmad.assignment2.question1;
public class question1 {
    public static void divisibleByThreeAndFive(int numb1, int numb2) {
        for (int i = numb1 + 1; i < numb2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("The numbers divisible by 3 and 5 are : %d\n", i);
            }
        }
    }
    public static void divisibleBy6OR7(int numb1, int numb2) {
        for (int i = numb1; i < numb2; i++) {
            if (i % 6 == 0 || i % 7 == 0) {
                System.out.printf("This number is divisible by 6 or 7: %d\n", i);
            }
        }
    }

    public static void notDivisibleByThree(int numb1,int numb2){
        for(int i=numb1;i<=numb2;i++){
            if(i%3!=0){
                System.out.printf("This number is not divisible by 3 : %d\n",i);
            }
        }
    }
}






