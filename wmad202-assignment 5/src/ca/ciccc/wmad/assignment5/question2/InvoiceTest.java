package ca.ciccc.wmad.assignment5.question2;

public class InvoiceTest {
    public void  InvoiceTest(){
        Invoice invoice=new Invoice();

        Product apple1   = new Product("apple", 1.3);
        Product apple2   = new Product("apple", 1.3);
        Product banana  = new Product("banana", 0.79);
        Product beef    = new Product("beef", 12);
        Product chicken = new Product("chicken", 7.5);


        invoice.addProduct(apple1);
        invoice.addProduct(apple2);
        invoice.addProduct(banana);
        invoice.addProduct(beef);
        invoice.addProduct(chicken);


        invoice.printAllProducts();
        invoice.printTotalPrice();


    }
}
