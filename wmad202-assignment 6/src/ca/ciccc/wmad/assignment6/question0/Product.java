package ca.ciccc.wmad.assignment6.question0;

public class Product extends Object {

    protected int productId;

    protected String productName;

    protected double productPrice;

    protected String productMadeInCountry;

public Product(int productId,String productName,double productPrice,String productMadeInCountry){
    this.productId=productId;
    this.productName=productName;
    this.productPrice=productPrice;
    this.productMadeInCountry=productMadeInCountry;
}

public double getProductPrice(){
    return productPrice;
}

public String getProductName(){
    return productName;
}

@Override
public String toString(){
    return "ID:"+this.productId+"\n"+"Product Name: "+this.productName+"\n"+"Product Price:"+this.productPrice+"\n"+"Origin:"+this.productMadeInCountry+"\n";
}
}

