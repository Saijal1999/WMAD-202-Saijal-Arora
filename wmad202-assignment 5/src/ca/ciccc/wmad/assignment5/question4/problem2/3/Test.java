package ca.ciccc.wmad.assignment5.question4;

public class Test {


    public void test(){

        ca.ciccc.wmad.assignment5.question4.Transaction transaction1 = new ca.ciccc.wmad.assignment5.question4.Transaction(1, ca.ciccc.wmad.assignment5.question4.Transaction.DEPOSIT, 12);
        ca.ciccc.wmad.assignment5.question4.Transaction transaction2 = new ca.ciccc.wmad.assignment5.question4.Transaction(2, ca.ciccc.wmad.assignment5.question4.Transaction.DEPOSIT, 15.03);
        ca.ciccc.wmad.assignment5.question4.Transaction transaction3 = new ca.ciccc.wmad.assignment5.question4.Transaction(3, ca.ciccc.wmad.assignment5.question4.Transaction.WITHDRAW, 20);
        ca.ciccc.wmad.assignment5.question4.Transaction transaction4 = new ca.ciccc.wmad.assignment5.question4.Transaction(4, ca.ciccc.wmad.assignment5.question4.Transaction.DEPOSIT, 300);
        ca.ciccc.wmad.assignment5.question4.Transaction transaction5 = new ca.ciccc.wmad.assignment5.question4.Transaction(5, ca.ciccc.wmad.assignment5.question4.Transaction.DEPOSIT, 45.23);


        ca.ciccc.wmad.assignment5.question4.Bankstatement bankstatement = new ca.ciccc.wmad.assignment5.question4.Bankstatement();
        bankstatement.addTransaction(transaction1);
        bankstatement.addTransaction(transaction2);
        bankstatement.addTransaction(transaction3);
        bankstatement.addTransaction(transaction4);
            bankstatement.addTransaction(transaction5);

        bankstatement.printAllTransactions();
        System.out.println();
    }
}
