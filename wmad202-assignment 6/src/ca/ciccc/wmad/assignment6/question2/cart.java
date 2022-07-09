package ca.ciccc.wmad.assignment6.question2;

import ca.ciccc.wmad.assignment6.question0.Product;

public interface cart {

    void addPurchases(Product product);
    void removeItem(Product product);
    double calculateTotalAmount();

    String printingTheProductName();

    void printReceiptInDetail();


}
