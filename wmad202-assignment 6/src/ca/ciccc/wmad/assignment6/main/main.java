package ca.ciccc.wmad.assignment6.main;

import ca.ciccc.wmad.assignment6.question0.Product;
import ca.ciccc.wmad.assignment6.question1.Cloth;
import ca.ciccc.wmad.assignment6.question1.Drink;
import ca.ciccc.wmad.assignment6.question1.Food;
import ca.ciccc.wmad.assignment6.question1.Material;
import ca.ciccc.wmad.assignment6.question2.ShoppingCart;

import java.util.ArrayList;

public class main {
    public static void test(){

        Product product=new Product(110,"Diet Pepsi",2,"USA");
        System.out.println("....Problem 0......");
       System.out.println(product.toString());


       ArrayList<Material>MaterialList2=new ArrayList<>();
        Material Mat1= new Material(345,"Polyster");
        Material Mat2= new Material(453,"Nylon");
        MaterialList2.add(Mat1);
        MaterialList2.add(Mat2);

        ArrayList<Material>MaterialList3=new ArrayList<>();
        Material Mat3= new Material(333,"Cotton");
        Material Mat4= new Material(493,"Nylon");
        MaterialList3.add(Mat3);
        MaterialList3.add(Mat4);



      Cloth cloth=new Cloth(654,"pants",15.3,"Canada",MaterialList2);
      Cloth cloth2=new Cloth(329,"shirt",6.33,"India",MaterialList2);
      Cloth cloth3=new Cloth(783,"sweater",7.90,"Japan",MaterialList3);
      Cloth cloth4=new Cloth(657,"Hoodie",20.5,"India",MaterialList3);
      System.out.println(".....Problem 1.....");
      System.out.println(cloth.toString());
      System.out.println(cloth2.toString());
      System.out.println(cloth3.toString());
      System.out.println(cloth4.toString());





      Drink drink=new Drink(4328,"Coke",6.34,"India",true,120);
      Drink drink2=new Drink(876,"Lemonade",8.76,"India",false,80);
      Drink drink3=new Drink(654,"Nestea",7.43,"USA",true,120);
      Drink drink4=new Drink(875,"Juice",8.45,"Canada",false,90);
      System.out.println(".....Problem 1(Drink Information).....");
      System.out.println(drink.toString());
      System.out.println(drink2.toString());
      System.out.println(drink3.toString());
      System.out.println(drink4.toString());

    ArrayList<String>ingredient1=new ArrayList<>();
    ingredient1.add("oil");
    ingredient1.add("egg");

    ArrayList<String>ingredient2=new ArrayList<>();
    ingredient2.add("onion");
        ingredient2.add("tom");
        ingredient2.add("olives");



        Food food= new Food(657,"Mayo",12.65,"Canada",200,50,ingredient1);
        Food food1= new Food(786,"pizza",12.99,"India",650,4,ingredient2);
        Food food2= new Food(988,"lettuce",3.45,"USA",45,1,ingredient1);
        Food food3= new Food(598,"chicken",12.45,"India",230, 4,ingredient2);
        Food food4= new Food(876,"Salt",2.34,"China",51,320,ingredient1);
        System.out.println(".....Problem 1(Food Information).....");
        System.out.println(food.toString());
        System.out.println(food1.toString());
        System.out.println(food2.toString());
        System.out.println(food3.toString());
        System.out.println(food4.toString());


       // ShoppingCart shoppingCart=new ShoppingCart();
        Drink drinkCart= new Drink(412,"Pepsi",2.00,"USA",true,150);
        Drink drinkCart1= new Drink(412,"Pepsi",2.00,"USA",true,150);
        Drink drinkCart2= new Drink(412,"Pepsi",2.00,"USA",true,150);

        Drink drinkCart3=new Drink(183,"Ginger Zero",3,"Canada",true,200);


        ArrayList<String>Fooditems=new ArrayList<>();
        Fooditems.add("Chicken");
        Fooditems.add("Oil");
        Fooditems.add("Cheese");

        ArrayList<String>Fooditems2=new ArrayList<>();
        Fooditems2.add("Pasta");
        Fooditems2.add("spinach");
        Fooditems2.add("Meet");

        Food foodShoppingCart= new Food(100,"Chicken",8,"Canada",350,4,Fooditems);
        Food foodShoppingCart1= new Food(100,"Chicken",8,"Canada",350,4,Fooditems);

        Food foodShoppingCart2=new Food(101,"pasta",18,"Canada",250,3,Fooditems2);
        Food foodShoppingCart3=new Food(101,"pasta",18,"Canada",250,3,Fooditems2);


        ArrayList<Material>newMaterials=new ArrayList<>();
        Material M1=new Material(10,"Cotton");
        Material M2=new Material(11,"Nylon");
        newMaterials.add(M1);
        newMaterials.add(M2);

        Cloth clothShoppingcart= new Cloth(701,"T-Shirt",15,"China",newMaterials);


        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addPurchases(drinkCart);
        shoppingCart.addPurchases(drinkCart1);
        shoppingCart.addPurchases(drinkCart2);
        shoppingCart.addPurchases(foodShoppingCart);
        shoppingCart.addPurchases(foodShoppingCart1);
        shoppingCart.addPurchases(foodShoppingCart2);
        shoppingCart.addPurchases(foodShoppingCart3);
        shoppingCart.addPurchases(clothShoppingcart);


        System.out.println(".........Problem3...........");
        shoppingCart.calculateTotalAmount();
        System.out.printf("Total Amount: %f\n", shoppingCart.calculateTotalAmount());

        System.out.println(".....Product Names......");
        shoppingCart.printingTheProductName();

        System.out.println(".....Detailed Receipt......");
        shoppingCart.printReceiptInDetail();







}}
