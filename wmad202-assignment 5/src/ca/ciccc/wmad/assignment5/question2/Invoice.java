//Each product has a name and price.
//- A invoice has zero or many products.
//- An invoice has the total price of all products.
//- A user should be able to see the list of all products (name and price).
//- A user should be able to see the total price of all products.


package ca.ciccc.wmad.assignment5.question2;

import java.util.ArrayList;

public class Invoice{

    private ArrayList<Product>products;


    public Invoice(){
        this.products=new ArrayList<>();
    }

    public Invoice(ArrayList<Product>products){
        this.products=products;
    }
    public  void  addProduct(Product product){
        this.products.add(product);
    }
    public void clearProducts() {
        this.products = new ArrayList<>();
    }
    public void printAllProducts() {
        for (Product product : this.products) {
            System.out.printf("Name: %s, Price: %f\n", product.getName(), product.getPrice());
        }
    }
    public void printTotalPrice() {
        System.out.printf("Total: $%f\n", this.getTotalPrice());
    }


    private double getTotalPrice() {
        double total = 0;


        for (Product product : this.products) {
            total += product.getPrice();
        }


        return total;
    }
}

