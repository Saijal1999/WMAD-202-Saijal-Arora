package ca.ciccc.wmad.assignment5.question4;

import java.util.ArrayList;

public class Bankstatement {
    private ArrayList<ca.ciccc.wmad.assignment5.question4.Transaction> transaction;
    private double totalbalance;

    public Bankstatement(double totalbalance, ArrayList<ca.ciccc.wmad.assignment5.question4.Transaction> Transaction) {
        this.totalbalance = totalbalance;
        this.transaction = Transaction;
    }

    public Bankstatement() {
        this.totalbalance = 0;
        this.transaction = new ArrayList<>();
    }

    public void addTransaction(ca.ciccc.wmad.assignment5.question4.Transaction transaction) {
        if (transaction.getType().equals(ca.ciccc.wmad.assignment5.question4.Transaction.WITHDRAW) && this.totalbalance < transaction.getAmount()) {
            System.out.println("The Amount withdrawn is too large");
            System.out.printf("Transaction ID = %d, Amount = %F\n", transaction.getTransactionID(), transaction.getAmount());
        }
        this.transaction.add(transaction);
        double total = 0;
        for (ca.ciccc.wmad.assignment5.question4.Transaction record : this.transaction) {
            if (record.getType().equals(ca.ciccc.wmad.assignment5.question4.Transaction.DEPOSIT)) {
                total = total + record.getAmount();
            } else if (record.getType().equals(ca.ciccc.wmad.assignment5.question4.Transaction.WITHDRAW)) {
                total = total - record.getAmount();
            }
        }

        this.totalbalance = total;
    }

    public void printAllTransactions() {
        System.out.println("=====Transactions=====");
        for (ca.ciccc.wmad.assignment5.question4.Transaction t : transaction) {
            System.out.printf("=====ID: %d=====\n", t.getTransactionID());
            System.out.printf("Type: %s\n", t.getType());
            System.out.printf("Amount: %f\n", t.getAmount());
        }
        System.out.printf("Total: %f\n", this.totalbalance);
    }
}
