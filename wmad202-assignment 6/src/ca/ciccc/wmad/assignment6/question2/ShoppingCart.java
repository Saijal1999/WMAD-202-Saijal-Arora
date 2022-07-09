package ca.ciccc.wmad.assignment6.question2;

import ca.ciccc.wmad.assignment6.question0.Product;

import java.util.ArrayList;

public class ShoppingCart implements cart{

    ArrayList<Product>Products=new ArrayList<>();

    public ShoppingCart (ArrayList<Product>Products){
        this.Products=Products;

    }
    public ShoppingCart(){
        this.Products=new ArrayList<>();
    }


    @Override
    public  void addPurchases(Product product) {
        this.Products.add(product);
    }

    @Override
    public void removeItem(Product product) {
        this.Products.remove(product);
    }

    @Override
    public double calculateTotalAmount() {
        double totalAmount = 0;

        for ( Product Product: this.Products){
            totalAmount=totalAmount+Product.getProductPrice();
        }
        return  totalAmount;
    }

    @Override
    public String printingTheProductName() {
      for (Product Product:this.Products){
         System.out.printf("Product Name: %s\n",Product.getProductName());
      }
      return null;
    }

    @Override
    public void printReceiptInDetail() {
        for(Product Product:this.Products){
            System.out.printf(Product.toString()+"\n");
        }
    }
}
