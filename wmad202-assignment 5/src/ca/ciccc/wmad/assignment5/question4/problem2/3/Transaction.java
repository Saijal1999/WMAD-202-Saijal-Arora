package ca.ciccc.wmad.assignment5.question4;

public class Transaction {
    private final int transactionID;
    private final String type;
    private final double amount;

    public static String DEPOSIT="deposit";
    public static String WITHDRAW="Withdraw";

    public Transaction(int transactionID,String type, double amount){
        this.transactionID=transactionID;
        this.type=type;
        this.amount=amount;
    }

    public int getTransactionID(){
        return this.transactionID;
    }
    public String getType(){
        return this.type;
    }
    public double getAmount(){
        return this.amount;
    }
}
