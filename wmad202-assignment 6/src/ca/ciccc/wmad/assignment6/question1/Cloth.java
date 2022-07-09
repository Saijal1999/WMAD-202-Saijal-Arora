package ca.ciccc.wmad.assignment6.question1;

import ca.ciccc.wmad.assignment6.question0.Product;

import java.util.ArrayList;

public class Cloth extends Product {

    public ArrayList<Material> materials;

    public Cloth(int productId, String productName, double productPrice, String productMadeInCountry, ArrayList<Material> materials) {
        super(productId, productName, productPrice, productMadeInCountry);
    this.materials=materials;

    }

    @Override
    public String toString() {
        return "ID:"+this.productId+"\n"+"Product Name: "+this.productName+"\n"+"Product Price:"+this.productPrice+"\n"+"Origin:"+this.productMadeInCountry+"\n"+this.materials+"\n";
    }
    }










