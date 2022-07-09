package ca.ciccc.wmad.assignment6.question1;

import ca.ciccc.wmad.assignment6.question0.Product;

import java.util.ArrayList;

public class Food extends Product {

    private int foodCalorie;
    private int foodSize;
    public ArrayList<String> foodIngredients;


    public Food(int productId, String productName, double productPrice, String productMadeInCountry, int foodCalorie, int foodSize, ArrayList<String> foodIngredients) {
        super(productId, productName, productPrice, productMadeInCountry);
        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }

    @Override
    public String toString() {
        return "ID:" + this.productId + "\n" + "Product Name: " + this.productName + "\n" + "Product Price:" + this.productPrice + "\n" + "Origin:" + this.productMadeInCountry + "\n"+"Food Calorie: "+this.foodCalorie+"\n"+"Food Size:"+this.foodSize+"\n"+foodIngredients+"\n";
    }
}