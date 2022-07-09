package ca.ciccc.wmad.assignment6.question1;

import ca.ciccc.wmad.assignment6.question0.Product;

public class Drink extends Product {

    private boolean isDrinkDiet;
    private double drinkSize;

    public Drink(int productId, String productName, double productPrice, String productMadeInCountry, boolean isDrinkDiet, int drinkSize){
        super(productId,productName,productPrice,productMadeInCountry);
        this.isDrinkDiet=isDrinkDiet;
        this.drinkSize=drinkSize;
    }

    @Override
    public String toString() {
        return "ID:"+this.productId+"\n"+"Product Name: "+this.productName+"\n"+"Product Price:"+this.productPrice+"\n"+"Origin:"+this.productMadeInCountry+"\n"+"Drink Type:"+this.isDrinkDiet+"\n"+"Drink Size:"+this.drinkSize+"\n";
    }






}
